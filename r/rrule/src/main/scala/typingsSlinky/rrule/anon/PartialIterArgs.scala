package typingsSlinky.rrule.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<rrule.rrule/dist/esm/src/iterresult.IterArgs> */
@js.native
trait PartialIterArgs extends js.Object {
  
  var _value: js.UndefOr[js.Date | js.Array[js.Date] | Null] = js.native
  
  var after: js.UndefOr[js.Date] = js.native
  
  var before: js.UndefOr[js.Date] = js.native
  
  var dt: js.UndefOr[js.Date] = js.native
  
  var inc: js.UndefOr[Boolean] = js.native
}
object PartialIterArgs {
  
  @scala.inline
  def apply(): PartialIterArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIterArgs]
  }
  
  @scala.inline
  implicit class PartialIterArgsOps[Self <: PartialIterArgs] (val x: Self) extends AnyVal {
    
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
    def set_valueVarargs(value: js.Date*): Self = this.set("_value", js.Array(value :_*))
    
    @scala.inline
    def set_valueDate(value: js.Date): Self = this.set("_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_value(value: js.Date | js.Array[js.Date]): Self = this.set("_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_value: Self = this.set("_value", js.undefined)
    
    @scala.inline
    def set_valueNull: Self = this.set("_value", null)
    
    @scala.inline
    def setAfter(value: js.Date): Self = this.set("after", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setBefore(value: js.Date): Self = this.set("before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
    
    @scala.inline
    def setDt(value: js.Date): Self = this.set("dt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDt: Self = this.set("dt", js.undefined)
    
    @scala.inline
    def setInc(value: Boolean): Self = this.set("inc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInc: Self = this.set("inc", js.undefined)
  }
}
