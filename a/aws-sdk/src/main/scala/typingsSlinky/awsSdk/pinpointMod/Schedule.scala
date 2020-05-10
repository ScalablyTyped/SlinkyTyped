package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schedule extends js.Object {
  /**
    * The scheduled time, in ISO 8601 format, when the campaign ended or will end.
    */
  var EndTime: js.UndefOr[string] = js.native
  /**
    * The type of event that causes the campaign to be sent, if the value of the Frequency property is EVENT.
    */
  var EventFilter: js.UndefOr[CampaignEventFilter] = js.native
  /**
    * Specifies how often the campaign is sent or whether the campaign is sent in response to a specific event.
    */
  var Frequency: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.Frequency] = js.native
  /**
    * Specifies whether the start and end times for the campaign schedule use each recipient's local time. To base the schedule on each recipient's local time, set this value to true.
    */
  var IsLocalTime: js.UndefOr[boolean] = js.native
  /**
    * The default quiet time for the campaign. Quiet time is a specific time range when a campaign doesn't send messages to endpoints, if all the following conditions are met: The EndpointDemographic.Timezone property of the endpoint is set to a valid value. The current time in the endpoint's time zone is later than or equal to the time specified by the QuietTime.Start property for the campaign. The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End property for the campaign. If any of the preceding conditions isn't met, the endpoint will receive messages from the campaign, even if quiet time is enabled.
    */
  var QuietTime: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.QuietTime] = js.native
  /**
    * The scheduled time when the campaign began or will begin. Valid values are: IMMEDIATE, to start the campaign immediately; or, a specific time in ISO 8601 format.
    */
  var StartTime: string = js.native
  /**
    * The starting UTC offset for the campaign schedule, if the value of the IsLocalTime property is true. Valid values are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05,
    UTC+05:30, UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09, UTC+09:30,
    UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05, UTC-06,
    UTC-07, UTC-08, UTC-09, UTC-10, and UTC-11.
    */
  var Timezone: js.UndefOr[string] = js.native
}

object Schedule {
  @scala.inline
  def apply(StartTime: string): Schedule = {
    val __obj = js.Dynamic.literal(StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
  @scala.inline
  implicit class ScheduleOps[Self <: Schedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStartTime(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEventFilter(value: CampaignEventFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withFrequency(value: Frequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frequency")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLocalTime(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLocalTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLocalTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsLocalTime")(js.undefined)
        ret
    }
    @scala.inline
    def withQuietTime(value: QuietTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuietTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuietTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QuietTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timezone")(js.undefined)
        ret
    }
  }
  
}

