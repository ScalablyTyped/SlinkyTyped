package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeetingTimeSuggestion extends js.Object {
  // An array that shows the availability status of each attendee for this meeting suggestion.
  var attendeeAvailability: js.UndefOr[js.Array[AttendeeAvailability]] = js.native
  // A percentage that represents the likelhood of all the attendees attending.
  var confidence: js.UndefOr[Double] = js.native
  // An array that specifies the name and geographic location of each meeting location for this meeting suggestion.
  var locations: js.UndefOr[js.Array[Location]] = js.native
  // A time period suggested for the meeting.
  var meetingTimeSlot: js.UndefOr[TimeSlot] = js.native
  /**
    * Order of meeting time suggestions sorted by their computed confidence value from high to low, then by chronology if
    * there are suggestions with the same confidence.
    */
  var order: js.UndefOr[Double] = js.native
  /**
    * Availability of the meeting organizer for this meeting suggestion. The possible values are: free, tentative, busy, oof,
    * workingElsewhere, unknown.
    */
  var organizerAvailability: js.UndefOr[FreeBusyStatus] = js.native
  // Reason for suggesting the meeting time.
  var suggestionReason: js.UndefOr[String] = js.native
}

object MeetingTimeSuggestion {
  @scala.inline
  def apply(): MeetingTimeSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingTimeSuggestion]
  }
  @scala.inline
  implicit class MeetingTimeSuggestionOps[Self <: MeetingTimeSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttendeeAvailability(value: js.Array[AttendeeAvailability]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attendeeAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttendeeAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attendeeAvailability")(js.undefined)
        ret
    }
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withLocations(value: js.Array[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locations")(js.undefined)
        ret
    }
    @scala.inline
    def withMeetingTimeSlot(value: TimeSlot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meetingTimeSlot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeetingTimeSlot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meetingTimeSlot")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizerAvailability(value: FreeBusyStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizerAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizerAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizerAvailability")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestionReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestionReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestionReason")(js.undefined)
        ret
    }
  }
  
}

