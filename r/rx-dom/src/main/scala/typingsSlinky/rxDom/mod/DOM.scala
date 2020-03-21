package typingsSlinky.rxDom.mod

import org.scalajs.dom.raw.CloseEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.MutationObserverInit
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.Position
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.UIEvent
import typingsSlinky.rxDom.mod.rxAugmentingMod.DOM.AjaxSettings
import typingsSlinky.rxDom.mod.rxAugmentingMod.DOM.AjaxSuccessResponse
import typingsSlinky.rxDom.mod.rxAugmentingMod.DOM.GeolocationOptions
import typingsSlinky.rxDom.mod.rxAugmentingMod.DOM.JsonpSettings
import typingsSlinky.rxDom.mod.rxAugmentingMod.DOM.JsonpSuccessResponse
import typingsSlinky.std.Event_
import typingsSlinky.std.MutationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "DOM")
@js.native
object DOM extends js.Object {
  def ajax(settingsOrUrl: String): typingsSlinky.rxLiteAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  // Ajax
  def ajax(settingsOrUrl: AjaxSettings): typingsSlinky.rxLiteAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  // Event Shortcuts
  def blur(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def blur(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def blur(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def change(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def change(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def click(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def click(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def click(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def contextmenu(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def contextmenu(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def contextmenu(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def dblclick(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def dblclick(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def dblclick(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def error(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def error(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def error(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def focus(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def focus(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def focus(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[FocusEvent] = js.native
  def focusin(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusin(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusin(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusout(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusout(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def focusout(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  // Events
  def fromEvent[T](element: js.Any, eventName: String): typingsSlinky.rxLiteAggregates.Rx.Observable[T] = js.native
  def fromEvent[T](element: js.Any, eventName: String, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[T] = js.native
  def fromEvent[T](element: js.Any, eventName: String, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[T] = js.native
  // Server-Sent Events
  def fromEventSource[T](url: String): typingsSlinky.rxLiteAggregates.Rx.Observable[T] = js.native
  def fromEventSource[T](url: String, openObservable: typingsSlinky.rxCore.Rx.Observer[T]): typingsSlinky.rxLiteAggregates.Rx.Observable[T] = js.native
  // Mutation Observers
  def fromMutationObserver(target: Node, options: MutationObserverInit): typingsSlinky.rxLiteAggregates.Rx.Observable[MutationEvent] = js.native
  // Web Sockets
  def fromWebSocket(url: String, protocol: String): typingsSlinky.rxCoreBinding.Rx.Subject[MessageEvent] = js.native
  def fromWebSocket(url: String, protocol: String, openObserver: typingsSlinky.rxCore.Rx.Observer[Event_]): typingsSlinky.rxCoreBinding.Rx.Subject[MessageEvent] = js.native
  def fromWebSocket(
    url: String,
    protocol: String,
    openObserver: typingsSlinky.rxCore.Rx.Observer[Event_],
    closingObserver: typingsSlinky.rxCore.Rx.Observer[CloseEvent]
  ): typingsSlinky.rxCoreBinding.Rx.Subject[MessageEvent] = js.native
  // Web Workers
  def fromWebWorker(url: String): typingsSlinky.rxCoreBinding.Rx.Subject[String] = js.native
  def get(url: String): typingsSlinky.rxLiteAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  def getJSON(url: String): typingsSlinky.rxLiteAggregates.Rx.Observable[String] = js.native
  def jsonpRequest(settings: JsonpSettings): typingsSlinky.rxLiteAggregates.Rx.Observable[JsonpSuccessResponse] = js.native
  def jsonpRequest(url: String): typingsSlinky.rxLiteAggregates.Rx.Observable[String] = js.native
  def keydown(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keydown(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keydown(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keypress(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keypress(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keypress(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keyup(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keyup(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def keyup(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[KeyboardEvent] = js.native
  def load(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def load(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def load(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def mousedown(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousedown(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousedown(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseenter(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseenter(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseenter(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseleave(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseleave(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseleave(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousemove(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousemove(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mousemove(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseout(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseout(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseout(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseover(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseover(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseover(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseup(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseup(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  def mouseup(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[MouseEvent] = js.native
  // Pointer Events
  def pointerdown(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerdown(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerdown(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerenter(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerenter(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerenter(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerleave(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerleave(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerleave(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointermove(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointermove(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointermove(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerout(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerout(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerout(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerover(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerover(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerover(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerup(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerup(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def pointerup(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[PointerEvent] = js.native
  def post(url: String, body: js.Any): typingsSlinky.rxLiteAggregates.Rx.Observable[AjaxSuccessResponse] = js.native
  def ready(): typingsSlinky.rxLiteAggregates.Rx.Observable[_] = js.native
  def resize(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def resize(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def resize(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def scroll(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def scroll(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def scroll(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[UIEvent] = js.native
  def select(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def select(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def select(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def submit(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def submit(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def submit(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  // Touch Events
  def touchcancel(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchcancel(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchcancel(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchend(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchend(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchend(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchmove(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchmove(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchmove(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchstart(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchstart(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def touchstart(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[TouchEvent] = js.native
  def unload(element: Element): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def unload(element: Element, selector: js.Function): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  def unload(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rxLiteAggregates.Rx.Observable[Event_] = js.native
  // Geolocation
  @js.native
  object geolocation extends js.Object {
    def getCurrentPosition(): typingsSlinky.rxLiteAggregates.Rx.Observable[Position] = js.native
    def getCurrentPosition(geolocationOptions: GeolocationOptions): typingsSlinky.rxLiteAggregates.Rx.Observable[Position] = js.native
    def watchPosition(): typingsSlinky.rxLiteAggregates.Rx.Observable[Position] = js.native
    def watchPosition(geolocationOptions: GeolocationOptions): typingsSlinky.rxLiteAggregates.Rx.Observable[Position] = js.native
  }
  
}

