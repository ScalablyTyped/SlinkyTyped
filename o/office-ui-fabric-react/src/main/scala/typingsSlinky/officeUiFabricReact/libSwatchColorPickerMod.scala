package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellProps
import typingsSlinky.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/SwatchColorPicker", JSImport.Namespace)
@js.native
object libSwatchColorPickerMod extends js.Object {
  @js.native
  class ColorPickerGridCellBase ()
    extends typingsSlinky.officeUiFabricReact.swatchColorPickerMod.ColorPickerGridCellBase
  
  @js.native
  class SwatchColorPickerBase protected ()
    extends typingsSlinky.officeUiFabricReact.swatchColorPickerMod.SwatchColorPickerBase {
    def this(props: ISwatchColorPickerProps) = this()
  }
  
  val ColorPickerGridCell: ReactComponentClass[IColorPickerGridCellProps] = js.native
  val SwatchColorPicker: ReactComponentClass[ISwatchColorPickerProps] = js.native
  /* static members */
  @js.native
  object ColorPickerGridCellBase extends js.Object {
    var defaultProps: PartialIColorPickerGridCe = js.native
  }
  
  /* static members */
  @js.native
  object SwatchColorPickerBase extends js.Object {
    var defaultProps: ISwatchColorPickerProps = js.native
  }
  
}

