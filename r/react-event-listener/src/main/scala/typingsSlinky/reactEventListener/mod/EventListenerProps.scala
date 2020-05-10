package typingsSlinky.reactEventListener.mod

import org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
import org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
import org.scalajs.dom.raw.BeforeUnloadEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HashChangeEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.PopStateEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.StorageEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.std.Document_
import typingsSlinky.std.Event_
import typingsSlinky.std.MSGestureEvent
import typingsSlinky.std.MSPointerEvent
import typingsSlinky.std.PageTransitionEvent
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventListenerProps extends js.Object {
  var oNmsPointerUp: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var oNmsPointerUpCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onAbort: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onAbortCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onAfterPrint: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onAfterPrintCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onBeforePrint: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onBeforePrintCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onBeforeUnload: js.UndefOr[js.Function1[/* ev */ BeforeUnloadEvent, _]] = js.native
  var onBeforeUnloadCapture: js.UndefOr[js.Function1[/* ev */ BeforeUnloadEvent, _]] = js.native
  var onBlur: js.UndefOr[js.Function1[/* ev */ FocusEvent, _]] = js.native
  var onBlurCapture: js.UndefOr[js.Function1[/* ev */ FocusEvent, _]] = js.native
  var onCanPlay: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onCanPlayCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onCanPlayThrough: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onCanPlayThroughCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onChange: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onChangeCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onClick: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onClickCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onCompassNeedsCalibration: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onCompassNeedsCalibrationCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onContextMenu: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onContextMenuCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onDblClick: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onDblClickCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onDeviceMotion: js.UndefOr[js.Function1[/* ev */ DeviceMotionEvent, _]] = js.native
  var onDeviceMotionCapture: js.UndefOr[js.Function1[/* ev */ DeviceMotionEvent, _]] = js.native
  var onDeviceOrientation: js.UndefOr[js.Function1[/* ev */ DeviceOrientationEvent, _]] = js.native
  var onDeviceOrientationCapture: js.UndefOr[js.Function1[/* ev */ DeviceOrientationEvent, _]] = js.native
  var onDrag: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragEnd: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragEndCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragEnter: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragEnterCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragLeave: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragLeaveCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragOver: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragOverCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragStart: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDragStartCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDrop: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDropCapture: js.UndefOr[js.Function1[/* ev */ DragEvent, _]] = js.native
  var onDurationChange: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onDurationChangeCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onEmptied: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onEmptiedCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onEnded: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onEndedCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onError: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any
  ] = js.native
  var onErrorCapture: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any
  ] = js.native
  var onFocus: js.UndefOr[js.Function1[/* ev */ FocusEvent, _]] = js.native
  var onFocusCapture: js.UndefOr[js.Function1[/* ev */ FocusEvent, _]] = js.native
  var onHashChange: js.UndefOr[js.Function1[/* ev */ HashChangeEvent, _]] = js.native
  var onHashChangeCapture: js.UndefOr[js.Function1[/* ev */ HashChangeEvent, _]] = js.native
  var onInput: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onInputCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onKeyDown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.native
  var onKeyDownCapture: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.native
  var onKeyPress: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.native
  var onKeyPressCapture: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.native
  var onKeyUp: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.native
  var onKeyUpCapture: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, _]] = js.native
  var onLoad: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onLoadCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onLoadStart: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onLoadStartCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onLoadedData: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onLoadedDataCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onLoadedMetadata: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onLoadedMetadataCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onMessage: js.UndefOr[js.Function1[/* ev */ MessageEvent, _]] = js.native
  var onMessageCapture: js.UndefOr[js.Function1[/* ev */ MessageEvent, _]] = js.native
  var onMouseDown: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseDownCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseEnter: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseEnterCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseLeave: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseLeaveCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseMove: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseMoveCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseOut: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseOutCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseOver: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseOverCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseUp: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseUpCapture: js.UndefOr[js.Function1[/* ev */ MouseEvent, _]] = js.native
  var onMouseWheel: js.UndefOr[js.Function1[/* ev */ WheelEvent, _]] = js.native
  var onMouseWheelCapture: js.UndefOr[js.Function1[/* ev */ WheelEvent, _]] = js.native
  var onMsGestureChange: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureChangeCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureDoubleTap: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureDoubleTapCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureEnd: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureEndCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureHold: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureHoldCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureStart: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureStartCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureTap: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsGestureTapCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsInertiaStart: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsInertiaStartCapture: js.UndefOr[js.Function1[/* ev */ MSGestureEvent, _]] = js.native
  var onMsPointerCancel: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerCancelCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerDown: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerDownCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerEnter: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerEnterCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerLeave: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerLeaveCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerMove: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerMoveCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerOut: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerOutCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerOver: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onMsPointerOverCapture: js.UndefOr[js.Function1[/* ev */ MSPointerEvent, _]] = js.native
  var onOffline: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onOfflineCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onOnline: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onOnlineCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onOrientationChange: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onOrientationChangeCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onPageHide: js.UndefOr[js.Function1[/* ev */ PageTransitionEvent, _]] = js.native
  var onPageHideCapture: js.UndefOr[js.Function1[/* ev */ PageTransitionEvent, _]] = js.native
  var onPageShow: js.UndefOr[js.Function1[/* ev */ PageTransitionEvent, _]] = js.native
  var onPageShowCapture: js.UndefOr[js.Function1[/* ev */ PageTransitionEvent, _]] = js.native
  var onPause: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onPauseCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onPlay: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onPlayCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onPlaying: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onPlayingCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  // Global events
  var onPointerCancel: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerCancelCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerDown: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerDownCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerEnter: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerEnterCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerLeave: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerLeaveCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerMove: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerMoveCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerOut: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerOutCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerOver: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerOverCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerUp: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPointerUpCapture: js.UndefOr[js.Function1[/* ev */ PointerEvent, _]] = js.native
  var onPopState: js.UndefOr[js.Function1[/* ev */ PopStateEvent, _]] = js.native
  var onPopStateCapture: js.UndefOr[js.Function1[/* ev */ PopStateEvent, _]] = js.native
  var onProgress: js.UndefOr[js.Function1[/* ev */ ProgressEvent, _]] = js.native
  var onProgressCapture: js.UndefOr[js.Function1[/* ev */ ProgressEvent, _]] = js.native
  var onRateChange: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onRateChangeCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onReadyStateChange: js.UndefOr[js.Function1[/* ev */ ProgressEvent, _]] = js.native
  var onReadyStateChangeCapture: js.UndefOr[js.Function1[/* ev */ ProgressEvent, _]] = js.native
  var onReset: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onResetCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onResize: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.native
  var onResizeCapture: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.native
  var onScroll: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.native
  var onScrollCapture: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.native
  var onSeeked: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onSeekedCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onSeeking: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onSeekingCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onSelect: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.native
  var onSelectCapture: js.UndefOr[js.Function1[/* ev */ UIEvent, _]] = js.native
  var onSelectionChange: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onSelectionChangeCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onStalled: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onStalledCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onStorage: js.UndefOr[js.Function1[/* ev */ StorageEvent, _]] = js.native
  var onStorageCapture: js.UndefOr[js.Function1[/* ev */ StorageEvent, _]] = js.native
  var onSubmit: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onSubmitCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onSuspend: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onSuspendCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onTimeUpdate: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onTimeUpdateCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onTouchCancel: js.UndefOr[js.Any] = js.native
  var onTouchCancelCapture: js.UndefOr[js.Any] = js.native
  var onTouchEnd: js.UndefOr[js.Any] = js.native
  var onTouchEndCapture: js.UndefOr[js.Any] = js.native
  var onTouchMove: js.UndefOr[js.Any] = js.native
  var onTouchMoveCapture: js.UndefOr[js.Any] = js.native
  var onTouchStart: js.UndefOr[js.Any] = js.native
  var onTouchStartCapture: js.UndefOr[js.Any] = js.native
  var onUnload: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onUnloadCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onVolumeChange: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onVolumeChangeCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onWaiting: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onWaitingCapture: js.UndefOr[js.Function1[/* ev */ Event_, _]] = js.native
  var onWheel: js.UndefOr[js.Function1[/* ev */ WheelEvent, _]] = js.native
  var onWheelCapture: js.UndefOr[js.Function1[/* ev */ WheelEvent, _]] = js.native
  /**
    * Target (window or document)
    */
  var target: Window_ | Document_ | String = js.native
}

