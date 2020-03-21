package typingsSlinky.reactEventListener.components

import org.scalablytyped.runtime.StringDictionary
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
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactEventListener.mod.EventListenerProps
import typingsSlinky.reactEventListener.mod.default
import typingsSlinky.std.Document_
import typingsSlinky.std.Event_
import typingsSlinky.std.MSGestureEvent
import typingsSlinky.std.MSPointerEvent
import typingsSlinky.std.PageTransitionEvent
import typingsSlinky.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactEventListener
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-event-listener", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    target: Window_ | Document_ | String,
    oNmsPointerUp: /* ev */ MSPointerEvent => _ = null,
    oNmsPointerUpCapture: /* ev */ MSPointerEvent => _ = null,
    onAbort: /* ev */ Event_ => _ = null,
    onAbortCapture: /* ev */ Event_ => _ = null,
    onAfterPrint: /* ev */ Event_ => _ = null,
    onAfterPrintCapture: /* ev */ Event_ => _ = null,
    onBeforePrint: /* ev */ Event_ => _ = null,
    onBeforePrintCapture: /* ev */ Event_ => _ = null,
    onBeforeUnload: /* ev */ BeforeUnloadEvent => _ = null,
    onBeforeUnloadCapture: /* ev */ BeforeUnloadEvent => _ = null,
    onBlur: /* ev */ FocusEvent => _ = null,
    onBlurCapture: /* ev */ FocusEvent => _ = null,
    onCanPlay: /* ev */ Event_ => _ = null,
    onCanPlayCapture: /* ev */ Event_ => _ = null,
    onCanPlayThrough: /* ev */ Event_ => _ = null,
    onCanPlayThroughCapture: /* ev */ Event_ => _ = null,
    onChange: /* ev */ Event_ => _ = null,
    onChangeCapture: /* ev */ Event_ => _ = null,
    onClick: /* ev */ MouseEvent => _ = null,
    onClickCapture: /* ev */ MouseEvent => _ = null,
    onCompassNeedsCalibration: /* ev */ Event_ => _ = null,
    onCompassNeedsCalibrationCapture: /* ev */ Event_ => _ = null,
    onContextMenu: /* ev */ PointerEvent => _ = null,
    onContextMenuCapture: /* ev */ PointerEvent => _ = null,
    onDblClick: /* ev */ MouseEvent => _ = null,
    onDblClickCapture: /* ev */ MouseEvent => _ = null,
    onDeviceMotion: /* ev */ DeviceMotionEvent => _ = null,
    onDeviceMotionCapture: /* ev */ DeviceMotionEvent => _ = null,
    onDeviceOrientation: /* ev */ DeviceOrientationEvent => _ = null,
    onDeviceOrientationCapture: /* ev */ DeviceOrientationEvent => _ = null,
    onDrag: /* ev */ DragEvent => _ = null,
    onDragCapture: /* ev */ DragEvent => _ = null,
    onDragEnd: /* ev */ DragEvent => _ = null,
    onDragEndCapture: /* ev */ DragEvent => _ = null,
    onDragEnter: /* ev */ DragEvent => _ = null,
    onDragEnterCapture: /* ev */ DragEvent => _ = null,
    onDragLeave: /* ev */ DragEvent => _ = null,
    onDragLeaveCapture: /* ev */ DragEvent => _ = null,
    onDragOver: /* ev */ DragEvent => _ = null,
    onDragOverCapture: /* ev */ DragEvent => _ = null,
    onDragStart: /* ev */ DragEvent => _ = null,
    onDragStartCapture: /* ev */ DragEvent => _ = null,
    onDrop: /* ev */ DragEvent => _ = null,
    onDropCapture: /* ev */ DragEvent => _ = null,
    onDurationChange: /* ev */ Event_ => _ = null,
    onDurationChangeCapture: /* ev */ Event_ => _ = null,
    onEmptied: /* ev */ Event_ => _ = null,
    onEmptiedCapture: /* ev */ Event_ => _ = null,
    onEnded: /* ev */ Event_ => _ = null,
    onEndedCapture: /* ev */ Event_ => _ = null,
    onError: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any = null,
    onErrorCapture: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any = null,
    onFocus: /* ev */ FocusEvent => _ = null,
    onFocusCapture: /* ev */ FocusEvent => _ = null,
    onHashChange: /* ev */ HashChangeEvent => _ = null,
    onHashChangeCapture: /* ev */ HashChangeEvent => _ = null,
    onInput: /* ev */ Event_ => _ = null,
    onInputCapture: /* ev */ Event_ => _ = null,
    onKeyDown: /* ev */ KeyboardEvent => _ = null,
    onKeyDownCapture: /* ev */ KeyboardEvent => _ = null,
    onKeyPress: /* ev */ KeyboardEvent => _ = null,
    onKeyPressCapture: /* ev */ KeyboardEvent => _ = null,
    onKeyUp: /* ev */ KeyboardEvent => _ = null,
    onKeyUpCapture: /* ev */ KeyboardEvent => _ = null,
    onLoad: /* ev */ Event_ => _ = null,
    onLoadCapture: /* ev */ Event_ => _ = null,
    onLoadStart: /* ev */ Event_ => _ = null,
    onLoadStartCapture: /* ev */ Event_ => _ = null,
    onLoadedData: /* ev */ Event_ => _ = null,
    onLoadedDataCapture: /* ev */ Event_ => _ = null,
    onLoadedMetadata: /* ev */ Event_ => _ = null,
    onLoadedMetadataCapture: /* ev */ Event_ => _ = null,
    onMessage: /* ev */ MessageEvent => _ = null,
    onMessageCapture: /* ev */ MessageEvent => _ = null,
    onMouseDown: /* ev */ MouseEvent => _ = null,
    onMouseDownCapture: /* ev */ MouseEvent => _ = null,
    onMouseEnter: /* ev */ MouseEvent => _ = null,
    onMouseEnterCapture: /* ev */ MouseEvent => _ = null,
    onMouseLeave: /* ev */ MouseEvent => _ = null,
    onMouseLeaveCapture: /* ev */ MouseEvent => _ = null,
    onMouseMove: /* ev */ MouseEvent => _ = null,
    onMouseMoveCapture: /* ev */ MouseEvent => _ = null,
    onMouseOut: /* ev */ MouseEvent => _ = null,
    onMouseOutCapture: /* ev */ MouseEvent => _ = null,
    onMouseOver: /* ev */ MouseEvent => _ = null,
    onMouseOverCapture: /* ev */ MouseEvent => _ = null,
    onMouseUp: /* ev */ MouseEvent => _ = null,
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
    onOffline: /* ev */ Event_ => _ = null,
    onOfflineCapture: /* ev */ Event_ => _ = null,
    onOnline: /* ev */ Event_ => _ = null,
    onOnlineCapture: /* ev */ Event_ => _ = null,
    onOrientationChange: /* ev */ Event_ => _ = null,
    onOrientationChangeCapture: /* ev */ Event_ => _ = null,
    onPageHide: /* ev */ PageTransitionEvent => _ = null,
    onPageHideCapture: /* ev */ PageTransitionEvent => _ = null,
    onPageShow: /* ev */ PageTransitionEvent => _ = null,
    onPageShowCapture: /* ev */ PageTransitionEvent => _ = null,
    onPause: /* ev */ Event_ => _ = null,
    onPauseCapture: /* ev */ Event_ => _ = null,
    onPlay: /* ev */ Event_ => _ = null,
    onPlayCapture: /* ev */ Event_ => _ = null,
    onPlaying: /* ev */ Event_ => _ = null,
    onPlayingCapture: /* ev */ Event_ => _ = null,
    onPointerCancel: /* ev */ PointerEvent => _ = null,
    onPointerCancelCapture: /* ev */ PointerEvent => _ = null,
    onPointerDown: /* ev */ PointerEvent => _ = null,
    onPointerDownCapture: /* ev */ PointerEvent => _ = null,
    onPointerEnter: /* ev */ PointerEvent => _ = null,
    onPointerEnterCapture: /* ev */ PointerEvent => _ = null,
    onPointerLeave: /* ev */ PointerEvent => _ = null,
    onPointerLeaveCapture: /* ev */ PointerEvent => _ = null,
    onPointerMove: /* ev */ PointerEvent => _ = null,
    onPointerMoveCapture: /* ev */ PointerEvent => _ = null,
    onPointerOut: /* ev */ PointerEvent => _ = null,
    onPointerOutCapture: /* ev */ PointerEvent => _ = null,
    onPointerOver: /* ev */ PointerEvent => _ = null,
    onPointerOverCapture: /* ev */ PointerEvent => _ = null,
    onPointerUp: /* ev */ PointerEvent => _ = null,
    onPointerUpCapture: /* ev */ PointerEvent => _ = null,
    onPopState: /* ev */ PopStateEvent => _ = null,
    onPopStateCapture: /* ev */ PopStateEvent => _ = null,
    onProgress: /* ev */ ProgressEvent => _ = null,
    onProgressCapture: /* ev */ ProgressEvent => _ = null,
    onRateChange: /* ev */ Event_ => _ = null,
    onRateChangeCapture: /* ev */ Event_ => _ = null,
    onReadyStateChange: /* ev */ ProgressEvent => _ = null,
    onReadyStateChangeCapture: /* ev */ ProgressEvent => _ = null,
    onReset: /* ev */ Event_ => _ = null,
    onResetCapture: /* ev */ Event_ => _ = null,
    onResize: /* ev */ UIEvent => _ = null,
    onResizeCapture: /* ev */ UIEvent => _ = null,
    onScroll: /* ev */ UIEvent => _ = null,
    onScrollCapture: /* ev */ UIEvent => _ = null,
    onSeeked: /* ev */ Event_ => _ = null,
    onSeekedCapture: /* ev */ Event_ => _ = null,
    onSeeking: /* ev */ Event_ => _ = null,
    onSeekingCapture: /* ev */ Event_ => _ = null,
    onSelect: /* ev */ UIEvent => _ = null,
    onSelectCapture: /* ev */ UIEvent => _ = null,
    onSelectionChange: /* ev */ Event_ => _ = null,
    onSelectionChangeCapture: /* ev */ Event_ => _ = null,
    onStalled: /* ev */ Event_ => _ = null,
    onStalledCapture: /* ev */ Event_ => _ = null,
    onStorage: /* ev */ StorageEvent => _ = null,
    onStorageCapture: /* ev */ StorageEvent => _ = null,
    onSubmit: /* ev */ Event_ => _ = null,
    onSubmitCapture: /* ev */ Event_ => _ = null,
    onSuspend: /* ev */ Event_ => _ = null,
    onSuspendCapture: /* ev */ Event_ => _ = null,
    onTimeUpdate: /* ev */ Event_ => _ = null,
    onTimeUpdateCapture: /* ev */ Event_ => _ = null,
    onTouchCancel: js.Any = null,
    onTouchCancelCapture: js.Any = null,
    onTouchEnd: js.Any = null,
    onTouchEndCapture: js.Any = null,
    onTouchMove: js.Any = null,
    onTouchMoveCapture: js.Any = null,
    onTouchStart: js.Any = null,
    onTouchStartCapture: js.Any = null,
    onUnload: /* ev */ Event_ => _ = null,
    onUnloadCapture: /* ev */ Event_ => _ = null,
    onVolumeChange: /* ev */ Event_ => _ = null,
    onVolumeChangeCapture: /* ev */ Event_ => _ = null,
    onWaiting: /* ev */ Event_ => _ = null,
    onWaitingCapture: /* ev */ Event_ => _ = null,
    onWheel: /* ev */ WheelEvent => _ = null,
    onWheelCapture: /* ev */ WheelEvent => _ = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (oNmsPointerUp != null) __obj.updateDynamic("oNmsPointerUp")(js.Any.fromFunction1(oNmsPointerUp))
    if (oNmsPointerUpCapture != null) __obj.updateDynamic("oNmsPointerUpCapture")(js.Any.fromFunction1(oNmsPointerUpCapture))
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onAbortCapture != null) __obj.updateDynamic("onAbortCapture")(js.Any.fromFunction1(onAbortCapture))
    if (onAfterPrint != null) __obj.updateDynamic("onAfterPrint")(js.Any.fromFunction1(onAfterPrint))
    if (onAfterPrintCapture != null) __obj.updateDynamic("onAfterPrintCapture")(js.Any.fromFunction1(onAfterPrintCapture))
    if (onBeforePrint != null) __obj.updateDynamic("onBeforePrint")(js.Any.fromFunction1(onBeforePrint))
    if (onBeforePrintCapture != null) __obj.updateDynamic("onBeforePrintCapture")(js.Any.fromFunction1(onBeforePrintCapture))
    if (onBeforeUnload != null) __obj.updateDynamic("onBeforeUnload")(js.Any.fromFunction1(onBeforeUnload))
    if (onBeforeUnloadCapture != null) __obj.updateDynamic("onBeforeUnloadCapture")(js.Any.fromFunction1(onBeforeUnloadCapture))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onBlurCapture != null) __obj.updateDynamic("onBlurCapture")(js.Any.fromFunction1(onBlurCapture))
    if (onCanPlay != null) __obj.updateDynamic("onCanPlay")(js.Any.fromFunction1(onCanPlay))
    if (onCanPlayCapture != null) __obj.updateDynamic("onCanPlayCapture")(js.Any.fromFunction1(onCanPlayCapture))
    if (onCanPlayThrough != null) __obj.updateDynamic("onCanPlayThrough")(js.Any.fromFunction1(onCanPlayThrough))
    if (onCanPlayThroughCapture != null) __obj.updateDynamic("onCanPlayThroughCapture")(js.Any.fromFunction1(onCanPlayThroughCapture))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onChangeCapture != null) __obj.updateDynamic("onChangeCapture")(js.Any.fromFunction1(onChangeCapture))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onClickCapture != null) __obj.updateDynamic("onClickCapture")(js.Any.fromFunction1(onClickCapture))
    if (onCompassNeedsCalibration != null) __obj.updateDynamic("onCompassNeedsCalibration")(js.Any.fromFunction1(onCompassNeedsCalibration))
    if (onCompassNeedsCalibrationCapture != null) __obj.updateDynamic("onCompassNeedsCalibrationCapture")(js.Any.fromFunction1(onCompassNeedsCalibrationCapture))
    if (onContextMenu != null) __obj.updateDynamic("onContextMenu")(js.Any.fromFunction1(onContextMenu))
    if (onContextMenuCapture != null) __obj.updateDynamic("onContextMenuCapture")(js.Any.fromFunction1(onContextMenuCapture))
    if (onDblClick != null) __obj.updateDynamic("onDblClick")(js.Any.fromFunction1(onDblClick))
    if (onDblClickCapture != null) __obj.updateDynamic("onDblClickCapture")(js.Any.fromFunction1(onDblClickCapture))
    if (onDeviceMotion != null) __obj.updateDynamic("onDeviceMotion")(js.Any.fromFunction1(onDeviceMotion))
    if (onDeviceMotionCapture != null) __obj.updateDynamic("onDeviceMotionCapture")(js.Any.fromFunction1(onDeviceMotionCapture))
    if (onDeviceOrientation != null) __obj.updateDynamic("onDeviceOrientation")(js.Any.fromFunction1(onDeviceOrientation))
    if (onDeviceOrientationCapture != null) __obj.updateDynamic("onDeviceOrientationCapture")(js.Any.fromFunction1(onDeviceOrientationCapture))
    if (onDrag != null) __obj.updateDynamic("onDrag")(js.Any.fromFunction1(onDrag))
    if (onDragCapture != null) __obj.updateDynamic("onDragCapture")(js.Any.fromFunction1(onDragCapture))
    if (onDragEnd != null) __obj.updateDynamic("onDragEnd")(js.Any.fromFunction1(onDragEnd))
    if (onDragEndCapture != null) __obj.updateDynamic("onDragEndCapture")(js.Any.fromFunction1(onDragEndCapture))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragEnterCapture != null) __obj.updateDynamic("onDragEnterCapture")(js.Any.fromFunction1(onDragEnterCapture))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragLeaveCapture != null) __obj.updateDynamic("onDragLeaveCapture")(js.Any.fromFunction1(onDragLeaveCapture))
    if (onDragOver != null) __obj.updateDynamic("onDragOver")(js.Any.fromFunction1(onDragOver))
    if (onDragOverCapture != null) __obj.updateDynamic("onDragOverCapture")(js.Any.fromFunction1(onDragOverCapture))
    if (onDragStart != null) __obj.updateDynamic("onDragStart")(js.Any.fromFunction1(onDragStart))
    if (onDragStartCapture != null) __obj.updateDynamic("onDragStartCapture")(js.Any.fromFunction1(onDragStartCapture))
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (onDropCapture != null) __obj.updateDynamic("onDropCapture")(js.Any.fromFunction1(onDropCapture))
    if (onDurationChange != null) __obj.updateDynamic("onDurationChange")(js.Any.fromFunction1(onDurationChange))
    if (onDurationChangeCapture != null) __obj.updateDynamic("onDurationChangeCapture")(js.Any.fromFunction1(onDurationChangeCapture))
    if (onEmptied != null) __obj.updateDynamic("onEmptied")(js.Any.fromFunction1(onEmptied))
    if (onEmptiedCapture != null) __obj.updateDynamic("onEmptiedCapture")(js.Any.fromFunction1(onEmptiedCapture))
    if (onEnded != null) __obj.updateDynamic("onEnded")(js.Any.fromFunction1(onEnded))
    if (onEndedCapture != null) __obj.updateDynamic("onEndedCapture")(js.Any.fromFunction1(onEndedCapture))
    if (onError != null) __obj.updateDynamic("onError")(onError.asInstanceOf[js.Any])
    if (onErrorCapture != null) __obj.updateDynamic("onErrorCapture")(onErrorCapture.asInstanceOf[js.Any])
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onFocusCapture != null) __obj.updateDynamic("onFocusCapture")(js.Any.fromFunction1(onFocusCapture))
    if (onHashChange != null) __obj.updateDynamic("onHashChange")(js.Any.fromFunction1(onHashChange))
    if (onHashChangeCapture != null) __obj.updateDynamic("onHashChangeCapture")(js.Any.fromFunction1(onHashChangeCapture))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (onInputCapture != null) __obj.updateDynamic("onInputCapture")(js.Any.fromFunction1(onInputCapture))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onKeyDownCapture != null) __obj.updateDynamic("onKeyDownCapture")(js.Any.fromFunction1(onKeyDownCapture))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1(onKeyPress))
    if (onKeyPressCapture != null) __obj.updateDynamic("onKeyPressCapture")(js.Any.fromFunction1(onKeyPressCapture))
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(js.Any.fromFunction1(onKeyUp))
    if (onKeyUpCapture != null) __obj.updateDynamic("onKeyUpCapture")(js.Any.fromFunction1(onKeyUpCapture))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (onLoadCapture != null) __obj.updateDynamic("onLoadCapture")(js.Any.fromFunction1(onLoadCapture))
    if (onLoadStart != null) __obj.updateDynamic("onLoadStart")(js.Any.fromFunction1(onLoadStart))
    if (onLoadStartCapture != null) __obj.updateDynamic("onLoadStartCapture")(js.Any.fromFunction1(onLoadStartCapture))
    if (onLoadedData != null) __obj.updateDynamic("onLoadedData")(js.Any.fromFunction1(onLoadedData))
    if (onLoadedDataCapture != null) __obj.updateDynamic("onLoadedDataCapture")(js.Any.fromFunction1(onLoadedDataCapture))
    if (onLoadedMetadata != null) __obj.updateDynamic("onLoadedMetadata")(js.Any.fromFunction1(onLoadedMetadata))
    if (onLoadedMetadataCapture != null) __obj.updateDynamic("onLoadedMetadataCapture")(js.Any.fromFunction1(onLoadedMetadataCapture))
    if (onMessage != null) __obj.updateDynamic("onMessage")(js.Any.fromFunction1(onMessage))
    if (onMessageCapture != null) __obj.updateDynamic("onMessageCapture")(js.Any.fromFunction1(onMessageCapture))
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(js.Any.fromFunction1(onMouseDown))
    if (onMouseDownCapture != null) __obj.updateDynamic("onMouseDownCapture")(js.Any.fromFunction1(onMouseDownCapture))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseEnterCapture != null) __obj.updateDynamic("onMouseEnterCapture")(js.Any.fromFunction1(onMouseEnterCapture))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (onMouseLeaveCapture != null) __obj.updateDynamic("onMouseLeaveCapture")(js.Any.fromFunction1(onMouseLeaveCapture))
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(js.Any.fromFunction1(onMouseMove))
    if (onMouseMoveCapture != null) __obj.updateDynamic("onMouseMoveCapture")(js.Any.fromFunction1(onMouseMoveCapture))
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(js.Any.fromFunction1(onMouseOut))
    if (onMouseOutCapture != null) __obj.updateDynamic("onMouseOutCapture")(js.Any.fromFunction1(onMouseOutCapture))
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(js.Any.fromFunction1(onMouseOver))
    if (onMouseOverCapture != null) __obj.updateDynamic("onMouseOverCapture")(js.Any.fromFunction1(onMouseOverCapture))
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(js.Any.fromFunction1(onMouseUp))
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
    if (onPause != null) __obj.updateDynamic("onPause")(js.Any.fromFunction1(onPause))
    if (onPauseCapture != null) __obj.updateDynamic("onPauseCapture")(js.Any.fromFunction1(onPauseCapture))
    if (onPlay != null) __obj.updateDynamic("onPlay")(js.Any.fromFunction1(onPlay))
    if (onPlayCapture != null) __obj.updateDynamic("onPlayCapture")(js.Any.fromFunction1(onPlayCapture))
    if (onPlaying != null) __obj.updateDynamic("onPlaying")(js.Any.fromFunction1(onPlaying))
    if (onPlayingCapture != null) __obj.updateDynamic("onPlayingCapture")(js.Any.fromFunction1(onPlayingCapture))
    if (onPointerCancel != null) __obj.updateDynamic("onPointerCancel")(js.Any.fromFunction1(onPointerCancel))
    if (onPointerCancelCapture != null) __obj.updateDynamic("onPointerCancelCapture")(js.Any.fromFunction1(onPointerCancelCapture))
    if (onPointerDown != null) __obj.updateDynamic("onPointerDown")(js.Any.fromFunction1(onPointerDown))
    if (onPointerDownCapture != null) __obj.updateDynamic("onPointerDownCapture")(js.Any.fromFunction1(onPointerDownCapture))
    if (onPointerEnter != null) __obj.updateDynamic("onPointerEnter")(js.Any.fromFunction1(onPointerEnter))
    if (onPointerEnterCapture != null) __obj.updateDynamic("onPointerEnterCapture")(js.Any.fromFunction1(onPointerEnterCapture))
    if (onPointerLeave != null) __obj.updateDynamic("onPointerLeave")(js.Any.fromFunction1(onPointerLeave))
    if (onPointerLeaveCapture != null) __obj.updateDynamic("onPointerLeaveCapture")(js.Any.fromFunction1(onPointerLeaveCapture))
    if (onPointerMove != null) __obj.updateDynamic("onPointerMove")(js.Any.fromFunction1(onPointerMove))
    if (onPointerMoveCapture != null) __obj.updateDynamic("onPointerMoveCapture")(js.Any.fromFunction1(onPointerMoveCapture))
    if (onPointerOut != null) __obj.updateDynamic("onPointerOut")(js.Any.fromFunction1(onPointerOut))
    if (onPointerOutCapture != null) __obj.updateDynamic("onPointerOutCapture")(js.Any.fromFunction1(onPointerOutCapture))
    if (onPointerOver != null) __obj.updateDynamic("onPointerOver")(js.Any.fromFunction1(onPointerOver))
    if (onPointerOverCapture != null) __obj.updateDynamic("onPointerOverCapture")(js.Any.fromFunction1(onPointerOverCapture))
    if (onPointerUp != null) __obj.updateDynamic("onPointerUp")(js.Any.fromFunction1(onPointerUp))
    if (onPointerUpCapture != null) __obj.updateDynamic("onPointerUpCapture")(js.Any.fromFunction1(onPointerUpCapture))
    if (onPopState != null) __obj.updateDynamic("onPopState")(js.Any.fromFunction1(onPopState))
    if (onPopStateCapture != null) __obj.updateDynamic("onPopStateCapture")(js.Any.fromFunction1(onPopStateCapture))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onProgressCapture != null) __obj.updateDynamic("onProgressCapture")(js.Any.fromFunction1(onProgressCapture))
    if (onRateChange != null) __obj.updateDynamic("onRateChange")(js.Any.fromFunction1(onRateChange))
    if (onRateChangeCapture != null) __obj.updateDynamic("onRateChangeCapture")(js.Any.fromFunction1(onRateChangeCapture))
    if (onReadyStateChange != null) __obj.updateDynamic("onReadyStateChange")(js.Any.fromFunction1(onReadyStateChange))
    if (onReadyStateChangeCapture != null) __obj.updateDynamic("onReadyStateChangeCapture")(js.Any.fromFunction1(onReadyStateChangeCapture))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction1(onReset))
    if (onResetCapture != null) __obj.updateDynamic("onResetCapture")(js.Any.fromFunction1(onResetCapture))
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (onResizeCapture != null) __obj.updateDynamic("onResizeCapture")(js.Any.fromFunction1(onResizeCapture))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1(onScroll))
    if (onScrollCapture != null) __obj.updateDynamic("onScrollCapture")(js.Any.fromFunction1(onScrollCapture))
    if (onSeeked != null) __obj.updateDynamic("onSeeked")(js.Any.fromFunction1(onSeeked))
    if (onSeekedCapture != null) __obj.updateDynamic("onSeekedCapture")(js.Any.fromFunction1(onSeekedCapture))
    if (onSeeking != null) __obj.updateDynamic("onSeeking")(js.Any.fromFunction1(onSeeking))
    if (onSeekingCapture != null) __obj.updateDynamic("onSeekingCapture")(js.Any.fromFunction1(onSeekingCapture))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1(onSelect))
    if (onSelectCapture != null) __obj.updateDynamic("onSelectCapture")(js.Any.fromFunction1(onSelectCapture))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction1(onSelectionChange))
    if (onSelectionChangeCapture != null) __obj.updateDynamic("onSelectionChangeCapture")(js.Any.fromFunction1(onSelectionChangeCapture))
    if (onStalled != null) __obj.updateDynamic("onStalled")(js.Any.fromFunction1(onStalled))
    if (onStalledCapture != null) __obj.updateDynamic("onStalledCapture")(js.Any.fromFunction1(onStalledCapture))
    if (onStorage != null) __obj.updateDynamic("onStorage")(js.Any.fromFunction1(onStorage))
    if (onStorageCapture != null) __obj.updateDynamic("onStorageCapture")(js.Any.fromFunction1(onStorageCapture))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onSubmitCapture != null) __obj.updateDynamic("onSubmitCapture")(js.Any.fromFunction1(onSubmitCapture))
    if (onSuspend != null) __obj.updateDynamic("onSuspend")(js.Any.fromFunction1(onSuspend))
    if (onSuspendCapture != null) __obj.updateDynamic("onSuspendCapture")(js.Any.fromFunction1(onSuspendCapture))
    if (onTimeUpdate != null) __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1(onTimeUpdate))
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
    if (onVolumeChange != null) __obj.updateDynamic("onVolumeChange")(js.Any.fromFunction1(onVolumeChange))
    if (onVolumeChangeCapture != null) __obj.updateDynamic("onVolumeChangeCapture")(js.Any.fromFunction1(onVolumeChangeCapture))
    if (onWaiting != null) __obj.updateDynamic("onWaiting")(js.Any.fromFunction1(onWaiting))
    if (onWaitingCapture != null) __obj.updateDynamic("onWaitingCapture")(js.Any.fromFunction1(onWaitingCapture))
    if (onWheel != null) __obj.updateDynamic("onWheel")(js.Any.fromFunction1(onWheel))
    if (onWheelCapture != null) __obj.updateDynamic("onWheelCapture")(js.Any.fromFunction1(onWheelCapture))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = EventListenerProps
}

