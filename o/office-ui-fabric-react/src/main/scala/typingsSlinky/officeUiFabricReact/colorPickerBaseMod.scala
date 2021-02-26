package typingsSlinky.officeUiFabricReact

import typingsSlinky.officeUiFabricReact.anon.PartialIColorPickerProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIColorPickerProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIColorPickerState
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPicker
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps
import typingsSlinky.officeUiFabricReact.interfacesMod.IColor
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorPickerBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase")
  @js.native
  class ColorPickerBase protected ()
    extends Component[IColorPickerProps, IColorPickerState, js.Any]
       with IColorPicker {
    def this(props: IColorPickerProps) = this()
    
    var _getDisplayValue: js.Any = js.native
    
    /** Callback for when the alpha/transparency slider changes */
    var _onATChanged: js.Any = js.native
    
    var _onBlur: js.Any = js.native
    
    var _onHChanged: js.Any = js.native
    
    var _onSVChanged: js.Any = js.native
    
    var _onTextChange: js.Any = js.native
    
    /** Strings besides red/green/blue/alpha/hex, with defaults for all values except the deprecated `hue` */
    var _strings: js.Any = js.native
    
    var _textChangeHandlers: js.Any = js.native
    
    /**
      * Strings displayed in the UI as text field labels (these are in a separate object for convenient
      * indexing by short color component name).
      */
    var _textLabels: js.Any = js.native
    
    /**
      * Update the displayed color and call change handlers if appropriate.
      * @param ev - Event if call was triggered by an event (undefined if triggered by props change)
      * @param newColor - Updated color
      */
    var _updateColor: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MColorPickerBase(prevProps: ReadonlyIColorPickerProps, prevState: ReadonlyIColorPickerState): Unit = js.native
  }
  /* static members */
  object ColorPickerBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorPickerProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialIColorPickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined keyof std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/utilities/color/interfaces.IColor, 'r' | 'g' | 'b' | 'a' | 't' | 'hex'> */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.g
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.b
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.a
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.r
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.hex
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.t
  */
  trait ColorComponent extends StObject
  object ColorComponent {
    
    @scala.inline
    def a: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.a = "a".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.a]
    
    @scala.inline
    def b: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.b = "b".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.b]
    
    @scala.inline
    def g: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.g = "g".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.g]
    
    @scala.inline
    def hex: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.hex = "hex".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.hex]
    
    @scala.inline
    def r: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.r = "r".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.r]
    
    @scala.inline
    def t: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.t = "t".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.t]
  }
  
  @js.native
  trait IColorPickerState extends StObject {
    
    /** Most recently selected color */
    var color: IColor = js.native
    
    /** Color component currently being edited via a text field (if intermediate value is invalid) */
    var editingColor: js.UndefOr[typingsSlinky.officeUiFabricReact.anon.Component] = js.native
  }
  object IColorPickerState {
    
    @scala.inline
    def apply(color: IColor): IColorPickerState = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorPickerState]
    }
    
    @scala.inline
    implicit class IColorPickerStateMutableBuilder[Self <: IColorPickerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditingColor(value: typingsSlinky.officeUiFabricReact.anon.Component): Self = StObject.set(x, "editingColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditingColorUndefined: Self = StObject.set(x, "editingColor", js.undefined)
    }
  }
}
