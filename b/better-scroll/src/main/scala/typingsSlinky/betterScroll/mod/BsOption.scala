package typingsSlinky.betterScroll.mod

import typingsSlinky.betterScroll.PartialInfinityOption
import typingsSlinky.betterScroll.PartialMouseWheelOption
import typingsSlinky.betterScroll.PartialPullDownOption
import typingsSlinky.betterScroll.PartialPullUpOption
import typingsSlinky.betterScroll.PartialScrollBarOption
import typingsSlinky.betterScroll.PartialSlideOption
import typingsSlinky.betterScroll.PartialWheelOption
import typingsSlinky.betterScroll.PartialZoomOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BsOption extends js.Object {
  var HWCompositing: Boolean = js.native
  var autoBlur: Boolean = js.native
  var bindToWrapper: Boolean = js.native
  var bounce: Boolean | BounceObjectOption = js.native
  var bounceTime: Double = js.native
  var click: Boolean = js.native
  var dblclick: Boolean | DoubleClick = js.native
  var deceleration: Double = js.native
  var directionLockThreshold: Double = js.native
  var disableMouse: Boolean = js.native
  var disableTouch: Boolean = js.native
  var eventPassthrough: String | Boolean = js.native
  var flickLimitDistance: Double = js.native
  var flickLimitTime: Double = js.native
  var freeScroll: Boolean = js.native
  // https://ustbhuangyi.github.io/better-scroll/doc/zh-hans/options-advanced.html
  var infinity: PartialInfinityOption | Boolean = js.native
  var momentum: Boolean = js.native
  var momentumLimitDistance: Double = js.native
  var momentumLimitTime: Double = js.native
  // mouseWheel: {
  //  speed: 20,
  //  invert: false,
  //  easeTime: 300
  // }
  var mouseWheel: PartialMouseWheelOption | Boolean = js.native
  var observeDOM: Boolean = js.native
  var preventDefault: Boolean = js.native
  var preventDefaultException: js.Object = js.native
  var probeType: Double = js.native
  /**
    * for pull down and refresh
    * pullDownRefresh: {
    *   threshold: 50,
    *   stop: 20
    * }
    */
  var pullDownRefresh: PartialPullDownOption | Boolean = js.native
  /**
    * for pull up and load
    * pullUpLoad: {
    *   threshold: 50
    * }
    */
  var pullUpLoad: PartialPullUpOption | Boolean = js.native
  var resizePolling: Double = js.native
  var scrollX: Boolean = js.native
  var scrollY: Boolean = js.native
  /**
    * for scrollbar
    * scrollbar: {
    *   fade: true
    * }
    */
  var scrollbar: PartialScrollBarOption | Boolean = js.native
  /**
    * for slide
    * snap: {
    *   loop: boolean,
    *   el: domEl,
    *   threshold: 0.1,
    *   stepX: 100,
    *   stepY: 100,
    *   listenFlick: true
    * }
    */
  var snap: PartialSlideOption | Boolean = js.native
  var startX: Double = js.native
  var startY: Double = js.native
  var stopPropagation: Boolean = js.native
  var swipeBounceTime: Double = js.native
  var swipeTime: Double = js.native
  var tap: Boolean = js.native
  var useTransform: Boolean = js.native
  var useTransition: Boolean = js.native
  /**
    * for picker
    * wheel: {
    *   selectedIndex: 0,
    *   rotate: 25,
    *   adjustTime: 400
    * }
    */
  var wheel: PartialWheelOption | Boolean = js.native
  // zoom: {
  //  start: 1,
  //  min: 1,
  //  max: 4
  // }
  var zoom: PartialZoomOption | Boolean = js.native
}

