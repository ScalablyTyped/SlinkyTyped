package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosMobileAppConfiguration extends ManagedDeviceMobileAppConfiguration {
  // mdm app configuration Base64 binary.
  var encodedSettingXml: js.UndefOr[Double] = js.native
  // app configuration setting items.
  var settings: js.UndefOr[js.Array[AppConfigurationSettingItem]] = js.native
}

object IosMobileAppConfiguration {
  @scala.inline
  def apply(): IosMobileAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosMobileAppConfiguration]
  }
  @scala.inline
  implicit class IosMobileAppConfigurationOps[Self <: IosMobileAppConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEncodedSettingXml(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedSettingXml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncodedSettingXml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodedSettingXml")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: js.Array[AppConfigurationSettingItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(js.undefined)
        ret
    }
  }
  
}

