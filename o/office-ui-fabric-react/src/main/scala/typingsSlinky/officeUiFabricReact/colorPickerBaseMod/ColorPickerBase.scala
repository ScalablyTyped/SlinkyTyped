package typingsSlinky.officeUiFabricReact.colorPickerBaseMod

import typingsSlinky.officeUiFabricReact.anon.PartialIColorPickerProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIColorPickerProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIColorPickerState
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPicker
import typingsSlinky.officeUiFabricReact.colorPickerTypesMod.IColorPickerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorPicker.base", "ColorPickerBase")
@js.native
object ColorPickerBase extends js.Object {
  
  var defaultProps: PartialIColorPickerProps = js.native
}
