package typingsSlinky.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventDetails extends js.Object {
  /**
    * Summary information about the event.
    */
  var event: js.UndefOr[Event] = js.native
  /**
    * The most recent description of the event.
    */
  var eventDescription: js.UndefOr[EventDescription_] = js.native
  /**
    * Additional metadata about the event.
    */
  var eventMetadata: js.UndefOr[typingsSlinky.awsSdk.healthMod.eventMetadata] = js.native
}

object EventDetails {
  @scala.inline
  def apply(): EventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDetails]
  }
  @scala.inline
  implicit class EventDetailsOps[Self <: EventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withEventDescription(value: EventDescription_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withEventMetadata(value: eventMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventMetadata")(js.undefined)
        ret
    }
  }
  
}

