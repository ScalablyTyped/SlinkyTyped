package typingsSlinky.integer

import typingsSlinky.integer.integerNumbers.`-1`
import typingsSlinky.integer.integerNumbers.`0`
import typingsSlinky.integer.integerNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("integer", JSImport.Namespace)
  @js.native
  def apply(`val`: IntLike): IntClass = js.native
  
  @JSImport("integer", "IntClass")
  @js.native
  class IntClass protected () extends StObject {
    def this(`val`: IntLike) = this()
    
    def abs(): IntClass = js.native
    
    def absoluteValue(): IntClass = js.native
    
    def add(augend: IntLike): IntClass = js.native
    
    def and(bits: IntLike): IntClass = js.native
    
    def bitSizeAbs(): Double = js.native
    
    def compare(`val`: IntLike): `-1` | `0` | `1` = js.native
    
    def div(divisor: IntLike): IntClass = js.native
    
    def divide(divisor: IntLike): IntClass = js.native
    
    def divideBy(divisor: IntLike): IntClass = js.native
    
    def dividedBy(divisor: IntLike): IntClass = js.native
    
    def doesNotEqual(`val`: IntLike): Boolean = js.native
    
    def eq(`val`: IntLike): Boolean = js.native
    
    def equals(`val`: IntLike): Boolean = js.native
    
    def greaterThan(`val`: IntLike): Boolean = js.native
    
    def greaterThanOrEquals(`val`: IntLike): Boolean = js.native
    
    def gt(`val`: IntLike): Boolean = js.native
    
    def gte(`val`: IntLike): Boolean = js.native
    
    var high: Double = js.native
    
    def isEqualTo(`val`: IntLike): Boolean = js.native
    
    def isEven(): Boolean = js.native
    
    def isGreaterThan(`val`: IntLike): Boolean = js.native
    
    def isGreaterThanOrEqualTo(`val`: IntLike): Boolean = js.native
    
    def isLessThan(`val`: IntLike): Boolean = js.native
    
    def isLessThanOrEqualTo(`val`: IntLike): Boolean = js.native
    
    def isNegative(): Boolean = js.native
    
    def isNonZero(): Boolean = js.native
    
    def isNotEqualTo(`val`: IntLike): Boolean = js.native
    
    def isNotZero(): Boolean = js.native
    
    def isOdd(): Boolean = js.native
    
    def isPositive(): Boolean = js.native
    
    def isSafe(): Boolean = js.native
    
    def isUnsafe(): Boolean = js.native
    
    def isZero(): Boolean = js.native
    
    def lessThan(`val`: IntLike): Boolean = js.native
    
    def lessThanOrEquals(`val`: IntLike): Boolean = js.native
    
    var low: Double = js.native
    
    def lt(`val`: IntLike): Boolean = js.native
    
    def lte(`val`: IntLike): Boolean = js.native
    
    def minus(subtrahend: IntLike): IntClass = js.native
    
    def mod(divisor: IntLike): IntClass = js.native
    
    def modulo(divisor: IntLike): IntClass = js.native
    
    def mul(multiplier: IntLike): IntClass = js.native
    
    def multiply(multiplier: IntLike): IntClass = js.native
    
    def neg(): IntClass = js.native
    
    def negate(): IntClass = js.native
    
    def neq(`val`: IntLike): Boolean = js.native
    
    def not(): IntClass = js.native
    
    def notEquals(`val`: IntLike): Boolean = js.native
    
    def or(bits: IntLike): IntClass = js.native
    
    def over(divisor: IntLike): IntClass = js.native
    
    def plus(augend: IntLike): IntClass = js.native
    
    def shiftLeft(bits: Double): IntClass = js.native
    
    def shiftRight(bits: Double): IntClass = js.native
    
    def shl(bits: Double): IntClass = js.native
    
    def shr(bits: Double): IntClass = js.native
    
    def sub(subtrahend: IntLike): IntClass = js.native
    
    def subtract(subtrahend: IntLike): IntClass = js.native
    
    def times(multiplier: IntLike): IntClass = js.native
    
    def toNumber(): Double = js.native
    
    def toNumberUnsafe(): Double = js.native
    
    def toString(radix: Double): String = js.native
    
    def xor(bits: IntLike): IntClass = js.native
  }
  
  @JSImport("integer", "MAX_VALUE")
  @js.native
  val MAX_VALUE: IntClass = js.native
  
  @JSImport("integer", "MIN_VALUE")
  @js.native
  val MIN_VALUE: IntClass = js.native
  
  @JSImport("integer", "NEG_ONE")
  @js.native
  val NEG_ONE: IntClass = js.native
  
  @JSImport("integer", "ONE")
  @js.native
  val ONE: IntClass = js.native
  
  @JSImport("integer", "ZERO")
  @js.native
  val ZERO: IntClass = js.native
  
  @JSImport("integer", "fromBits")
  @js.native
  def fromBits(low: Double): IntClass = js.native
  @JSImport("integer", "fromBits")
  @js.native
  def fromBits(low: Double, high: Double): IntClass = js.native
  
  @JSImport("integer", "fromNumber")
  @js.native
  def fromNumber(`val`: Double): IntClass = js.native
  @JSImport("integer", "fromNumber")
  @js.native
  def fromNumber(`val`: Double, defaultVal: Double): IntClass = js.native
  @JSImport("integer", "fromNumber")
  @js.native
  def fromNumber(`val`: Double, defaultVal: IntClass): IntClass = js.native
  
  @JSImport("integer", "fromString")
  @js.native
  def fromString(`val`: String): IntClass = js.native
  @JSImport("integer", "fromString")
  @js.native
  def fromString(`val`: String, radix: js.UndefOr[scala.Nothing], defaultVal: String): IntClass = js.native
  @JSImport("integer", "fromString")
  @js.native
  def fromString(`val`: String, radix: js.UndefOr[scala.Nothing], defaultVal: IntClass): IntClass = js.native
  @JSImport("integer", "fromString")
  @js.native
  def fromString(`val`: String, radix: Double): IntClass = js.native
  @JSImport("integer", "fromString")
  @js.native
  def fromString(`val`: String, radix: Double, defaultVal: String): IntClass = js.native
  @JSImport("integer", "fromString")
  @js.native
  def fromString(`val`: String, radix: Double, defaultVal: IntClass): IntClass = js.native
  
  @JSImport("integer", "isInstance")
  @js.native
  def isInstance(`val`: js.Any): Boolean = js.native
  
  type IntLike = Double | String | IntClass
}
