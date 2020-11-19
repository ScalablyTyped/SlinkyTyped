package typingsSlinky.rrule.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryMethods extends js.Object {
  
  def after(date: js.Date, inc: Boolean): js.Date = js.native
  
  def all(): js.Array[js.Date] = js.native
  
  def before(date: js.Date, inc: Boolean): js.Date = js.native
  
  def between(after: js.Date, before: js.Date, inc: Boolean): js.Array[js.Date] = js.native
}
object QueryMethods {
  
  @scala.inline
  def apply(
    after: (js.Date, Boolean) => js.Date,
    all: () => js.Array[js.Date],
    before: (js.Date, Boolean) => js.Date,
    between: (js.Date, js.Date, Boolean) => js.Array[js.Date]
  ): QueryMethods = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction2(after), all = js.Any.fromFunction0(all), before = js.Any.fromFunction2(before), between = js.Any.fromFunction3(between))
    __obj.asInstanceOf[QueryMethods]
  }
  
  @scala.inline
  implicit class QueryMethodsOps[Self <: QueryMethods] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: (js.Date, Boolean) => js.Date): Self = this.set("after", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAll(value: () => js.Array[js.Date]): Self = this.set("all", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBefore(value: (js.Date, Boolean) => js.Date): Self = this.set("before", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBetween(value: (js.Date, js.Date, Boolean) => js.Array[js.Date]): Self = this.set("between", js.Any.fromFunction3(value))
  }
}
