package typingsSlinky.flight.Flight

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Base extends js.Object {
  
  /**
    * Most Components and Mixins need to define attributes. In Flight,
    * default values are assigned by passing an object to the attributes
    * function.
    *
    * NOTE: this.attributes replaces the now deprecated this.defaultAttrs.
    * However, for backwards compatibility, if you are using this.defaultAttrs
    * then all the old attribute behavior remains in place.
    */
  def attributes(obj: js.Object): Unit = js.native
  
  /**
    * Most Components and Mixins need to define attributes. In Flight,
    * default values are assigned by passing an object to the defaultAttrs
    * function.
    *
    * NOTE: this.attributes replaces the now deprecated this.defaultAttrs.
    * However, for backwards compatibility, if you are using this.defaultAttrs
    * then all the old attribute behavior remains in place.
    */
  def defaultAttrs(obj: js.Object): Unit = js.native
  
  /**
    * This method is attached to the prototype of every Component; it accepts
    * the component's node and an options object as arguments. The core
    * implementation, which is called every time an instance is created, will
    * assign the node to the instance and override the default attrs with the
    * options object.
    *
    * Components and Mixins will typically augment the core implementation by
    * supplying a function as an argument to the after method (see the advice
    * API for more information). This is a good place to set up event
    * listeners that bind to callbacks.
    */
  def initialize(node: js.Any, options: js.Object): Unit = js.native
  
  /**
    * If we no longer want a component instance to listen to an event we can
    * use the off method to unsubscribe.
    *
    * @param selector Optional. The DOM node(s) listening for the event.
    *        Defaults to the component instance's node value.
    *
    * @param eventType The event type being listened to.
    *
    * @param handler Optional. The function (callback) to detach from the
    *        component instance. Defaults to the detaching all callbacks for the event.
    */
  def off(eventType: String): Unit = js.native
  def off(eventType: String, handler: js.Function): Unit = js.native
  def off(selector: String, eventType: String): Unit = js.native
  def off(selector: String, eventType: String, handler: js.Function): Unit = js.native
  def off(selector: String, eventType: String, handler: js.Object): Unit = js.native
  def off(selector: String, eventType: js.Object): Unit = js.native
  def off(selector: String, eventType: js.Object, handler: js.Function): Unit = js.native
  def off(selector: String, eventType: js.Object, handler: js.Object): Unit = js.native
  def off(selector: js.Array[Element], eventType: String): Unit = js.native
  def off(selector: js.Array[Element], eventType: String, handler: js.Function): Unit = js.native
  def off(selector: js.Array[Element], eventType: String, handler: js.Object): Unit = js.native
  def off(selector: js.Array[Element], eventType: js.Object): Unit = js.native
  def off(selector: js.Array[Element], eventType: js.Object, handler: js.Function): Unit = js.native
  def off(selector: js.Array[Element], eventType: js.Object, handler: js.Object): Unit = js.native
  def off(selector: Document, eventType: String): Unit = js.native
  def off(selector: Document, eventType: String, handler: js.Function): Unit = js.native
  def off(selector: Document, eventType: String, handler: js.Object): Unit = js.native
  def off(selector: Document, eventType: js.Object): Unit = js.native
  def off(selector: Document, eventType: js.Object, handler: js.Function): Unit = js.native
  def off(selector: Document, eventType: js.Object, handler: js.Object): Unit = js.native
  def off(selector: Element, eventType: String): Unit = js.native
  def off(selector: Element, eventType: String, handler: js.Function): Unit = js.native
  def off(selector: Element, eventType: String, handler: js.Object): Unit = js.native
  def off(selector: Element, eventType: js.Object): Unit = js.native
  def off(selector: Element, eventType: js.Object, handler: js.Function): Unit = js.native
  def off(selector: Element, eventType: js.Object, handler: js.Object): Unit = js.native
  
  /**
    * This allows a component instance to listen to an event and register a
    * callback to be invoked. Flight will automatically bind the context
    * (this) of the callback to the component instance.
    *
    * @param selector Optional. Specify the DOM node(s) that should listen
    *        for the event. Defaults to the component instance's node value.
    *
    * @param eventType The event type to listen for.
    *
    * @param handler Either a function (callback) to be invoked, or a map of
    *        targets and callbacks.
    */
  def on(eventType: String, handler: js.Function): Unit = js.native
  def on(eventType: String, handler: js.Object): Unit = js.native
  def on(selector: String, eventType: String, handler: js.Function): Unit = js.native
  def on(selector: String, eventType: String, handler: js.Object): Unit = js.native
  def on(selector: js.Array[Element], eventType: String, handler: js.Function): Unit = js.native
  def on(selector: js.Array[Element], eventType: String, handler: js.Object): Unit = js.native
  def on(selector: Document, eventType: String, handler: js.Function): Unit = js.native
  def on(selector: Document, eventType: String, handler: js.Object): Unit = js.native
  def on(selector: Element, eventType: String, handler: js.Function): Unit = js.native
  def on(selector: Element, eventType: String, handler: js.Object): Unit = js.native
  
  /**
    * The select method takes an attr key as its argument. The value of the
    * attr must be a CSS Selector. The method will return all matching
    * elements within the component's node.
    *
    * This is a handy alternative to jQuery's this.$node.find() and prevents
    * accidental access to elements outside of the component's node.
    *
    * @param attr
    */
  def select(attr: String): JQuery[HTMLElement] = js.native
  
  /**
    * Remove a component instance and its event bindings.
    *
    * It's a good idea to teardown components after each unit test - and
    * teardown is also good for unbinding event listeners when, for example,
    * the user navigates away from a page.
    *
    */
  def teardown(): Unit = js.native
  
  /**
    * Trigger an event.
    *
    * @param selector Optional. The DOM node(s) that the event will be
    *        dispatched to. Defaults to the component instance's node value.
    *
    * @param eventType String. The event type to be triggered.
    *
    * You can also specify a default function that will be called by the
    * component, providing that nothing in the event's bubble chain invokes
    * preventDefault. Default functions in custom events are analagous to the
    * default actions of native events.
    *
    * To define a default function, make the eventType argument an object
    * that specifies the event's type and a defaultBehavior property. A
    * common use case is defining default behavior for keyboard events.
    *
    * @param eventPayload This is the payload of data that accompanies the event.
    */
  def trigger(eventType: String): Unit = js.native
  def trigger(eventType: js.Object): Unit = js.native
  def trigger(selector: String, eventType: String): Unit = js.native
  def trigger(selector: String, eventType: String, eventPayload: js.Object): Unit = js.native
  def trigger(selector: String, eventType: js.Object): Unit = js.native
  def trigger(selector: String, eventType: js.Object, eventPayload: js.Object): Unit = js.native
  def trigger(selector: js.Array[Element], eventType: String): Unit = js.native
  def trigger(selector: js.Array[Element], eventType: String, eventPayload: js.Object): Unit = js.native
  def trigger(selector: js.Array[Element], eventType: js.Object): Unit = js.native
  def trigger(selector: js.Array[Element], eventType: js.Object, eventPayload: js.Object): Unit = js.native
  def trigger(selector: Document, eventType: String): Unit = js.native
  def trigger(selector: Document, eventType: String, eventPayload: js.Object): Unit = js.native
  def trigger(selector: Document, eventType: js.Object): Unit = js.native
  def trigger(selector: Document, eventType: js.Object, eventPayload: js.Object): Unit = js.native
  def trigger(selector: Element, eventType: String): Unit = js.native
  def trigger(selector: Element, eventType: String, eventPayload: js.Object): Unit = js.native
  def trigger(selector: Element, eventType: js.Object): Unit = js.native
  def trigger(selector: Element, eventType: js.Object, eventPayload: js.Object): Unit = js.native
}
