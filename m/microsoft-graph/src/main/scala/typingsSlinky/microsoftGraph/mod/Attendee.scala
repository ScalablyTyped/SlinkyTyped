package typingsSlinky.microsoftGraph.mod

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
  implicit class AttendeeOps[Self <: Attendee] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProposedNewTime(value: NullableOption[TimeSlot]): Self = this.set("proposedNewTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProposedNewTime: Self = this.set("proposedNewTime", js.undefined)
    
    @scala.inline
    def setProposedNewTimeNull: Self = this.set("proposedNewTime", null)
    
    @scala.inline
    def setStatus(value: NullableOption[ResponseStatus]): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusNull: Self = this.set("status", null)
  }
}
