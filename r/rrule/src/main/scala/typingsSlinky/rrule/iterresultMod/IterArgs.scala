package typingsSlinky.rrule.iterresultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IterArgs extends js.Object {
  
  var _value: js.Date | js.Array[js.Date] | Null = js.native
  
  var after: js.Date = js.native
  
  var before: js.Date = js.native
  
  var dt: js.Date = js.native
  
  var inc: Boolean = js.native
}
object IterArgs {
  
  @scala.inline
  def apply(after: js.Date, before: js.Date, dt: js.Date, inc: Boolean): IterArgs = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], dt = dt.asInstanceOf[js.Any], inc = inc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterArgs]
  }
  
  @scala.inline
  implicit class IterArgsOps[Self <: IterArgs] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: js.Date): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBefore(value: js.Date): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDt(value: js.Date): Self = this.set("dt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInc(value: Boolean): Self = this.set("inc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueVarargs(value: js.Date*): Self = this.set("_value", js.Array(value :_*))
    
    @scala.inline
    def set_valueDate(value: js.Date): Self = this.set("_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_value(value: js.Date | js.Array[js.Date]): Self = this.set("_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_valueNull: Self = this.set("_value", null)
  }
}
