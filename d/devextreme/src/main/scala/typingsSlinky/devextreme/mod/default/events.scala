package typingsSlinky.devextreme.mod.default

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.mod.DevExpress.events.event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "events")
@js.native
object events extends js.Object {
  
  def eventsHandler(event: typingsSlinky.devextreme.mod.DevExpress.events.dxEvent, extraParameters: js.Any): Boolean = js.native
  
  def off(element: js.Array[Element]): Unit = js.native
  def off(element: js.Array[Element], eventName: String): Unit = js.native
  def off(element: js.Array[Element], eventName: String, handler: js.Function): Unit = js.native
  def off(element: js.Array[Element], eventName: String, selector: String): Unit = js.native
  def off(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = js.native
  def off(element: Element): Unit = js.native
  def off(element: Element, eventName: String): Unit = js.native
  def off(element: Element, eventName: String, handler: js.Function): Unit = js.native
  def off(element: Element, eventName: String, selector: String): Unit = js.native
  def off(element: Element, eventName: String, selector: String, handler: js.Function): Unit = js.native
  
  def on(element: js.Array[Element], eventName: String, data: js.Any, handler: js.Function): Unit = js.native
  def on(element: js.Array[Element], eventName: String, handler: js.Function): Unit = js.native
  def on(
    element: js.Array[Element],
    eventName: String,
    selector: String,
    data: js.Any,
    handler: js.Function
  ): Unit = js.native
  def on(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = js.native
  def on(element: Element, eventName: String, data: js.Any, handler: js.Function): Unit = js.native
  def on(element: Element, eventName: String, handler: js.Function): Unit = js.native
  def on(element: Element, eventName: String, selector: String, data: js.Any, handler: js.Function): Unit = js.native
  def on(element: Element, eventName: String, selector: String, handler: js.Function): Unit = js.native
  
  def one(element: js.Array[Element], eventName: String, data: js.Any, handler: js.Function): Unit = js.native
  def one(element: js.Array[Element], eventName: String, handler: js.Function): Unit = js.native
  def one(
    element: js.Array[Element],
    eventName: String,
    selector: String,
    data: js.Any,
    handler: js.Function
  ): Unit = js.native
  def one(element: js.Array[Element], eventName: String, selector: String, handler: js.Function): Unit = js.native
  def one(element: Element, eventName: String, data: js.Any, handler: js.Function): Unit = js.native
  def one(element: Element, eventName: String, handler: js.Function): Unit = js.native
  def one(element: Element, eventName: String, selector: String, data: js.Any, handler: js.Function): Unit = js.native
  def one(element: Element, eventName: String, selector: String, handler: js.Function): Unit = js.native
  
  def trigger(element: js.Array[Element], event: String): Unit = js.native
  def trigger(element: js.Array[Element], event: String, extraParameters: js.Any): Unit = js.native
  def trigger(element: js.Array[Element], event: event): Unit = js.native
  def trigger(element: js.Array[Element], event: event, extraParameters: js.Any): Unit = js.native
  def trigger(element: Element, event: String): Unit = js.native
  def trigger(element: Element, event: String, extraParameters: js.Any): Unit = js.native
  def trigger(element: Element, event: event): Unit = js.native
  def trigger(element: Element, event: event, extraParameters: js.Any): Unit = js.native
  
  def triggerHandler(element: js.Array[Element], event: String): Unit = js.native
  def triggerHandler(element: js.Array[Element], event: String, extraParameters: js.Any): Unit = js.native
  def triggerHandler(element: js.Array[Element], event: event): Unit = js.native
  def triggerHandler(element: js.Array[Element], event: event, extraParameters: js.Any): Unit = js.native
  def triggerHandler(element: Element, event: String): Unit = js.native
  def triggerHandler(element: Element, event: String, extraParameters: js.Any): Unit = js.native
  def triggerHandler(element: Element, event: event): Unit = js.native
  def triggerHandler(element: Element, event: event, extraParameters: js.Any): Unit = js.native
  
  @js.native
  class dxEvent ()
    extends typingsSlinky.devextreme.mod.DevExpress.events.dxEvent
}
