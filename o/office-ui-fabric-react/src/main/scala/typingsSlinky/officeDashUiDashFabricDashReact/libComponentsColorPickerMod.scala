package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsColorPickerColorPickerDotTypesMod.IColorPickerProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/ColorPicker", JSImport.Namespace)
@js.native
object libComponentsColorPickerMod extends js.Object {
  @js.native
  class ColorPickerBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsColorPickerColorPickerDotBaseMod.ColorPickerBase {
    def this(props: IColorPickerProps) = this()
  }
  
  val ColorPicker: ReactComponentClass[IColorPickerProps] = js.native
  /* static members */
  @js.native
  object ColorPickerBase extends js.Object {
    var defaultProps: Partial[IColorPickerProps] = js.native
  }
  
}

