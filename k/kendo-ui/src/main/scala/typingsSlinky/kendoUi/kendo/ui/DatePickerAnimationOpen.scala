package typingsSlinky.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePickerAnimationOpen extends StObject {
  
  var duration: js.UndefOr[Double] = js.native
  
  var effects: js.UndefOr[String] = js.native
}
object DatePickerAnimationOpen {
  
  @scala.inline
  def apply(): DatePickerAnimationOpen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatePickerAnimationOpen]
  }
  
  @scala.inline
  implicit class DatePickerAnimationOpenMutableBuilder[Self <: DatePickerAnimationOpen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEffects(value: String): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
  }
}
