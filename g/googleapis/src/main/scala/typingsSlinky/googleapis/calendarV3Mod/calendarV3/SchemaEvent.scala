package typingsSlinky.googleapis.calendarV3Mod.calendarV3

import typingsSlinky.googleapis.AnonDisplay
import typingsSlinky.googleapis.AnonOverrides
import typingsSlinky.googleapis.AnonPrivate
import typingsSlinky.googleapis.AnonSelf
import typingsSlinky.googleapis.AnonTitleUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaEvent extends js.Object {
  /**
    * Whether anyone can invite themselves to the event (currently works for
    * Google+ events only). Optional. The default is False.
    */
  var anyoneCanAddSelf: js.UndefOr[Boolean] = js.native
  /**
    * File attachments for the event. Currently only Google Drive attachments
    * are supported. In order to modify attachments the supportsAttachments
    * request parameter should be set to true. There can be at most 25
    * attachments per event,
    */
  var attachments: js.UndefOr[js.Array[SchemaEventAttachment]] = js.native
  /**
    * The attendees of the event. See the Events with attendees guide for more
    * information on scheduling events with other calendar users.
    */
  var attendees: js.UndefOr[js.Array[SchemaEventAttendee]] = js.native
  /**
    * Whether attendees may have been omitted from the event&#39;s
    * representation. When retrieving an event, this may be due to a
    * restriction specified by the maxAttendee query parameter. When updating
    * an event, this can be used to only update the participant&#39;s response.
    * Optional. The default is False.
    */
  var attendeesOmitted: js.UndefOr[Boolean] = js.native
  /**
    * The color of the event. This is an ID referring to an entry in the event
    * section of the colors definition (see the  colors endpoint). Optional.
    */
  var colorId: js.UndefOr[String] = js.native
  /**
    * The conference-related information, such as details of a Hangouts Meet
    * conference. To create new conference details use the createRequest field.
    * To persist your changes, remember to set the conferenceDataVersion
    * request parameter to 1 for all event modification requests.
    */
  var conferenceData: js.UndefOr[SchemaConferenceData] = js.native
  /**
    * Creation time of the event (as a RFC3339 timestamp). Read-only.
    */
  var created: js.UndefOr[String] = js.native
  /**
    * The creator of the event. Read-only.
    */
  var creator: js.UndefOr[AnonSelf] = js.native
  /**
    * Description of the event. Optional.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The (exclusive) end time of the event. For a recurring event, this is the
    * end time of the first instance.
    */
  var end: js.UndefOr[SchemaEventDateTime] = js.native
  /**
    * Whether the end time is actually unspecified. An end time is still
    * provided for compatibility reasons, even if this attribute is set to
    * True. The default is False.
    */
  var endTimeUnspecified: js.UndefOr[Boolean] = js.native
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Extended properties of the event.
    */
  var extendedProperties: js.UndefOr[AnonPrivate] = js.native
  /**
    * A gadget that extends this event.
    */
  var gadget: js.UndefOr[AnonDisplay] = js.native
  /**
    * Whether attendees other than the organizer can invite others to the
    * event. Optional. The default is True.
    */
  var guestsCanInviteOthers: js.UndefOr[Boolean] = js.native
  /**
    * Whether attendees other than the organizer can modify the event.
    * Optional. The default is False.
    */
  var guestsCanModify: js.UndefOr[Boolean] = js.native
  /**
    * Whether attendees other than the organizer can see who the event&#39;s
    * attendees are. Optional. The default is True.
    */
  var guestsCanSeeOtherGuests: js.UndefOr[Boolean] = js.native
  /**
    * An absolute link to the Google+ hangout associated with this event.
    * Read-only.
    */
  var hangoutLink: js.UndefOr[String] = js.native
  /**
    * An absolute link to this event in the Google Calendar Web UI. Read-only.
    */
  var htmlLink: js.UndefOr[String] = js.native
  /**
    * Event unique identifier as defined in RFC5545. It is used to uniquely
    * identify events accross calendaring systems and must be supplied when
    * importing events via the import method. Note that the icalUID and the id
    * are not identical and only one of them should be supplied at event
    * creation time. One difference in their semantics is that in recurring
    * events, all occurrences of one event have different ids while they all
    * share the same icalUIDs.
    */
  var iCalUID: js.UndefOr[String] = js.native
  /**
    * Opaque identifier of the event. When creating new single or recurring
    * events, you can specify their IDs. Provided IDs must follow these rules:
    * - characters allowed in the ID are those used in base32hex encoding, i.e.
    * lowercase letters a-v and digits 0-9, see section 3.1.2 in RFC2938  - the
    * length of the ID must be between 5 and 1024 characters  - the ID must be
    * unique per calendar  Due to the globally distributed nature of the
    * system, we cannot guarantee that ID collisions will be detected at event
    * creation time. To minimize the risk of collisions we recommend using an
    * established UUID algorithm such as one described in RFC4122. If you do
    * not specify an ID, it will be automatically generated by the server. Note
    * that the icalUID and the id are not identical and only one of them should
    * be supplied at event creation time. One difference in their semantics is
    * that in recurring events, all occurrences of one event have different ids
    * while they all share the same icalUIDs.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Type of the resource (&quot;calendar#event&quot;).
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Geographic location of the event as free-form text. Optional.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Whether this is a locked event copy where no changes can be made to the
    * main event fields &quot;summary&quot;, &quot;description&quot;,
    * &quot;location&quot;, &quot;start&quot;, &quot;end&quot; or
    * &quot;recurrence&quot;. The default is False. Read-Only.
    */
  var locked: js.UndefOr[Boolean] = js.native
  /**
    * The organizer of the event. If the organizer is also an attendee, this is
    * indicated with a separate entry in attendees with the organizer field set
    * to True. To change the organizer, use the move operation. Read-only,
    * except when importing an event.
    */
  var organizer: js.UndefOr[AnonSelf] = js.native
  /**
    * For an instance of a recurring event, this is the time at which this
    * event would start according to the recurrence data in the recurring event
    * identified by recurringEventId. It uniquely identifies the instance
    * within the recurring event series even if the instance was moved to a
    * different time. Immutable.
    */
  var originalStartTime: js.UndefOr[SchemaEventDateTime] = js.native
  /**
    * Whether this is a private event copy where changes are not shared with
    * other copies on other calendars. Optional. Immutable. The default is
    * False.
    */
  var privateCopy: js.UndefOr[Boolean] = js.native
  /**
    * List of RRULE, EXRULE, RDATE and EXDATE lines for a recurring event, as
    * specified in RFC5545. Note that DTSTART and DTEND lines are not allowed
    * in this field; event start and end times are specified in the start and
    * end fields. This field is omitted for single events or instances of
    * recurring events.
    */
  var recurrence: js.UndefOr[js.Array[String]] = js.native
  /**
    * For an instance of a recurring event, this is the id of the recurring
    * event to which this instance belongs. Immutable.
    */
  var recurringEventId: js.UndefOr[String] = js.native
  /**
    * Information about the event&#39;s reminders for the authenticated user.
    */
  var reminders: js.UndefOr[AnonOverrides] = js.native
  /**
    * Sequence number as per iCalendar.
    */
  var sequence: js.UndefOr[Double] = js.native
  /**
    * Source from which the event was created. For example, a web page, an
    * email message or any document identifiable by an URL with HTTP or HTTPS
    * scheme. Can only be seen or modified by the creator of the event.
    */
  var source: js.UndefOr[AnonTitleUrl] = js.native
  /**
    * The (inclusive) start time of the event. For a recurring event, this is
    * the start time of the first instance.
    */
  var start: js.UndefOr[SchemaEventDateTime] = js.native
  /**
    * Status of the event. Optional. Possible values are:   -
    * &quot;confirmed&quot; - The event is confirmed. This is the default
    * status.  - &quot;tentative&quot; - The event is tentatively confirmed.  -
    * &quot;cancelled&quot; - The event is cancelled (deleted). The list method
    * returns cancelled events only on incremental sync (when syncToken or
    * updatedMin are specified) or if the showDeleted flag is set to true. The
    * get method always returns them. A cancelled status represents two
    * different states depending on the event type:   - Cancelled exceptions of
    * an uncancelled recurring event indicate that this instance should no
    * longer be presented to the user. Clients should store these events for
    * the lifetime of the parent recurring event. Cancelled exceptions are only
    * guaranteed to have values for the id, recurringEventId and
    * originalStartTime fields populated. The other fields might be empty.   -
    * All other cancelled events represent deleted events. Clients should
    * remove their locally synced copies. Such cancelled events will eventually
    * disappear, so do not rely on them being available indefinitely. Deleted
    * events are only guaranteed to have the id field populated.   On the
    * organizer&#39;s calendar, cancelled events continue to expose event
    * details (summary, location, etc.) so that they can be restored
    * (undeleted). Similarly, the events to which the user was invited and that
    * they manually removed continue to provide details. However, incremental
    * sync requests with showDeleted set to false will not return these
    * details. If an event changes its organizer (for example via the move
    * operation) and the original organizer is not on the attendee list, it
    * will leave behind a cancelled event where only the id field is guaranteed
    * to be populated.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Title of the event.
    */
  var summary: js.UndefOr[String] = js.native
  /**
    * Whether the event blocks time on the calendar. Optional. Possible values
    * are:   - &quot;opaque&quot; - Default value. The event does block time on
    * the calendar. This is equivalent to setting Show me as to Busy in the
    * Calendar UI.  - &quot;transparent&quot; - The event does not block time
    * on the calendar. This is equivalent to setting Show me as to Available in
    * the Calendar UI.
    */
  var transparency: js.UndefOr[String] = js.native
  /**
    * Last modification time of the event (as a RFC3339 timestamp). Read-only.
    */
  var updated: js.UndefOr[String] = js.native
  /**
    * Visibility of the event. Optional. Possible values are:   -
    * &quot;default&quot; - Uses the default visibility for events on the
    * calendar. This is the default value.  - &quot;public&quot; - The event is
    * public and event details are visible to all readers of the calendar.  -
    * &quot;private&quot; - The event is private and only event attendees may
    * view event details.  - &quot;confidential&quot; - The event is private.
    * This value is provided for compatibility reasons.
    */
  var visibility: js.UndefOr[String] = js.native
}

object SchemaEvent {
  @scala.inline
  def apply(): SchemaEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvent]
  }
  @scala.inline
  implicit class SchemaEventOps[Self <: SchemaEvent] (val x: Self) extends AnyVal {
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
    def withAttachments(value: js.Array[SchemaEventAttachment]): Self = {
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
    def withAttendees(value: js.Array[SchemaEventAttendee]): Self = {
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
    def withConferenceData(value: SchemaConferenceData): Self = {
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
    def withCreator(value: AnonSelf): Self = {
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
    def withEnd(value: SchemaEventDateTime): Self = {
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
    def withExtendedProperties(value: AnonPrivate): Self = {
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
    def withGadget(value: AnonDisplay): Self = {
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
    def withOrganizer(value: AnonSelf): Self = {
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
    def withOriginalStartTime(value: SchemaEventDateTime): Self = {
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
    def withReminders(value: AnonOverrides): Self = {
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
    def withSource(value: AnonTitleUrl): Self = {
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
    def withStart(value: SchemaEventDateTime): Self = {
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

