package typingsSlinky.awsSdkClientPinpointBrowser.typesScheduleMod

import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DAILY
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.HOURLY
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.MONTHLY
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.ONCE
import typingsSlinky.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.WEEKLY
import typingsSlinky.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schedule extends js.Object {
  /**
    * The scheduled time that the campaign ends in ISO 8601 format.
    */
  var EndTime: js.UndefOr[String] = js.native
  /**
    * How often the campaign delivers messages.
    *
    * Valid values: ONCE, HOURLY, DAILY, WEEKLY, MONTHLY
    */
  var Frequency: js.UndefOr[ONCE | HOURLY | DAILY | WEEKLY | MONTHLY | String] = js.native
  /**
    * Indicates whether the campaign schedule takes effect according to each user's local time.
    */
  var IsLocalTime: js.UndefOr[Boolean] = js.native
  /**
    * The time during which the campaign sends no messages.
    */
  var QuietTime: js.UndefOr[typingsSlinky.awsSdkClientPinpointBrowser.typesQuietTimeMod.QuietTime] = js.native
  /**
    * The scheduled time that the campaign begins in ISO 8601 format.
    */
  var StartTime: js.UndefOr[String] = js.native
  /**
    * The starting UTC offset for the schedule if the value for isLocalTime is true
    *
    * Valid values:
    * UTC
    * UTC+01
    * UTC+02
    * UTC+03
    * UTC+03:30
    * UTC+04
    * UTC+04:30
    * UTC+05
    * UTC+05:30
    * UTC+05:45
    * UTC+06
    * UTC+06:30
    * UTC+07
    * UTC+08
    * UTC+09
    * UTC+09:30
    * UTC+10
    * UTC+10:30
    * UTC+11
    * UTC+12
    * UTC+13
    * UTC-02
    * UTC-03
    * UTC-04
    * UTC-05
    * UTC-06
    * UTC-07
    * UTC-08
    * UTC-09
    * UTC-10
    * UTC-11
    */
  var Timezone: js.UndefOr[String] = js.native
}

object Schedule {
  @scala.inline
  def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  @scala.inline
  implicit class ScheduleOps[Self <: Schedule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: String): Self = {
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
    def withFrequency(value: ONCE | HOURLY | DAILY | WEEKLY | MONTHLY | String): Self = {
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
    def withIsLocalTime(value: Boolean): Self = {
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
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
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

