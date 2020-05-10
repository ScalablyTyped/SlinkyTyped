package typingsSlinky.reactNativeModal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAnimationInTiming extends js.Object {
  var animationIn: String = js.native
  var animationInTiming: Double = js.native
  var animationOut: String = js.native
  var animationOutTiming: Double = js.native
  var avoidKeyboard: Boolean = js.native
  var backdropColor: String = js.native
  var backdropOpacity: Double = js.native
  var backdropTransitionInTiming: Double = js.native
  var backdropTransitionOutTiming: Double = js.native
  var coverScreen: Boolean = js.native
  var customBackdrop: Null = js.native
  var deviceHeight: Null = js.native
  var deviceWidth: Null = js.native
  var hasBackdrop: Boolean = js.native
  var hideModalContentWhileAnimating: Boolean = js.native
  var isVisible: Boolean = js.native
  var propagateSwipe: Boolean = js.native
  var scrollHorizontal: Boolean = js.native
  var scrollOffset: Double = js.native
  var scrollOffsetMax: Double = js.native
  var scrollTo: Null = js.native
  var supportedOrientations: js.Array[String] = js.native
  var swipeThreshold: Double = js.native
  var useNativeDriver: Boolean = js.native
  def onBackButtonPress(): Null = js.native
  def onBackdropPress(): Null = js.native
  def onModalHide(): Null = js.native
  def onModalShow(): Null = js.native
  def onModalWillHide(): Null = js.native
  def onModalWillShow(): Null = js.native
}

object AnonAnimationInTiming {
  @scala.inline
  def apply(
    animationIn: String,
    animationInTiming: Double,
    animationOut: String,
    animationOutTiming: Double,
    avoidKeyboard: Boolean,
    backdropColor: String,
    backdropOpacity: Double,
    backdropTransitionInTiming: Double,
    backdropTransitionOutTiming: Double,
    coverScreen: Boolean,
    customBackdrop: Null,
    deviceHeight: Null,
    deviceWidth: Null,
    hasBackdrop: Boolean,
    hideModalContentWhileAnimating: Boolean,
    isVisible: Boolean,
    onBackButtonPress: () => Null,
    onBackdropPress: () => Null,
    onModalHide: () => Null,
    onModalShow: () => Null,
    onModalWillHide: () => Null,
    onModalWillShow: () => Null,
    propagateSwipe: Boolean,
    scrollHorizontal: Boolean,
    scrollOffset: Double,
    scrollOffsetMax: Double,
    scrollTo: Null,
    supportedOrientations: js.Array[String],
    swipeThreshold: Double,
    useNativeDriver: Boolean
  ): AnonAnimationInTiming = {
    val __obj = js.Dynamic.literal(animationIn = animationIn.asInstanceOf[js.Any], animationInTiming = animationInTiming.asInstanceOf[js.Any], animationOut = animationOut.asInstanceOf[js.Any], animationOutTiming = animationOutTiming.asInstanceOf[js.Any], avoidKeyboard = avoidKeyboard.asInstanceOf[js.Any], backdropColor = backdropColor.asInstanceOf[js.Any], backdropOpacity = backdropOpacity.asInstanceOf[js.Any], backdropTransitionInTiming = backdropTransitionInTiming.asInstanceOf[js.Any], backdropTransitionOutTiming = backdropTransitionOutTiming.asInstanceOf[js.Any], coverScreen = coverScreen.asInstanceOf[js.Any], customBackdrop = customBackdrop.asInstanceOf[js.Any], deviceHeight = deviceHeight.asInstanceOf[js.Any], deviceWidth = deviceWidth.asInstanceOf[js.Any], hasBackdrop = hasBackdrop.asInstanceOf[js.Any], hideModalContentWhileAnimating = hideModalContentWhileAnimating.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any], onBackButtonPress = js.Any.fromFunction0(onBackButtonPress), onBackdropPress = js.Any.fromFunction0(onBackdropPress), onModalHide = js.Any.fromFunction0(onModalHide), onModalShow = js.Any.fromFunction0(onModalShow), onModalWillHide = js.Any.fromFunction0(onModalWillHide), onModalWillShow = js.Any.fromFunction0(onModalWillShow), propagateSwipe = propagateSwipe.asInstanceOf[js.Any], scrollHorizontal = scrollHorizontal.asInstanceOf[js.Any], scrollOffset = scrollOffset.asInstanceOf[js.Any], scrollOffsetMax = scrollOffsetMax.asInstanceOf[js.Any], scrollTo = scrollTo.asInstanceOf[js.Any], supportedOrientations = supportedOrientations.asInstanceOf[js.Any], swipeThreshold = swipeThreshold.asInstanceOf[js.Any], useNativeDriver = useNativeDriver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnimationInTiming]
  }
  @scala.inline
  implicit class AnonAnimationInTimingOps[Self <: AnonAnimationInTiming] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationIn(value: String): Self = {
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
    def withAnimationOut(value: String): Self = {
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
    def withCustomBackdrop(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customBackdrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceHeight(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceWidth(value: Null): Self = {
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
    def withOnBackButtonPress(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackButtonPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnBackdropPress(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBackdropPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnModalHide(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnModalShow(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnModalWillHide(value: () => Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onModalWillHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnModalWillShow(value: () => Null): Self = {
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
    def withScrollTo(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedOrientations(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedOrientations")(value.asInstanceOf[js.Any])
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
  }
  
}

