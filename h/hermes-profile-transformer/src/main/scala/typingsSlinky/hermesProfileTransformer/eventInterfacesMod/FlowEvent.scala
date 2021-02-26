package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_END
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_START
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.FLOW_EVENTS_STEP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventStart
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventStep
  - typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventEnd
*/
trait FlowEvent extends Event
object FlowEvent {
  
  @scala.inline
  def FlowEventEnd(ph: FLOW_EVENTS_END): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventEnd = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventEnd]
  }
  
  @scala.inline
  def FlowEventStart(ph: FLOW_EVENTS_START): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventStart = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventStart]
  }
  
  @scala.inline
  def FlowEventStep(ph: FLOW_EVENTS_STEP): typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventStep = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.hermesProfileTransformer.eventInterfacesMod.FlowEventStep]
  }
}