object BsOption {
  @scala.inline
  def apply(
    HWCompositing: Boolean,
    autoBlur: Boolean,
    bindToWrapper: Boolean,
    bounce: Boolean | BounceObjectOption,
    bounceTime: Double,
    click: Boolean,
    dblclick: Boolean | DoubleClick,
    deceleration: Double,
    directionLockThreshold: Double,
    disableMouse: Boolean,
    disableTouch: Boolean,
    eventPassthrough: String | Boolean,
    flickLimitDistance: Double,
    flickLimitTime: Double,
    freeScroll: Boolean,
    infinity: PartialInfinityOption | Boolean,
    momentum: Boolean,
    momentumLimitDistance: Double,
    momentumLimitTime: Double,
    mouseWheel: PartialMouseWheelOption | Boolean,
    observeDOM: Boolean,
    preventDefault: Boolean,
    preventDefaultException: js.Object,
    probeType: Double,
    pullDownRefresh: PartialPullDownOption | Boolean,
    pullUpLoad: PartialPullUpOption | Boolean,
    resizePolling: Double,
    scrollX: Boolean,
    scrollY: Boolean,
    scrollbar: PartialScrollBarOption | Boolean,
    snap: PartialSlideOption | Boolean,
    startX: Double,
    startY: Double,
    stopPropagation: Boolean,
    swipeBounceTime: Double,
    swipeTime: Double,
    tap: Boolean,
    useTransform: Boolean,
    useTransition: Boolean,
    wheel: PartialWheelOption | Boolean,
    zoom: PartialZoomOption | Boolean
  ): BsOption = {
    val __obj = js.Dynamic.literal(HWCompositing = HWCompositing.asInstanceOf[js.Any], autoBlur = autoBlur.asInstanceOf[js.Any], bindToWrapper = bindToWrapper.asInstanceOf[js.Any], bounce = bounce.asInstanceOf[js.Any], bounceTime = bounceTime.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], deceleration = deceleration.asInstanceOf[js.Any], directionLockThreshold = directionLockThreshold.asInstanceOf[js.Any], disableMouse = disableMouse.asInstanceOf[js.Any], disableTouch = disableTouch.asInstanceOf[js.Any], eventPassthrough = eventPassthrough.asInstanceOf[js.Any], flickLimitDistance = flickLimitDistance.asInstanceOf[js.Any], flickLimitTime = flickLimitTime.asInstanceOf[js.Any], freeScroll = freeScroll.asInstanceOf[js.Any], infinity = infinity.asInstanceOf[js.Any], momentum = momentum.asInstanceOf[js.Any], momentumLimitDistance = momentumLimitDistance.asInstanceOf[js.Any], momentumLimitTime = momentumLimitTime.asInstanceOf[js.Any], mouseWheel = mouseWheel.asInstanceOf[js.Any], observeDOM = observeDOM.asInstanceOf[js.Any], preventDefault = preventDefault.asInstanceOf[js.Any], preventDefaultException = preventDefaultException.asInstanceOf[js.Any], probeType = probeType.asInstanceOf[js.Any], pullDownRefresh = pullDownRefresh.asInstanceOf[js.Any], pullUpLoad = pullUpLoad.asInstanceOf[js.Any], resizePolling = resizePolling.asInstanceOf[js.Any], scrollX = scrollX.asInstanceOf[js.Any], scrollY = scrollY.asInstanceOf[js.Any], scrollbar = scrollbar.asInstanceOf[js.Any], snap = snap.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], stopPropagation = stopPropagation.asInstanceOf[js.Any], swipeBounceTime = swipeBounceTime.asInstanceOf[js.Any], swipeTime = swipeTime.asInstanceOf[js.Any], tap = tap.asInstanceOf[js.Any], useTransform = useTransform.asInstanceOf[js.Any], useTransition = useTransition.asInstanceOf[js.Any], wheel = wheel.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[BsOption]
  }
  @scala.inline
  implicit class BsOptionOps[Self <: BsOption] (val x: Self) extends AnyVal {
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
    def withAutoBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBindToWrapper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindToWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounce(value: Boolean | BounceObjectOption): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounceTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDblclick(value: Boolean | DoubleClick): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dblclick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeceleration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deceleration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirectionLockThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directionLockThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableMouse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableMouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableTouch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventPassthrough(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventPassthrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlickLimitDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickLimitDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlickLimitTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flickLimitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFreeScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freeScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfinity(value: PartialInfinityOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMomentum(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMomentumLimitDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentumLimitDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMomentumLimitTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("momentumLimitTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseWheel(value: PartialMouseWheelOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObserveDOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observeDOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreventDefaultException(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventDefaultException")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProbeType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullDownRefresh(value: PartialPullDownOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullDownRefresh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPullUpLoad(value: PartialPullUpOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pullUpLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResizePolling(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizePolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollX(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollY(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollbar(value: PartialScrollBarOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnap(value: PartialSlideOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStopPropagation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopPropagation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeBounceTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeBounceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwipeTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseTransform(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseTransition(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWheel(value: PartialWheelOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: PartialZoomOption | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

