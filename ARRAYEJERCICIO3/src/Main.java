import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ESCRIBE TU DNI");
        int DNI;
        int letra;
        Scanner sc= new Scanner(System.in);
        DNI= sc.nextInt();
        char[] letrasDNI= new char[]{'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
for (char d=0 ; d< letrasDNI.length; d++){

    letra= DNI%23;
    System.out.println("EL DNI: "+DNI);

    }

}



    }
}