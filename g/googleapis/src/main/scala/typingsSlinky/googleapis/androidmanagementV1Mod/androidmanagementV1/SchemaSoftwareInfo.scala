package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about device software.
  */
@js.native
trait SchemaSoftwareInfo extends js.Object {
  /**
    * Android build ID string meant for displaying to the user. For example,
    * shamu-userdebug 6.0.1 MOB30I 2756745 dev-keys.
    */
  var androidBuildNumber: js.UndefOr[String] = js.native
  /**
    * Build time.
    */
  var androidBuildTime: js.UndefOr[String] = js.native
  /**
    * The Android Device Policy app version code.
    */
  var androidDevicePolicyVersionCode: js.UndefOr[Double] = js.native
  /**
    * The Android Device Policy app version as displayed to the user.
    */
  var androidDevicePolicyVersionName: js.UndefOr[String] = js.native
  /**
    * The user-visible Android version string. For example, 6.0.1.
    */
  var androidVersion: js.UndefOr[String] = js.native
  /**
    * The system bootloader version number, e.g. 0.6.7.
    */
  var bootloaderVersion: js.UndefOr[String] = js.native
  /**
    * SHA-256 hash of android.content.pm.Signature
    * (https://developer.android.com/reference/android/content/pm/Signature.html)
    * associated with the system package, which can be used to verify that the
    * system build hasn&#39;t been modified.
    */
  var deviceBuildSignature: js.UndefOr[String] = js.native
  /**
    * Kernel version, for example, 2.6.32.9-g103d848.
    */
  var deviceKernelVersion: js.UndefOr[String] = js.native
  /**
    * An IETF BCP 47 language code for the primary locale on the device.
    */
  var primaryLanguageCode: js.UndefOr[String] = js.native
  /**
    * Security patch level, e.g. 2016-05-01.
    */
  var securityPatchLevel: js.UndefOr[String] = js.native
}

object SchemaSoftwareInfo {
  @scala.inline
  def apply(): SchemaSoftwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareInfo]
  }
  @scala.inline
  implicit class SchemaSoftwareInfoOps[Self <: SchemaSoftwareInfo] (val x: Self) extends AnyVal {
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
    def withAndroidDevicePolicyVersionCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDevicePolicyVersionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidDevicePolicyVersionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDevicePolicyVersionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withAndroidDevicePolicyVersionName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDevicePolicyVersionName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidDevicePolicyVersionName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDevicePolicyVersionName")(js.undefined)
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
    def withDeviceBuildSignature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceBuildSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceBuildSignature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceBuildSignature")(js.undefined)
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
    def withPrimaryLanguageCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryLanguageCode")(js.undefined)
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

