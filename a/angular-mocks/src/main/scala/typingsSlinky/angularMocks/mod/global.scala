package typingsSlinky.angularMocks.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.angular.JQuery
import typingsSlinky.angularMocks.mod.angularAugmentingMod.IInjectStatic
import typingsSlinky.angularMocks.mod.angularAugmentingMod.mock.IBrowserTriggerEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////////
// functions attached to global object (window)
///////////////////////////////////////////////////////////////////////////////
// Use `angular.mock.module` instead of `module`, as `module` conflicts with commonjs.
// declare var module: (...modules: any[]) => any;
@JSGlobalScope
@js.native
object global extends js.Object {
  
  /**
    * This is a global (window) function that is only available when the `ngMock` module is included.
    * It can be used to trigger a native browser event on an element, which is useful for unit testing.
    *
    * @param element Either a wrapped jQuery/jqLite node or a DOM element.
    * @param eventType Optional event type. If none is specified, the function tries to determine the
    *     right event type for the element, e.g. `change` for `input[text]`.
    * @param eventData An optional object which contains additional event data used when creating the
    *     event.
    */
  def browserTrigger(element: JQuery): Unit = js.native
  def browserTrigger(element: JQuery, eventType: js.UndefOr[scala.Nothing], eventData: IBrowserTriggerEventData): Unit = js.native
  def browserTrigger(element: JQuery, eventType: String): Unit = js.native
  def browserTrigger(element: JQuery, eventType: String, eventData: IBrowserTriggerEventData): Unit = js.native
  def browserTrigger(element: Element): Unit = js.native
  def browserTrigger(element: Element, eventType: js.UndefOr[scala.Nothing], eventData: IBrowserTriggerEventData): Unit = js.native
  def browserTrigger(element: Element, eventType: String): Unit = js.native
  def browserTrigger(element: Element, eventType: String, eventData: IBrowserTriggerEventData): Unit = js.native
  
  val inject: IInjectStatic = js.native
}
