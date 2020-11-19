package typingsSlinky.dateArithmetic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: (js.Date, Double, Unit) => js.Date): Self = this.set("add", js.Any.fromFunction3(value))
    
    @scala.inline
    def setEq(value: (js.Date, js.Date) => Boolean): Self = this.set("eq", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGt(value: (js.Date, js.Date) => Boolean): Self = this.set("gt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGte(value: (js.Date, js.Date) => Boolean): Self = this.set("gte", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLt(value: (js.Date, js.Date) => Boolean): Self = this.set("lt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLte(value: (js.Date, js.Date) => Boolean): Self = this.set("lte", js.Any.fromFunction2(value))
    
    @scala.inline
    def setNeq(value: (js.Date, js.Date) => Boolean): Self = this.set("neq", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSubtract(value: (js.Date, Double, Unit) => js.Date): Self = this.set("subtract", js.Any.fromFunction3(value))
  }
}
