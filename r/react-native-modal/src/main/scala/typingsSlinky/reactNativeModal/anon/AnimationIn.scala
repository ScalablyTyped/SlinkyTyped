package typingsSlinky.reactNativeModal.anon

import typingsSlinky.propTypes.mod.ReactElementLike
import typingsSlinky.propTypes.mod.ReactNodeArray
import typingsSlinky.propTypes.mod.ReactNodeLike
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationIn extends js.Object {
  var animationIn: Requireable[String | js.Object] = js.native
  var animationInTiming: Requireable[Double] = js.native
  var animationOut: Requireable[String | js.Object] = js.native
  var animationOutTiming: Requireable[Double] = js.native
  var avoidKeyboard: Requireable[Boolean] = js.native
  var backdropColor: Requireable[String] = js.native
  var backdropOpacity: Requireable[Double] = js.native
  var backdropTransitionInTiming: Requireable[Double] = js.native
  var backdropTransitionOutTiming: Requireable[Double] = js.native
  var children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray] = js.native
  var coverScreen: Requireable[Boolean] = js.native
  var customBackdrop: Requireable[ReactNodeLike] = js.native
  var deviceHeight: Requireable[Double] = js.native
  var deviceWidth: Requireable[Double] = js.native
  var hasBackdrop: Requireable[Boolean] = js.native
  var hideModalContentWhileAnimating: Requireable[Boolean] = js.native
  var isVisible: Validator[Boolean] = js.native
  var onBackButtonPress: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onBackdropPress: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onModalHide: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onModalShow: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onModalWillHide: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onModalWillShow: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onSwipeCancel: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onSwipeComplete: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onSwipeMove: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onSwipeStart: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var propagateSwipe: Requireable[Boolean] = js.native
  var scrollHorizontal: Requireable[Boolean] = js.native
  var scrollOffset: Requireable[Double] = js.native
  var scrollOffsetMax: Requireable[Double] = js.native
  var scrollTo: Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var style: Requireable[_] = js.native
  var supportedOrientations: Requireable[js.Array[js.UndefOr[String | Null]]] = js.native
  var swipeDirection: Requireable[String | (js.Array[js.UndefOr[String | Null]])] = js.native
  var swipeThreshold: Requireable[Double] = js.native
  var useNativeDriver: Requireable[Boolean] = js.native
}

object AnimationIn {
  @scala.inline
  def apply(
    animationIn: Requireable[String | js.Object],
    animationInTiming: Requireable[Double],
    animationOut: Requireable[String | js.Object],
    animationOutTiming: Requireable[Double],
    avoidKeyboard: Requireable[Boolean],
    backdropColor: Requireable[String],
    backdropOpacity: Requireable[Double],
    backdropTransitionInTiming: Requireable[Double],
    backdropTransitionOutTiming: Requireable[Double],
    children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray],
    coverScreen: Requireable[Boolean],
    customBackdrop: Requireable[ReactNodeLike],
    deviceHeight: Requireable[Double],
    deviceWidth: Requireable[Double],
    hasBackdrop: Requireable[Boolean],
    hideModalContentWhileAnimating: Requireable[Boolean],
    isVisible: Validator[Boolean],
    onBackButtonPress: Requireable[js.Function1[/* repeated */ _, _]],
    onBackdropPress: Requireable[js.Function1[/* repeated */ _, _]],
    onModalHide: Requireable[js.Function1[/* repeated */ _, _]],
    onModalShow: Requireable[js.Function1[/* repeated */ _, _]],
    onModalWillHide: Requireable[js.Function1[/* repeated */ _, _]],
    onModalWillShow: Requireable[js.Function1[/* repeated */ _, _]],
    onSwipeCancel: Requireable[js.Function1[/* repeated */ _, _]],
    onSwipeComplete: Requireable[js.Function1[/* repeated */ _, _]],
    onSwipeMove: Requireable[js.Function1[/* repeated */ _, _]],
    onSwipeStart: Requireable[js.Function1[/* repeated */ _, _]],
    propagateSwipe: Requireable[Boolean],
    scrollHorizontal: Requireable[Boolean],
    scrollOffset: Requireable[Double],
    scrollOffsetMax: Requireable[Double],
    scrollTo: Requireable[js.Function1[/* repeated */ _, _]],
    style: Requireable[_],
    supportedOrientations: Requireable[js.Array[js.UndefOr[String | Null]]],
    swipeDirection: Requireable[String | (js.Array[js.UndefOr[String | Null]])],
    swipeThreshold: Requireable[Double],
    useNativeDriver: Requireable[Boolean]
  ): AnimationIn = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], customBackdrop = customBackdrop.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = onBackButtonPress.asInstanceOf[js.Any], onBackdropPress = onBackdropPress.asInstanceOf[js.Any], onModalHide = onModalHide.asInstanceOf[js.Any], onModalShow = onModalShow.asInstanceOf[js.Any], onModalWillHide = onModalWillHide.asInstanceOf[js.Any], onModalWillShow = onModalWillShow.asInstanceOf[js.Any], onSwipeCancel = onSwipeCancel.asInstanceOf[js.Any], onSwipeComplete = onSwipeComplete.asInstanceOf[js.Any], onSwipeMove = onSwipeMove.asInstanceOf[js.Any], onSwipeStart = onSwipeStart.asInstanceOf[js.Any], propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], scrollTo = scrollTo.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], supportedOrientations = supportedOrientations.asInstanceOf[js.Any], swipeDirection = swipeDirection.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationIn]
  }
  @scala.inline
  implicit class AnimationInOps[Self <: AnimationIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationIn(value: Requireable[String | js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationInTiming(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationInTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOut(value: Requireable[String | js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOutTiming(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationOutTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvoidKeyboard(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoidKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdropColor(value: Requireable[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdropOpacity(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdropTransitionInTiming(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransitionInTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackdropTransitionOutTiming(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backdropTransitionOutTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoverScreen(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coverScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomBackdrop(value: Requireable[ReactNodeLike]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceHeight(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceWidth(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasBackdrop(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHideModalContentWhileAnimating(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideModalContentWhileAnimating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Validator[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBackButtonPress(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackButtonPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnBackdropPress(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackdropPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnModalHide(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnModalShow(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnModalWillHide(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalWillHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnModalWillShow(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalWillShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSwipeCancel(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSwipeComplete(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeComplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSwipeMove(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnSwipeStart(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropagateSwipe(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propagateSwipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollHorizontal(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollOffset(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollOffsetMax(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOffsetMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollTo(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: Requireable[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedOrientations(value: Requireable[js.Array[js.UndefOr[String | Null]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOrientations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeDirection(value: Requireable[String | (js.Array[js.UndefOr[String | Null]])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeThreshold(value: Requireable[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseNativeDriver(value: Requireable[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useNativeDriver")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

