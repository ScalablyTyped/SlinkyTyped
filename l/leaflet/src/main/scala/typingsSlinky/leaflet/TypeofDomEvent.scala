package typingsSlinky.leaflet

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.leaflet.mod.DomEvent.EventHandlerFn
import typingsSlinky.leaflet.mod.DomEvent.PropagableEvent
import typingsSlinky.leaflet.mod.Point_
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofDomEvent extends js.Object {
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def addListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def addListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def disableClickPropagation(el: HTMLElement): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def disableScrollPropagation(el: HTMLElement): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def getMousePosition(ev: MouseEvent): Point_ = js.native
  def getMousePosition(ev: MouseEvent, container: HTMLElement): Point_ = js.native
  def getWheelDelta(ev: Event_): Double = js.native
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def off(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def off(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def on(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def on(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def preventDefault(ev: Event_): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn]): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def removeListener(el: HTMLElement, eventMap: StringDictionary[EventHandlerFn], context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def removeListener(el: HTMLElement, types: String, fn: EventHandlerFn, context: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def stop(ev: PropagableEvent): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
  def stopPropagation(ev: PropagableEvent): /* import warning: importer.ImportType#apply Failed type conversion: typeof DomEvent */ js.Any = js.native
}

