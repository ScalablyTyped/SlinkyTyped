package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends OutlookItem {
  /**
    * The collection of fileAttachment and itemAttachment attachments for the event. Navigation property. Read-only.
    * Nullable.
    */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.native
  // The collection of attendees for the event.
  var attendees: js.UndefOr[js.Array[Attendee]] = js.native
  // The body of the message associated with the event. It can be in HTML or text format.
  var body: js.UndefOr[ItemBody] = js.native
  // The preview of the message associated with the event. It is in text format.
  var bodyPreview: js.UndefOr[String] = js.native
  // The calendar that contains the event. Navigation property. Read-only.
  var calendar: js.UndefOr[Calendar] = js.native
  // The date, time, and time zone that the event ends. By default, the end time is in UTC.
  var end: js.UndefOr[DateTimeTimeZone] = js.native
  // The collection of open extensions defined for the event. Read-only. Nullable.
  var extensions: js.UndefOr[js.Array[Extension]] = js.native
  // Set to true if the event has attachments.
  var hasAttachments: js.UndefOr[Boolean] = js.native
  // A unique identifier that is shared by all instances of an event across different calendars. Read-only.
  var iCalUId: js.UndefOr[String] = js.native
  // The importance of the event. The possible values are: low, normal, high.
  var importance: js.UndefOr[Importance] = js.native
  // The instances of the event. Navigation property. Read-only. Nullable.
  var instances: js.UndefOr[js.Array[Event]] = js.native
  // Set to true if the event lasts all day.
  var isAllDay: js.UndefOr[Boolean] = js.native
  // Set to true if the event has been canceled.
  var isCancelled: js.UndefOr[Boolean] = js.native
  // Set to true if the message sender is also the organizer.
  var isOrganizer: js.UndefOr[Boolean] = js.native
  // Set to true if an alert is set to remind the user of the event.
  var isReminderOn: js.UndefOr[Boolean] = js.native
  // The location of the event.
  var location: js.UndefOr[Location] = js.native
  /**
    * The locations where the event is held or attended from. The location and locations properties always correspond with
    * each other. If you update the location property, any prior locations in the locations collection would be removed and
    * replaced by the new location value.
    */
  var locations: js.UndefOr[js.Array[Location]] = js.native
  // The collection of multi-value extended properties defined for the event. Read-only. Nullable.
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.native
  /**
    * A URL for an online meeting. The property is set only when an organizer specifies an event as an online meeting such as
    * a Skype meeting. Read-only.
    */
  var onlineMeetingUrl: js.UndefOr[String] = js.native
  // The organizer of the event.
  var organizer: js.UndefOr[Recipient] = js.native
  /**
    * The end time zone that was set when the event was created. A value of tzone://Microsoft/Custom indicates that a legacy
    * custom time zone was set in desktop Outlook.
    */
  var originalEndTimeZone: js.UndefOr[String] = js.native
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'
    */
  var originalStart: js.UndefOr[String] = js.native
  /**
    * The start time zone that was set when the event was created. A value of tzone://Microsoft/Custom indicates that a
    * legacy custom time zone was set in desktop Outlook.
    */
  var originalStartTimeZone: js.UndefOr[String] = js.native
  // The recurrence pattern for the event.
  var recurrence: js.UndefOr[PatternedRecurrence] = js.native
  // The number of minutes before the event start time that the reminder alert occurs.
  var reminderMinutesBeforeStart: js.UndefOr[Double] = js.native
  // Set to true if the sender would like a response when the event is accepted or declined.
  var responseRequested: js.UndefOr[Boolean] = js.native
  // Indicates the type of response sent in response to an event message.
  var responseStatus: js.UndefOr[ResponseStatus] = js.native
  // The possible values are: normal, personal, private, confidential.
  var sensitivity: js.UndefOr[Sensitivity] = js.native
  // The ID for the recurring series master item, if this event is part of a recurring series.
  var seriesMasterId: js.UndefOr[String] = js.native
  // The status to show. The possible values are: free, tentative, busy, oof, workingElsewhere, unknown.
  var showAs: js.UndefOr[FreeBusyStatus] = js.native
  // The collection of single-value extended properties defined for the event. Read-only. Nullable.
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.native
  // The date, time, and time zone that the event starts. By default, the start time is in UTC.
  var start: js.UndefOr[DateTimeTimeZone] = js.native
  // The text of the event's subject line.
  var subject: js.UndefOr[String] = js.native
  // The event type. The possible values are: singleInstance, occurrence, exception, seriesMaster. Read-only.
  var `type`: js.UndefOr[EventType] = js.native
  /**
    * The URL to open the event in Outlook on the web.Outlook on the web opens the event in the browser if you are signed in
    * to your mailbox. Otherwise, Outlook on the web prompts you to sign in.This URL can be accessed from within an iFrame.
    */
  var webLink: js.UndefOr[String] = js.native
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
    def withAttachments(value: js.Array[Attachment]): Self = {
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
    def withAttendees(value: js.Array[Attendee]): Self = {
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
    def withBody(value: ItemBody): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyPreview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyPreview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyPreview")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendar(value: Calendar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendar")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: DateTimeTimeZone): Self = {
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
    def withExtensions(value: js.Array[Extension]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withHasAttachments(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAttachments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAttachments")(js.undefined)
        ret
    }
    @scala.inline
    def withICalUId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCalUId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutICalUId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iCalUId")(js.undefined)
        ret
    }
    @scala.inline
    def withImportance(value: Importance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importance")(js.undefined)
        ret
    }
    @scala.inline
    def withInstances(value: js.Array[Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instances")(js.undefined)
        ret
    }
    @scala.inline
    def withIsAllDay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsAllDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllDay")(js.undefined)
        ret
    }
    @scala.inline
    def withIsCancelled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsCancelled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCancelled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOrganizer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOrganizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOrganizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOrganizer")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReminderOn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReminderOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReminderOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReminderOn")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: Location): Self = {
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
    def withMultiValueExtendedProperties(value: js.Array[MultiValueLegacyExtendedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueExtendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiValueExtendedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiValueExtendedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlineMeetingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineMeetingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlineMeetingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlineMeetingUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizer(value: Recipient): Self = {
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
    def withOriginalEndTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEndTimeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalEndTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalEndTimeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalStartTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalStartTimeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalStartTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalStartTimeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurrence(value: PatternedRecurrence): Self = {
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
    def withReminderMinutesBeforeStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderMinutesBeforeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminderMinutesBeforeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reminderMinutesBeforeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseRequested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseRequested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseRequested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseRequested")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseStatus(value: ResponseStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withSensitivity(value: Sensitivity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitivity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSensitivity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sensitivity")(js.undefined)
        ret
    }
    @scala.inline
    def withSeriesMasterId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMasterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeriesMasterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seriesMasterId")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAs(value: FreeBusyStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAs")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleValueExtendedProperties(value: js.Array[SingleValueLegacyExtendedProperty]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValueExtendedProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleValueExtendedProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleValueExtendedProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: DateTimeTimeZone): Self = {
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
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: EventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withWebLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webLink")(js.undefined)
        ret
    }
  }
  
}

