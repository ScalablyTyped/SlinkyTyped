package typingsSlinky.googleapis.androidmanagementV1Mod.androidmanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about security related device settings on device.
  */
@js.native
trait SchemaDeviceSettings extends js.Object {
  /**
    * Whether ADB (https://developer.android.com/studio/command-line/adb.html)
    * is enabled on the device.
    */
  var adbEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether developer mode is enabled on the device.
    */
  var developmentSettingsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Encryption status from DevicePolicyManager.
    */
  var encryptionStatus: js.UndefOr[String] = js.native
  /**
    * Whether the device is secured with PIN/password.
    */
  var isDeviceSecure: js.UndefOr[Boolean] = js.native
  /**
    * Whether the storage encryption is enabled.
    */
  var isEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Whether installing apps from unknown sources is enabled.
    */
  var unknownSourcesEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether Verify Apps (Google Play Protect
    * (https://support.google.com/googleplay/answer/2812853)) is enabled on the
    * device.
    */
  var verifyAppsEnabled: js.UndefOr[Boolean] = js.native
}

object SchemaDeviceSettings {
  @scala.inline
  def apply(): SchemaDeviceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceSettings]
  }
  @scala.inline
  implicit class SchemaDeviceSettingsOps[Self <: SchemaDeviceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdbEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adbEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdbEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adbEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDevelopmentSettingsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developmentSettingsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevelopmentSettingsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("developmentSettingsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDeviceSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeviceSecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDeviceSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeviceSecure")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withUnknownSourcesEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownSourcesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnknownSourcesEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unknownSourcesEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyAppsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyAppsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyAppsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyAppsEnabled")(js.undefined)
        ret
    }
  }
  
}

