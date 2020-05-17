package typingsSlinky.androiduix.goog.math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Long extends js.Object {
  var high_ : js.Any = js.native
  var low_ : js.Any = js.native
  def add(other: Long): Long = js.native
  def and(other: Long): Long = js.native
  def compare(other: Long): Double = js.native
  def div(other: Long): Long = js.native
  def equals(other: Long): Boolean = js.native
  def getHighBits(): Double = js.native
  def getLowBits(): Double = js.native
  def getLowBitsUnsigned(): Double = js.native
  def getNumBitsAbs(): Double = js.native
  def greaterThan(other: Long): Boolean = js.native
  def greaterThanOrEqual(other: Long): Boolean = js.native
  def isNegative(): Boolean = js.native
  def isOdd(): Boolean = js.native
  def isZero(): Boolean = js.native
  def lessThan(other: Long): Boolean = js.native
  def lessThanOrEqual(other: Long): Boolean = js.native
  def modulo(other: Long): Long = js.native
  def multiply(other: Long): Long = js.native
  def negate(): Long = js.native
  def not(): Long = js.native
  def notEquals(other: Long): Boolean = js.native
  def or(other: Long): Long = js.native
  def shiftLeft(numBits: Double): Long = js.native
  def shiftRight(numBits: Double): Long = js.native
  def shiftRightUnsigned(numBits: Double): Long = js.native
  def subtract(other: Long): Long = js.native
  def toInt(): Double = js.native
  def toNumber(): Double = js.native
  def toString(opt_radix: Double): String = js.native
  def xor(other: Long): Long = js.native
}

object Long {
  @scala.inline
  def apply(
    add: Long => Long,
    and: Long => Long,
    compare: Long => Double,
    div: Long => Long,
    equals: Long => Boolean,
    getHighBits: () => Double,
    getLowBits: () => Double,
    getLowBitsUnsigned: () => Double,
    getNumBitsAbs: () => Double,
    greaterThan: Long => Boolean,
    greaterThanOrEqual: Long => Boolean,
    high_ : js.Any,
    isNegative: () => Boolean,
    isOdd: () => Boolean,
    isZero: () => Boolean,
    lessThan: Long => Boolean,
    lessThanOrEqual: Long => Boolean,
    low_ : js.Any,
    modulo: Long => Long,
    multiply: Long => Long,
    negate: () => Long,
    not: () => Long,
    notEquals: Long => Boolean,
    or: Long => Long,
    shiftLeft: Double => Long,
    shiftRight: Double => Long,
    shiftRightUnsigned: Double => Long,
    subtract: Long => Long,
    toInt: () => Double,
    toNumber: () => Double,
    toString: Double => String,
    xor: Long => Long
  ): Long = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), and = js.Any.fromFunction1(and), compare = js.Any.fromFunction1(compare), div = js.Any.fromFunction1(div), equals = js.Any.fromFunction1(equals), getHighBits = js.Any.fromFunction0(getHighBits), getLowBits = js.Any.fromFunction0(getLowBits), getLowBitsUnsigned = js.Any.fromFunction0(getLowBitsUnsigned), getNumBitsAbs = js.Any.fromFunction0(getNumBitsAbs), greaterThan = js.Any.fromFunction1(greaterThan), greaterThanOrEqual = js.Any.fromFunction1(greaterThanOrEqual), high_ = high_.asInstanceOf[js.Any], isNegative = js.Any.fromFunction0(isNegative), isOdd = js.Any.fromFunction0(isOdd), isZero = js.Any.fromFunction0(isZero), lessThan = js.Any.fromFunction1(lessThan), lessThanOrEqual = js.Any.fromFunction1(lessThanOrEqual), low_ = low_.asInstanceOf[js.Any], modulo = js.Any.fromFunction1(modulo), multiply = js.Any.fromFunction1(multiply), negate = js.Any.fromFunction0(negate), not = js.Any.fromFunction0(not), notEquals = js.Any.fromFunction1(notEquals), or = js.Any.fromFunction1(or), shiftLeft = js.Any.fromFunction1(shiftLeft), shiftRight = js.Any.fromFunction1(shiftRight), shiftRightUnsigned = js.Any.fromFunction1(shiftRightUnsigned), subtract = js.Any.fromFunction1(subtract), toInt = js.Any.fromFunction0(toInt), toNumber = js.Any.fromFunction0(toNumber), toString = js.Any.fromFunction1(toString), xor = js.Any.fromFunction1(xor))
    __obj.asInstanceOf[Long]
  }
  @scala.inline
  implicit class LongOps[Self <: Long] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Long => Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnd(value: Long => Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("and")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCompare(value: Long => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compare")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDiv(value: Long => Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("div")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquals(value: Long => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHighBits(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHighBits")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLowBits(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLowBits")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLowBitsUnsigned(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLowBitsUnsigned")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNumBitsAbs(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumBitsAbs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGreaterThan(value: Long => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGreaterThanOrEqual(value: Long => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterThanOrEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHigh_(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("high_")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNegative(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNegative")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOdd(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOdd")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsZero(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isZero")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLessThan(value: Long => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLessThanOrEqual(value: Long => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThanOrEqual")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLow_(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("low_")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModulo(value: Long => Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMultiply(value: Long => Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNegate(value: () => Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNot(value: () => Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("not")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNotEquals(value: Long => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notEquals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOr(value: Long => Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("or")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShiftLeft(value: Double => Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShiftRight(value: Double => Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShiftRightUnsigned(value: Double => Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shiftRightUnsigned")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubtract(value: Long => Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtract")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToInt(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toInt")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToNumber(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toNumber")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToString(value: Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toString")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withXor(value: Long => Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xor")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

