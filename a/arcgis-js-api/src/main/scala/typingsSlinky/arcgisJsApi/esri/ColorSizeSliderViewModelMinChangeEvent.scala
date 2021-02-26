package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorSizeSliderViewModelMinChangeEvent extends StObject {
  
  var oldValue: Double = js.native
  
  var `type`: min = js.native
  
  var value: Double = js.native
}
object ColorSizeSliderViewModelMinChangeEvent {
  
  @scala.inline
  def apply(oldValue: Double, `type`: min, value: Double): ColorSizeSliderViewModelMinChangeEvent = {
    val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSizeSliderViewModelMinChangeEvent]
  }
  
  @scala.inline
  implicit class ColorSizeSliderViewModelMinChangeEventMutableBuilder[Self <: ColorSizeSliderViewModelMinChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: min): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
