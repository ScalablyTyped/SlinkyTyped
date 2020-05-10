package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftwareInfo extends js.Object {
  /** Android build Id string meant for displaying to the user, e.g. shamu-userdebug 6.0.1 MOB30I 2756745 dev-keys. */
  var androidBuildNumber: js.UndefOr[String] = js.native
  /** Build time. */
  var androidBuildTime: js.UndefOr[String] = js.native
  /** The user visible Android version string, e.g. 6.0.1. */
  var androidVersion: js.UndefOr[String] = js.native
  /** The system bootloader version number, e.g. 0.6.7. */
  var bootloaderVersion: js.UndefOr[String] = js.native
  /** Kernel version, e.g. 2.6.32.9-g103d848. */
  var deviceKernelVersion: js.UndefOr[String] = js.native
  /** Security patch level, e.g. 2016-05-01. */
  var securityPatchLevel: js.UndefOr[String] = js.native
}

object SoftwareInfo {
  @scala.inline
  def apply(): SoftwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareInfo]
  }
  @scala.inline
  implicit class SoftwareInfoOps[Self <: SoftwareInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidBuildNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidBuildNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidBuildNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidBuildNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidBuildTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidBuildTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidBuildTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidBuildTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBootloaderVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootloaderVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBootloaderVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bootloaderVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceKernelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceKernelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceKernelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceKernelVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityPatchLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPatchLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityPatchLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPatchLevel")(js.undefined)
        ret
    }
  }
  
}

