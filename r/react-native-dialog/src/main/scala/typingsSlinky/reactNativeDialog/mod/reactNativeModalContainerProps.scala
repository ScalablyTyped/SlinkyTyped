package typingsSlinky.reactNativeDialog.mod

import slinky.core.SyntheticEvent
import slinky.core.TagMod
import typingsSlinky.reactNative.mod.ImageStyle
import typingsSlinky.reactNative.mod.NodeHandle
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeAnimatable.mod.Animation
import typingsSlinky.reactNativeAnimatable.mod.CustomAnimation
import typingsSlinky.reactNativeModal.modalMod.OnSwipeCompleteParams
import typingsSlinky.reactNativeModal.typesMod.Direction
import typingsSlinky.reactNativeModal.typesMod.OnOrientationChange
import typingsSlinky.reactNativeModal.typesMod.OrNull
import typingsSlinky.reactNativeModal.typesMod.Orientation
import typingsSlinky.reactNativeModal.typesMod.PresentationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<react-native-modal.react-native-modal.ModalProps, std.Exclude<keyof react-native-modal.react-native-modal.ModalProps, 'isVisible'>>> */
trait reactNativeModalContainerProps extends js.Object {
  var animationIn: js.UndefOr[Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.undefined
  var animationInTiming: js.UndefOr[Double] = js.undefined
  var animationOut: js.UndefOr[Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle])] = js.undefined
  var animationOutTiming: js.UndefOr[Double] = js.undefined
  var avoidKeyboard: js.UndefOr[Boolean] = js.undefined
  var backdropColor: js.UndefOr[String] = js.undefined
  var backdropOpacity: js.UndefOr[Double] = js.undefined
  var backdropTransitionInTiming: js.UndefOr[Double] = js.undefined
  var backdropTransitionOutTiming: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var coverScreen: js.UndefOr[Boolean] = js.undefined
  var customBackdrop: js.UndefOr[TagMod[Any]] = js.undefined
  var deviceHeight: js.UndefOr[Double] = js.undefined
  var deviceWidth: js.UndefOr[Double] = js.undefined
  var hardwareAccelerated: js.UndefOr[Boolean] = js.undefined
  var hasBackdrop: js.UndefOr[Boolean] = js.undefined
  var hideModalContentWhileAnimating: js.UndefOr[Boolean] = js.undefined
  var onBackButtonPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onBackdropPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onDismiss: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalWillHide: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onModalWillShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onOrientationChange: js.UndefOr[OnOrientationChange] = js.undefined
  var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeCancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSwipeComplete: js.UndefOr[js.Function1[/* params */ OnSwipeCompleteParams, Unit]] = js.undefined
  var onSwipeMove: js.UndefOr[js.Function1[/* percentageShown */ Double, Unit]] = js.undefined
  var onSwipeStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  var presentationStyle: js.UndefOr[PresentationStyle] = js.undefined
  var propagateSwipe: js.UndefOr[Boolean] = js.undefined
  var scrollHorizontal: js.UndefOr[Boolean] = js.undefined
  var scrollOffset: js.UndefOr[Double] = js.undefined
  var scrollOffsetMax: js.UndefOr[Double] = js.undefined
  var scrollTo: js.UndefOr[OrNull[js.Function1[/* e */ _, Unit]]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var supportedOrientations: js.UndefOr[js.Array[Orientation]] = js.undefined
  var swipeDirection: js.UndefOr[Direction | js.Array[Direction]] = js.undefined
  var swipeThreshold: js.UndefOr[Double] = js.undefined
  var useNativeDriver: js.UndefOr[Boolean] = js.undefined
}

