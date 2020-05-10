package typingsSlinky.officeUiFabricReact.coachmarkBaseMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.PartialICoachmarkProps
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmark
import typingsSlinky.officeUiFabricReact.coachmarkTypesMod.ICoachmarkProps
import typingsSlinky.react.mod.Component
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "CoachmarkBase")
@js.native
class CoachmarkBase protected ()
  extends Component[ICoachmarkProps, ICoachmarkState, js.Any]
     with ICoachmark {
  def this(props: ICoachmarkProps) = this()
  var _addListeners: js.Any = js.native
  var _addProximityHandler: js.Any = js.native
  var _ariaAlertContainer: js.Any = js.native
  var _async: js.Any = js.native
  val _beakDirection: js.Any = js.native
  var _childrenContainer: js.Any = js.native
  var _dismissOnLostFocus: js.Any = js.native
  /**
    * The cached HTMLElement reference to the Entity Inner Host
    * element.
    */
  var _entityHost: js.Any = js.native
  var _entityInnerHostElement: js.Any = js.native
  var _events: js.Any = js.native
  var _getBounds: js.Any = js.native
  var _isInsideElement: js.Any = js.native
  var _onFocusHandler: js.Any = js.native
  var _onKeyDown: js.Any = js.native
  var _onPositioned: js.Any = js.native
  var _openCoachmark: js.Any = js.native
  var _positioningContainer: js.Any = js.native
  var _setBeakPosition: js.Any = js.native
  var _setTargetElementRect: js.Any = js.native
  /**
    * The target element the mouse would be in
    * proximity to
    */
  var _targetElementRect: js.Any = js.native
  var _translateAnimationContainer: js.Any = js.native
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MCoachmarkBase(newProps: ICoachmarkProps): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MCoachmarkBase(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MCoachmarkBase(prevProps: ICoachmarkProps, prevState: ICoachmarkState): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MCoachmarkBase(): Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(): Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(ev: SyntheticKeyboardEvent[HTMLElement]): Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(ev: SyntheticMouseEvent[HTMLElement]): Unit = js.native
  @JSName("dismiss")
  def dismiss_MCoachmarkBase(ev: Event_): Unit = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MCoachmarkBase(newProps: ICoachmarkProps, newState: ICoachmarkState): Boolean = js.native
}

/* static members */
@JSImport("office-ui-fabric-react/lib/components/Coachmark/Coachmark.base", "CoachmarkBase")
@js.native
object CoachmarkBase extends js.Object {
  var defaultProps: PartialICoachmarkProps = js.native
}

