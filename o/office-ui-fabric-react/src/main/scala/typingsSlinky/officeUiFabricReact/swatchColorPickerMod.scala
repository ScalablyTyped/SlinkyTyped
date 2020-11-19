package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.PartialIColorPickerGridCe
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellProps
import typingsSlinky.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/SwatchColorPicker", JSImport.Namespace)
@js.native
object swatchColorPickerMod extends js.Object {
  
  val ColorPickerGridCell: ReactComponentClass[IColorPickerGridCellProps] = js.native
  
  val SwatchColorPicker: ReactComponentClass[ISwatchColorPickerProps] = js.native
  
  @js.native
  class ColorPickerGridCellBase ()
    extends typingsSlinky.officeUiFabricReact.colorPickerGridCellBaseMod.ColorPickerGridCellBase
  /* static members */
  @js.native
  object ColorPickerGridCellBase extends js.Object {
    
    var defaultProps: PartialIColorPickerGridCe = js.native
  }
  
  @js.native
  class SwatchColorPickerBase protected ()
    extends typingsSlinky.officeUiFabricReact.swatchColorPickerBaseMod.SwatchColorPickerBase {
    def this(props: ISwatchColorPickerProps) = this()
  }
  /* static members */
  @js.native
  object SwatchColorPickerBase extends js.Object {
    
    var defaultProps: ISwatchColorPickerProps = js.native
  }
}
