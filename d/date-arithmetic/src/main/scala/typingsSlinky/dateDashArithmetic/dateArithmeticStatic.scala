package typingsSlinky.dateDashArithmetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** dateArithmetic Public Instance Methods */
trait dateArithmeticStatic extends js.Object {
  /** Add specified amount of units to a provided date and return new date as a result */
  def add(date: js.Date, num: Double, unit: Unit): js.Date
  /** Compare two dates and return true if they are equal */
  def eq(date: js.Date, date2: js.Date): Boolean
  /** Compare two dates and return true if date is greater than date2 */
  def gt(date: js.Date, date2: js.Date): Boolean
  /** Compare two dates and return true if date is greater or equal than date2 */
  def gte(date: js.Date, date2: js.Date): Boolean
  /** Compare two dates and return true if date is less than date2 */
  def lt(date: js.Date, date2: js.Date): Boolean
  /** Compare two dates and return true if date is less or equal than date2 */
  def lte(date: js.Date, date2: js.Date): Boolean
  /** Compare two dates and return false if they are equal */
  def neq(date: js.Date, date2: js.Date): Boolean
  /** Subtract specified amount of units from a provided date and return new date as a result */
  def subtract(date: js.Date, num: Double, unit: Unit): js.Date
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
}

