package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndOfMeetingReminder extends js.Object {
  /**
    * Whether an end of meeting reminder is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * A range of 3 to 15 minutes that determines when the reminder begins.
    */
  var ReminderAtMinutes: js.UndefOr[EndOfMeetingReminderMinutesList] = js.native
  /**
    * The type of sound that users hear during the end of meeting reminder. 
    */
  var ReminderType: js.UndefOr[EndOfMeetingReminderType] = js.native
}

object EndOfMeetingReminder {
  @scala.inline
  def apply(): EndOfMeetingReminder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndOfMeetingReminder]
  }
  @scala.inline
  implicit class EndOfMeetingReminderOps[Self <: EndOfMeetingReminder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withReminderAtMinutes(value: EndOfMeetingReminderMinutesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReminderAtMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminderAtMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReminderAtMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withReminderType(value: EndOfMeetingReminderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReminderType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReminderType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReminderType")(js.undefined)
        ret
    }
  }
  
}

