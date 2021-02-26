package typingsSlinky.iscroll

import typingsSlinky.iscroll.anon.Fn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScrollOptions extends StObject {
  
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
  implicit class IScrollOptionsMutableBuilder[Self <: IScrollOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounce(value: Boolean): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounceEasing(value: String | Fn): Self = StObject.set(x, "bounceEasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounceEasingUndefined: Self = StObject.set(x, "bounceEasing", js.undefined)
    
    @scala.inline
    def setBounceLock(value: Boolean): Self = StObject.set(x, "bounceLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounceLockUndefined: Self = StObject.set(x, "bounceLock", js.undefined)
    
    @scala.inline
    def setBounceTime(value: Double): Self = StObject.set(x, "bounceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounceTimeUndefined: Self = StObject.set(x, "bounceTime", js.undefined)
    
    @scala.inline
    def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
    
    @scala.inline
    def setCheckDOMChanges(value: Boolean): Self = StObject.set(x, "checkDOMChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckDOMChangesUndefined: Self = StObject.set(x, "checkDOMChanges", js.undefined)
    
    @scala.inline
    def setClick(value: Boolean): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setDirectionLockThreshold(value: Double): Self = StObject.set(x, "directionLockThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionLockThresholdUndefined: Self = StObject.set(x, "directionLockThreshold", js.undefined)
    
    @scala.inline
    def setDisableMouse(value: Boolean): Self = StObject.set(x, "disableMouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMouseUndefined: Self = StObject.set(x, "disableMouse", js.undefined)
    
    @scala.inline
    def setDisablePointer(value: Boolean): Self = StObject.set(x, "disablePointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePointerUndefined: Self = StObject.set(x, "disablePointer", js.undefined)
    
    @scala.inline
    def setDisableTouch(value: Boolean): Self = StObject.set(x, "disableTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTouchUndefined: Self = StObject.set(x, "disableTouch", js.undefined)
    
    @scala.inline
    def setDoubleTapZoom(value: Double): Self = StObject.set(x, "doubleTapZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleTapZoomUndefined: Self = StObject.set(x, "doubleTapZoom", js.undefined)
    
    @scala.inline
    def setEventPassthrough(value: String | Boolean): Self = StObject.set(x, "eventPassthrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPassthroughUndefined: Self = StObject.set(x, "eventPassthrough", js.undefined)
    
    @scala.inline
    def setFadeScrollbar(value: Boolean): Self = StObject.set(x, "fadeScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeScrollbarUndefined: Self = StObject.set(x, "fadeScrollbar", js.undefined)
    
    @scala.inline
    def setFadeScrollbars(value: Boolean): Self = StObject.set(x, "fadeScrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeScrollbarsUndefined: Self = StObject.set(x, "fadeScrollbars", js.undefined)
    
    @scala.inline
    def setFixedScrollbar(value: Boolean): Self = StObject.set(x, "fixedScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedScrollbarUndefined: Self = StObject.set(x, "fixedScrollbar", js.undefined)
    
    @scala.inline
    def setFreeScroll(value: Boolean): Self = StObject.set(x, "freeScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreeScrollUndefined: Self = StObject.set(x, "freeScroll", js.undefined)
    
    @scala.inline
    def setHScrollbar(value: Boolean): Self = StObject.set(x, "hScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHScrollbarUndefined: Self = StObject.set(x, "hScrollbar", js.undefined)
    
    @scala.inline
    def setHWCompositing(value: Boolean): Self = StObject.set(x, "HWCompositing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHWCompositingUndefined: Self = StObject.set(x, "HWCompositing", js.undefined)
    
    @scala.inline
    def setHandleClick(value: Boolean): Self = StObject.set(x, "handleClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandleClickUndefined: Self = StObject.set(x, "handleClick", js.undefined)
    
    @scala.inline
    def setHideScrollbar(value: Boolean): Self = StObject.set(x, "hideScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideScrollbarUndefined: Self = StObject.set(x, "hideScrollbar", js.undefined)
    
    @scala.inline
    def setInteractiveScrollbars(value: Boolean): Self = StObject.set(x, "interactiveScrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractiveScrollbarsUndefined: Self = StObject.set(x, "interactiveScrollbars", js.undefined)
    
    @scala.inline
    def setInvertWheelDirection(value: Boolean): Self = StObject.set(x, "invertWheelDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertWheelDirectionUndefined: Self = StObject.set(x, "invertWheelDirection", js.undefined)
    
    @scala.inline
    def setLockDirection(value: Boolean): Self = StObject.set(x, "lockDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockDirectionUndefined: Self = StObject.set(x, "lockDirection", js.undefined)
    
    @scala.inline
    def setMomentum(value: Boolean): Self = StObject.set(x, "momentum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMomentumUndefined: Self = StObject.set(x, "momentum", js.undefined)
    
    @scala.inline
    def setMouseWheel(value: Boolean): Self = StObject.set(x, "mouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelSpeed(value: Double): Self = StObject.set(x, "mouseWheelSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseWheelSpeedUndefined: Self = StObject.set(x, "mouseWheelSpeed", js.undefined)
    
    @scala.inline
    def setMouseWheelUndefined: Self = StObject.set(x, "mouseWheel", js.undefined)
    
    @scala.inline
    def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefaultException(value: js.Array[js.RegExp] | js.Object): Self = StObject.set(x, "preventDefaultException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefaultExceptionUndefined: Self = StObject.set(x, "preventDefaultException", js.undefined)
    
    @scala.inline
    def setPreventDefaultExceptionVarargs(value: js.RegExp*): Self = StObject.set(x, "preventDefaultException", js.Array(value :_*))
    
    @scala.inline
    def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    @scala.inline
    def setProbeType(value: Double): Self = StObject.set(x, "probeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbeTypeUndefined: Self = StObject.set(x, "probeType", js.undefined)
    
    @scala.inline
    def setReleaseScroll(value: Boolean): Self = StObject.set(x, "releaseScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseScrollUndefined: Self = StObject.set(x, "releaseScroll", js.undefined)
    
    @scala.inline
    def setResizeIndicator(value: Boolean): Self = StObject.set(x, "resizeIndicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeIndicatorUndefined: Self = StObject.set(x, "resizeIndicator", js.undefined)
    
    @scala.inline
    def setResizePolling(value: Double): Self = StObject.set(x, "resizePolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizePollingUndefined: Self = StObject.set(x, "resizePolling", js.undefined)
    
    @scala.inline
    def setScrollX(value: Boolean): Self = StObject.set(x, "scrollX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollXUndefined: Self = StObject.set(x, "scrollX", js.undefined)
    
    @scala.inline
    def setScrollY(value: Boolean): Self = StObject.set(x, "scrollY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollYUndefined: Self = StObject.set(x, "scrollY", js.undefined)
    
    @scala.inline
    def setScrollbarClass(value: String): Self = StObject.set(x, "scrollbarClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarClassUndefined: Self = StObject.set(x, "scrollbarClass", js.undefined)
    
    @scala.inline
    def setScrollbars(value: Boolean | String): Self = StObject.set(x, "scrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarsUndefined: Self = StObject.set(x, "scrollbars", js.undefined)
    
    @scala.inline
    def setShrinkScrollbars(value: String): Self = StObject.set(x, "shrinkScrollbars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkScrollbarsUndefined: Self = StObject.set(x, "shrinkScrollbars", js.undefined)
    
    @scala.inline
    def setSnap(value: String | Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapThreshold(value: Double): Self = StObject.set(x, "snapThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapThresholdUndefined: Self = StObject.set(x, "snapThreshold", js.undefined)
    
    @scala.inline
    def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    @scala.inline
    def setStartX(value: Double): Self = StObject.set(x, "startX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartXUndefined: Self = StObject.set(x, "startX", js.undefined)
    
    @scala.inline
    def setStartY(value: Double): Self = StObject.set(x, "startY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartYUndefined: Self = StObject.set(x, "startY", js.undefined)
    
    @scala.inline
    def setTap(value: Boolean): Self = StObject.set(x, "tap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
    
    @scala.inline
    def setTopOffset(value: Double): Self = StObject.set(x, "topOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopOffsetUndefined: Self = StObject.set(x, "topOffset", js.undefined)
    
    @scala.inline
    def setUseTransform(value: Boolean): Self = StObject.set(x, "useTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTransformUndefined: Self = StObject.set(x, "useTransform", js.undefined)
    
    @scala.inline
    def setUseTransition(value: Boolean): Self = StObject.set(x, "useTransition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseTransitionUndefined: Self = StObject.set(x, "useTransition", js.undefined)
    
    @scala.inline
    def setVScrollbar(value: Boolean): Self = StObject.set(x, "vScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVScrollbarUndefined: Self = StObject.set(x, "vScrollbar", js.undefined)
    
    @scala.inline
    def setWheelAction(value: String): Self = StObject.set(x, "wheelAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWheelActionUndefined: Self = StObject.set(x, "wheelAction", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZoom(value: Boolean): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMax(value: Double): Self = StObject.set(x, "zoomMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMaxUndefined: Self = StObject.set(x, "zoomMax", js.undefined)
    
    @scala.inline
    def setZoomMin(value: Double): Self = StObject.set(x, "zoomMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomMinUndefined: Self = StObject.set(x, "zoomMin", js.undefined)
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
