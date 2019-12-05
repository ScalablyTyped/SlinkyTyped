package typingsSlinky.reactDashColor

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashColor.libComponentsSliderSliderMod.SliderPicker
import typingsSlinky.reactDashColor.libComponentsSliderSliderMod.SliderPickerProps
import typingsSlinky.reactDashColor.reactDashColorMod.ColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/slider/Slider", JSImport.Namespace)
@js.native
object libComponentsSliderSliderMod extends js.Object {
  @js.native
  trait SliderPicker
    extends Component[SliderPickerProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[SliderPickerProps, js.Object, js.Any]
  
  type SliderPickerProps = ColorPickerProps[SliderPicker]
}

