package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeetingRoomConfiguration extends js.Object {
  /**
    * Settings for the end of meeting reminder feature that are applied to a room profile. The end of meeting reminder enables Alexa to remind users when a meeting is ending. 
    */
  var EndOfMeetingReminder: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.EndOfMeetingReminder] = js.native
  /**
    * Settings to automatically book the room if available for a configured duration when joining a meeting with Alexa. 
    */
  var InstantBooking: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.InstantBooking] = js.native
  /**
    * Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not checked into. This makes the room available for others. Users can check in by joining the meeting with Alexa or an AVS device, or by saying “Alexa, check in.” 
    */
  var RequireCheckIn: js.UndefOr[typingsSlinky.awsSdk.alexaforbusinessMod.RequireCheckIn] = js.native
  /**
    * Whether room utilization metrics are enabled or not.
    */
  var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean] = js.native
}

object MeetingRoomConfiguration {
  @scala.inline
  def apply(): MeetingRoomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingRoomConfiguration]
  }
  @scala.inline
  implicit class MeetingRoomConfigurationOps[Self <: MeetingRoomConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndOfMeetingReminder(value: EndOfMeetingReminder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndOfMeetingReminder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndOfMeetingReminder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndOfMeetingReminder")(js.undefined)
        ret
    }
    @scala.inline
    def withInstantBooking(value: InstantBooking): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstantBooking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstantBooking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstantBooking")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireCheckIn(value: RequireCheckIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireCheckIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireCheckIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequireCheckIn")(js.undefined)
        ret
    }
    @scala.inline
    def withRoomUtilizationMetricsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomUtilizationMetricsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoomUtilizationMetricsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RoomUtilizationMetricsEnabled")(js.undefined)
        ret
    }
  }
  
}

