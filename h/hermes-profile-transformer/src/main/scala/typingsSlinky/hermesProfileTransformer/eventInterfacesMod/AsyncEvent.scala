package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_END
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_INSTANT
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_START
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventStart
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventInstant
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventEnd
*/
trait AsyncEvent extends Event
object AsyncEvent {
  
  @scala.inline
  def AsyncEventStart(id: Double, ph: ASYNC_EVENTS_NESTABLE_START): AsyncEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def AsyncEventInstant(id: Double, ph: ASYNC_EVENTS_NESTABLE_INSTANT): AsyncEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
  
  @scala.inline
  def AsyncEventEnd(id: Double, ph: ASYNC_EVENTS_NESTABLE_END): AsyncEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncEvent]
  }
}
