package typingsSlinky.bootstrapDatepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatepickerBeforeShowResponse extends StObject {
  
  var classes: js.UndefOr[String] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var tooltip: js.UndefOr[String] = js.native
}
object DatepickerBeforeShowResponse {
  
  @scala.inline
  def apply(): DatepickerBeforeShowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerBeforeShowResponse]
  }
  
  @scala.inline
  implicit class DatepickerBeforeShowResponseMutableBuilder[Self <: DatepickerBeforeShowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
