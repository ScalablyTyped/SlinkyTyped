package typingsSlinky.gapiCalendar.gapi.client.calendar

import typingsSlinky.gapiCalendar.anon.Comment
import typingsSlinky.gapiCalendar.anon.Date
import typingsSlinky.gapiCalendar.anon.DisplayName
import typingsSlinky.gapiCalendar.anon.FileId
import typingsSlinky.gapiCalendar.anon.Height
import typingsSlinky.gapiCalendar.anon.Private
import typingsSlinky.gapiCalendar.anon.TimeZone
import typingsSlinky.gapiCalendar.anon.Title
import typingsSlinky.gapiCalendar.anon.UseDefault
import typingsSlinky.gapiCalendar.gapiCalendarStrings.calendarNumbersignevent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.native
  // File attachments for the event. Currently only Google Drive attachments are supported.
  var attachments: js.UndefOr[js.Array[FileId]] = js.native
  // The attendees of the event.
  var attendees: js.UndefOr[js.Array[Comment]] = js.native
  var attendeesOmitted: js.UndefOr[Boolean] = js.native
  var colorId: js.UndefOr[String] = js.native
  var created: datetime = js.native
  // The creator of the event. Read-only.
  var creator: DisplayName = js.native
  var description: String = js.native
  // The (exclusive) end time of the event. For a recurring event, this is the end time of the first instance.
  var end: Date = js.native
  // 	Whether the end time is actually unspecified. An end time is still provided for compatibility reasons, even if this attribute is set to True.
  // The default is False.
  var endTimeUnspecified: js.UndefOr[Boolean] = js.native
  var etag: typingsSlinky.gapiCalendar.gapi.client.calendar.etag = js.native
  // Extended properties of the event.
  var extendedProperties: js.UndefOr[Private] = js.native
  // A gadget that extends this event.
  var gadget: js.UndefOr[Height] = js.native
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.native
  var guestsCanModify: js.UndefOr[Boolean] = js.native
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.native
  // An absolute link to the Google+ hangout associated with this event. Read-only.
  var hangoutLink: js.UndefOr[String] = js.native
  var htmlLink: String = js.native
  var iCalUID: String = js.native
  var id: String = js.native
  var kind: calendarNumbersignevent = js.native
  var location: js.UndefOr[String] = js.native
  // Whether this is a locked event copy where no changes can be made to the main event fields "summary", "description", "location", "start", "end" or "recurrence". The default is False. Read-Only.
  var locked: js.UndefOr[Boolean] = js.native
  // The organizer of the event.
  var organizer: DisplayName = js.native
  // Whether the organizer corresponds to the calendar on which this copy of the event appears. Read-only. The default is False.
  var originalStartTime: js.UndefOr[TimeZone] = js.native
  var privateCopy: js.UndefOr[Boolean] = js.native
  var recurrence: js.Array[String] = js.native
  // For an instance of a recurring event, this is the id of the recurring event to which this instance belongs. Immutable.
  var recurringEventId: js.UndefOr[String] = js.native
  var reminders: UseDefault = js.native
  var sequence: integer = js.native
  // Source from which the event was created. For example, a web page, an email message or any document identifiable by an URL with HTTP or HTTPS scheme.
  // Can only be seen or modified by the creator of the event.
  var source: js.UndefOr[Title] = js.native
  // The (inclusive) start time of the event. For a recurring event, this is the start time of the first instance.
  var start: Date = js.native
  var status: js.UndefOr[EventStatus] = js.native
  var summary: String = js.native
  var transparency: js.UndefOr[EventTransparency] = js.native
  var updated: datetime = js.native
  var visibility: js.UndefOr[EventVisibility] = js.native
}

object Event {
  @scala.inline
  def apply(
    created: datetime,
    creator: DisplayName,
    description: String,
    end: Date,
    etag: etag,
    htmlLink: String,
    iCalUID: String,
    id: String,
    kind: calendarNumbersignevent,
    organizer: DisplayName,
    recurrence: js.Array[String],
    reminders: UseDefault,
    sequence: integer,
    start: Date,
    summary: String,
    updated: datetime
  ): Event = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], htmlLink = htmlLink.asInstanceOf[js.Any], iCalUID = iCalUID.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], organizer = organizer.asInstanceOf[js.Any], recurrence = recurrence.asInstanceOf[js.Any], reminders = reminders.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEtag(value: etag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withICalUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCalUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: calendarNumbersignevent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrganizer(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecurrence(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReminders(value: UseDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequence(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSummary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated(value: datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
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
    def withAttachments(value: js.Array[FileId]): Self = {
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
    def withAttendees(value: js.Array[Comment]): Self = {
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
    def withExtendedProperties(value: Private): Self = {
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
    def withGadget(value: Height): Self = {
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
    def withOriginalStartTime(value: TimeZone): Self = {
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
    def withSource(value: Title): Self = {
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
    def withStatus(value: EventStatus): Self = {
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
    def withTransparency(value: EventTransparency): Self = {
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
    def withVisibility(value: EventVisibility): Self = {
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

