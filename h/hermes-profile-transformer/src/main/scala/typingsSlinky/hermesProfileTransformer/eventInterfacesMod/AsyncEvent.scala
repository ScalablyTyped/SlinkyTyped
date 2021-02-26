package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_END
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_INSTANT
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.ASYNC_EVENTS_NESTABLE_START
import org.scalablytyped.runtime.StObject
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
  def AsyncEventEnd(id: Double, ph: ASYNC_EVENTS_NESTABLE_END): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventEnd = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventEnd]
  }
  
  @scala.inline
  def AsyncEventInstant(id: Double, ph: ASYNC_EVENTS_NESTABLE_INSTANT): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventInstant = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventInstant]
  }
  
  @scala.inline
  def AsyncEventStart(id: Double, ph: ASYNC_EVENTS_NESTABLE_START): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventStart = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.AsyncEventStart]
  }
}
