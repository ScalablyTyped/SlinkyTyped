package typingsSlinky.betterScroll

import typingsSlinky.betterScroll.mod.BounceObjectOption
import typingsSlinky.betterScroll.mod.DoubleClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<better-scroll.better-scroll.BsOption> */
@js.native
trait PartialBsOption extends js.Object {
  var HWCompositing: js.UndefOr[Boolean] = js.native
  var autoBlur: js.UndefOr[Boolean] = js.native
  var bindToWrapper: js.UndefOr[Boolean] = js.native
  var bounce: js.UndefOr[Boolean | BounceObjectOption] = js.native
  var bounceTime: js.UndefOr[Double] = js.native
  var click: js.UndefOr[Boolean] = js.native
  var dblclick: js.UndefOr[Boolean | DoubleClick] = js.native
  var deceleration: js.UndefOr[Double] = js.native
  var directionLockThreshold: js.UndefOr[Double] = js.native
  var disableMouse: js.UndefOr[Boolean] = js.native
  var disableTouch: js.UndefOr[Boolean] = js.native
  var eventPassthrough: js.UndefOr[String | Boolean] = js.native
  var flickLimitDistance: js.UndefOr[Double] = js.native
  var flickLimitTime: js.UndefOr[Double] = js.native
  var freeScroll: js.UndefOr[Boolean] = js.native
  var infinity: js.UndefOr[PartialInfinityOption | Boolean] = js.native
  var momentum: js.UndefOr[Boolean] = js.native
  var momentumLimitDistance: js.UndefOr[Double] = js.native
  var momentumLimitTime: js.UndefOr[Double] = js.native
  var mouseWheel: js.UndefOr[PartialMouseWheelOption | Boolean] = js.native
  var observeDOM: js.UndefOr[Boolean] = js.native
  var preventDefault: js.UndefOr[Boolean] = js.native
  var preventDefaultException: js.UndefOr[js.Object] = js.native
  var probeType: js.UndefOr[Double] = js.native
  var pullDownRefresh: js.UndefOr[PartialPullDownOption | Boolean] = js.native
  var pullUpLoad: js.UndefOr[PartialPullUpOption | Boolean] = js.native
  var resizePolling: js.UndefOr[Double] = js.native
  var scrollX: js.UndefOr[Boolean] = js.native
  var scrollY: js.UndefOr[Boolean] = js.native
  var scrollbar: js.UndefOr[PartialScrollBarOption | Boolean] = js.native
  var snap: js.UndefOr[PartialSlideOption | Boolean] = js.native
  var startX: js.UndefOr[Double] = js.native
  var startY: js.UndefOr[Double] = js.native
  var stopPropagation: js.UndefOr[Boolean] = js.native
  var swipeBounceTime: js.UndefOr[Double] = js.native
  var swipeTime: js.UndefOr[Double] = js.native
  var tap: js.UndefOr[Boolean] = js.native
  var useTransform: js.UndefOr[Boolean] = js.native
  var useTransition: js.UndefOr[Boolean] = js.native
  var wheel: js.UndefOr[PartialWheelOption | Boolean] = js.native
  var zoom: js.UndefOr[PartialZoomOption | Boolean] = js.native
}

object PartialBsOption {
  @scala.inline
  def apply(): PartialBsOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBsOption]
  }
  @scala.inline
  implicit class PartialBsOptionOps[Self <: PartialBsOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHWCompositing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HWCompositing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHWCompositing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HWCompositing")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withBindToWrapper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindToWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindToWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindToWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withBounce(value: Boolean | BounceObjectOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(js.undefined)
        ret
    }
    @scala.inline
    def withBounceTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceTime")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withDblclick(value: Boolean | DoubleClick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withDeceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeceleration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceleration")(js.undefined)
        ret
    }
    @scala.inline
    def withDirectionLockThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionLockThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectionLockThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionLockThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableMouse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMouse")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withEventPassthrough(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPassthrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventPassthrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPassthrough")(js.undefined)
        ret
    }
    @scala.inline
    def withFlickLimitDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickLimitDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlickLimitDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickLimitDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withFlickLimitTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickLimitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlickLimitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickLimitTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFreeScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreeScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withInfinity(value: PartialInfinityOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinity")(js.undefined)
        ret
    }
    @scala.inline
    def withMomentum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMomentum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentum")(js.undefined)
        ret
    }
    @scala.inline
    def withMomentumLimitDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentumLimitDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMomentumLimitDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentumLimitDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withMomentumLimitTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentumLimitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMomentumLimitTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentumLimitTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMouseWheel(value: PartialMouseWheelOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withObserveDOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserveDOM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeDOM")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventDefaultException(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventDefaultException: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultException")(js.undefined)
        ret
    }
    @scala.inline
    def withProbeType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProbeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probeType")(js.undefined)
        ret
    }
    @scala.inline
    def withPullDownRefresh(value: PartialPullDownOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullDownRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullDownRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullDownRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withPullUpLoad(value: PartialPullUpOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullUpLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPullUpLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullUpLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withResizePolling(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizePolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizePolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizePolling")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollY")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbar(value: PartialScrollBarOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withSnap(value: PartialSlideOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(js.undefined)
        ret
    }
    @scala.inline
    def withStartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(js.undefined)
        ret
    }
    @scala.inline
    def withStartY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(js.undefined)
        ret
    }
    @scala.inline
    def withStopPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopPropagation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeBounceTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeBounceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeBounceTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeBounceTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransform")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTransition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransition")(js.undefined)
        ret
    }
    @scala.inline
    def withWheel(value: PartialWheelOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheel")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: PartialZoomOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

