package typingsSlinky.reactEventListener.components

import org.scalajs.dom.experimental.deviceorientation.DeviceMotionEvent
import org.scalajs.dom.experimental.deviceorientation.DeviceOrientationEvent
import org.scalajs.dom.raw.BeforeUnloadEvent
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HashChangeEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.PopStateEvent
import org.scalajs.dom.raw.ProgressEvent
import org.scalajs.dom.raw.StorageEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactEventListener.mod.EventListenerProps
import typingsSlinky.reactEventListener.mod.EventListenerThisType
import typingsSlinky.reactEventListener.mod.OnErrorEventHandlerArgs
import typingsSlinky.reactEventListener.mod.WindowEventTargets
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
  class Builder[T /* <: EventTarget | WindowEventTargets */] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default[T]] {
    
    @scala.inline
    def oNmsPointerUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("oNmsPointerUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def oNmsPointerUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("oNmsPointerUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAbort(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onAbort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAbortCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onAbortCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAfterPrint(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onAfterPrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onAfterPrintCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onAfterPrintCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBeforePrint(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onBeforePrint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBeforePrintCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onBeforePrintCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBeforeUnload(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, _]): this.type = set("onBeforeUnload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBeforeUnloadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ BeforeUnloadEvent, _]): this.type = set("onBeforeUnloadCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlur(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, _]): this.type = set("onBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onBlurCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, _]): this.type = set("onBlurCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCanPlay(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onCanPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCanPlayCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onCanPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCanPlayThrough(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onCanPlayThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCanPlayThroughCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onCanPlayThroughCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClickCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCompassNeedsCalibration(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onCompassNeedsCalibration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCompassNeedsCalibrationCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onCompassNeedsCalibrationCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onContextMenu(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onContextMenuCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onContextMenuCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDblClick(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onDblClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDblClickCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onDblClickCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDeviceMotion(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, _]): this.type = set("onDeviceMotion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDeviceMotionCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceMotionEvent, _]): this.type = set("onDeviceMotionCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDeviceOrientation(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, _]): this.type = set("onDeviceOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDeviceOrientationCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DeviceOrientationEvent, _]): this.type = set("onDeviceOrientationCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrag(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDragCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragEnd(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDragEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragEndCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDragEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDragEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDragEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDragLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDragLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDragOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDragOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDragStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDragStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrop(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDropCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ DragEvent, _]): this.type = set("onDropCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDurationChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onDurationChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDurationChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onDurationChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEmptied(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onEmptied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEmptiedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onEmptiedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEnded(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onEnded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onEndedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onEndedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onError(
      value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, _]
    ): this.type = set("onError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onErrorCapture(
      value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* args */ OnErrorEventHandlerArgs, _]
    ): this.type = set("onErrorCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onFocus(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, _]): this.type = set("onFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onFocusCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ FocusEvent, _]): this.type = set("onFocusCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onHashChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, _]): this.type = set("onHashChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onHashChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ HashChangeEvent, _]): this.type = set("onHashChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onInput(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onInputCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onInputCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]): this.type = set("onKeyDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]): this.type = set("onKeyDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyPress(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]): this.type = set("onKeyPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyPressCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]): this.type = set("onKeyPressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]): this.type = set("onKeyUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onKeyUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ KeyboardEvent, _]): this.type = set("onKeyUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoad(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onLoadCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoadStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onLoadStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoadStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onLoadStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoadedData(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onLoadedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoadedDataCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onLoadedDataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoadedMetadata(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onLoadedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onLoadedMetadataCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onLoadedMetadataCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMessage(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent, _]): this.type = set("onMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMessageCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MessageEvent, _]): this.type = set("onMessageCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseOut(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseOutCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MouseEvent, _]): this.type = set("onMouseUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseWheel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, _]): this.type = set("onMouseWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMouseWheelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, _]): this.type = set("onMouseWheelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsGestureChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsGestureChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsGestureChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsGestureChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsGestureDoubleTap(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsGestureDoubleTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsGestureDoubleTapCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsGestureDoubleTapCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsGestureEnd(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsGestureEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsGestureEndCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsGestureEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsGestureHold(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsGestureHold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsGestureHoldCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsGestureHoldCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsGestureStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsGestureStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsGestureStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsGestureStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsGestureTap(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsGestureTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsGestureTapCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsGestureTapCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsInertiaStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsInertiaStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsInertiaStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSGestureEvent, _]): this.type = set("onMsInertiaStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerCancel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerCancelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerOut(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerOutCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onMsPointerOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ MSPointerEvent, _]): this.type = set("onMsPointerOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOffline(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onOffline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOfflineCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onOfflineCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOnline(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onOnline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOnlineCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onOnlineCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOrientationChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onOrientationChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOrientationChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onOrientationChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPageHide(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, _]): this.type = set("onPageHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPageHideCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, _]): this.type = set("onPageHideCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPageShow(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, _]): this.type = set("onPageShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPageShowCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PageTransitionEvent, _]): this.type = set("onPageShowCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPause(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onPause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPauseCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onPauseCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPlay(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPlayCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onPlayCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPlaying(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPlayingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onPlayingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerCancel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerCancelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerDown(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerDownCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerDownCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerEnter(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerEnterCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerEnterCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerLeave(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerLeaveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerLeaveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerOut(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerOutCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerOutCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerOver(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerOverCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerOverCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerUp(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPointerUpCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PointerEvent, _]): this.type = set("onPointerUpCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPopState(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, _]): this.type = set("onPopState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPopStateCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ PopStateEvent, _]): this.type = set("onPopStateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onProgress(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent, _]): this.type = set("onProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onProgressCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent, _]): this.type = set("onProgressCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRateChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onRateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRateChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onRateChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onReadyStateChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent, _]): this.type = set("onReadyStateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onReadyStateChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ ProgressEvent, _]): this.type = set("onReadyStateChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onReset(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onReset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResetCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onResetCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResize(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]): this.type = set("onResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onResizeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]): this.type = set("onResizeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onScroll(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]): this.type = set("onScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onScrollCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]): this.type = set("onScrollCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSeeked(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onSeeked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSeekedCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onSeekedCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSeeking(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onSeeking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSeekingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onSeekingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSelect(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]): this.type = set("onSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSelectCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ UIEvent, _]): this.type = set("onSelectCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSelectionChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onSelectionChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSelectionChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onSelectionChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onStalled(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onStalled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onStalledCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onStalledCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onStorage(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, _]): this.type = set("onStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onStorageCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ StorageEvent, _]): this.type = set("onStorageCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSubmit(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSubmitCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onSubmitCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSuspend(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onSuspend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSuspendCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onSuspendCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTimeUpdate(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onTimeUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTimeUpdateCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onTimeUpdateCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchCancel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): this.type = set("onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchCancelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): this.type = set("onTouchCancelCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchEnd(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): this.type = set("onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchEndCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): this.type = set("onTouchEndCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchMove(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): this.type = set("onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchMoveCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): this.type = set("onTouchMoveCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchStart(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): this.type = set("onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTouchStartCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ TouchEvent, _]): this.type = set("onTouchStartCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onUnload(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onUnload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onUnloadCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onUnloadCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onVolumeChange(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onVolumeChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onVolumeChangeCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onVolumeChangeCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onWaiting(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onWaiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onWaitingCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ Event, _]): this.type = set("onWaitingCapture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onWheel(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, _]): this.type = set("onWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onWheelCapture(value: js.ThisFunction1[/* this */ EventListenerThisType[T], /* ev */ WheelEvent, _]): this.type = set("onWheelCapture", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: EventTarget | WindowEventTargets */](p: EventListenerProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply[T /* <: EventTarget | WindowEventTargets */](target: T): Builder[T] = {
    val __props = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[EventListenerProps[T]]))
  }
}
