package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndOfMeetingReminder extends js.Object {
  /**
    * Whether an end of meeting reminder is enabled or not.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * Updates settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending. 
    */
  var ReminderAtMinutes: js.UndefOr[EndOfMeetingReminderMinutesList] = js.native
  /**
    * The type of sound that users hear during the end of meeting reminder. 
    */
  var ReminderType: js.UndefOr[EndOfMeetingReminderType] = js.native
}

object UpdateEndOfMeetingReminder {
  @scala.inline
  def apply(): UpdateEndOfMeetingReminder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEndOfMeetingReminder]
  }
  @scala.inline
  implicit class UpdateEndOfMeetingReminderOps[Self <: UpdateEndOfMeetingReminder] (val x: Self) extends AnyVal {
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

