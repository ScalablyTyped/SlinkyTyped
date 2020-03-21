package typingsSlinky.reactColor

import typingsSlinky.react.mod.Component
import typingsSlinky.reactColor.mod.CustomPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/common/Saturation", JSImport.Namespace)
@js.native
object saturationMod extends js.Object {
  @js.native
  trait Saturation
    extends Component[SaturationProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[SaturationProps, js.Object, js.Any]
  
  type SaturationProps = CustomPickerProps[Saturation]
}

