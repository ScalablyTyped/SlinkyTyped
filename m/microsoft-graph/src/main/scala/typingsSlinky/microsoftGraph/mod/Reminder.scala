package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reminder extends js.Object {
  
  /**
    * Identifies the version of the reminder. Every time the reminder is changed, changeKey changes as well. This allows
    * Exchange to apply changes to the correct version of the object.
    */
  var changeKey: js.UndefOr[NullableOption[String]] = js.native
  
  // The date, time and time zone that the event ends.
  var eventEndTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  // The unique ID of the event. Read only.
  var eventId: js.UndefOr[NullableOption[String]] = js.native
  
  // The location of the event.
  var eventLocation: js.UndefOr[NullableOption[Location]] = js.native
  
  // The date, time, and time zone that the event starts.
  var eventStartTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
  
  // The text of the event's subject line.
  var eventSubject: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The URL to open the event in Outlook on the web.The event will open in the browser if you are logged in to your mailbox
    * via Outlook on the web. You will be prompted to login if you are not already logged in with the browser.This URL cannot
    * be accessed from within an iFrame.
    */
  var eventWebLink: js.UndefOr[NullableOption[String]] = js.native
  
  // The date, time, and time zone that the reminder is set to occur.
  var reminderFireTime: js.UndefOr[NullableOption[DateTimeTimeZone]] = js.native
}
object Reminder {
  
  @scala.inline
  def apply(): Reminder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reminder]
  }
  
  @scala.inline
  implicit class ReminderOps[Self <: Reminder] (val x: Self) extends AnyVal {
    
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
    def setChangeKey(value: NullableOption[String]): Self = this.set("changeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeKey: Self = this.set("changeKey", js.undefined)
    
    @scala.inline
    def setChangeKeyNull: Self = this.set("changeKey", null)
    
    @scala.inline
    def setEventEndTime(value: NullableOption[DateTimeTimeZone]): Self = this.set("eventEndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventEndTime: Self = this.set("eventEndTime", js.undefined)
    
    @scala.inline
    def setEventEndTimeNull: Self = this.set("eventEndTime", null)
    
    @scala.inline
    def setEventId(value: NullableOption[String]): Self = this.set("eventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventId: Self = this.set("eventId", js.undefined)
    
    @scala.inline
    def setEventIdNull: Self = this.set("eventId", null)
    
    @scala.inline
    def setEventLocation(value: NullableOption[Location]): Self = this.set("eventLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventLocation: Self = this.set("eventLocation", js.undefined)
    
    @scala.inline
    def setEventLocationNull: Self = this.set("eventLocation", null)
    
    @scala.inline
    def setEventStartTime(value: NullableOption[DateTimeTimeZone]): Self = this.set("eventStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventStartTime: Self = this.set("eventStartTime", js.undefined)
    
    @scala.inline
    def setEventStartTimeNull: Self = this.set("eventStartTime", null)
    
    @scala.inline
    def setEventSubject(value: NullableOption[String]): Self = this.set("eventSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSubject: Self = this.set("eventSubject", js.undefined)
    
    @scala.inline
    def setEventSubjectNull: Self = this.set("eventSubject", null)
    
    @scala.inline
    def setEventWebLink(value: NullableOption[String]): Self = this.set("eventWebLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventWebLink: Self = this.set("eventWebLink", js.undefined)
    
    @scala.inline
    def setEventWebLinkNull: Self = this.set("eventWebLink", null)
    
    @scala.inline
    def setReminderFireTime(value: NullableOption[DateTimeTimeZone]): Self = this.set("reminderFireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReminderFireTime: Self = this.set("reminderFireTime", js.undefined)
    
    @scala.inline
    def setReminderFireTimeNull: Self = this.set("reminderFireTime", null)
  }
}
