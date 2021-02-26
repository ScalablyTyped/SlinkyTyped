package typingsSlinky.rxDom.mod

import org.scalajs.dom.raw.CloseEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MessageEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.MutationObserverInit
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.PointerEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.UIEvent
import typingsSlinky.rxDom.mod.rxAugmentingMod.DOM.AjaxSettings
import typingsSlinky.rxDom.mod.rxAugmentingMod.DOM.AjaxSuccessResponse
import typingsSlinky.rxDom.mod.rxAugmentingMod.DOM.GeolocationOptions
import typingsSlinky.rxDom.mod.rxAugmentingMod.DOM.JsonpSettings
import typingsSlinky.rxDom.mod.rxAugmentingMod.DOM.JsonpSuccessResponse
import typingsSlinky.std.GeolocationPosition
import typingsSlinky.std.MutationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DOM {
  
  @JSImport("rx-dom", "DOM.ajax")
  @js.native
  def ajax(settingsOrUrl: String): typingsSlinky.rx.Rx.Observable[AjaxSuccessResponse] = js.native
  // Ajax
  @JSImport("rx-dom", "DOM.ajax")
  @js.native
  def ajax(settingsOrUrl: AjaxSettings): typingsSlinky.rx.Rx.Observable[AjaxSuccessResponse] = js.native
  
  // Event Shortcuts
  @JSImport("rx-dom", "DOM.blur")
  @js.native
  def blur(element: Element): typingsSlinky.rx.Rx.Observable[FocusEvent] = js.native
  @JSImport("rx-dom", "DOM.blur")
  @js.native
  def blur(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[FocusEvent] = js.native
  @JSImport("rx-dom", "DOM.blur")
  @js.native
  def blur(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[FocusEvent] = js.native
  @JSImport("rx-dom", "DOM.blur")
  @js.native
  def blur(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[FocusEvent] = js.native
  
  @JSImport("rx-dom", "DOM.change")
  @js.native
  def change(element: Element): typingsSlinky.rx.Rx.Observable[Event] = js.native
  @JSImport("rx-dom", "DOM.change")
  @js.native
  def change(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[Event] = js.native
  
  @JSImport("rx-dom", "DOM.click")
  @js.native
  def click(element: Element): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.click")
  @js.native
  def click(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.click")
  @js.native
  def click(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.click")
  @js.native
  def click(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  
  @JSImport("rx-dom", "DOM.contextmenu")
  @js.native
  def contextmenu(element: Element): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.contextmenu")
  @js.native
  def contextmenu(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.contextmenu")
  @js.native
  def contextmenu(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.contextmenu")
  @js.native
  def contextmenu(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  
  @JSImport("rx-dom", "DOM.dblclick")
  @js.native
  def dblclick(element: Element): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.dblclick")
  @js.native
  def dblclick(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.dblclick")
  @js.native
  def dblclick(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.dblclick")
  @js.native
  def dblclick(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  
  @JSImport("rx-dom", "DOM.error")
  @js.native
  def error(element: Element): typingsSlinky.rx.Rx.Observable[Event] = js.native
  @JSImport("rx-dom", "DOM.error")
  @js.native
  def error(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[Event] = js.native
  @JSImport("rx-dom", "DOM.error")
  @js.native
  def error(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[Event] = js.native
  @JSImport("rx-dom", "DOM.error")
  @js.native
  def error(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[Event] = js.native
  
  @JSImport("rx-dom", "DOM.focus")
  @js.native
  def focus(element: Element): typingsSlinky.rx.Rx.Observable[FocusEvent] = js.native
  @JSImport("rx-dom", "DOM.focus")
  @js.native
  def focus(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[FocusEvent] = js.native
  @JSImport("rx-dom", "DOM.focus")
  @js.native
  def focus(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[FocusEvent] = js.native
  @JSImport("rx-dom", "DOM.focus")
  @js.native
  def focus(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[FocusEvent] = js.native
  
  @JSImport("rx-dom", "DOM.focusin")
  @js.native
  def focusin(element: Element): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.focusin")
  @js.native
  def focusin(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.focusin")
  @js.native
  def focusin(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.focusin")
  @js.native
  def focusin(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  
  @JSImport("rx-dom", "DOM.focusout")
  @js.native
  def focusout(element: Element): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.focusout")
  @js.native
  def focusout(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.focusout")
  @js.native
  def focusout(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.focusout")
  @js.native
  def focusout(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  
  // Events
  @JSImport("rx-dom", "DOM.fromEvent")
  @js.native
  def fromEvent[T](element: js.Any, eventName: String): typingsSlinky.rx.Rx.Observable[T] = js.native
  @JSImport("rx-dom", "DOM.fromEvent")
  @js.native
  def fromEvent[T](element: js.Any, eventName: String, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[T] = js.native
  @JSImport("rx-dom", "DOM.fromEvent")
  @js.native
  def fromEvent[T](element: js.Any, eventName: String, selector: js.Function): typingsSlinky.rx.Rx.Observable[T] = js.native
  @JSImport("rx-dom", "DOM.fromEvent")
  @js.native
  def fromEvent[T](element: js.Any, eventName: String, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[T] = js.native
  
  // Server-Sent Events
  @JSImport("rx-dom", "DOM.fromEventSource")
  @js.native
  def fromEventSource[T](url: String): typingsSlinky.rx.Rx.Observable[T] = js.native
  @JSImport("rx-dom", "DOM.fromEventSource")
  @js.native
  def fromEventSource[T](url: String, openObservable: typingsSlinky.rx.Rx.Observer[T]): typingsSlinky.rx.Rx.Observable[T] = js.native
  
  // Mutation Observers
  @JSImport("rx-dom", "DOM.fromMutationObserver")
  @js.native
  def fromMutationObserver(target: Node, options: MutationObserverInit): typingsSlinky.rx.Rx.Observable[MutationEvent] = js.native
  
  // Web Sockets
  @JSImport("rx-dom", "DOM.fromWebSocket")
  @js.native
  def fromWebSocket(url: String, protocol: String): typingsSlinky.rx.Rx.Subject[MessageEvent] = js.native
  @JSImport("rx-dom", "DOM.fromWebSocket")
  @js.native
  def fromWebSocket(
    url: String,
    protocol: String,
    openObserver: js.UndefOr[scala.Nothing],
    closingObserver: typingsSlinky.rx.Rx.Observer[CloseEvent]
  ): typingsSlinky.rx.Rx.Subject[MessageEvent] = js.native
  @JSImport("rx-dom", "DOM.fromWebSocket")
  @js.native
  def fromWebSocket(url: String, protocol: String, openObserver: typingsSlinky.rx.Rx.Observer[Event]): typingsSlinky.rx.Rx.Subject[MessageEvent] = js.native
  @JSImport("rx-dom", "DOM.fromWebSocket")
  @js.native
  def fromWebSocket(
    url: String,
    protocol: String,
    openObserver: typingsSlinky.rx.Rx.Observer[Event],
    closingObserver: typingsSlinky.rx.Rx.Observer[CloseEvent]
  ): typingsSlinky.rx.Rx.Subject[MessageEvent] = js.native
  
  // Web Workers
  @JSImport("rx-dom", "DOM.fromWebWorker")
  @js.native
  def fromWebWorker(url: String): typingsSlinky.rx.Rx.Subject[String] = js.native
  
  // Geolocation
  object geolocation {
    
    @JSImport("rx-dom", "DOM.geolocation.getCurrentPosition")
    @js.native
    def getCurrentPosition(): typingsSlinky.rx.Rx.Observable[GeolocationPosition] = js.native
    @JSImport("rx-dom", "DOM.geolocation.getCurrentPosition")
    @js.native
    def getCurrentPosition(geolocationOptions: GeolocationOptions): typingsSlinky.rx.Rx.Observable[GeolocationPosition] = js.native
    
    @JSImport("rx-dom", "DOM.geolocation.watchPosition")
    @js.native
    def watchPosition(): typingsSlinky.rx.Rx.Observable[GeolocationPosition] = js.native
    @JSImport("rx-dom", "DOM.geolocation.watchPosition")
    @js.native
    def watchPosition(geolocationOptions: GeolocationOptions): typingsSlinky.rx.Rx.Observable[GeolocationPosition] = js.native
  }
  
  @JSImport("rx-dom", "DOM.get")
  @js.native
  def get(url: String): typingsSlinky.rx.Rx.Observable[AjaxSuccessResponse] = js.native
  
  @JSImport("rx-dom", "DOM.getJSON")
  @js.native
  def getJSON(url: String): typingsSlinky.rx.Rx.Observable[String] = js.native
  
  @JSImport("rx-dom", "DOM.jsonpRequest")
  @js.native
  def jsonpRequest(settings: JsonpSettings): typingsSlinky.rx.Rx.Observable[JsonpSuccessResponse] = js.native
  @JSImport("rx-dom", "DOM.jsonpRequest")
  @js.native
  def jsonpRequest(url: String): typingsSlinky.rx.Rx.Observable[String] = js.native
  
  @JSImport("rx-dom", "DOM.keydown")
  @js.native
  def keydown(element: Element): typingsSlinky.rx.Rx.Observable[KeyboardEvent] = js.native
  @JSImport("rx-dom", "DOM.keydown")
  @js.native
  def keydown(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[KeyboardEvent] = js.native
  @JSImport("rx-dom", "DOM.keydown")
  @js.native
  def keydown(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[KeyboardEvent] = js.native
  @JSImport("rx-dom", "DOM.keydown")
  @js.native
  def keydown(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[KeyboardEvent] = js.native
  
  @JSImport("rx-dom", "DOM.keypress")
  @js.native
  def keypress(element: Element): typingsSlinky.rx.Rx.Observable[KeyboardEvent] = js.native
  @JSImport("rx-dom", "DOM.keypress")
  @js.native
  def keypress(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[KeyboardEvent] = js.native
  @JSImport("rx-dom", "DOM.keypress")
  @js.native
  def keypress(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[KeyboardEvent] = js.native
  @JSImport("rx-dom", "DOM.keypress")
  @js.native
  def keypress(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[KeyboardEvent] = js.native
  
  @JSImport("rx-dom", "DOM.keyup")
  @js.native
  def keyup(element: Element): typingsSlinky.rx.Rx.Observable[KeyboardEvent] = js.native
  @JSImport("rx-dom", "DOM.keyup")
  @js.native
  def keyup(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[KeyboardEvent] = js.native
  @JSImport("rx-dom", "DOM.keyup")
  @js.native
  def keyup(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[KeyboardEvent] = js.native
  @JSImport("rx-dom", "DOM.keyup")
  @js.native
  def keyup(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[KeyboardEvent] = js.native
  
  @JSImport("rx-dom", "DOM.load")
  @js.native
  def load(element: Element): typingsSlinky.rx.Rx.Observable[UIEvent] = js.native
  @JSImport("rx-dom", "DOM.load")
  @js.native
  def load(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[UIEvent] = js.native
  @JSImport("rx-dom", "DOM.load")
  @js.native
  def load(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[UIEvent] = js.native
  @JSImport("rx-dom", "DOM.load")
  @js.native
  def load(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[UIEvent] = js.native
  
  @JSImport("rx-dom", "DOM.mousedown")
  @js.native
  def mousedown(element: Element): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mousedown")
  @js.native
  def mousedown(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mousedown")
  @js.native
  def mousedown(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mousedown")
  @js.native
  def mousedown(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  
  @JSImport("rx-dom", "DOM.mouseenter")
  @js.native
  def mouseenter(element: Element): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseenter")
  @js.native
  def mouseenter(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseenter")
  @js.native
  def mouseenter(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseenter")
  @js.native
  def mouseenter(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  
  @JSImport("rx-dom", "DOM.mouseleave")
  @js.native
  def mouseleave(element: Element): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseleave")
  @js.native
  def mouseleave(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseleave")
  @js.native
  def mouseleave(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseleave")
  @js.native
  def mouseleave(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  
  @JSImport("rx-dom", "DOM.mousemove")
  @js.native
  def mousemove(element: Element): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mousemove")
  @js.native
  def mousemove(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mousemove")
  @js.native
  def mousemove(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mousemove")
  @js.native
  def mousemove(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  
  @JSImport("rx-dom", "DOM.mouseout")
  @js.native
  def mouseout(element: Element): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseout")
  @js.native
  def mouseout(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseout")
  @js.native
  def mouseout(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseout")
  @js.native
  def mouseout(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  
  @JSImport("rx-dom", "DOM.mouseover")
  @js.native
  def mouseover(element: Element): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseover")
  @js.native
  def mouseover(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseover")
  @js.native
  def mouseover(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseover")
  @js.native
  def mouseover(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  
  @JSImport("rx-dom", "DOM.mouseup")
  @js.native
  def mouseup(element: Element): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseup")
  @js.native
  def mouseup(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseup")
  @js.native
  def mouseup(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  @JSImport("rx-dom", "DOM.mouseup")
  @js.native
  def mouseup(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[MouseEvent] = js.native
  
  // Pointer Events
  @JSImport("rx-dom", "DOM.pointerdown")
  @js.native
  def pointerdown(element: Element): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerdown")
  @js.native
  def pointerdown(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerdown")
  @js.native
  def pointerdown(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerdown")
  @js.native
  def pointerdown(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  
  @JSImport("rx-dom", "DOM.pointerenter")
  @js.native
  def pointerenter(element: Element): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerenter")
  @js.native
  def pointerenter(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerenter")
  @js.native
  def pointerenter(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerenter")
  @js.native
  def pointerenter(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  
  @JSImport("rx-dom", "DOM.pointerleave")
  @js.native
  def pointerleave(element: Element): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerleave")
  @js.native
  def pointerleave(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerleave")
  @js.native
  def pointerleave(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerleave")
  @js.native
  def pointerleave(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  
  @JSImport("rx-dom", "DOM.pointermove")
  @js.native
  def pointermove(element: Element): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointermove")
  @js.native
  def pointermove(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointermove")
  @js.native
  def pointermove(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointermove")
  @js.native
  def pointermove(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  
  @JSImport("rx-dom", "DOM.pointerout")
  @js.native
  def pointerout(element: Element): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerout")
  @js.native
  def pointerout(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerout")
  @js.native
  def pointerout(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerout")
  @js.native
  def pointerout(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  
  @JSImport("rx-dom", "DOM.pointerover")
  @js.native
  def pointerover(element: Element): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerover")
  @js.native
  def pointerover(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerover")
  @js.native
  def pointerover(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerover")
  @js.native
  def pointerover(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  
  @JSImport("rx-dom", "DOM.pointerup")
  @js.native
  def pointerup(element: Element): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerup")
  @js.native
  def pointerup(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerup")
  @js.native
  def pointerup(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  @JSImport("rx-dom", "DOM.pointerup")
  @js.native
  def pointerup(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[PointerEvent] = js.native
  
  @JSImport("rx-dom", "DOM.post")
  @js.native
  def post(url: String, body: js.Any): typingsSlinky.rx.Rx.Observable[AjaxSuccessResponse] = js.native
  
  @JSImport("rx-dom", "DOM.ready")
  @js.native
  def ready(): typingsSlinky.rx.Rx.Observable[_] = js.native
  
  @JSImport("rx-dom", "DOM.resize")
  @js.native
  def resize(element: Element): typingsSlinky.rx.Rx.Observable[UIEvent] = js.native
  @JSImport("rx-dom", "DOM.resize")
  @js.native
  def resize(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[UIEvent] = js.native
  @JSImport("rx-dom", "DOM.resize")
  @js.native
  def resize(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[UIEvent] = js.native
  @JSImport("rx-dom", "DOM.resize")
  @js.native
  def resize(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[UIEvent] = js.native
  
  @JSImport("rx-dom", "DOM.scroll")
  @js.native
  def scroll(element: Element): typingsSlinky.rx.Rx.Observable[UIEvent] = js.native
  @JSImport("rx-dom", "DOM.scroll")
  @js.native
  def scroll(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[UIEvent] = js.native
  @JSImport("rx-dom", "DOM.scroll")
  @js.native
  def scroll(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[UIEvent] = js.native
  @JSImport("rx-dom", "DOM.scroll")
  @js.native
  def scroll(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[UIEvent] = js.native
  
  @JSImport("rx-dom", "DOM.select")
  @js.native
  def select(element: Element): typingsSlinky.rx.Rx.Observable[Event] = js.native
  @JSImport("rx-dom", "DOM.select")
  @js.native
  def select(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[Event] = js.native
  @JSImport("rx-dom", "DOM.select")
  @js.native
  def select(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[Event] = js.native
  @JSImport("rx-dom", "DOM.select")
  @js.native
  def select(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[Event] = js.native
  
  @JSImport("rx-dom", "DOM.submit")
  @js.native
  def submit(element: Element): typingsSlinky.rx.Rx.Observable[Event] = js.native
  @JSImport("rx-dom", "DOM.submit")
  @js.native
  def submit(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[Event] = js.native
  @JSImport("rx-dom", "DOM.submit")
  @js.native
  def submit(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[Event] = js.native
  @JSImport("rx-dom", "DOM.submit")
  @js.native
  def submit(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[Event] = js.native
  
  // Touch Events
  @JSImport("rx-dom", "DOM.touchcancel")
  @js.native
  def touchcancel(element: Element): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  @JSImport("rx-dom", "DOM.touchcancel")
  @js.native
  def touchcancel(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  @JSImport("rx-dom", "DOM.touchcancel")
  @js.native
  def touchcancel(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  @JSImport("rx-dom", "DOM.touchcancel")
  @js.native
  def touchcancel(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  
  @JSImport("rx-dom", "DOM.touchend")
  @js.native
  def touchend(element: Element): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  @JSImport("rx-dom", "DOM.touchend")
  @js.native
  def touchend(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  @JSImport("rx-dom", "DOM.touchend")
  @js.native
  def touchend(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  @JSImport("rx-dom", "DOM.touchend")
  @js.native
  def touchend(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  
  @JSImport("rx-dom", "DOM.touchmove")
  @js.native
  def touchmove(element: Element): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  @JSImport("rx-dom", "DOM.touchmove")
  @js.native
  def touchmove(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  @JSImport("rx-dom", "DOM.touchmove")
  @js.native
  def touchmove(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  @JSImport("rx-dom", "DOM.touchmove")
  @js.native
  def touchmove(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  
  @JSImport("rx-dom", "DOM.touchstart")
  @js.native
  def touchstart(element: Element): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  @JSImport("rx-dom", "DOM.touchstart")
  @js.native
  def touchstart(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  @JSImport("rx-dom", "DOM.touchstart")
  @js.native
  def touchstart(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  @JSImport("rx-dom", "DOM.touchstart")
  @js.native
  def touchstart(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[TouchEvent] = js.native
  
  @JSImport("rx-dom", "DOM.unload")
  @js.native
  def unload(element: Element): typingsSlinky.rx.Rx.Observable[Event] = js.native
  @JSImport("rx-dom", "DOM.unload")
  @js.native
  def unload(element: Element, selector: js.UndefOr[scala.Nothing], useCapture: Boolean): typingsSlinky.rx.Rx.Observable[Event] = js.native
  @JSImport("rx-dom", "DOM.unload")
  @js.native
  def unload(element: Element, selector: js.Function): typingsSlinky.rx.Rx.Observable[Event] = js.native
  @JSImport("rx-dom", "DOM.unload")
  @js.native
  def unload(element: Element, selector: js.Function, useCapture: Boolean): typingsSlinky.rx.Rx.Observable[Event] = js.native
}
