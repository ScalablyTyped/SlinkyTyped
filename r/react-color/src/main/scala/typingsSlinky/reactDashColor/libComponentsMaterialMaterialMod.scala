package typingsSlinky.reactDashColor

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashColor.libComponentsMaterialMaterialMod.MaterialPicker
import typingsSlinky.reactDashColor.libComponentsMaterialMaterialMod.MaterialPickerProps
import typingsSlinky.reactDashColor.reactDashColorMod.ColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/material/Material", JSImport.Namespace)
@js.native
object libComponentsMaterialMaterialMod extends js.Object {
  @js.native
  trait MaterialPicker
    extends Component[MaterialPickerProps, js.Object, js.Any]
  
  @js.native
  class default ()
    extends Component[MaterialPickerProps, js.Object, js.Any]
  
  type MaterialPickerProps = ColorPickerProps[MaterialPicker]
}

