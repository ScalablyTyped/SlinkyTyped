package typingsSlinky.reactNativeModal.modalMod

import slinky.core.SyntheticEvent
import slinky.core.TagMod
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewProps
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeAnimatable.mod.Animation
import typingsSlinky.reactNativeAnimatable.mod.CustomAnimation
import typingsSlinky.reactNativeModal.typesMod.Direction
import typingsSlinky.reactNativeModal.typesMod.OnOrientationChange
import typingsSlinky.reactNativeModal.typesMod.OrNull
import typingsSlinky.reactNativeModal.typesMod.Orientation
import typingsSlinky.reactNativeModal.typesMod.PresentationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModalProps extends ViewProps {
  var animationIn: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = js.native
  var animationInTiming: Double = js.native
  var animationOut: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = js.native
  var animationOutTiming: Double = js.native
  var avoidKeyboard: Boolean = js.native
  var backdropColor: String = js.native
  var backdropOpacity: Double = js.native
  var backdropTransitionInTiming: Double = js.native
  var backdropTransitionOutTiming: Double = js.native
  var children: TagMod[Any] = js.native
  var coverScreen: Boolean = js.native
  var customBackdrop: TagMod[Any] = js.native
  var deviceHeight: Double = js.native
  var deviceWidth: Double = js.native
  var hardwareAccelerated: js.UndefOr[Boolean] = js.native
  var hasBackdrop: Boolean = js.native
  var hideModalContentWhileAnimating: Boolean = js.native
  var isVisible: Boolean = js.native
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.native
  var onOrientationChange: js.UndefOr[OnOrientationChange] = js.native
  var onShow: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeCancel: js.UndefOr[js.Function0[Unit]] = js.native
  var onSwipeComplete: js.UndefOr[js.Function1[/* params */ OnSwipeCompleteParams, Unit]] = js.native
  var onSwipeMove: js.UndefOr[js.Function1[/* percentageShown */ Double, Unit]] = js.native
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.native
  var presentationStyle: js.UndefOr[PresentationStyle] = js.native
  var propagateSwipe: Boolean = js.native
  var scrollHorizontal: Boolean = js.native
  var scrollOffset: Double = js.native
  var scrollOffsetMax: Double = js.native
  var scrollTo: OrNull[js.Function1[/* e */ _, Unit]] = js.native
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.native
  var swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.native
  var swipeThreshold: Double = js.native
  var useNativeDriver: Boolean = js.native
  def onBackButtonPress(): Unit = js.native
  def onBackdropPress(): Unit = js.native
  def onModalHide(): Unit = js.native
  def onModalShow(): Unit = js.native
  def onModalWillHide(): Unit = js.native
  def onModalWillShow(): Unit = js.native
}

object ModalProps {
  @scala.inline
  def apply(
    animationIn: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]),
    animationInTiming: Double,
    animationOut: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]),
    animationOutTiming: Double,
    avoidKeyboard: Boolean,
    backdropColor: String,
    backdropOpacity: Double,
    backdropTransitionInTiming: Double,
    backdropTransitionOutTiming: Double,
    coverScreen: Boolean,
    deviceHeight: Double,
    deviceWidth: Double,
    hasBackdrop: Boolean,
    hideModalContentWhileAnimating: Boolean,
    isVisible: Boolean,
    onBackButtonPress: () => Unit,
    onBackdropPress: () => Unit,
    onModalHide: () => Unit,
    onModalShow: () => Unit,
    onModalWillHide: () => Unit,
    onModalWillShow: () => Unit,
    propagateSwipe: Boolean,
    scrollHorizontal: Boolean,
    scrollOffset: Double,
    scrollOffsetMax: Double,
    swipeThreshold: Double,
    useNativeDriver: Boolean
  ): ModalProps = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = js.Any.fromFunction0(onBackButtonPress), onBackdropPress = js.Any.fromFunction0(onBackdropPress), onModalHide = js.Any.fromFunction0(onModalHide), onModalShow = js.Any.fromFunction0(onModalShow), onModalWillHide = js.Any.fromFunction0(onModalWillHide), onModalWillShow = js.Any.fromFunction0(onModalWillShow), propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalProps]
  }
  @scala.inline
  implicit class ModalPropsOps[Self <: ModalProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationIn(value: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationInTiming(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationInTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOut(value: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOutTiming(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOutTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvoidKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdropColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdropOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdropTransitionInTiming(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransitionInTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdropTransitionOutTiming(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransitionOutTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverScreen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasBackdrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideModalContentWhileAnimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideModalContentWhileAnimating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBackButtonPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackButtonPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnBackdropPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackdropPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnModalHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnModalShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnModalWillHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalWillHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnModalWillShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalWillShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPropagateSwipe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateSwipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollOffsetMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffsetMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseNativeDriver(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDriver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomBackdrop(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomBackdrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBackdrop")(js.undefined)
        ret
    }
    @scala.inline
    def withHardwareAccelerated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareAccelerated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHardwareAccelerated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hardwareAccelerated")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDismiss(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnDismiss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDismiss")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOrientationChange(value: SyntheticEvent[NodeHandle, js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOrientationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOrientationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOrientationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeCancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeComplete(value: /* params */ OnSwipeCompleteParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeMove(value: /* percentageShown */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipeStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSwipeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withPresentationStyle(value: PresentationStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentationStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentationStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollTo(value: /* e */ _ => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withScrollToNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(null)
        ret
    }
    @scala.inline
    def withSupportedOrientations(value: js.Array[Orientation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOrientations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedOrientations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOrientations")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeDirection(value: Direction | js.Array[Direction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeDirection")(js.undefined)
        ret
    }
  }
  
}

