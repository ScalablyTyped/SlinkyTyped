package typingsSlinky.officeUiFabricReact.colorRectangleBaseMod

import typingsSlinky.officeUiFabricReact.anon.PartialIColorRectanglePro
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIColorRectanglePr
import typingsSlinky.officeUiFabricReact.anon.ReadonlyIColorRectangleSt
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangle
import typingsSlinky.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "ColorRectangleBase")
@js.native
class ColorRectangleBase protected ()
  extends Component[IColorRectangleProps, IColorRectangleState, js.Any]
     with IColorRectangle {
  def this(props: IColorRectangleProps) = this()
  
  var _descriptionId: js.Any = js.native
  
  var _disposables: js.Any = js.native
  
  var _disposeListeners: js.Any = js.native
  
  var _isAdjustingSaturation: js.Any = js.native
  
  var _onKeyDown: js.Any = js.native
  
  var _onMouseDown: js.Any = js.native
  
  var _onMouseMove: js.Any = js.native
  
  var _root: js.Any = js.native
  
  var _updateColor: js.Any = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MColorRectangleBase(prevProps: ReadonlyIColorRectanglePr, prevState: ReadonlyIColorRectangleSt): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MColorRectangleBase(): Unit = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "ColorRectangleBase")
@js.native
object ColorRectangleBase extends js.Object {
  
  var defaultProps: PartialIColorRectanglePro = js.native
}
