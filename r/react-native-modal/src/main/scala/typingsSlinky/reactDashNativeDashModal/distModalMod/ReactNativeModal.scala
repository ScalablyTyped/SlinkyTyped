package typingsSlinky.reactDashNativeDashModal.distModalMod

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashNative.reactDashNativeMod.PanResponderGestureState
import typingsSlinky.reactDashNative.reactDashNativeMod.PanResponderInstance
import typingsSlinky.reactDashNativeDashModal.Anon_AnimationIn
import typingsSlinky.reactDashNativeDashModal.Anon_AnimationInAnimationInTiming
import typingsSlinky.reactDashNativeDashModal.Anon_IsVisible
import typingsSlinky.reactDashNativeDashModal.distTypesMod.Direction
import typingsSlinky.reactDashNativeDashModal.distTypesMod.OrNull
import typingsSlinky.reactDashNativeDashModal.reactDashNativeDashModalStrings.down
import typingsSlinky.reactDashNativeDashModal.reactDashNativeDashModalStrings.left
import typingsSlinky.reactDashNativeDashModal.reactDashNativeDashModalStrings.right
import typingsSlinky.reactDashNativeDashModal.reactDashNativeDashModalStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-modal/dist/modal", "ReactNativeModal")
@js.native
class ReactNativeModal protected ()
  extends Component[ModalProps, State, js.Any] {
  def this(props: ModalProps) = this()
  var animationIn: String = js.native
  var animationOut: String = js.native
  var backdropRef: js.Any = js.native
  var contentRef: js.Any = js.native
  var currentSwipingDirection: OrNull[Direction] = js.native
  var inSwipeClosingState: Boolean = js.native
  var isTransitioning: Boolean = js.native
  var panResponder: OrNull[PanResponderInstance] = js.native
  def buildPanResponder(): Unit = js.native
  def calcDistancePercentage(gestureState: PanResponderGestureState): Double = js.native
  def close(): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactNativeModal(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactNativeModal(prevProps: ModalProps): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactNativeModal(): Unit = js.native
  def createAnimationEventForSwipe(): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def getAccDistancePerDirection(gestureState: PanResponderGestureState): Double = js.native
  def getSwipingDirection(gestureState: PanResponderGestureState): left | right | up | down = js.native
  def handleDimensionsUpdate(): Unit = js.native
  def isDirectionIncluded(direction: Direction): Boolean = js.native
  def isSwipeDirectionAllowed(hasDyDx: PanResponderGestureState): Boolean = js.native
  def open(): Unit = js.native
}

/* static members */
@JSImport("react-native-modal/dist/modal", "ReactNativeModal")
@js.native
object ReactNativeModal extends js.Object {
  var defaultProps: Anon_AnimationInAnimationInTiming = js.native
  var propTypes: Anon_AnimationIn = js.native
  def getDerivedStateFromProps(nextProps: ModalProps, state: State): Anon_IsVisible | Null = js.native
}

