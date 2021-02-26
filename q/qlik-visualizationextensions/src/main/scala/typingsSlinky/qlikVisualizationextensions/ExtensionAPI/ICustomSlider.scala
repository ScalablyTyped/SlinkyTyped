package typingsSlinky.qlikVisualizationextensions.ExtensionAPI

import typingsSlinky.qlikVisualizationextensions.qlikVisualizationextensionsStrings.slider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomSlider extends ICustomControl {
  
  var component: slider = js.native
  
  var defaultValue: Double = js.native
  
  var max: Double = js.native
  
  var min: Double = js.native
  
  var step: Double = js.native
}
object ICustomSlider {
  
  @scala.inline
  def apply(
    component: slider,
    defaultValue: Double,
    label: String,
    max: Double,
    min: Double,
    ref: String,
    step: Double,
    `type`: String
  ): ICustomSlider = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomSlider]
  }
  
  @scala.inline
  implicit class ICustomSliderMutableBuilder[Self <: ICustomSlider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: slider): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
