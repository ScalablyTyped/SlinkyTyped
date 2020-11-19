package typingsSlinky.officeUiFabricReact.colorSliderBaseMod

import typingsSlinky.officeUiFabricReact.anon.PartialIColorSliderProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIColorSliderProps
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIColorSliderState
import typingsSlinky.officeUiFabricReact.colorSliderTypesMod.IColorSlider
import typingsSlinky.officeUiFabricReact.colorSliderTypesMod.IColorSliderProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base", "ColorSliderBase")
@js.native
class ColorSliderBase protected ()
  extends Component[IColorSliderProps, IColorSliderState, js.Any]
     with IColorSlider {
  def this(props: IColorSliderProps) = this()
  
  var _disposables: js.Any = js.native
  
  var _disposeListeners: js.Any = js.native
  
  val _maxValue: js.Any = js.native
  
  var _onKeyDown: js.Any = js.native
  
  var _onMouseDown: js.Any = js.native
  
  var _onMouseMove: js.Any = js.native
  
  var _root: js.Any = js.native
  
  val _type: js.Any = js.native
  
  var _updateValue: js.Any = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MColorSliderBase(prevProps: ReadonlyIColorSliderProps, prevState: ReadonlyIColorSliderState): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MColorSliderBase(): Unit = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.base", "ColorSliderBase")
@js.native
object ColorSliderBase extends js.Object {
  
  var defaultProps: PartialIColorSliderProps = js.native
}
