package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserInstallStateSummary extends Entity {
  // The install state of the eBook.
  var deviceStates: js.UndefOr[js.Array[DeviceInstallState]] = js.native
  // Failed Device Count.
  var failedDeviceCount: js.UndefOr[Double] = js.native
  // Installed Device Count.
  var installedDeviceCount: js.UndefOr[Double] = js.native
  // Not installed device count.
  var notInstalledDeviceCount: js.UndefOr[Double] = js.native
  // User name.
  var userName: js.UndefOr[String] = js.native
}

object UserInstallStateSummary {
  @scala.inline
  def apply(): UserInstallStateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserInstallStateSummary]
  }
  @scala.inline
  implicit class UserInstallStateSummaryOps[Self <: UserInstallStateSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceStates(value: js.Array[DeviceInstallState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceStates")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withInstalledDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installedDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstalledDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installedDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withNotInstalledDeviceCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notInstalledDeviceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotInstalledDeviceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notInstalledDeviceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userName")(js.undefined)
        ret
    }
  }
  
}

