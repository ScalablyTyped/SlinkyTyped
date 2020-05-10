package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMaintenanceStartTimeInput extends js.Object {
  /**
    * The day of the month component of the maintenance start time represented as an ordinal number from 1 to 28, where 1 represents the first day of the month and 28 represents the last day of the month.  This value is only available for tape and volume gateways. 
    */
  var DayOfMonth: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.DayOfMonth] = js.native
  /**
    * The day of the week component of the maintenance start time week represented as an ordinal number from 0 to 6, where 0 represents Sunday and 6 Saturday.
    */
  var DayOfWeek: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.DayOfWeek] = js.native
  var GatewayARN: typingsSlinky.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * The hour component of the maintenance start time represented as hh, where hh is the hour (00 to 23). The hour of the day is in the time zone of the gateway.
    */
  var HourOfDay: typingsSlinky.awsSdk.storagegatewayMod.HourOfDay = js.native
  /**
    * The minute component of the maintenance start time represented as mm, where mm is the minute (00 to 59). The minute of the hour is in the time zone of the gateway.
    */
  var MinuteOfHour: typingsSlinky.awsSdk.storagegatewayMod.MinuteOfHour = js.native
}

object UpdateMaintenanceStartTimeInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, HourOfDay: HourOfDay, MinuteOfHour: MinuteOfHour): UpdateMaintenanceStartTimeInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any], HourOfDay = HourOfDay.asInstanceOf[js.Any], MinuteOfHour = MinuteOfHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMaintenanceStartTimeInput]
  }
  @scala.inline
  implicit class UpdateMaintenanceStartTimeInputOps[Self <: UpdateMaintenanceStartTimeInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHourOfDay(value: HourOfDay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HourOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinuteOfHour(value: MinuteOfHour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinuteOfHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDayOfMonth(value: DayOfMonth): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayOfMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayOfMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withDayOfWeek(value: DayOfWeek): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DayOfWeek")(js.undefined)
        ret
    }
  }
  
}

