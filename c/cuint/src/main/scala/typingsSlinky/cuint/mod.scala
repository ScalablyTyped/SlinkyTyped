package typingsSlinky.cuint

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("cuint", "UINT32")
  @js.native
  class UINT32 protected () extends Uint {
    // called as a constructor:
    def this(low: Double) = this()
    // tslint:disable-next-line:unified-signatures
    def this(text: String) = this()
    def this(low: Double, high: Double) = this()
    def this(text: String, radix: Double) = this()
  }
  @JSImport("cuint", "UINT32")
  @js.native
  val UINT32: UintConstructor[Uint] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("cuint", "UINT64")
  @js.native
  class UINT64 protected () extends Uint {
    // called as a constructor:
    def this(low: Double) = this()
    // tslint:disable-next-line:unified-signatures
    def this(text: String) = this()
    def this(low: Double, high: Double) = this()
    def this(text: String, radix: Double) = this()
    // called as constructor:
    def this(a00: Double, a16: Double, a32: Double, a48: Double) = this()
  }
  @JSImport("cuint", "UINT64")
  @js.native
  val UINT64: Uint64Constructor[Uint] = js.native
  
  @js.native
  trait Uint extends StObject {
    
    var _high: Double = js.native
    
    var _low: Double = js.native
    
    // Math
    def add(x: this.type): this.type = js.native
    
    def and(x: this.type): this.type = js.native
    
    def div(x: this.type): this.type = js.native
    
    def eq(x: this.type): Boolean = js.native
    
    // Compare
    def equals(x: this.type): Boolean = js.native
    
    def fromBits(bits: Double*): this.type = js.native
    
    // Deserialize
    def fromNumber(n: Double): this.type = js.native
    
    def fromString(integer: String): this.type = js.native
    def fromString(integer: String, radix: Double): this.type = js.native
    
    def greaterThan(x: this.type): Boolean = js.native
    
    def gt(x: this.type): Boolean = js.native
    
    def lessThan(x: this.type): Boolean = js.native
    
    def lt(x: this.type): Boolean = js.native
    
    def multiply(x: this.type): this.type = js.native
    
    // Bitwise
    def negate(): this.type = js.native
    
    def not(x: this.type): this.type = js.native
    
    def or(x: this.type): this.type = js.native
    
    def rorateLeft(n: Double): this.type = js.native
    
    def rorateRight(n: Double): this.type = js.native
    
    def rotl(n: Double): this.type = js.native
    
    def rotr(n: Double): this.type = js.native
    
    def shiftLeft(n: Double): this.type = js.native
    
    def shiftRight(n: Double): this.type = js.native
    
    def shiftl(n: Double): this.type = js.native
    
    def shiftr(n: Double): this.type = js.native
    
    def subtract(x: this.type): this.type = js.native
    
    // Serialize
    def toNumber(): Double = js.native
    
    def toString(base: Double): String = js.native
    
    def xor(x: this.type): this.type = js.native
  }
  
  @js.native
  trait Uint64Constructor[T /* <: Uint */]
    extends UintConstructor[T]
       with // called as constructor:
  Instantiable4[/* a00 */ Double, /* a16 */ Double, /* a32 */ Double, /* a48 */ Double, T] {
    
    // called as a function:
    def apply(a00: Double, a16: Double, a32: Double, a48: Double): T = js.native
  }
  
  @js.native
  trait UintConstructor[T /* <: Uint */]
    extends // called as a constructor:
  // tslint:disable-next-line:unified-signatures
  Instantiable1[(/* low */ Double) | (/* text */ String), T]
       with Instantiable2[(/* low */ Double) | (/* text */ String), /* high */ Double, T] {
    
    // called as a function:
    def apply(low: Double): T = js.native
    def apply(low: Double, high: Double): T = js.native
    // tslint:disable-next-line:unified-signatures
    def apply(text: String): T = js.native
    def apply(text: String, radix: Double): T = js.native
  }
}
