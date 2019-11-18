package typingsSlinky.leaflet.leafletMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import typingsSlinky.leaflet.TypeofDomEvent
import typingsSlinky.leaflet.leafletMod.DomEvent.EventHandlerFn
import typingsSlinky.std.HTMLElement
import typingsSlinky.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "DomEvent")
@js.native
object DomEvent extends js.Object {
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): TypeofDomEvent = js.native
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): TypeofDomEvent = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn): TypeofDomEvent = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): TypeofDomEvent = js.native
  def disableClickPropagation(el: org.scalajs.dom.raw.HTMLElement): TypeofDomEvent = js.native
  def disableScrollPropagation(el: org.scalajs.dom.raw.HTMLElement): TypeofDomEvent = js.native
  def getMousePosition(ev: MouseEvent): Point = js.native
  def getMousePosition(ev: MouseEvent, container: HTMLElement): Point = js.native
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
  def stop(ev: Event): TypeofDomEvent = js.native
  def stopPropagation(ev: Event): TypeofDomEvent = js.native
  type EventHandlerFn = js.Function1[/* event */ typingsSlinky.std.Event, Unit]
}

