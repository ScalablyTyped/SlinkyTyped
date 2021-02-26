package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.INSTANT_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstantEvent
  extends SharedEventProperties
     with Event {
  
  @JSName("ph")
  var ph_InstantEvent: INSTANT_EVENTS = js.native
  
  var s: String = js.native
}
object InstantEvent {
  
  @scala.inline
  def apply(ph: INSTANT_EVENTS, s: String): InstantEvent = {
    val __obj = js.Dynamic.literal(ph = ph.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstantEvent]
  }
  
  @scala.inline
  implicit class InstantEventMutableBuilder[Self <: InstantEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPh(value: INSTANT_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: String): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
