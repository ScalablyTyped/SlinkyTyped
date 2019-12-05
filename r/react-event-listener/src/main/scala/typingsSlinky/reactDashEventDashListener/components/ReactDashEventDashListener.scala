package typingsSlinky.reactDashEventDashListener.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
import org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
import org.scalajs.dom.raw.BeforeUnloadEvent
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Event
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
import org.scalajs.dom.raw.Window
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashEventDashListener.reactDashEventDashListenerMod.EventListenerProps
import typingsSlinky.reactDashEventDashListener.reactDashEventDashListenerMod.default
import typingsSlinky.std.MSGestureEvent
import typingsSlinky.std.MSPointerEvent
import typingsSlinky.std.PageTransitionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashEventDashListener
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-event-listener", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: onAbort, onBlur, onCanPlay, onCanPlayThrough, onChange, onClick, onContextMenu, onDrag, onDragEnd, onDragEnter, onDragLeave, onDragOver, onDragStart, onDrop, onDurationChange, onEmptied, onEnded, onFocus, onInput, onKeyDown, onKeyPress, onKeyUp, onLoad, onLoadStart, onLoadedData, onLoadedMetadata, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseOut, onMouseOver, onMouseUp, onPause, onPlay, onPlaying, onPointerCancel, onPointerDown, onPointerEnter, onPointerLeave, onPointerMove, onPointerOut, onPointerOver, onPointerUp, onProgress, onRateChange, onScroll, onSeeked, onSeeking, onSelect, onStalled, onSubmit, onSuspend, onTimeUpdate, onVolumeChange, onWaiting, onWheel */
  def apply(
    target: Window | Document | String,
    oNmsPointerUp: /* ev */ MSPointerEvent => _ = null,
    oNmsPointerUpCapture: /* ev */ MSPointerEvent => _ = null,
    onAbortCapture: /* ev */ Event => _ = null,
    onAfterPrint: /* ev */ Event => _ = null,
    onAfterPrintCapture: /* ev */ Event => _ = null,
    onBeforePrint: /* ev */ Event => _ = null,
    onBeforePrintCapture: /* ev */ Event => _ = null,
    onBeforeUnload: /* ev */ BeforeUnloadEvent => _ = null,
    onBeforeUnloadCapture: /* ev */ BeforeUnloadEvent => _ = null,
    onBlurCapture: /* ev */ FocusEvent => _ = null,
    onCanPlayCapture: /* ev */ Event => _ = null,
    onCanPlayThroughCapture: /* ev */ Event => _ = null,
    onChangeCapture: /* ev */ Event => _ = null,
    onClickCapture: /* ev */ MouseEvent => _ = null,
    onCompassNeedsCalibration: /* ev */ Event => _ = null,
    onCompassNeedsCalibrationCapture: /* ev */ Event => _ = null,
    onContextMenuCapture: /* ev */ PointerEvent => _ = null,
    onDblClick: /* ev */ MouseEvent => _ = null,
    onDblClickCapture: /* ev */ MouseEvent => _ = null,
    onDeviceMotion: /* ev */ DeviceMotionEvent => _ = null,
    onDeviceMotionCapture: /* ev */ DeviceMotionEvent => _ = null,
    onDeviceOrientation: /* ev */ DeviceOrientationEvent => _ = null,
    onDeviceOrientationCapture: /* ev */ DeviceOrientationEvent => _ = null,
    onDragCapture: /* ev */ DragEvent => _ = null,
    onDragEndCapture: /* ev */ DragEvent => _ = null,
    onDragEnterCapture: /* ev */ DragEvent => _ = null,
    onDragLeaveCapture: /* ev */ DragEvent => _ = null,
    onDragOverCapture: /* ev */ DragEvent => _ = null,
    onDragStartCapture: /* ev */ DragEvent => _ = null,
    onDropCapture: /* ev */ DragEvent => _ = null,
    onDurationChangeCapture: /* ev */ Event => _ = null,
    onEmptiedCapture: /* ev */ Event => _ = null,
    onEndedCapture: /* ev */ Event => _ = null,
    onError: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any = null,
    onErrorCapture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any = null,
    onFocusCapture: /* ev */ FocusEvent => _ = null,
    onHashChange: /* ev */ HashChangeEvent => _ = null,
    onHashChangeCapture: /* ev */ HashChangeEvent => _ = null,
    onInputCapture: /* ev */ Event => _ = null,
    onKeyDownCapture: /* ev */ KeyboardEvent => _ = null,
    onKeyPressCapture: /* ev */ KeyboardEvent => _ = null,
    onKeyUpCapture: /* ev */ KeyboardEvent => _ = null,
    onLoadCapture: /* ev */ Event => _ = null,
    onLoadStartCapture: /* ev */ Event => _ = null,
    onLoadedDataCapture: /* ev */ Event => _ = null,
    onLoadedMetadataCapture: /* ev */ Event => _ = null,
    onMessage: /* ev */ MessageEvent => _ = null,
    onMessageCapture: /* ev */ MessageEvent => _ = null,
    onMouseDownCapture: /* ev */ MouseEvent => _ = null,
    onMouseEnterCapture: /* ev */ MouseEvent => _ = null,
    onMouseLeaveCapture: /* ev */ MouseEvent => _ = null,
    onMouseMoveCapture: /* ev */ MouseEvent => _ = null,
    onMouseOutCapture: /* ev */ MouseEvent => _ = null,
    onMouseOverCapture: /* ev */ MouseEvent => _ = null,
    onMouseUpCapture: /* ev */ MouseEvent => _ = null,
    onMouseWheel: /* ev */ WheelEvent => _ = null,
    onMouseWheelCapture: /* ev */ WheelEvent => _ = null,
    onMsGestureChange: /* ev */ MSGestureEvent => _ = null,
    onMsGestureChangeCapture: /* ev */ MSGestureEvent => _ = null,
    onMsGestureDoubleTap: /* ev */ MSGestureEvent => _ = null,
    onMsGestureDoubleTapCapture: /* ev */ MSGestureEvent => _ = null,
    onMsGestureEnd: /* ev */ MSGestureEvent => _ = null,
    onMsGestureEndCapture: /* ev */ MSGestureEvent => _ = null,
    onMsGestureHold: /* ev */ MSGestureEvent => _ = null,
    onMsGestureHoldCapture: /* ev */ MSGestureEvent => _ = null,
    onMsGestureStart: /* ev */ MSGestureEvent => _ = null,
    onMsGestureStartCapture: /* ev */ MSGestureEvent => _ = null,
    onMsGestureTap: /* ev */ MSGestureEvent => _ = null,
    onMsGestureTapCapture: /* ev */ MSGestureEvent => _ = null,
    onMsInertiaStart: /* ev */ MSGestureEvent => _ = null,
    onMsInertiaStartCapture: /* ev */ MSGestureEvent => _ = null,
    onMsPointerCancel: /* ev */ MSPointerEvent => _ = null,
    onMsPointerCancelCapture: /* ev */ MSPointerEvent => _ = null,
    onMsPointerDown: /* ev */ MSPointerEvent => _ = null,
    onMsPointerDownCapture: /* ev */ MSPointerEvent => _ = null,
    onMsPointerEnter: /* ev */ MSPointerEvent => _ = null,
    onMsPointerEnterCapture: /* ev */ MSPointerEvent => _ = null,
    onMsPointerLeave: /* ev */ MSPointerEvent => _ = null,
    onMsPointerLeaveCapture: /* ev */ MSPointerEvent => _ = null,
    onMsPointerMove: /* ev */ MSPointerEvent => _ = null,
    onMsPointerMoveCapture: /* ev */ MSPointerEvent => _ = null,
    onMsPointerOut: /* ev */ MSPointerEvent => _ = null,
    onMsPointerOutCapture: /* ev */ MSPointerEvent => _ = null,
    onMsPointerOver: /* ev */ MSPointerEvent => _ = null,
    onMsPointerOverCapture: /* ev */ MSPointerEvent => _ = null,
    onOffline: /* ev */ Event => _ = null,
    onOfflineCapture: /* ev */ Event => _ = null,
    onOnline: /* ev */ Event => _ = null,
    onOnlineCapture: /* ev */ Event => _ = null,
    onOrientationChange: /* ev */ Event => _ = null,
    onOrientationChangeCapture: /* ev */ Event => _ = null,
    onPageHide: /* ev */ PageTransitionEvent => _ = null,
    onPageHideCapture: /* ev */ PageTransitionEvent => _ = null,
    onPageShow: /* ev */ PageTransitionEvent => _ = null,
    onPageShowCapture: /* ev */ PageTransitionEvent => _ = null,
    onPauseCapture: /* ev */ Event => _ = null,
    onPlayCapture: /* ev */ Event => _ = null,
    onPlayingCapture: /* ev */ Event => _ = null,
    onPointerCancelCapture: /* ev */ PointerEvent => _ = null,
    onPointerDownCapture: /* ev */ PointerEvent => _ = null,
    onPointerEnterCapture: /* ev */ PointerEvent => _ = null,
    onPointerLeaveCapture: /* ev */ PointerEvent => _ = null,
    onPointerMoveCapture: /* ev */ PointerEvent => _ = null,
    onPointerOutCapture: /* ev */ PointerEvent => _ = null,
    onPointerOverCapture: /* ev */ PointerEvent => _ = null,
    onPointerUpCapture: /* ev */ PointerEvent => _ = null,
    onPopState: /* ev */ PopStateEvent => _ = null,
    onPopStateCapture: /* ev */ PopStateEvent => _ = null,
    onProgressCapture: /* ev */ ProgressEvent => _ = null,
    onRateChangeCapture: /* ev */ Event => _ = null,
    onReadyStateChange: /* ev */ ProgressEvent => _ = null,
    onReadyStateChangeCapture: /* ev */ ProgressEvent => _ = null,
    onReset: /* ev */ Event => _ = null,
    onResetCapture: /* ev */ Event => _ = null,
    onResize: /* ev */ UIEvent => _ = null,
    onResizeCapture: /* ev */ UIEvent => _ = null,
    onScrollCapture: /* ev */ UIEvent => _ = null,
    onSeekedCapture: /* ev */ Event => _ = null,
    onSeekingCapture: /* ev */ Event => _ = null,
    onSelectCapture: /* ev */ UIEvent => _ = null,
    onSelectionChange: /* ev */ Event => _ = null,
    onSelectionChangeCapture: /* ev */ Event => _ = null,
    onStalledCapture: /* ev */ Event => _ = null,
    onStorage: /* ev */ StorageEvent => _ = null,
    onStorageCapture: /* ev */ StorageEvent => _ = null,
    onSubmitCapture: /* ev */ Event => _ = null,
    onSuspendCapture: /* ev */ Event => _ = null,
    onTimeUpdateCapture: /* ev */ Event => _ = null,
    onTouchCancel: js.Any = null,
    onTouchCancelCapture: js.Any = null,
    onTouchEnd: js.Any = null,
    onTouchEndCapture: js.Any = null,
    onTouchMove: js.Any = null,
    onTouchMoveCapture: js.Any = null,
    onTouchStart: js.Any = null,
    onTouchStartCapture: js.Any = null,
    onUnload: /* ev */ Event => _ = null,
    onUnloadCapture: /* ev */ Event => _ = null,
    onVolumeChangeCapture: /* ev */ Event => _ = null,
    onWaitingCapture: /* ev */ Event => _ = null,
    onWheelCapture: /* ev */ WheelEvent => _ = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (oNmsPointerUp != null) __obj.updateDynamic("oNmsPointerUp")(js.Any.fromFunction1(oNmsPointerUp))
    if (oNmsPointerUpCapture != null) __obj.updateDynamic("oNmsPointerUpCapture")(js.Any.fromFunction1(oNmsPointerUpCapture))
    if (onAbortCapture != null) __obj.updateDynamic("onAbortCapture")(js.Any.fromFunction1(onAbortCapture))
    if (onAfterPrint != null) __obj.updateDynamic("onAfterPrint")(js.Any.fromFunction1(onAfterPrint))
    if (onAfterPrintCapture != null) __obj.updateDynamic("onAfterPrintCapture")(js.Any.fromFunction1(onAfterPrintCapture))
    if (onBeforePrint != null) __obj.updateDynamic("onBeforePrint")(js.Any.fromFunction1(onBeforePrint))
    if (onBeforePrintCapture != null) __obj.updateDynamic("onBeforePrintCapture")(js.Any.fromFunction1(onBeforePrintCapture))
    if (onBeforeUnload != null) __obj.updateDynamic("onBeforeUnload")(js.Any.fromFunction1(onBeforeUnload))
    if (onBeforeUnloadCapture != null) __obj.updateDynamic("onBeforeUnloadCapture")(js.Any.fromFunction1(onBeforeUnloadCapture))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(js.Any.fromFunction1(onBlurCapture))
    if (onCanPlayCapture != null) __obj.updateDynamic("onCanPlayCapture")(js.Any.fromFunction1(onCanPlayCapture))
    if (onCanPlayThroughCapture != null) __obj.updateDynamic("onCanPlayThroughCapture")(js.Any.fromFunction1(onCanPlayThroughCapture))
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(js.Any.fromFunction1(onChangeCapture))
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(js.Any.fromFunction1(onClickCapture))
    if (onCompassNeedsCalibration != null) __obj.updateDynamic("onCompassNeedsCalibration")(js.Any.fromFunction1(onCompassNeedsCalibration))
    if (onCompassNeedsCalibrationCapture != null) __obj.updateDynamic("onCompassNeedsCalibrationCapture")(js.Any.fromFunction1(onCompassNeedsCalibrationCapture))
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(js.Any.fromFunction1(onContextMenuCapture))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onDblClickCapture != null) __obj.updateDynamic("onDblClickCapture")(js.Any.fromFunction1(onDblClickCapture))
    if (onDeviceMotion != null) __obj.updateDynamic("onDeviceMotion")(js.Any.fromFunction1(onDeviceMotion))
    if (onDeviceMotionCapture != null) __obj.updateDynamic("onDeviceMotionCapture")(js.Any.fromFunction1(onDeviceMotionCapture))
    if (onDeviceOrientation != null) __obj.updateDynamic("onDeviceOrientation")(js.Any.fromFunction1(onDeviceOrientation))
    if (onDeviceOrientationCapture != null) __obj.updateDynamic("onDeviceOrientationCapture")(js.Any.fromFunction1(onDeviceOrientationCapture))
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(js.Any.fromFunction1(onDragCapture))
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(js.Any.fromFunction1(onDragEndCapture))
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(js.Any.fromFunction1(onDragEnterCapture))
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1(onDragLeaveCapture))
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(js.Any.fromFunction1(onDragOverCapture))
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(js.Any.fromFunction1(onDragStartCapture))
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(js.Any.fromFunction1(onDropCapture))
    if (onDurationChangeCapture != null) __obj.updateDynamic("onDurationChangeCapture")(js.Any.fromFunction1(onDurationChangeCapture))
    if (onEmptiedCapture != null) __obj.updateDynamic("onEmptiedCapture")(js.Any.fromFunction1(onEmptiedCapture))
    if (onEndedCapture != null) __obj.updateDynamic("onEndedCapture")(js.Any.fromFunction1(onEndedCapture))
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(onErrorCapture.asInstanceOf[js.Any])
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(js.Any.fromFunction1(onFocusCapture))
    if (onHashChange != null) __obj.updateDynamic("onHashChange")(js.Any.fromFunction1(onHashChange))
    if (onHashChangeCapture != null) __obj.updateDynamic("onHashChangeCapture")(js.Any.fromFunction1(onHashChangeCapture))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(js.Any.fromFunction1(onInputCapture))
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(js.Any.fromFunction1(onKeyDownCapture))
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(js.Any.fromFunction1(onKeyPressCapture))
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(js.Any.fromFunction1(onKeyUpCapture))
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(js.Any.fromFunction1(onLoadCapture))
    if (onLoadStartCapture != null) __obj.updateDynamic("onLoadStartCapture")(js.Any.fromFunction1(onLoadStartCapture))
    if (onLoadedDataCapture != null) __obj.updateDynamic("onLoadedDataCapture")(js.Any.fromFunction1(onLoadedDataCapture))
    if (onLoadedMetadataCapture != null) __obj.updateDynamic("onLoadedMetadataCapture")(js.Any.fromFunction1(onLoadedMetadataCapture))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onMessageCapture != null) __obj.updateDynamic("onMessageCapture")(js.Any.fromFunction1(onMessageCapture))
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(js.Any.fromFunction1(onMouseDownCapture))
    if (onMouseEnterCapture != null) __obj.updateDynamic("onMouseEnterCapture")(js.Any.fromFunction1(onMouseEnterCapture))
    if (onMouseLeaveCapture != null) __obj.updateDynamic("onMouseLeaveCapture")(js.Any.fromFunction1(onMouseLeaveCapture))
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1(onMouseMoveCapture))
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(js.Any.fromFunction1(onMouseOutCapture))
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(js.Any.fromFunction1(onMouseOverCapture))
    if (onMouseUpCapture != null) __obj.updateDynamic("onMouseUpCapture")(js.Any.fromFunction1(onMouseUpCapture))
    if (onMouseWheel != null) __obj.updateDynamic("onMouseWheel")(js.Any.fromFunction1(onMouseWheel))
    if (onMouseWheelCapture != null) __obj.updateDynamic("onMouseWheelCapture")(js.Any.fromFunction1(onMouseWheelCapture))
    if (onMsGestureChange != null) __obj.updateDynamic("onMsGestureChange")(js.Any.fromFunction1(onMsGestureChange))
    if (onMsGestureChangeCapture != null) __obj.updateDynamic("onMsGestureChangeCapture")(js.Any.fromFunction1(onMsGestureChangeCapture))
    if (onMsGestureDoubleTap != null) __obj.updateDynamic("onMsGestureDoubleTap")(js.Any.fromFunction1(onMsGestureDoubleTap))
    if (onMsGestureDoubleTapCapture != null) __obj.updateDynamic("onMsGestureDoubleTapCapture")(js.Any.fromFunction1(onMsGestureDoubleTapCapture))
    if (onMsGestureEnd != null) __obj.updateDynamic("onMsGestureEnd")(js.Any.fromFunction1(onMsGestureEnd))
    if (onMsGestureEndCapture != null) __obj.updateDynamic("onMsGestureEndCapture")(js.Any.fromFunction1(onMsGestureEndCapture))
    if (onMsGestureHold != null) __obj.updateDynamic("onMsGestureHold")(js.Any.fromFunction1(onMsGestureHold))
    if (onMsGestureHoldCapture != null) __obj.updateDynamic("onMsGestureHoldCapture")(js.Any.fromFunction1(onMsGestureHoldCapture))
    if (onMsGestureStart != null) __obj.updateDynamic("onMsGestureStart")(js.Any.fromFunction1(onMsGestureStart))
    if (onMsGestureStartCapture != null) __obj.updateDynamic("onMsGestureStartCapture")(js.Any.fromFunction1(onMsGestureStartCapture))
    if (onMsGestureTap != null) __obj.updateDynamic("onMsGestureTap")(js.Any.fromFunction1(onMsGestureTap))
    if (onMsGestureTapCapture != null) __obj.updateDynamic("onMsGestureTapCapture")(js.Any.fromFunction1(onMsGestureTapCapture))
    if (onMsInertiaStart != null) __obj.updateDynamic("onMsInertiaStart")(js.Any.fromFunction1(onMsInertiaStart))
    if (onMsInertiaStartCapture != null) __obj.updateDynamic("onMsInertiaStartCapture")(js.Any.fromFunction1(onMsInertiaStartCapture))
    if (onMsPointerCancel != null) __obj.updateDynamic("onMsPointerCancel")(js.Any.fromFunction1(onMsPointerCancel))
    if (onMsPointerCancelCapture != null) __obj.updateDynamic("onMsPointerCancelCapture")(js.Any.fromFunction1(onMsPointerCancelCapture))
    if (onMsPointerDown != null) __obj.updateDynamic("onMsPointerDown")(js.Any.fromFunction1(onMsPointerDown))
    if (onMsPointerDownCapture != null) __obj.updateDynamic("onMsPointerDownCapture")(js.Any.fromFunction1(onMsPointerDownCapture))
    if (onMsPointerEnter != null) __obj.updateDynamic("onMsPointerEnter")(js.Any.fromFunction1(onMsPointerEnter))
    if (onMsPointerEnterCapture != null) __obj.updateDynamic("onMsPointerEnterCapture")(js.Any.fromFunction1(onMsPointerEnterCapture))
    if (onMsPointerLeave != null) __obj.updateDynamic("onMsPointerLeave")(js.Any.fromFunction1(onMsPointerLeave))
    if (onMsPointerLeaveCapture != null) __obj.updateDynamic("onMsPointerLeaveCapture")(js.Any.fromFunction1(onMsPointerLeaveCapture))
    if (onMsPointerMove != null) __obj.updateDynamic("onMsPointerMove")(js.Any.fromFunction1(onMsPointerMove))
    if (onMsPointerMoveCapture != null) __obj.updateDynamic("onMsPointerMoveCapture")(js.Any.fromFunction1(onMsPointerMoveCapture))
    if (onMsPointerOut != null) __obj.updateDynamic("onMsPointerOut")(js.Any.fromFunction1(onMsPointerOut))
    if (onMsPointerOutCapture != null) __obj.updateDynamic("onMsPointerOutCapture")(js.Any.fromFunction1(onMsPointerOutCapture))
    if (onMsPointerOver != null) __obj.updateDynamic("onMsPointerOver")(js.Any.fromFunction1(onMsPointerOver))
    if (onMsPointerOverCapture != null) __obj.updateDynamic("onMsPointerOverCapture")(js.Any.fromFunction1(onMsPointerOverCapture))
    if (onOffline != null) __obj.updateDynamic("onOffline")(js.Any.fromFunction1(onOffline))
    if (onOfflineCapture != null) __obj.updateDynamic("onOfflineCapture")(js.Any.fromFunction1(onOfflineCapture))
    if (onOnline != null) __obj.updateDynamic("onOnline")(js.Any.fromFunction1(onOnline))
    if (onOnlineCapture != null) __obj.updateDynamic("onOnlineCapture")(js.Any.fromFunction1(onOnlineCapture))
    if (onOrientationChange != null) __obj.updateDynamic("onOrientationChange")(js.Any.fromFunction1(onOrientationChange))
    if (onOrientationChangeCapture != null) __obj.updateDynamic("onOrientationChangeCapture")(js.Any.fromFunction1(onOrientationChangeCapture))
    if (onPageHide != null) __obj.updateDynamic("onPageHide")(js.Any.fromFunction1(onPageHide))
    if (onPageHideCapture != null) __obj.updateDynamic("onPageHideCapture")(js.Any.fromFunction1(onPageHideCapture))
    if (onPageShow != null) __obj.updateDynamic("onPageShow")(js.Any.fromFunction1(onPageShow))
    if (onPageShowCapture != null) __obj.updateDynamic("onPageShowCapture")(js.Any.fromFunction1(onPageShowCapture))
    if (onPauseCapture != null) __obj.updateDynamic("onPauseCapture")(js.Any.fromFunction1(onPauseCapture))
    if (onPlayCapture != null) __obj.updateDynamic("onPlayCapture")(js.Any.fromFunction1(onPlayCapture))
    if (onPlayingCapture != null) __obj.updateDynamic("onPlayingCapture")(js.Any.fromFunction1(onPlayingCapture))
    if (onPointerCancelCapture != null) __obj.updateDynamic("onPointerCancelCapture")(js.Any.fromFunction1(onPointerCancelCapture))
    if (onPointerDownCapture != null) __obj.updateDynamic("onPointerDownCapture")(js.Any.fromFunction1(onPointerDownCapture))
    if (onPointerEnterCapture != null) __obj.updateDynamic("onPointerEnterCapture")(js.Any.fromFunction1(onPointerEnterCapture))
    if (onPointerLeaveCapture != null) __obj.updateDynamic("onPointerLeaveCapture")(js.Any.fromFunction1(onPointerLeaveCapture))
    if (onPointerMoveCapture != null) __obj.updateDynamic("onPointerMoveCapture")(js.Any.fromFunction1(onPointerMoveCapture))
    if (onPointerOutCapture != null) __obj.updateDynamic("onPointerOutCapture")(js.Any.fromFunction1(onPointerOutCapture))
    if (onPointerOverCapture != null) __obj.updateDynamic("onPointerOverCapture")(js.Any.fromFunction1(onPointerOverCapture))
    if (onPointerUpCapture != null) __obj.updateDynamic("onPointerUpCapture")(js.Any.fromFunction1(onPointerUpCapture))
    if (onPopState != null) __obj.updateDynamic("onPopState")(js.Any.fromFunction1(onPopState))
    if (onPopStateCapture != null) __obj.updateDynamic("onPopStateCapture")(js.Any.fromFunction1(onPopStateCapture))
    if (onProgressCapture != null) __obj.updateDynamic("onProgressCapture")(js.Any.fromFunction1(onProgressCapture))
    if (onRateChangeCapture != null) __obj.updateDynamic("onRateChangeCapture")(js.Any.fromFunction1(onRateChangeCapture))
    if (onReadyStateChange != null) __obj.updateDynamic("onReadyStateChange")(js.Any.fromFunction1(onReadyStateChange))
    if (onReadyStateChangeCapture != null) __obj.updateDynamic("onReadyStateChangeCapture")(js.Any.fromFunction1(onReadyStateChangeCapture))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(js.Any.fromFunction1(onResetCapture))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onResizeCapture != null) __obj.updateDynamic("onResizeCapture")(js.Any.fromFunction1(onResizeCapture))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(js.Any.fromFunction1(onScrollCapture))
    if (onSeekedCapture != null) __obj.updateDynamic("onSeekedCapture")(js.Any.fromFunction1(onSeekedCapture))
    if (onSeekingCapture != null) __obj.updateDynamic("onSeekingCapture")(js.Any.fromFunction1(onSeekingCapture))
    if (onSelectCapture != null) __obj.updateDynamic("onSelectCapture")(js.Any.fromFunction1(onSelectCapture))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onSelectionChangeCapture != null) __obj.updateDynamic("onSelectionChangeCapture")(js.Any.fromFunction1(onSelectionChangeCapture))
    if (onStalledCapture != null) __obj.updateDynamic("onStalledCapture")(js.Any.fromFunction1(onStalledCapture))
    if (onStorage != null) __obj.updateDynamic("onStorage")(js.Any.fromFunction1(onStorage))
    if (onStorageCapture != null) __obj.updateDynamic("onStorageCapture")(js.Any.fromFunction1(onStorageCapture))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(js.Any.fromFunction1(onSubmitCapture))
    if (onSuspendCapture != null) __obj.updateDynamic("onSuspendCapture")(js.Any.fromFunction1(onSuspendCapture))
    if (onTimeUpdateCapture != null) __obj.updateDynamic("onTimeUpdateCapture")(js.Any.fromFunction1(onTimeUpdateCapture))
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel.asInstanceOf[js.Any])
    if (onTouchCancelCapture != null) __obj.updateDynamic("onTouchCancelCapture")(onTouchCancelCapture.asInstanceOf[js.Any])
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd.asInstanceOf[js.Any])
    if (onTouchEndCapture != null) __obj.updateDynamic("onTouchEndCapture")(onTouchEndCapture.asInstanceOf[js.Any])
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove.asInstanceOf[js.Any])
    if (onTouchMoveCapture != null) __obj.updateDynamic("onTouchMoveCapture")(onTouchMoveCapture.asInstanceOf[js.Any])
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart.asInstanceOf[js.Any])
    if (onTouchStartCapture != null) __obj.updateDynamic("onTouchStartCapture")(onTouchStartCapture.asInstanceOf[js.Any])
    if (onUnload != null) __obj.updateDynamic("onUnload")(js.Any.fromFunction1(onUnload))
    if (onUnloadCapture != null) __obj.updateDynamic("onUnloadCapture")(js.Any.fromFunction1(onUnloadCapture))
    if (onVolumeChangeCapture != null) __obj.updateDynamic("onVolumeChangeCapture")(js.Any.fromFunction1(onVolumeChangeCapture))
    if (onWaitingCapture != null) __obj.updateDynamic("onWaitingCapture")(js.Any.fromFunction1(onWaitingCapture))
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(js.Any.fromFunction1(onWheelCapture))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = EventListenerProps
}