object EventListenerProps {
  @scala.inline
  def apply(target: Window_ | Document_ | String): EventListenerProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListenerProps]
  }
  @scala.inline
  implicit class EventListenerPropsOps[Self <: EventListenerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTarget(value: Window_ | Document_ | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withONmsPointerUp(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oNmsPointerUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutONmsPointerUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oNmsPointerUp")(js.undefined)
        ret
    }
    @scala.inline
    def withONmsPointerUpCapture(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oNmsPointerUpCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutONmsPointerUpCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oNmsPointerUpCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbort(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAbortCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbortCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAbortCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAbortCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAfterPrint(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterPrint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAfterPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterPrint")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAfterPrintCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterPrintCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnAfterPrintCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAfterPrintCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforePrint(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforePrint")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforePrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforePrint")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforePrintCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforePrintCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforePrintCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforePrintCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeUnload(value: /* ev */ BeforeUnloadEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUnload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUnload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeUnloadCapture(value: /* ev */ BeforeUnloadEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUnloadCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeUnloadCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUnloadCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlur(value: /* ev */ FocusEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBlurCapture(value: /* ev */ FocusEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlurCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBlurCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBlurCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlay(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlayCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayThrough(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlayThrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThrough")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCanPlayThroughCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThroughCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCanPlayThroughCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCanPlayThroughCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChangeCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClickCapture(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClickCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompassNeedsCalibration(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompassNeedsCalibration")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompassNeedsCalibration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompassNeedsCalibration")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCompassNeedsCalibrationCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompassNeedsCalibrationCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCompassNeedsCalibrationCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCompassNeedsCalibrationCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenu(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withOnContextMenuCapture(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnContextMenuCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContextMenuCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDblClick(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDblClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDblClickCapture(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClickCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDblClickCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDblClickCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeviceMotion(value: /* ev */ DeviceMotionEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeviceMotion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDeviceMotion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeviceMotion")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeviceMotionCapture(value: /* ev */ DeviceMotionEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeviceMotionCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDeviceMotionCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeviceMotionCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeviceOrientation(value: /* ev */ DeviceOrientationEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeviceOrientation")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDeviceOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeviceOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeviceOrientationCapture(value: /* ev */ DeviceOrientationEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeviceOrientationCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDeviceOrientationCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeviceOrientationCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrag(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragCapture(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnd(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEndCapture(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnter(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragEnterCapture(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnterCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragEnterCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragEnterCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeave(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragLeaveCapture(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragLeaveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragLeaveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOver(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragOverCapture(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOverCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragOverCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragOverCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStart(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDragStartCapture(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDragStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDragStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDrop(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDropCapture(value: /* ev */ DragEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDropCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDropCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDurationChange(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDurationChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDurationChangeCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDurationChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDurationChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEmptied(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEmptied: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptied")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEmptiedCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptiedCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEmptiedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEmptiedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEnded(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEnded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEnded")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEndedCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndedCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEndedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEndedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrorCapture(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnErrorCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrorCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocus(value: /* ev */ FocusEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFocusCapture(value: /* ev */ FocusEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFocusCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHashChange(value: /* ev */ HashChangeEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHashChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHashChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHashChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHashChangeCapture(value: /* ev */ HashChangeEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHashChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnHashChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHashChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInput(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnInputCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnInputCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onInputCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDown(value: /* ev */ KeyboardEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyDownCapture(value: /* ev */ KeyboardEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDownCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyDownCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDownCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPress(value: /* ev */ KeyboardEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyPressCapture(value: /* ev */ KeyboardEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPressCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyPressCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyPressCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUp(value: /* ev */ KeyboardEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKeyUpCapture(value: /* ev */ KeyboardEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUpCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnKeyUpCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUpCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoad(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStart(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadStartCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedData(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedData")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedDataCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedDataCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedDataCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedDataCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedMetadata(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLoadedMetadataCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadataCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLoadedMetadataCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLoadedMetadataCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMessage(value: /* ev */ MessageEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMessageCapture(value: /* ev */ MessageEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessageCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMessageCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessageCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDown(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseDownCapture(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDownCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseDownCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseDownCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnter(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseEnterCapture(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseEnterCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnterCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeave(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseLeaveCapture(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseLeaveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeaveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMove(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseMoveCapture(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMoveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMoveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOut(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOutCapture(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOutCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOutCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOver(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOverCapture(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOverCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOverCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOverCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUp(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseUpCapture(value: /* ev */ MouseEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUpCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseUpCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseUpCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseWheel(value: /* ev */ WheelEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseWheel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseWheelCapture(value: /* ev */ WheelEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseWheelCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMouseWheelCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseWheelCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsGestureChange(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsGestureChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsGestureChangeCapture(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsGestureChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsGestureDoubleTap(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureDoubleTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsGestureDoubleTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureDoubleTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsGestureDoubleTapCapture(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureDoubleTapCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsGestureDoubleTapCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureDoubleTapCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsGestureEnd(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsGestureEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsGestureEndCapture(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureEndCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsGestureEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsGestureHold(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureHold")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsGestureHold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureHold")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsGestureHoldCapture(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureHoldCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsGestureHoldCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureHoldCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsGestureStart(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsGestureStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsGestureStartCapture(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsGestureStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsGestureTap(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureTap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsGestureTap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureTap")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsGestureTapCapture(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureTapCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsGestureTapCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsGestureTapCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsInertiaStart(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsInertiaStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsInertiaStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsInertiaStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsInertiaStartCapture(value: /* ev */ MSGestureEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsInertiaStartCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsInertiaStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsInertiaStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerCancel(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerCancelCapture(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerCancelCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerCancelCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerCancelCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerDown(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerDownCapture(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerDownCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerDownCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerDownCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerEnter(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerEnterCapture(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerEnterCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerEnterCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerEnterCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerLeave(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerLeaveCapture(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerLeaveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerLeaveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerLeaveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerMove(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerMoveCapture(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerMoveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerMoveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerMoveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerOut(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerOutCapture(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerOutCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerOutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerOutCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerOver(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMsPointerOverCapture(value: /* ev */ MSPointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerOverCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMsPointerOverCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMsPointerOverCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOffline(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOffline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOffline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOffline")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOfflineCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOfflineCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOfflineCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOfflineCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOnline(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOnline")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOnline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOnline")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOnlineCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOnlineCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOnlineCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOnlineCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOrientationChange(value: /* ev */ Event_ => _): Self = {
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
    def withOnOrientationChangeCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOrientationChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOrientationChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOrientationChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageHide(value: /* ev */ PageTransitionEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageHide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageHideCapture(value: /* ev */ PageTransitionEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageHideCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageHideCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageHideCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageShow(value: /* ev */ PageTransitionEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPageShowCapture(value: /* ev */ PageTransitionEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageShowCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPageShowCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageShowCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPause(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPause")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPauseCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPauseCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPauseCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPauseCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlay(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlayCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlayCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlaying(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlaying: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlaying")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPlayingCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayingCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPlayingCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPlayingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerCancel(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerCancelCapture(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancelCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerCancelCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerCancelCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerDown(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerDown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerDownCapture(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDownCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerDownCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerDownCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerEnter(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerEnterCapture(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnterCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerEnterCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerEnterCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerLeave(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerLeaveCapture(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeaveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerLeaveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerLeaveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerMove(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerMoveCapture(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMoveCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerMoveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerMoveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOut(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOut")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOutCapture(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOutCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOutCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOutCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOver(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOver")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOver")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerOverCapture(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOverCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerOverCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerOverCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerUp(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUp")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPointerUpCapture(value: /* ev */ PointerEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUpCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPointerUpCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPointerUpCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPopState(value: /* ev */ PopStateEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPopState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopState")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPopStateCapture(value: /* ev */ PopStateEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopStateCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPopStateCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPopStateCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgress(value: /* ev */ ProgressEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnProgressCapture(value: /* ev */ ProgressEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgressCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnProgressCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onProgressCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRateChange(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRateChangeCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRateChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRateChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReadyStateChange(value: /* ev */ ProgressEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadyStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReadyStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadyStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReadyStateChangeCapture(value: /* ev */ ProgressEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadyStateChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReadyStateChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReadyStateChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReset(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReset")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResetCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResetCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResetCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResetCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResize(value: /* ev */ UIEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnResizeCapture(value: /* ev */ UIEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnResizeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onResizeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScroll(value: /* ev */ UIEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnScrollCapture(value: /* ev */ UIEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnScrollCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onScrollCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeked(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeeked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeked")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeekedCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekedCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeekedCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekedCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeeking(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeking")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeeking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeeking")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSeekingCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekingCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSeekingCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSeekingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: /* ev */ UIEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectCapture(value: /* ev */ UIEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChange(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChangeCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStalled(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStalled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalled")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStalledCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalledCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStalledCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStalledCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStorage(value: /* ev */ StorageEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStorage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStorage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStorage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnStorageCapture(value: /* ev */ StorageEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStorageCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnStorageCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onStorageCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmitCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmitCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmitCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuspend(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuspend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuspendCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSuspendCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuspendCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeUpdate(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTimeUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTimeUpdateCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdateCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnTimeUpdateCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTimeUpdateCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchCancelCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancelCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchCancelCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchCancelCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEnd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchEndCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchEndCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEndCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMove(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchMoveCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMoveCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchMoveCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchMoveCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTouchStartCapture(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStartCapture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTouchStartCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchStartCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnload(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnloadCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnloadCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUnloadCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnloadCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVolumeChange(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVolumeChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnVolumeChangeCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChangeCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnVolumeChangeCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onVolumeChangeCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWaiting(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaiting")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWaiting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaiting")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWaitingCapture(value: /* ev */ Event_ => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaitingCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWaitingCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWaitingCapture")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWheel(value: /* ev */ WheelEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnWheelCapture(value: /* ev */ WheelEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheelCapture")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnWheelCapture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWheelCapture")(js.undefined)
        ret
    }
  }
  
}

