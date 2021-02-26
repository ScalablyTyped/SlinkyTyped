package typingsSlinky.reactColor.anon

import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-color.react-color/lib/components/slider/Slider.SliderPickerStylesProps> */
@js.native
trait PartialSliderPickerStyles extends StObject {
  
  var Hue: js.UndefOr[CSSProperties] = js.native
  
  var hue: js.UndefOr[CSSProperties] = js.native
}
object PartialSliderPickerStyles {
  
  @scala.inline
  def apply(): PartialSliderPickerStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSliderPickerStyles]
  }
  
  @scala.inline
  implicit class PartialSliderPickerStylesMutableBuilder[Self <: PartialSliderPickerStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHue(value: CSSProperties): Self = StObject.set(x, "Hue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHueUndefined: Self = StObject.set(x, "Hue", js.undefined)
  }
}
