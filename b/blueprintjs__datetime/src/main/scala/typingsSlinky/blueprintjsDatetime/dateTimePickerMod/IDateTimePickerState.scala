package typingsSlinky.blueprintjsDatetime.dateTimePickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateTimePickerState extends js.Object {
  
  var dateValue: js.UndefOr[js.Date] = js.native
  
  var timeValue: js.UndefOr[js.Date] = js.native
}
object IDateTimePickerState {
  
  @scala.inline
  def apply(): IDateTimePickerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDateTimePickerState]
  }
  
  @scala.inline
  implicit class IDateTimePickerStateOps[Self <: IDateTimePickerState] (val x: Self) extends AnyVal {
    
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
    def setDateValue(value: js.Date): Self = this.set("dateValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateValue: Self = this.set("dateValue", js.undefined)
    
    @scala.inline
    def setTimeValue(value: js.Date): Self = this.set("timeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeValue: Self = this.set("timeValue", js.undefined)
  }
}
