package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndOfMeetingReminder extends js.Object {
  /**
    * Whether an end of meeting reminder is enabled or not.
    */
  var Enabled: Boolean = js.native
  /**
    *  A range of 3 to 15 minutes that determines when the reminder begins.
    */
  var ReminderAtMinutes: EndOfMeetingReminderMinutesList = js.native
  /**
    * The type of sound that users hear during the end of meeting reminder. 
    */
  var ReminderType: EndOfMeetingReminderType = js.native
}

object CreateEndOfMeetingReminder {
  @scala.inline
  def apply(
    Enabled: Boolean,
    ReminderAtMinutes: EndOfMeetingReminderMinutesList,
    ReminderType: EndOfMeetingReminderType
  ): CreateEndOfMeetingReminder = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], ReminderAtMinutes = ReminderAtMinutes.asInstanceOf[js.Any], ReminderType = ReminderType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndOfMeetingReminder]
  }
  @scala.inline
  implicit class CreateEndOfMeetingReminderOps[Self <: CreateEndOfMeetingReminder] (val x: Self) extends AnyVal {
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
    def withReminderAtMinutes(value: EndOfMeetingReminderMinutesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReminderAtMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReminderType(value: EndOfMeetingReminderType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReminderType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

