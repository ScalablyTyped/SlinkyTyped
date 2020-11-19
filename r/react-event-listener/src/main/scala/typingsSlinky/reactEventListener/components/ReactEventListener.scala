package typingsSlinky.reactEventListener.components

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
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactEventListener.mod.EventListenerProps
import typingsSlinky.reactEventListener.mod.default
import typingsSlinky.std.MSGestureEvent
import typingsSlinky.std.MSPointerEvent
import typingsSlinky.std.PageTransitionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactEventListener {
  
  @JSImport("react-event-listener", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def oNmsPointerUp(value: /* ev */ MSPointerEvent => _): this.type = set("oNmsPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def oNmsPointerUpCapture(value: /* ev */ MSPointerEvent => _): this.type = set("oNmsPointerUpCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAbort(value: /* ev */ Event => _): this.type = set("onAbort", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAbortCapture(value: /* ev */ Event => _): this.type = set("onAbortCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAfterPrint(value: /* ev */ Event => _): this.type = set("onAfterPrint", js.Any.fromFunction1(value))
    
    @scala.inline
    def onAfterPrintCapture(value: /* ev */ Event => _): this.type = set("onAfterPrintCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforePrint(value: /* ev */ Event => _): this.type = set("onBeforePrint", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforePrintCapture(value: /* ev */ Event => _): this.type = set("onBeforePrintCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeUnload(value: /* ev */ BeforeUnloadEvent => _): this.type = set("onBeforeUnload", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBeforeUnloadCapture(value: /* ev */ BeforeUnloadEvent => _): this.type = set("onBeforeUnloadCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlur(value: /* ev */ FocusEvent => _): this.type = set("onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def onBlurCapture(value: /* ev */ FocusEvent => _): this.type = set("onBlurCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlay(value: /* ev */ Event => _): this.type = set("onCanPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayCapture(value: /* ev */ Event => _): this.type = set("onCanPlayCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayThrough(value: /* ev */ Event => _): this.type = set("onCanPlayThrough", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCanPlayThroughCapture(value: /* ev */ Event => _): this.type = set("onCanPlayThroughCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* ev */ Event => _): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChangeCapture(value: /* ev */ Event => _): this.type = set("onChangeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClick(value: /* ev */ MouseEvent => _): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onClickCapture(value: /* ev */ MouseEvent => _): this.type = set("onClickCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompassNeedsCalibration(value: /* ev */ Event => _): this.type = set("onCompassNeedsCalibration", js.Any.fromFunction1(value))
    
    @scala.inline
    def onCompassNeedsCalibrationCapture(value: /* ev */ Event => _): this.type = set("onCompassNeedsCalibrationCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenu(value: /* ev */ PointerEvent => _): this.type = set("onContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def onContextMenuCapture(value: /* ev */ PointerEvent => _): this.type = set("onContextMenuCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDblClick(value: /* ev */ MouseEvent => _): this.type = set("onDblClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDblClickCapture(value: /* ev */ MouseEvent => _): this.type = set("onDblClickCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDeviceMotion(value: /* ev */ DeviceMotionEvent => _): this.type = set("onDeviceMotion", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDeviceMotionCapture(value: /* ev */ DeviceMotionEvent => _): this.type = set("onDeviceMotionCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDeviceOrientation(value: /* ev */ DeviceOrientationEvent => _): this.type = set("onDeviceOrientation", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDeviceOrientationCapture(value: /* ev */ DeviceOrientationEvent => _): this.type = set("onDeviceOrientationCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrag(value: /* ev */ DragEvent => _): this.type = set("onDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragCapture(value: /* ev */ DragEvent => _): this.type = set("onDragCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnd(value: /* ev */ DragEvent => _): this.type = set("onDragEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEndCapture(value: /* ev */ DragEvent => _): this.type = set("onDragEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnter(value: /* ev */ DragEvent => _): this.type = set("onDragEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragEnterCapture(value: /* ev */ DragEvent => _): this.type = set("onDragEnterCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragLeave(value: /* ev */ DragEvent => _): this.type = set("onDragLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragLeaveCapture(value: /* ev */ DragEvent => _): this.type = set("onDragLeaveCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragOver(value: /* ev */ DragEvent => _): this.type = set("onDragOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragOverCapture(value: /* ev */ DragEvent => _): this.type = set("onDragOverCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStart(value: /* ev */ DragEvent => _): this.type = set("onDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDragStartCapture(value: /* ev */ DragEvent => _): this.type = set("onDragStartCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDrop(value: /* ev */ DragEvent => _): this.type = set("onDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDropCapture(value: /* ev */ DragEvent => _): this.type = set("onDropCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDurationChange(value: /* ev */ Event => _): this.type = set("onDurationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onDurationChangeCapture(value: /* ev */ Event => _): this.type = set("onDurationChangeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEmptied(value: /* ev */ Event => _): this.type = set("onEmptied", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEmptiedCapture(value: /* ev */ Event => _): this.type = set("onEmptiedCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEnded(value: /* ev */ Event => _): this.type = set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEndedCapture(value: /* ev */ Event => _): this.type = set("onEndedCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onError(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any
    ): this.type = set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onErrorCapture(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ErrorEventHandler */ js.Any
    ): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onFocus(value: /* ev */ FocusEvent => _): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def onFocusCapture(value: /* ev */ FocusEvent => _): this.type = set("onFocusCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHashChange(value: /* ev */ HashChangeEvent => _): this.type = set("onHashChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onHashChangeCapture(value: /* ev */ HashChangeEvent => _): this.type = set("onHashChangeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInput(value: /* ev */ Event => _): this.type = set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def onInputCapture(value: /* ev */ Event => _): this.type = set("onInputCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDown(value: /* ev */ KeyboardEvent => _): this.type = set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyDownCapture(value: /* ev */ KeyboardEvent => _): this.type = set("onKeyDownCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPress(value: /* ev */ KeyboardEvent => _): this.type = set("onKeyPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyPressCapture(value: /* ev */ KeyboardEvent => _): this.type = set("onKeyPressCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUp(value: /* ev */ KeyboardEvent => _): this.type = set("onKeyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onKeyUpCapture(value: /* ev */ KeyboardEvent => _): this.type = set("onKeyUpCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoad(value: /* ev */ Event => _): this.type = set("onLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadCapture(value: /* ev */ Event => _): this.type = set("onLoadCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadStart(value: /* ev */ Event => _): this.type = set("onLoadStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadStartCapture(value: /* ev */ Event => _): this.type = set("onLoadStartCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedData(value: /* ev */ Event => _): this.type = set("onLoadedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedDataCapture(value: /* ev */ Event => _): this.type = set("onLoadedDataCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedMetadata(value: /* ev */ Event => _): this.type = set("onLoadedMetadata", js.Any.fromFunction1(value))
    
    @scala.inline
    def onLoadedMetadataCapture(value: /* ev */ Event => _): this.type = set("onLoadedMetadataCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMessage(value: /* ev */ MessageEvent => _): this.type = set("onMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMessageCapture(value: /* ev */ MessageEvent => _): this.type = set("onMessageCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDown(value: /* ev */ MouseEvent => _): this.type = set("onMouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseDownCapture(value: /* ev */ MouseEvent => _): this.type = set("onMouseDownCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnter(value: /* ev */ MouseEvent => _): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseEnterCapture(value: /* ev */ MouseEvent => _): this.type = set("onMouseEnterCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeave(value: /* ev */ MouseEvent => _): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseLeaveCapture(value: /* ev */ MouseEvent => _): this.type = set("onMouseLeaveCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMove(value: /* ev */ MouseEvent => _): this.type = set("onMouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseMoveCapture(value: /* ev */ MouseEvent => _): this.type = set("onMouseMoveCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOut(value: /* ev */ MouseEvent => _): this.type = set("onMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOutCapture(value: /* ev */ MouseEvent => _): this.type = set("onMouseOutCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOver(value: /* ev */ MouseEvent => _): this.type = set("onMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseOverCapture(value: /* ev */ MouseEvent => _): this.type = set("onMouseOverCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUp(value: /* ev */ MouseEvent => _): this.type = set("onMouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseUpCapture(value: /* ev */ MouseEvent => _): this.type = set("onMouseUpCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseWheel(value: /* ev */ WheelEvent => _): this.type = set("onMouseWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMouseWheelCapture(value: /* ev */ WheelEvent => _): this.type = set("onMouseWheelCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsGestureChange(value: /* ev */ MSGestureEvent => _): this.type = set("onMsGestureChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsGestureChangeCapture(value: /* ev */ MSGestureEvent => _): this.type = set("onMsGestureChangeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsGestureDoubleTap(value: /* ev */ MSGestureEvent => _): this.type = set("onMsGestureDoubleTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsGestureDoubleTapCapture(value: /* ev */ MSGestureEvent => _): this.type = set("onMsGestureDoubleTapCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsGestureEnd(value: /* ev */ MSGestureEvent => _): this.type = set("onMsGestureEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsGestureEndCapture(value: /* ev */ MSGestureEvent => _): this.type = set("onMsGestureEndCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsGestureHold(value: /* ev */ MSGestureEvent => _): this.type = set("onMsGestureHold", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsGestureHoldCapture(value: /* ev */ MSGestureEvent => _): this.type = set("onMsGestureHoldCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsGestureStart(value: /* ev */ MSGestureEvent => _): this.type = set("onMsGestureStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsGestureStartCapture(value: /* ev */ MSGestureEvent => _): this.type = set("onMsGestureStartCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsGestureTap(value: /* ev */ MSGestureEvent => _): this.type = set("onMsGestureTap", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsGestureTapCapture(value: /* ev */ MSGestureEvent => _): this.type = set("onMsGestureTapCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsInertiaStart(value: /* ev */ MSGestureEvent => _): this.type = set("onMsInertiaStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsInertiaStartCapture(value: /* ev */ MSGestureEvent => _): this.type = set("onMsInertiaStartCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerCancel(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerCancelCapture(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerCancelCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerDown(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerDownCapture(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerDownCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerEnter(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerEnterCapture(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerEnterCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerLeave(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerLeaveCapture(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerLeaveCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerMove(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerMoveCapture(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerMoveCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerOut(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerOutCapture(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerOutCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerOver(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onMsPointerOverCapture(value: /* ev */ MSPointerEvent => _): this.type = set("onMsPointerOverCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOffline(value: /* ev */ Event => _): this.type = set("onOffline", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOfflineCapture(value: /* ev */ Event => _): this.type = set("onOfflineCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOnline(value: /* ev */ Event => _): this.type = set("onOnline", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOnlineCapture(value: /* ev */ Event => _): this.type = set("onOnlineCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOrientationChange(value: /* ev */ Event => _): this.type = set("onOrientationChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onOrientationChangeCapture(value: /* ev */ Event => _): this.type = set("onOrientationChangeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPageHide(value: /* ev */ PageTransitionEvent => _): this.type = set("onPageHide", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPageHideCapture(value: /* ev */ PageTransitionEvent => _): this.type = set("onPageHideCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPageShow(value: /* ev */ PageTransitionEvent => _): this.type = set("onPageShow", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPageShowCapture(value: /* ev */ PageTransitionEvent => _): this.type = set("onPageShowCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPause(value: /* ev */ Event => _): this.type = set("onPause", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPauseCapture(value: /* ev */ Event => _): this.type = set("onPauseCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlay(value: /* ev */ Event => _): this.type = set("onPlay", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlayCapture(value: /* ev */ Event => _): this.type = set("onPlayCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlaying(value: /* ev */ Event => _): this.type = set("onPlaying", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPlayingCapture(value: /* ev */ Event => _): this.type = set("onPlayingCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerCancel(value: /* ev */ PointerEvent => _): this.type = set("onPointerCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerCancelCapture(value: /* ev */ PointerEvent => _): this.type = set("onPointerCancelCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerDown(value: /* ev */ PointerEvent => _): this.type = set("onPointerDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerDownCapture(value: /* ev */ PointerEvent => _): this.type = set("onPointerDownCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerEnter(value: /* ev */ PointerEvent => _): this.type = set("onPointerEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerEnterCapture(value: /* ev */ PointerEvent => _): this.type = set("onPointerEnterCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerLeave(value: /* ev */ PointerEvent => _): this.type = set("onPointerLeave", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerLeaveCapture(value: /* ev */ PointerEvent => _): this.type = set("onPointerLeaveCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerMove(value: /* ev */ PointerEvent => _): this.type = set("onPointerMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerMoveCapture(value: /* ev */ PointerEvent => _): this.type = set("onPointerMoveCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOut(value: /* ev */ PointerEvent => _): this.type = set("onPointerOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOutCapture(value: /* ev */ PointerEvent => _): this.type = set("onPointerOutCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOver(value: /* ev */ PointerEvent => _): this.type = set("onPointerOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerOverCapture(value: /* ev */ PointerEvent => _): this.type = set("onPointerOverCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerUp(value: /* ev */ PointerEvent => _): this.type = set("onPointerUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPointerUpCapture(value: /* ev */ PointerEvent => _): this.type = set("onPointerUpCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPopState(value: /* ev */ PopStateEvent => _): this.type = set("onPopState", js.Any.fromFunction1(value))
    
    @scala.inline
    def onPopStateCapture(value: /* ev */ PopStateEvent => _): this.type = set("onPopStateCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onProgress(value: /* ev */ ProgressEvent => _): this.type = set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def onProgressCapture(value: /* ev */ ProgressEvent => _): this.type = set("onProgressCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRateChange(value: /* ev */ Event => _): this.type = set("onRateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onRateChangeCapture(value: /* ev */ Event => _): this.type = set("onRateChangeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReadyStateChange(value: /* ev */ ProgressEvent => _): this.type = set("onReadyStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReadyStateChangeCapture(value: /* ev */ ProgressEvent => _): this.type = set("onReadyStateChangeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onReset(value: /* ev */ Event => _): this.type = set("onReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResetCapture(value: /* ev */ Event => _): this.type = set("onResetCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResize(value: /* ev */ UIEvent => _): this.type = set("onResize", js.Any.fromFunction1(value))
    
    @scala.inline
    def onResizeCapture(value: /* ev */ UIEvent => _): this.type = set("onResizeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScroll(value: /* ev */ UIEvent => _): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def onScrollCapture(value: /* ev */ UIEvent => _): this.type = set("onScrollCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeked(value: /* ev */ Event => _): this.type = set("onSeeked", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeekedCapture(value: /* ev */ Event => _): this.type = set("onSeekedCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeeking(value: /* ev */ Event => _): this.type = set("onSeeking", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSeekingCapture(value: /* ev */ Event => _): this.type = set("onSeekingCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelect(value: /* ev */ UIEvent => _): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelectCapture(value: /* ev */ UIEvent => _): this.type = set("onSelectCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelectionChange(value: /* ev */ Event => _): this.type = set("onSelectionChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSelectionChangeCapture(value: /* ev */ Event => _): this.type = set("onSelectionChangeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStalled(value: /* ev */ Event => _): this.type = set("onStalled", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStalledCapture(value: /* ev */ Event => _): this.type = set("onStalledCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStorage(value: /* ev */ StorageEvent => _): this.type = set("onStorage", js.Any.fromFunction1(value))
    
    @scala.inline
    def onStorageCapture(value: /* ev */ StorageEvent => _): this.type = set("onStorageCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSubmit(value: /* ev */ Event => _): this.type = set("onSubmit", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSubmitCapture(value: /* ev */ Event => _): this.type = set("onSubmitCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSuspend(value: /* ev */ Event => _): this.type = set("onSuspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def onSuspendCapture(value: /* ev */ Event => _): this.type = set("onSuspendCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTimeUpdate(value: /* ev */ Event => _): this.type = set("onTimeUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTimeUpdateCapture(value: /* ev */ Event => _): this.type = set("onTimeUpdateCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTouchCancel(value: js.Any): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchCancelCapture(value: js.Any): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchEnd(value: js.Any): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchEndCapture(value: js.Any): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchMove(value: js.Any): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchMoveCapture(value: js.Any): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchStart(value: js.Any): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchStartCapture(value: js.Any): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onUnload(value: /* ev */ Event => _): this.type = set("onUnload", js.Any.fromFunction1(value))
    
    @scala.inline
    def onUnloadCapture(value: /* ev */ Event => _): this.type = set("onUnloadCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVolumeChange(value: /* ev */ Event => _): this.type = set("onVolumeChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onVolumeChangeCapture(value: /* ev */ Event => _): this.type = set("onVolumeChangeCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWaiting(value: /* ev */ Event => _): this.type = set("onWaiting", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWaitingCapture(value: /* ev */ Event => _): this.type = set("onWaitingCapture", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWheel(value: /* ev */ WheelEvent => _): this.type = set("onWheel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onWheelCapture(value: /* ev */ WheelEvent => _): this.type = set("onWheelCapture", js.Any.fromFunction1(value))
  }
  
  def withProps(p: EventListenerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(target: Window | Document | String): Builder = {
    val __props = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EventListenerProps]))
  }
}
