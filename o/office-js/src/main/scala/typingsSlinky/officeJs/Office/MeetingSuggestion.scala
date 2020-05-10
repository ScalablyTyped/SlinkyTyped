package typingsSlinky.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a suggested meeting found in an item. Read mode only.
  *
  * The list of meetings suggested in an email message is returned in the `meetingSuggestions` property of the `Entities` object that is returned when
  * the `getEntities` or `getEntitiesByType` method is called on the active item.
  *
  * The start and end values are string representations of a `Date` object that contains the date and time at which the suggested meeting is to
  * begin and end. The values are in the default time zone specified for the current user.
  *
  * @remarks
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/understanding-outlook-add-in-permissions | Minimum permission level}**: `ReadItem`
  * 
  * **{@link https://docs.microsoft.com/office/dev/add-ins/outlook/outlook-add-ins-overview#extension-points | Applicable Outlook mode}**: Read
  */
@js.native
trait MeetingSuggestion extends js.Object {
  /**
    * Gets the attendees for a suggested meeting.
    */
  var attendees: js.Array[EmailUser] = js.native
  /**
    * Gets the date and time that a suggested meeting is to end.
    */
  var end: String = js.native
  /**
    * Gets the location of a suggested meeting.
    */
  var location: String = js.native
  /**
    * Gets a string that was identified as a meeting suggestion.
    */
  var meetingString: String = js.native
  /**
    * Gets the date and time that a suggested meeting is to begin.
    */
  var start: String = js.native
  /**
    * Gets the subject of a suggested meeting.
    */
  var subject: String = js.native
}

object MeetingSuggestion {
  @scala.inline
  def apply(
    attendees: js.Array[EmailUser],
    end: String,
    location: String,
    meetingString: String,
    start: String,
    subject: String
  ): MeetingSuggestion = {
    val __obj = js.Dynamic.literal(attendees = attendees.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], meetingString = meetingString.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeetingSuggestion]
  }
  @scala.inline
  implicit class MeetingSuggestionOps[Self <: MeetingSuggestion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttendees(value: js.Array[EmailUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attendees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeetingString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meetingString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

