package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attendee extends AttendeeBase {
  
  /**
    * An alternate date/time proposed by the attendee for a meeting request to start and end. If the attendee hasn't proposed
    * another time, then this property is not included in a response of a GET event.
    */
  var proposedNewTime: js.UndefOr[NullableOption[TimeSlot]] = js.native
  
  // The attendee's response (none, accepted, declined, etc.) for the event and date-time that the response was sent.
  var status: js.UndefOr[NullableOption[ResponseStatus]] = js.native
}
object Attendee {
  
  @scala.inline
  def apply(): Attendee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attendee]
  }
  
  @scala.inline
  implicit class AttendeeMutableBuilder[Self <: Attendee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProposedNewTime(value: NullableOption[TimeSlot]): Self = StObject.set(x, "proposedNewTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProposedNewTimeNull: Self = StObject.set(x, "proposedNewTime", null)
    
    @scala.inline
    def setProposedNewTimeUndefined: Self = StObject.set(x, "proposedNewTime", js.undefined)
    
    @scala.inline
    def setStatus(value: NullableOption[ResponseStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusNull: Self = StObject.set(x, "status", null)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