object reactNativeModalContainerProps {
  @scala.inline
  def apply(
    animationIn: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = null,
    animationInTiming: Int | Double = null,
    animationOut: Animation | (CustomAnimation[TextStyle with ViewStyle with ImageStyle]) = null,
    animationOutTiming: Int | Double = null,
    avoidKeyboard: js.UndefOr[Boolean] = js.undefined,
    backdropColor: String = null,
    backdropOpacity: Int | Double = null,
    backdropTransitionInTiming: Int | Double = null,
    backdropTransitionOutTiming: Int | Double = null,
    children: TagMod[Any] = null,
    coverScreen: js.UndefOr[Boolean] = js.undefined,
    customBackdrop: TagMod[Any] = null,
    deviceHeight: Int | Double = null,
    deviceWidth: Int | Double = null,
    hardwareAccelerated: js.UndefOr[Boolean] = js.undefined,
    hasBackdrop: js.UndefOr[Boolean] = js.undefined,
    hideModalContentWhileAnimating: js.UndefOr[Boolean] = js.undefined,
    onBackButtonPress: () => Unit = null,
    onBackdropPress: () => Unit = null,
    onDismiss: () => Unit = null,
    onModalHide: () => Unit = null,
    onModalShow: () => Unit = null,
    onModalWillHide: () => Unit = null,
    onModalWillShow: () => Unit = null,
    onOrientationChange: SyntheticEvent[NodeHandle, js.Any] => Unit = null,
    onShow: () => Unit = null,
    onSwipeCancel: () => Unit = null,
    onSwipeComplete: /* params */ OnSwipeCompleteParams => Unit = null,
    onSwipeMove: /* percentageShown */ Double => Unit = null,
    onSwipeStart: () => Unit = null,
    presentationStyle: PresentationStyle = null,
    propagateSwipe: js.UndefOr[Boolean] = js.undefined,
    scrollHorizontal: js.UndefOr[Boolean] = js.undefined,
    scrollOffset: Int | Double = null,
    scrollOffsetMax: Int | Double = null,
    scrollTo: /* e */ _ => Unit = null,
    style: StyleProp[ViewStyle] = null,
    supportedOrientations: js.Array[Orientation] = null,
    swipeDirection: Direction | js.Array[Direction] = null,
    swipeThreshold: Int | Double = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined
  ): reactNativeModalContainerProps = {
    val __obj = js.Dynamic.literal()
    if (animationIn != null) __obj.updateDynamic("animationIn")(animationIn.asInstanceOf[js.Any])
    if (animationInTiming != null) __obj.updateDynamic("animationInTiming")(animationInTiming.asInstanceOf[js.Any])
    if (animationOut != null) __obj.updateDynamic("animationOut")(animationOut.asInstanceOf[js.Any])
    if (animationOutTiming != null) __obj.updateDynamic("animationOutTiming")(animationOutTiming.asInstanceOf[js.Any])
    if (!js.isUndefined(avoidKeyboard)) __obj.updateDynamic("avoidKeyboard")(avoidKeyboard.asInstanceOf[js.Any])
    if (backdropColor != null) __obj.updateDynamic("backdropColor")(backdropColor.asInstanceOf[js.Any])
    if (backdropOpacity != null) __obj.updateDynamic("backdropOpacity")(backdropOpacity.asInstanceOf[js.Any])
    if (backdropTransitionInTiming != null) __obj.updateDynamic("backdropTransitionInTiming")(backdropTransitionInTiming.asInstanceOf[js.Any])
    if (backdropTransitionOutTiming != null) __obj.updateDynamic("backdropTransitionOutTiming")(backdropTransitionOutTiming.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(coverScreen)) __obj.updateDynamic("coverScreen")(coverScreen.asInstanceOf[js.Any])
    if (customBackdrop != null) __obj.updateDynamic("customBackdrop")(customBackdrop.asInstanceOf[js.Any])
    if (deviceHeight != null) __obj.updateDynamic("deviceHeight")(deviceHeight.asInstanceOf[js.Any])
    if (deviceWidth != null) __obj.updateDynamic("deviceWidth")(deviceWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(hardwareAccelerated)) __obj.updateDynamic("hardwareAccelerated")(hardwareAccelerated.asInstanceOf[js.Any])
    if (!js.isUndefined(hasBackdrop)) __obj.updateDynamic("hasBackdrop")(hasBackdrop.asInstanceOf[js.Any])
    if (!js.isUndefined(hideModalContentWhileAnimating)) __obj.updateDynamic("hideModalContentWhileAnimating")(hideModalContentWhileAnimating.asInstanceOf[js.Any])
    if (onBackButtonPress != null) __obj.updateDynamic("onBackButtonPress")(js.Any.fromFunction0(onBackButtonPress))
    if (onBackdropPress != null) __obj.updateDynamic("onBackdropPress")(js.Any.fromFunction0(onBackdropPress))
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction0(onDismiss))
    if (onModalHide != null) __obj.updateDynamic("onModalHide")(js.Any.fromFunction0(onModalHide))
    if (onModalShow != null) __obj.updateDynamic("onModalShow")(js.Any.fromFunction0(onModalShow))
    if (onModalWillHide != null) __obj.updateDynamic("onModalWillHide")(js.Any.fromFunction0(onModalWillHide))
    if (onModalWillShow != null) __obj.updateDynamic("onModalWillShow")(js.Any.fromFunction0(onModalWillShow))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1(onOrientationChange))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (onSwipeCancel != null) __obj.updateDynamic("onSwipeCancel")(js.Any.fromFunction0(onSwipeCancel))
    if (onSwipeComplete != null) __obj.updateDynamic("onSwipeComplete")(js.Any.fromFunction1(onSwipeComplete))
    if (onSwipeMove != null) __obj.updateDynamic("onSwipeMove")(js.Any.fromFunction1(onSwipeMove))
    if (onSwipeStart != null) __obj.updateDynamic("onSwipeStart")(js.Any.fromFunction0(onSwipeStart))
    if (presentationStyle != null) __obj.updateDynamic("presentationStyle")(presentationStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(propagateSwipe)) __obj.updateDynamic("propagateSwipe")(propagateSwipe.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollHorizontal)) __obj.updateDynamic("scrollHorizontal")(scrollHorizontal.asInstanceOf[js.Any])
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (scrollOffsetMax != null) __obj.updateDynamic("scrollOffsetMax")(scrollOffsetMax.asInstanceOf[js.Any])
    if (scrollTo != null) __obj.updateDynamic("scrollTo")(js.Any.fromFunction1(scrollTo))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (swipeDirection != null) __obj.updateDynamic("swipeDirection")(swipeDirection.asInstanceOf[js.Any])
    if (swipeThreshold != null) __obj.updateDynamic("swipeThreshold")(swipeThreshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[reactNativeModalContainerProps]
  }
}

