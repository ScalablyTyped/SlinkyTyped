package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.anon.PartialIColorPickerGridCe
import typingsSlinky.officeUiFabricReact.colorPickerGridCellTypesMod.IColorPickerGridCellProps
import typingsSlinky.officeUiFabricReact.swatchColorPickerTypesMod.ISwatchColorPickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwatchColorPickerMod {
  
  @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "ColorPickerGridCell")
  @js.native
  val ColorPickerGridCell: ReactComponentClass[IColorPickerGridCellProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "ColorPickerGridCellBase")
  @js.native
  class ColorPickerGridCellBase protected ()
    extends typingsSlinky.officeUiFabricReact.swatchColorPickerMod.ColorPickerGridCellBase {
    def this(props: IColorPickerGridCellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IColorPickerGridCellProps, context: js.Any) = this()
  }
  /* static members */
  object ColorPickerGridCellBase {
    
    @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "ColorPickerGridCellBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "ColorPickerGridCellBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorPickerGridCe = js.native
    @scala.inline
    def defaultProps_=(x: PartialIColorPickerGridCe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "SwatchColorPicker")
  @js.native
  val SwatchColorPicker: ReactComponentClass[ISwatchColorPickerProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "SwatchColorPickerBase")
  @js.native
  class SwatchColorPickerBase protected ()
    extends typingsSlinky.officeUiFabricReact.swatchColorPickerMod.SwatchColorPickerBase {
    def this(props: ISwatchColorPickerProps) = this()
  }
  /* static members */
  object SwatchColorPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "SwatchColorPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/SwatchColorPicker", "SwatchColorPickerBase.defaultProps")
    @js.native
    def defaultProps: ISwatchColorPickerProps = js.native
    @scala.inline
    def defaultProps_=(x: ISwatchColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
