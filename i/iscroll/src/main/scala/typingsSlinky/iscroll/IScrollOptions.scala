package typingsSlinky.iscroll

import typingsSlinky.iscroll.anon.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScrollOptions extends js.Object {
  var HWCompositing: js.UndefOr[Boolean] = js.native
  var bounce: js.UndefOr[Boolean] = js.native
  ///String or function
  var bounceEasing: js.UndefOr[String | Fn] = js.native
  var bounceLock: js.UndefOr[Boolean] = js.native
  var bounceTime: js.UndefOr[Double] = js.native
  var checkDOMChanges: js.UndefOr[Boolean] = js.native
  var click: js.UndefOr[Boolean] = js.native
  var directionLockThreshold: js.UndefOr[Double] = js.native
  // Pointer events
  var disableMouse: js.UndefOr[Boolean] = js.native
  var disablePointer: js.UndefOr[Boolean] = js.native
  var disableTouch: js.UndefOr[Boolean] = js.native
  var doubleTapZoom: js.UndefOr[Double] = js.native
  var eventPassthrough: js.UndefOr[String | Boolean] = js.native
  var fadeScrollbar: js.UndefOr[Boolean] = js.native
  var fadeScrollbars: js.UndefOr[Boolean] = js.native
  var fixedScrollbar: js.UndefOr[Boolean] = js.native
  var freeScroll: js.UndefOr[Boolean] = js.native
  // Scrollbar
  var hScrollbar: js.UndefOr[Boolean] = js.native
  var handleClick: js.UndefOr[Boolean] = js.native
  var hideScrollbar: js.UndefOr[Boolean] = js.native
  var interactiveScrollbars: js.UndefOr[Boolean] = js.native
  var invertWheelDirection: js.UndefOr[Boolean] = js.native
  var lockDirection: js.UndefOr[Boolean] = js.native
  var momentum: js.UndefOr[Boolean] = js.native
  var mouseWheel: js.UndefOr[Boolean] = js.native
  var mouseWheelSpeed: js.UndefOr[Double] = js.native
  var preventDefault: js.UndefOr[Boolean] = js.native
  var preventDefaultException: js.UndefOr[js.Array[js.RegExp] | js.Object] = js.native
  // iScroll probe edition
  var probeType: js.UndefOr[Double] = js.native
  var releaseScroll: js.UndefOr[Boolean] = js.native
  // New in IScroll 5?
  var resizeIndicator: js.UndefOr[Boolean] = js.native
  var resizePolling: js.UndefOr[Double] = js.native
  //hScroll?: boolean;
  //vScroll?: boolean;
  var scrollX: js.UndefOr[Boolean] = js.native
  var scrollY: js.UndefOr[Boolean] = js.native
  var scrollbarClass: js.UndefOr[String] = js.native
  var scrollbars: js.UndefOr[Boolean | String] = js.native
  var shrinkScrollbars: js.UndefOr[String] = js.native
  var snap: js.UndefOr[String | Boolean] = js.native
  var snapThreshold: js.UndefOr[Double] = js.native
  var startX: js.UndefOr[Double] = js.native
  var startY: js.UndefOr[Double] = js.native
  var tap: js.UndefOr[Boolean] = js.native
  var topOffset: js.UndefOr[Double] = js.native
  var useTransform: js.UndefOr[Boolean] = js.native
  var useTransition: js.UndefOr[Boolean] = js.native
  var vScrollbar: js.UndefOr[Boolean] = js.native
  var wheelAction: js.UndefOr[String] = js.native
  var x: js.UndefOr[Double] = js.native
  var y: js.UndefOr[Double] = js.native
  // Zoom
  var zoom: js.UndefOr[Boolean] = js.native
  var zoomMax: js.UndefOr[Double] = js.native
  var zoomMin: js.UndefOr[Double] = js.native
}

object IScrollOptions {
  @scala.inline
  def apply(): IScrollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScrollOptions]
  }
  @scala.inline
  implicit class IScrollOptionsOps[Self <: IScrollOptions] (val x: Self) extends AnyVal {
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
    def withBounce(value: Boolean): Self = {
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
    def withBounceEasing(value: String | Fn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withBounceLock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceLock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceLock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceLock")(js.undefined)
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
    def withCheckDOMChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkDOMChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckDOMChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkDOMChanges")(js.undefined)
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
    def withDisablePointer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePointer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePointer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePointer")(js.undefined)
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
    def withDoubleTapZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTapZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleTapZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleTapZoom")(js.undefined)
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
    def withFadeScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeScrollbars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeScrollbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeScrollbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeScrollbars")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedScrollbar")(js.undefined)
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
    def withHScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleClick")(js.undefined)
        ret
    }
    @scala.inline
    def withHideScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withInteractiveScrollbars(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactiveScrollbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteractiveScrollbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interactiveScrollbars")(js.undefined)
        ret
    }
    @scala.inline
    def withInvertWheelDirection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertWheelDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvertWheelDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertWheelDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withLockDirection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockDirection")(js.undefined)
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
    def withMouseWheel(value: Boolean): Self = {
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
    def withMouseWheelSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelSpeed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouseWheelSpeed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseWheelSpeed")(js.undefined)
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
    def withPreventDefaultException(value: js.Array[js.RegExp] | js.Object): Self = {
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
    def withReleaseScroll(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseScroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeIndicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeIndicator")(js.undefined)
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
    def withScrollbarClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbarClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbarClass")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollbars(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollbars")(js.undefined)
        ret
    }
    @scala.inline
    def withShrinkScrollbars(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkScrollbars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrinkScrollbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkScrollbars")(js.undefined)
        ret
    }
    @scala.inline
    def withSnap(value: String | Boolean): Self = {
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
    def withSnapThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapThreshold")(js.undefined)
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
    def withTopOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topOffset")(js.undefined)
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
    def withVScrollbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vScrollbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVScrollbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vScrollbar")(js.undefined)
        ret
    }
    @scala.inline
    def withWheelAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWheelAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wheelAction")(js.undefined)
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Boolean): Self = {
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
    @scala.inline
    def withZoomMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMax")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomMin")(js.undefined)
        ret
    }
  }
  
}

