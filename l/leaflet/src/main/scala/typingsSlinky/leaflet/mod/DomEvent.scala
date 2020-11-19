package typingsSlinky.leaflet.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.leaflet.anon.TypeofDomEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "DomEvent")
@js.native
object DomEvent extends js.Object {
  
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  
  def disableClickPropagation(el: HTMLElement): TypeofDomEvent = js.native
  
  def disableScrollPropagation(el: HTMLElement): TypeofDomEvent = js.native
  
  def getMousePosition(ev: MouseEvent): Point_ = js.native
  def getMousePosition(ev: MouseEvent, container: HTMLElement): Point_ = js.native
  
  def getWheelDelta(ev: Event): Double = js.native
  
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  
  def preventDefault(ev: Event): TypeofDomEvent = js.native
  
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  
  def stop(ev: PropagableEvent): TypeofDomEvent = js.native
  
  def stopPropagation(ev: PropagableEvent): TypeofDomEvent = js.native
  
  trait _PropagableEvent extends js.Object
  
  type EventHandlerFn = js.Function1[/* event */ Event, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.leaflet.mod.LeafletMouseEvent
    - typingsSlinky.leaflet.mod.LeafletKeyboardEvent
    - typingsSlinky.leaflet.mod.LeafletEvent
    - typingsSlinky.std.Event
  */
  type PropagableEvent = _PropagableEvent | Event
}
