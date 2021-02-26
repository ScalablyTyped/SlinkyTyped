package typingsSlinky.hermesProfileTransformer.eventInterfacesMod

import typingsSlinky.hermesProfileTransformer.anon.Linkedid
import typingsSlinky.hermesProfileTransformer.phasesMod.EventsPhase.LINKED_ID_EVENTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedIDEvent
  extends SharedEventProperties
     with Event {
  
  @JSName("args")
  var args_LinkedIDEvent: Linkedid = js.native
  
  var id: Double = js.native
  
  @JSName("ph")
  var ph_LinkedIDEvent: LINKED_ID_EVENTS = js.native
}
object LinkedIDEvent {
  
  @scala.inline
  def apply(args: Linkedid, id: Double, ph: LINKED_ID_EVENTS): LinkedIDEvent = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ph = ph.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkedIDEvent]
  }
  
  @scala.inline
  implicit class LinkedIDEventMutableBuilder[Self <: LinkedIDEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: Linkedid): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPh(value: LINKED_ID_EVENTS): Self = StObject.set(x, "ph", value.asInstanceOf[js.Any])
  }
}
