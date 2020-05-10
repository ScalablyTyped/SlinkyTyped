package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsUpdateScheduledInstall extends WindowsUpdateInstallScheduleType {
  /**
    * Scheduled Install Day in week. Possible values are: userDefined, everyday, sunday, monday, tuesday, wednesday,
    * thursday, friday, saturday.
    */
  var scheduledInstallDay: js.UndefOr[WeeklySchedule] = js.native
  // Scheduled Install Time during day
  var scheduledInstallTime: js.UndefOr[String] = js.native
}

object WindowsUpdateScheduledInstall {
  @scala.inline
  def apply(): WindowsUpdateScheduledInstall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateScheduledInstall]
  }
  @scala.inline
  implicit class WindowsUpdateScheduledInstallOps[Self <: WindowsUpdateScheduledInstall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScheduledInstallDay(value: WeeklySchedule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledInstallDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledInstallDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledInstallDay")(js.undefined)
        ret
    }
    @scala.inline
    def withScheduledInstallTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledInstallTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScheduledInstallTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scheduledInstallTime")(js.undefined)
        ret
    }
  }
  
}

