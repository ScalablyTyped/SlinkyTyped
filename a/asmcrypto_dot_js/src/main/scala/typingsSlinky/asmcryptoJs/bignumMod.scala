package typingsSlinky.asmcryptoJs

import typingsSlinky.asmcryptoJs.anon.BitLength
import typingsSlinky.asmcryptoJs.anon.Gcd
import typingsSlinky.asmcryptoJs.anon.Quotient
import typingsSlinky.asmcryptoJs.bigintAsmMod.bigintresult
import typingsSlinky.std.ArrayBufferLike
import typingsSlinky.std.ArrayLike
import typingsSlinky.std.Math
import typingsSlinky.std.Uint32ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bignumMod {
  
  @JSImport("asmcrypto.js/dist_es8/bignum/bignum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber")
  @js.native
  class BigNumber () extends StObject {
    def this(num: js.typedarray.Uint8Array) = this()
    
    def add(that: BigNumber): BigNumber = js.native
    
    var bitLength: Double = js.native
    
    def clamp(b: Double): BigNumber = js.native
    
    def compare(that: BigNumber): Double = js.native
    
    def divide(that: BigNumber): Quotient = js.native
    
    def isMillerRabinProbablePrime(rounds: Double): Boolean = js.native
    
    def isProbablePrime(): Boolean = js.native
    def isProbablePrime(paranoia: Double): Boolean = js.native
    
    var limbs: js.typedarray.Uint32Array = js.native
    
    def multiply(that: BigNumber): BigNumber = js.native
    
    def negate(): BigNumber = js.native
    
    var sign: Double = js.native
    
    def slice(f: Double): BigNumber = js.native
    def slice(f: Double, b: Double): BigNumber = js.native
    
    def square(): BigNumber = js.native
    
    def subtract(that: BigNumber): BigNumber = js.native
    
    def toBytes(): js.typedarray.Uint8Array = js.native
    
    def toString(radix: Double): String = js.native
  }
  /* static members */
  object BigNumber {
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber.ONE")
    @js.native
    def ONE: BigNumber = js.native
    @scala.inline
    def ONE_=(x: BigNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber.ZERO")
    @js.native
    def ZERO: BigNumber = js.native
    @scala.inline
    def ZERO_=(x: BigNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber.extGCD")
    @js.native
    def extGCD: js.Function2[/* a */ this.type, /* b */ this.type, Gcd] = js.native
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber.extGCD")
    @js.native
    def extGCD(a: this.type, b: this.type): Gcd = js.native
    @scala.inline
    def extGCD_=(x: js.Function2[/* a */ this.type, /* b */ this.type, Gcd]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extGCD")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber.fromArrayBuffer")
    @js.native
    def fromArrayBuffer(buffer: js.typedarray.ArrayBuffer): BigNumber = js.native
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber.fromConfig")
    @js.native
    def fromConfig(obj: BitLength): BigNumber = js.native
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber.fromNumber")
    @js.native
    def fromNumber(num: Double): BigNumber = js.native
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "BigNumber.fromString")
    @js.native
    def fromString(str: String): BigNumber = js.native
  }
  
  @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "Modulus")
  @js.native
  class Modulus protected () extends BigNumber {
    def this(number: BigNumber) = this()
    
    var coefficient: js.Any = js.native
    
    var comodulus: js.Any = js.native
    
    var comodulusRemainder: js.Any = js.native
    
    var comodulusRemainderSquare: js.Any = js.native
    
    /**
      * Modular inverse
      */
    def inverse(a: BigNumber): BigNumber = js.native
    
    /**
      * Modular exponentiation
      */
    def power(g: BigNumber, e: BigNumber): BigNumber = js.native
    
    /**
      * Modular reduction
      */
    def reduce(a: BigNumber): BigNumber = js.native
  }
  /* static members */
  object Modulus {
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "Modulus._Montgomery_reduce")
    @js.native
    def _Montgomery_reduce(a: BigNumber, n: Modulus): BigNumber = js.native
  }
  
  @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "_bigint_asm")
  @js.native
  def bigintAsm: bigintresult = js.native
  
  @scala.inline
  def bigintAsm_=(x: bigintresult): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_bigint_asm")(x.asInstanceOf[js.Any])
  
  @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "_bigint_heap")
  @js.native
  val bigintHeap: js.typedarray.Uint32Array = js.native
  
  object bigintStdlib {
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "_bigint_stdlib")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "_bigint_stdlib.Math")
    @js.native
    def Math: typingsSlinky.std.Math = js.native
    @scala.inline
    def Math_=(x: Math): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Math")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "_bigint_stdlib.Uint32Array")
    @js.native
    class Uint32Array ()
      extends typingsSlinky.std.Uint32Array {
      def this(array: ArrayBufferLike) = this()
      def this(array: ArrayLike[Double]) = this()
      def this(elements: js.Iterable[Double]) = this()
      def this(length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: js.UndefOr[scala.Nothing], length: Double) = this()
      def this(buffer: ArrayBufferLike, byteOffset: Double, length: Double) = this()
    }
    @JSImport("asmcrypto.js/dist_es8/bignum/bignum", "_bigint_stdlib.Uint32Array")
    @js.native
    def Uint32Array: Uint32ArrayConstructor = js.native
    @scala.inline
    def Uint32Array_=(x: Uint32ArrayConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Uint32Array")(x.asInstanceOf[js.Any])
  }
}
