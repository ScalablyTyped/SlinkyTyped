package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsUpdateActiveHoursInstall extends WindowsUpdateInstallScheduleType {
  // Active Hours End
  var activeHoursEnd: js.UndefOr[String] = js.native
  // Active Hours Start
  var activeHoursStart: js.UndefOr[String] = js.native
}

object WindowsUpdateActiveHoursInstall {
  @scala.inline
  def apply(): WindowsUpdateActiveHoursInstall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateActiveHoursInstall]
  }
  @scala.inline
  implicit class WindowsUpdateActiveHoursInstallOps[Self <: WindowsUpdateActiveHoursInstall] (val x: Self) extends AnyVal {
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
  }
  
}

