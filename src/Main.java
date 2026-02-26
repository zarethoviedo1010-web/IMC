import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    double Peso;
    double Estatura;
    double IMC;
        System.out.println("Digite cual es su peso en kilogrmos");
    Peso=teclado.nextDouble();
        System.out.println("Digite cual es tu estatura");
    Estatura=teclado.nextDouble();
    IMC=(Peso/(Estatura*2));

    if(IMC<18.5){
        System.out.println("Tienes un peso bajo");
    }else if (IMC>=18.5 & IMC<=24.9){
            System.out.println("Tienes un peso normal");
    }else if(IMC>=25 & IMC<=26.9){
            System.out.println("Tienes un sobre peso grado uno");
    }else if(IMC>=27 & IMC<=29.9){
            System.out.println("Tienes un sobre peso grado dos");
    }else if(IMC>=30 & IMC<=34.9){
            System.out.println("Tienes obecidad de tipo uno");

    }else if(IMC>=35 & IMC<=39.9){
            System.out.println("Tienes obecidad de tipo dos");
    }else if(IMC>=40 & IMC<=49.9){
            System.out.println("Tienes obecidad morbia");
    }else if(IMC>50){
            System.out.println("Tienes obecidad extrema");
        }else{

        }
        System.out.println("Su indice de masa corporal(IMC)"+IMC);

    }
}