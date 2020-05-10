package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EBookInstallSummary extends Entity {
  // Number of Devices that have failed to install this book.
  var failedDeviceCount: js.UndefOr[Double] = js.native
  // Number of Users that have 1 or more device that failed to install this book.
  var failedUserCount: js.UndefOr[Double] = js.native
  // Number of Devices that have successfully installed this book.
  var installedDeviceCount: js.UndefOr[Double] = js.native
  // Number of Users whose devices have all succeeded to install this book.
  var installedUserCount: js.UndefOr[Double] = js.native
  // Number of Devices that does not have this book installed.
  var notInstalledDeviceCount: js.UndefOr[Double] = js.native
  // Number of Users that did not install this book.
  var notInstalledUserCount: js.UndefOr[Double] = js.native
}

object EBookInstallSummary {
  @scala.inline
  def apply(): EBookInstallSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBookInstallSummary]
  }
  @scala.inline
  implicit class EBookInstallSummaryOps[Self <: EBookInstallSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFailedUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failedUserCount")(js.undefined)
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
    def withInstalledUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installedUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstalledUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installedUserCount")(js.undefined)
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
    def withNotInstalledUserCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notInstalledUserCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotInstalledUserCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notInstalledUserCount")(js.undefined)
        ret
    }
  }
  
}

