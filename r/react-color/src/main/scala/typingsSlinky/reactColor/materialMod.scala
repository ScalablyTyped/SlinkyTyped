package typingsSlinky.reactColor

import typingsSlinky.react.mod.Component
import typingsSlinky.reactColor.mod.ColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/material/Material", JSImport.Namespace)
@js.native
object materialMod extends js.Object {
  @js.native
  trait MaterialPicker
    extends Component[MaterialPickerProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[MaterialPickerProps, js.Object, js.Any]
  
  type MaterialPickerProps = ColorPickerProps[MaterialPicker]
}

