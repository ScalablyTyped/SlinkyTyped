package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.sliderMod.SliderPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SliderPicker {
  @JSImport("react-color", "SliderPicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: SliderPickerProps): SharedBuilder_SliderPickerProps_2143603056[typingsSlinky.reactColor.mod.SliderPicker] = new SharedBuilder_SliderPickerProps_2143603056[typingsSlinky.reactColor.mod.SliderPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SliderPicker.type): SharedBuilder_SliderPickerProps_2143603056[typingsSlinky.reactColor.mod.SliderPicker] = new SharedBuilder_SliderPickerProps_2143603056[typingsSlinky.reactColor.mod.SliderPicker](js.Array(this.component, js.Dictionary.empty))()
}

