package typingsSlinky.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BigInteger extends StObject {
  
  def abs(): BigInteger = js.native
  
  def bitLength(): Double = js.native
  
  def compareTo(a: BigInteger): Double = js.native
  
  def mod(a: BigInteger): BigInteger = js.native
  
  def modPowInt(e: Double, m: BigInteger): BigInteger = js.native
  
  def negate(): BigInteger = js.native
  
  def toString(b: Double): String = js.native
}
object BigInteger {
  
  @scala.inline
  def apply(
    abs: () => BigInteger,
    bitLength: () => Double,
    compareTo: BigInteger => Double,
    mod: BigInteger => BigInteger,
    modPowInt: (Double, BigInteger) => BigInteger,
    negate: () => BigInteger,
    toString_ : Double => String
  ): BigInteger = {
    val __obj = js.Dynamic.literal(abs = js.Any.fromFunction0(abs), bitLength = js.Any.fromFunction0(bitLength), compareTo = js.Any.fromFunction1(compareTo), mod = js.Any.fromFunction1(mod), modPowInt = js.Any.fromFunction2(modPowInt), negate = js.Any.fromFunction0(negate))
    __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
    __obj.asInstanceOf[BigInteger]
  }
  
  @scala.inline
  implicit class BigIntegerMutableBuilder[Self <: BigInteger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbs(value: () => BigInteger): Self = StObject.set(x, "abs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBitLength(value: () => Double): Self = StObject.set(x, "bitLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompareTo(value: BigInteger => Double): Self = StObject.set(x, "compareTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMod(value: BigInteger => BigInteger): Self = StObject.set(x, "mod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setModPowInt(value: (Double, BigInteger) => BigInteger): Self = StObject.set(x, "modPowInt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNegate(value: () => BigInteger): Self = StObject.set(x, "negate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToString_(value: Double => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
  }
}
