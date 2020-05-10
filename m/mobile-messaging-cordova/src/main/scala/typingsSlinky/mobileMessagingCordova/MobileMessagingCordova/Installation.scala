package typingsSlinky.mobileMessagingCordova.MobileMessagingCordova

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Installation extends js.Object {
  var appVersion: js.UndefOr[String] = js.native
  var applicationUserId: js.UndefOr[String] = js.native
  var customAttributes: js.UndefOr[Record[String, String]] = js.native
  var deviceManufacturer: js.UndefOr[String] = js.native
  var deviceModel: js.UndefOr[String] = js.native
  var deviceName: js.UndefOr[String] = js.native
  var deviceSecure: js.UndefOr[Boolean] = js.native
  var deviceTimezoneId: js.UndefOr[String] = js.native
  var geoEnabled: js.UndefOr[Boolean] = js.native
  var isPrimaryDevice: js.UndefOr[Boolean] = js.native
  var isPushRegistrationEnabled: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var notificationsEnabled: js.UndefOr[Boolean] = js.native
  var os: js.UndefOr[OS] = js.native
  var osVersion: String = js.native
  var sdkVersion: js.UndefOr[String] = js.native
}

object Installation {
  @scala.inline
  def apply(osVersion: String): Installation = {
    val __obj = js.Dynamic.literal(osVersion = osVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Installation]
  }
  @scala.inline
  implicit class InstallationOps[Self <: Installation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOsVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("osVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withApplicationUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomAttributes(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceManufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceManufacturer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceManufacturer")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceModel")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceSecure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceSecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceSecure")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceTimezoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceTimezoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceTimezoneId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceTimezoneId")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPrimaryDevice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimaryDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPrimaryDevice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPrimaryDevice")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPushRegistrationEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPushRegistrationEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPushRegistrationEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPushRegistrationEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withOs(value: OS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("os")(js.undefined)
        ret
    }
    @scala.inline
    def withSdkVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSdkVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkVersion")(js.undefined)
        ret
    }
  }
  
}

