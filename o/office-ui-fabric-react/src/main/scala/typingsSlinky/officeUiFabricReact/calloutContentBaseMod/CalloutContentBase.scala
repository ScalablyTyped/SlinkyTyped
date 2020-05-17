package typingsSlinky.officeUiFabricReact.calloutContentBaseMod

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.anon.DirectionalHint
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Callout/CalloutContent.base", "CalloutContentBase")
@js.native
class CalloutContentBase protected ()
  extends Component[ICalloutProps, ICalloutState, js.Any] {
  def this(props: ICalloutProps) = this()
  var _addListeners: js.Any = js.native
  var _arePositionsEqual: js.Any = js.native
  var _async: js.Any = js.native
  var _blockResetHeight: js.Any = js.native
  var _bounds: js.Any = js.native
  var _calloutElement: js.Any = js.native
  var _classNames: js.Any = js.native
  var _comparePositions: js.Any = js.native
  var _didPositionPropsChange: js.Any = js.native
  var _didSetInitialFocus: js.Any = js.native
  var _dismissOnClickOrScroll: js.Any = js.native
  var _disposables: js.Any = js.native
  var _getBeakPosition: js.Any = js.native
  var _getBounds: js.Any = js.native
  var _getMaxHeight: js.Any = js.native
  var _getTarget: js.Any = js.native
  var _hasListeners: js.Any = js.native
  var _hostElement: js.Any = js.native
  var _isMouseDownOnPopup: js.Any = js.native
  var _maxHeight: js.Any = js.native
  var _mouseDownOnPopup: js.Any = js.native
  var _mouseUpOnPopup: js.Any = js.native
  var _positionAttempts: js.Any = js.native
  var _removeListeners: js.Any = js.native
  var _setHeightOffsetEveryFrame: js.Any = js.native
  var _setHeightOffsetTimer: js.Any = js.native
  var _setTargetWindowAndElement: js.Any = js.native
  var _target: js.Any = js.native
  var _targetWindow: js.Any = js.native
  var _updateAsyncPosition: js.Any = js.native
  var _updatePosition: js.Any = js.native
  @JSName("UNSAFE_componentWillMount")
  def UNSAFE_componentWillMount_MCalloutContentBase(): Unit = js.native
  @JSName("UNSAFE_componentWillUpdate")
  def UNSAFE_componentWillUpdate_MCalloutContentBase(newProps: ICalloutProps): Unit = js.native
  /* protected */ def _dismissOnLostFocus(ev: Event): Unit = js.native
  /* protected */ def _dismissOnResize(ev: Event): Unit = js.native
  /* protected */ def _dismissOnScroll(ev: Event): Unit = js.native
  /* protected */ def _onComponentDidMount(): Unit = js.native
  /* protected */ def _setInitialFocus(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCalloutContentBase(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCalloutContentBase(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCalloutContentBase(): Unit = js.native
  def dismiss(): Unit = js.native
  def dismiss(ev: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
  def dismiss(ev: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  def dismiss(ev: Event): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCalloutContentBase(newProps: ICalloutProps, newState: ICalloutState): Boolean = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Callout/CalloutContent.base", "CalloutContentBase")
@js.native
object CalloutContentBase extends js.Object {
  var defaultProps: DirectionalHint = js.native
}

