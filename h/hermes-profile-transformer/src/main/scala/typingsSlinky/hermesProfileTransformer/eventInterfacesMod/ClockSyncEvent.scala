package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.anon.Issuets
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.CLOCK_SYNC_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClockSyncEvent
  extends SharedEventProperties
     with Event {
  
  @JSName("args")
  var args_ClockSyncEvent: Issuets = js.native
  
  @JSName("ph")
  var ph_ClockSyncEvent: CLOCK_SYNC_EVENTS = js.native
}
object ClockSyncEvent {
  
  @scala.inline
  def apply(args: Issuets, ph: CLOCK_SYNC_EVENTS): ClockSyncEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClockSyncEvent]
  }
  
  @scala.inline
  implicit class ClockSyncEventMutableBuilder[Self <: ClockSyncEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: Issuets): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPh(value: CLOCK_SYNC_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
