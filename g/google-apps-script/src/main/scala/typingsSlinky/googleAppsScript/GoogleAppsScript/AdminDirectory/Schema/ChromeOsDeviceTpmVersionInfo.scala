package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeOsDeviceTpmVersionInfo extends js.Object {
  var family: js.UndefOr[String] = js.native
  var firmwareVersion: js.UndefOr[String] = js.native
  var manufacturer: js.UndefOr[String] = js.native
  var specLevel: js.UndefOr[String] = js.native
  var tpmModel: js.UndefOr[String] = js.native
  var vendorSpecific: js.UndefOr[String] = js.native
}

object ChromeOsDeviceTpmVersionInfo {
  @scala.inline
  def apply(): ChromeOsDeviceTpmVersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOsDeviceTpmVersionInfo]
  }
  @scala.inline
  implicit class ChromeOsDeviceTpmVersionInfoOps[Self <: ChromeOsDeviceTpmVersionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("family")(js.undefined)
        ret
    }
    @scala.inline
    def withFirmwareVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirmwareVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firmwareVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withManufacturer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManufacturer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manufacturer")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withTpmModel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpmModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTpmModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tpmModel")(js.undefined)
        ret
    }
    @scala.inline
    def withVendorSpecific(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorSpecific")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendorSpecific: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vendorSpecific")(js.undefined)
        ret
    }
  }
  
}

