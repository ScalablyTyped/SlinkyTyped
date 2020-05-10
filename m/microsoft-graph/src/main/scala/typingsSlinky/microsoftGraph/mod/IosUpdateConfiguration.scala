package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosUpdateConfiguration extends DeviceConfiguration {
  // Active Hours End (active hours mean the time window when updates install should not happen)
  var activeHoursEnd: js.UndefOr[String] = js.native
  // Active Hours Start (active hours mean the time window when updates install should not happen)
  var activeHoursStart: js.UndefOr[String] = js.native
  // Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.
  var scheduledInstallDays: js.UndefOr[js.Array[DayOfWeek]] = js.native
  // UTC Time Offset indicated in minutes
  var utcTimeOffsetInMinutes: js.UndefOr[Double] = js.native
}

object IosUpdateConfiguration {
  @scala.inline
  def apply(): IosUpdateConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosUpdateConfiguration]
  }
  @scala.inline
  implicit class IosUpdateConfigurationOps[Self <: IosUpdateConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveHoursEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeHoursEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveHoursEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeHoursEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withActiveHoursStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeHoursStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveHoursStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeHoursStart")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledInstallDays(value: js.Array[DayOfWeek]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledInstallDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledInstallDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledInstallDays")(js.undefined)
        ret
    }
    @scala.inline
    def withUtcTimeOffsetInMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcTimeOffsetInMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtcTimeOffsetInMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utcTimeOffsetInMinutes")(js.undefined)
        ret
    }
  }
  
}

