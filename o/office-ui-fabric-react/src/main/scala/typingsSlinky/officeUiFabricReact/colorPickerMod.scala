package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.PartialIColorPickerProps
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/ColorPicker", JSImport.Namespace)
@js.native
object colorPickerMod extends js.Object {
  
  val ColorPicker: ReactComponentClass[IColorPickerProps] = js.native
  
  @js.native
  class ColorPickerBase protected ()
    extends typingsSlinky.officeUiFabricReact.colorPickerBaseMod.ColorPickerBase {
    def this(props: IColorPickerProps) = this()
  }
  /* static members */
  @js.native
  object ColorPickerBase extends js.Object {
    
    var defaultProps: PartialIColorPickerProps = js.native
  }
}
