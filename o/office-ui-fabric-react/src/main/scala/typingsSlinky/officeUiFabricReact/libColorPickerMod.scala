package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.PartialIColorPickerProps
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColorPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/ColorPicker", "ColorPicker")
  @js.native
  val ColorPicker: ReactComponentClass[IColorPickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/ColorPicker", "ColorPickerBase")
  @js.native
  class ColorPickerBase protected ()
    extends typingsSlinky.officeUiFabricReact.colorPickerMod.ColorPickerBase {
    def this(props: IColorPickerProps) = this()
  }
  /* static members */
  object ColorPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/ColorPicker", "ColorPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/ColorPicker", "ColorPickerBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorPickerProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialIColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
