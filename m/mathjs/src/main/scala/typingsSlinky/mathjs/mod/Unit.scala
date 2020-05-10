package typingsSlinky.mathjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Unit extends _MathType {
  def abs(unit: Unit): Unit = js.native
  def divide(unit: Unit): Unit = js.native
  def equalBase(unit: Unit): Boolean = js.native
  def equals(unit: Unit): Boolean = js.native
  def format(options: FormatOptions): String = js.native
  def formatUnits(): String = js.native
  def hasBase(base: js.Any): Boolean = js.native
  def multiply(unit: Unit): Unit = js.native
  def pow(unit: Unit): Unit = js.native
  def splitUnit(parts: js.Array[String | Unit]): js.Array[Unit] = js.native
  def to(unit: String): Unit = js.native
  def toJSON(): MathJSON = js.native
  def toNumber(unit: String): Double = js.native
  def toNumeric(unit: String): Double | Fraction | BigNumber = js.native
  def toSI(): Unit = js.native
}

object Unit {
  @scala.inline
  def apply(
    abs: Unit => Unit,
    divide: Unit => Unit,
    equalBase: Unit => Boolean,
    equals: Unit => Boolean,
    format: FormatOptions => String,
    formatUnits: () => String,
    hasBase: js.Any => Boolean,
    multiply: Unit => Unit,
    pow: Unit => Unit,
    splitUnit: js.Array[String | Unit] => js.Array[Unit],
    to: String => Unit,
    toJSON: () => MathJSON,
    toNumber: String => Double,
    toNumeric: String => Double | Fraction | BigNumber,
    toSI: () => Unit
  ): Unit = {
    val __obj = js.Dynamic.literal(abs = js.Any.fromFunction1(abs), divide = js.Any.fromFunction1(divide), equalBase = js.Any.fromFunction1(equalBase), equals = js.Any.fromFunction1(equals), format = js.Any.fromFunction1(format), formatUnits = js.Any.fromFunction0(formatUnits), hasBase = js.Any.fromFunction1(hasBase), multiply = js.Any.fromFunction1(multiply), pow = js.Any.fromFunction1(pow), splitUnit = js.Any.fromFunction1(splitUnit), to = js.Any.fromFunction1(to), toJSON = js.Any.fromFunction0(toJSON), toNumber = js.Any.fromFunction1(toNumber), toNumeric = js.Any.fromFunction1(toNumeric), toSI = js.Any.fromFunction0(toSI))
    __obj.asInstanceOf[Unit]
  }
  @scala.inline
  implicit class UnitOps[Self <: Unit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbs(value: Unit => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abs")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDivide(value: Unit => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEqualBase(value: Unit => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalBase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEquals(value: Unit => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: FormatOptions => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormatUnits(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatUnits")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHasBase(value: js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBase")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMultiply(value: Unit => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPow(value: Unit => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSplitUnit(value: js.Array[String | Unit] => js.Array[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitUnit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTo(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToJSON(value: () => MathJSON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToNumber(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toNumber")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToNumeric(value: String => Double | Fraction | BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toNumeric")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withToSI(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSI")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

