package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.CONTEXT_EVENTS_ENTER
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.CONTEXT_EVENTS_LEAVE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ContextEventEnter
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.ContextEventLeave
*/
trait ContextEvent extends Event
object ContextEvent {
  
  @scala.inline
  def ContextEventEnter(ph: CONTEXT_EVENTS_ENTER): ContextEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextEvent]
  }
  
  @scala.inline
  def ContextEventLeave(ph: CONTEXT_EVENTS_LEAVE): ContextEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextEvent]
  }
}
