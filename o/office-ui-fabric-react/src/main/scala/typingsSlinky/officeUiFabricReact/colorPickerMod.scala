package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.PartialIColorPickerProps
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker", "ColorPicker")
  @js.native
  val ColorPicker: ReactComponentClass[IColorPickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker", "ColorPickerBase")
  @js.native
  class ColorPickerBase protected ()
    extends typingsSlinky.officeUiFabricReact.colorPickerBaseMod.ColorPickerBase {
    def this(props: IColorPickerProps) = this()
  }
  /* static members */
  object ColorPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker", "ColorPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker", "ColorPickerBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorPickerProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialIColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
