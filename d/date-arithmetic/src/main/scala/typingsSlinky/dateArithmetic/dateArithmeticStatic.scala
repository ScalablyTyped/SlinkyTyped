package typingsSlinky.dateArithmetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** dateArithmetic Public Instance Methods */
@js.native
trait dateArithmeticStatic extends js.Object {
  /** Add specified amount of units to a provided date and return new date as a result */
  def add(date: js.Date, num: Double, unit: Unit): js.Date = js.native
  /** Compare two dates and return true if they are equal */
  def eq(date: js.Date, date2: js.Date): Boolean = js.native
  /** Compare two dates and return true if date is greater than date2 */
  def gt(date: js.Date, date2: js.Date): Boolean = js.native
  /** Compare two dates and return true if date is greater or equal than date2 */
  def gte(date: js.Date, date2: js.Date): Boolean = js.native
  /** Compare two dates and return true if date is less than date2 */
  def lt(date: js.Date, date2: js.Date): Boolean = js.native
  /** Compare two dates and return true if date is less or equal than date2 */
  def lte(date: js.Date, date2: js.Date): Boolean = js.native
  /** Compare two dates and return false if they are equal */
  def neq(date: js.Date, date2: js.Date): Boolean = js.native
  /** Subtract specified amount of units from a provided date and return new date as a result */
  def subtract(date: js.Date, num: Double, unit: Unit): js.Date = js.native
}

object dateArithmeticStatic {
  @scala.inline
  def apply(
    add: (js.Date, Double, Unit) => js.Date,
    eq: (js.Date, js.Date) => Boolean,
    gt: (js.Date, js.Date) => Boolean,
    gte: (js.Date, js.Date) => Boolean,
    lt: (js.Date, js.Date) => Boolean,
    lte: (js.Date, js.Date) => Boolean,
    neq: (js.Date, js.Date) => Boolean,
    subtract: (js.Date, Double, Unit) => js.Date
  ): dateArithmeticStatic = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), eq = js.Any.fromFunction2(eq), gt = js.Any.fromFunction2(gt), gte = js.Any.fromFunction2(gte), lt = js.Any.fromFunction2(lt), lte = js.Any.fromFunction2(lte), neq = js.Any.fromFunction2(neq), subtract = js.Any.fromFunction3(subtract))
    __obj.asInstanceOf[dateArithmeticStatic]
  }
  @scala.inline
  implicit class dateArithmeticStaticOps[Self <: dateArithmeticStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (js.Date, Double, Unit) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withEq(value: (js.Date, js.Date) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eq")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGt(value: (js.Date, js.Date) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGte(value: (js.Date, js.Date) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gte")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLt(value: (js.Date, js.Date) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lt")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLte(value: (js.Date, js.Date) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lte")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNeq(value: (js.Date, js.Date) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neq")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSubtract(value: (js.Date, Double, Unit) => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtract")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

