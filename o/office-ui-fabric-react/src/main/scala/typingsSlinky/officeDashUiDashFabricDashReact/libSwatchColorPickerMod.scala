package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerColorPickerGridCellDotTypesMod.IColorPickerGridCellProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerSwatchColorPickerDotTypesMod.ISwatchColorPickerProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SwatchColorPicker", JSImport.Namespace)
@js.native
object libSwatchColorPickerMod extends js.Object {
  @js.native
  class ColorPickerGridCellBase ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerMod.ColorPickerGridCellBase
  
  @js.native
  class SwatchColorPickerBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsSwatchColorPickerMod.SwatchColorPickerBase {
    def this(props: ISwatchColorPickerProps) = this()
  }
  
  val ColorPickerGridCell: ReactComponentClass[IColorPickerGridCellProps] = js.native
  val SwatchColorPicker: ReactComponentClass[ISwatchColorPickerProps] = js.native
  /* static members */
  @js.native
  object ColorPickerGridCellBase extends js.Object {
    var defaultProps: Partial[IColorPickerGridCellProps] = js.native
  }
  
  /* static members */
  @js.native
  object SwatchColorPickerBase extends js.Object {
    var defaultProps: ISwatchColorPickerProps = js.native
  }
  
}

