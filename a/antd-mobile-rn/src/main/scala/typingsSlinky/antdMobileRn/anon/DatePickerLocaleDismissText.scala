package typingsSlinky.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerLocaleDismissText extends js.Object {
  
  var DatePickerLocale: Calendar = js.native
  
  var dismissText: String = js.native
  
  var extra: String = js.native
  
  var okText: String = js.native
}
object DatePickerLocaleDismissText {
  
  @scala.inline
  def apply(DatePickerLocale: Calendar, dismissText: String, extra: String, okText: String): DatePickerLocaleDismissText = {
    val __obj = js.Dynamic.literal(DatePickerLocale = DatePickerLocale.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePickerLocaleDismissText]
  }
  
  @scala.inline
  implicit class DatePickerLocaleDismissTextOps[Self <: DatePickerLocaleDismissText] (val x: Self) extends AnyVal {
    
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
    def setDatePickerLocale(value: Calendar): Self = this.set("DatePickerLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissText(value: String): Self = this.set("dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: String): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkText(value: String): Self = this.set("okText", value.asInstanceOf[js.Any])
  }
}
