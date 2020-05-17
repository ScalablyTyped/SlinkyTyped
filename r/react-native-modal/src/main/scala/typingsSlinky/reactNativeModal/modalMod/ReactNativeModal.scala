package typingsSlinky.reactNativeModal.modalMod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNative.mod.PanResponderGestureState
import typingsSlinky.reactNative.mod.PanResponderInstance
import typingsSlinky.reactNativeModal.anon.AnimationIn
import typingsSlinky.reactNativeModal.anon.AnimationInTiming
import typingsSlinky.reactNativeModal.anon.IsVisible
import typingsSlinky.reactNativeModal.reactNativeModalStrings.down
import typingsSlinky.reactNativeModal.reactNativeModalStrings.left
import typingsSlinky.reactNativeModal.reactNativeModalStrings.right
import typingsSlinky.reactNativeModal.reactNativeModalStrings.up
import typingsSlinky.reactNativeModal.typesMod.Direction
import typingsSlinky.reactNativeModal.typesMod.OrNull
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
  var defaultProps: AnimationInTiming = js.native
  var propTypes: AnimationIn = js.native
  def getDerivedStateFromProps(nextProps: ModalProps, state: State): IsVisible | Null = js.native
}

