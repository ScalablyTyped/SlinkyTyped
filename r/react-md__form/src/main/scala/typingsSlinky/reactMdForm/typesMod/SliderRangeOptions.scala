package typingsSlinky.reactMdForm.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderRangeOptions extends StObject {
  
  /**
    * Boolean if the slider is disabled and the values cannot be changed.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The max value for the slider.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The min value for the slider.
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * Boolean if the slider is rendered vertically instead of horizontally.
    */
  var vertical: js.UndefOr[Boolean] = js.native
}
object SliderRangeOptions {
  
  @scala.inline
  def apply(): SliderRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderRangeOptions]
  }
  
  @scala.inline
  implicit class SliderRangeOptionsMutableBuilder[Self <: SliderRangeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
