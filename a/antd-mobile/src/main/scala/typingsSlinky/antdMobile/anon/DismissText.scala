package typingsSlinky.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DismissText extends StObject {
  
  var DatePickerLocale: Day = js.native
  
  var dismissText: String = js.native
  
  var extra: String = js.native
  
  var okText: String = js.native
}
object DismissText {
  
  @scala.inline
  def apply(DatePickerLocale: Day, dismissText: String, extra: String, okText: String): DismissText = {
    val __obj = js.Dynamic.literal(DatePickerLocale = DatePickerLocale.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DismissText]
  }
  
  @scala.inline
  implicit class DismissTextMutableBuilder[Self <: DismissText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatePickerLocale(value: Day): Self = StObject.set(x, "DatePickerLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissText(value: String): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
  }
}
