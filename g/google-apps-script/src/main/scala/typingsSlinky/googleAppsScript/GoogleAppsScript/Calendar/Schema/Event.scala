package typingsSlinky.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.native
  var attachments: js.UndefOr[js.Array[EventAttachment]] = js.native
  var attendees: js.UndefOr[js.Array[EventAttendee]] = js.native
  var attendeesOmitted: js.UndefOr[Boolean] = js.native
  var colorId: js.UndefOr[String] = js.native
  var conferenceData: js.UndefOr[ConferenceData] = js.native
  var created: js.UndefOr[String] = js.native
  var creator: js.UndefOr[EventCreator] = js.native
  var description: js.UndefOr[String] = js.native
  var end: js.UndefOr[EventDateTime] = js.native
  var endTimeUnspecified: js.UndefOr[Boolean] = js.native
  var etag: js.UndefOr[String] = js.native
  var extendedProperties: js.UndefOr[EventExtendedProperties] = js.native
  var gadget: js.UndefOr[EventGadget] = js.native
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.native
  var guestsCanModify: js.UndefOr[Boolean] = js.native
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.native
  var hangoutLink: js.UndefOr[String] = js.native
  var htmlLink: js.UndefOr[String] = js.native
  var iCalUID: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var location: js.UndefOr[String] = js.native
  var locked: js.UndefOr[Boolean] = js.native
  var organizer: js.UndefOr[EventOrganizer] = js.native
  var originalStartTime: js.UndefOr[EventDateTime] = js.native
  var privateCopy: js.UndefOr[Boolean] = js.native
  var recurrence: js.UndefOr[js.Array[String]] = js.native
  var recurringEventId: js.UndefOr[String] = js.native
  var reminders: js.UndefOr[EventReminders] = js.native
  var sequence: js.UndefOr[Double] = js.native
  var source: js.UndefOr[EventSource] = js.native
  var start: js.UndefOr[EventDateTime] = js.native
  var status: js.UndefOr[String] = js.native
  var summary: js.UndefOr[String] = js.native
  var transparency: js.UndefOr[String] = js.native
  var updated: js.UndefOr[String] = js.native
  var visibility: js.UndefOr[String] = js.native
}

object Event {
  @scala.inline
  def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyoneCanAddSelf(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyoneCanAddSelf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnyoneCanAddSelf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyoneCanAddSelf")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachments(value: js.Array[EventAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachments")(js.undefined)
        ret
    }
    @scala.inline
    def withAttendees(value: js.Array[EventAttendee]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attendees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttendees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attendees")(js.undefined)
        ret
    }
    @scala.inline
    def withAttendeesOmitted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attendeesOmitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttendeesOmitted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attendeesOmitted")(js.undefined)
        ret
    }
    @scala.inline
    def withColorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorId")(js.undefined)
        ret
    }
    @scala.inline
    def withConferenceData(value: ConferenceData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conferenceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConferenceData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conferenceData")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withCreator(value: EventCreator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: EventDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTimeUnspecified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeUnspecified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTimeUnspecified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTimeUnspecified")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withExtendedProperties(value: EventExtendedProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withGadget(value: EventGadget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gadget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGadget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gadget")(js.undefined)
        ret
    }
    @scala.inline
    def withGuestsCanInviteOthers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestsCanInviteOthers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuestsCanInviteOthers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestsCanInviteOthers")(js.undefined)
        ret
    }
    @scala.inline
    def withGuestsCanModify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestsCanModify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuestsCanModify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestsCanModify")(js.undefined)
        ret
    }
    @scala.inline
    def withGuestsCanSeeOtherGuests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestsCanSeeOtherGuests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuestsCanSeeOtherGuests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guestsCanSeeOtherGuests")(js.undefined)
        ret
    }
    @scala.inline
    def withHangoutLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hangoutLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHangoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hangoutLink")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlLink")(js.undefined)
        ret
    }
    @scala.inline
    def withICalUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCalUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICalUID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCalUID")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizer(value: EventOrganizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizer")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalStartTime(value: EventDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalStartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateCopy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateCopy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateCopy")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrence(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurrence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrence")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurringEventId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurringEventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurringEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurringEventId")(js.undefined)
        ret
    }
    @scala.inline
    def withReminders(value: EventReminders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminders")(js.undefined)
        ret
    }
    @scala.inline
    def withSequence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSequence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: EventSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: EventDateTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparency(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

