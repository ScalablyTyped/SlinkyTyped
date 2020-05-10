package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMeetingRoomConfiguration extends js.Object {
  var EndOfMeetingReminder: js.UndefOr[CreateEndOfMeetingReminder] = js.native
  /**
    * Settings to automatically book a room for a configured duration if it's free when joining a meeting with Alexa.
    */
  var InstantBooking: js.UndefOr[CreateInstantBooking] = js.native
  /**
    * Settings for requiring a check in when a room is reserved. Alexa can cancel a room reservation if it's not checked into to make the room available for others. Users can check in by joining the meeting with Alexa or an AVS device, or by saying “Alexa, check in.”
    */
  var RequireCheckIn: js.UndefOr[CreateRequireCheckIn] = js.native
  /**
    * Whether room utilization metrics are enabled or not.
    */
  var RoomUtilizationMetricsEnabled: js.UndefOr[Boolean] = js.native
}

object CreateMeetingRoomConfiguration {
  @scala.inline
  def apply(): CreateMeetingRoomConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMeetingRoomConfiguration]
  }
  @scala.inline
  implicit class CreateMeetingRoomConfigurationOps[Self <: CreateMeetingRoomConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndOfMeetingReminder(value: CreateEndOfMeetingReminder): Self = {
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
    def withInstantBooking(value: CreateInstantBooking): Self = {
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
    def withRequireCheckIn(value: CreateRequireCheckIn): Self = {
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

