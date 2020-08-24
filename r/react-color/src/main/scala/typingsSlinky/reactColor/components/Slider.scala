package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.sliderMod.SliderPickerProps
import typingsSlinky.reactColor.sliderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Slider {
  @JSImport("react-color/lib/components/slider/Slider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SliderPickerProps): SharedBuilder_SliderPickerProps_2143603056[default] = new SharedBuilder_SliderPickerProps_2143603056[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Slider.type): SharedBuilder_SliderPickerProps_2143603056[default] = new SharedBuilder_SliderPickerProps_2143603056[default](js.Array(this.component, js.Dictionary.empty))()
}

