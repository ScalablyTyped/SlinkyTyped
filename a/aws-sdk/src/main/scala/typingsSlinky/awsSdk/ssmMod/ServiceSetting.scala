package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceSetting extends js.Object {
  /**
    * The ARN of the service setting.
    */
  var ARN: js.UndefOr[String] = js.native
  /**
    * The last time the service setting was modified.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The ARN of the last modified user. This field is populated only if the setting value was overwritten.
    */
  var LastModifiedUser: js.UndefOr[String] = js.native
  /**
    * The ID of the service setting.
    */
  var SettingId: js.UndefOr[ServiceSettingId] = js.native
  /**
    * The value of the service setting.
    */
  var SettingValue: js.UndefOr[ServiceSettingValue] = js.native
  /**
    * The status of the service setting. The value can be Default, Customized or PendingUpdate.   Default: The current setting uses a default value provisioned by the AWS service team.   Customized: The current setting use a custom value specified by the customer.   PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending approval.  
    */
  var Status: js.UndefOr[String] = js.native
}

object ServiceSetting {
  @scala.inline
  def apply(): ServiceSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSetting]
  }
  @scala.inline
  implicit class ServiceSettingOps[Self <: ServiceSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARN(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARN")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedUser")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingId(value: ServiceSettingId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingId")(js.undefined)
        ret
    }
    @scala.inline
    def withSettingValue(value: ServiceSettingValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettingValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SettingValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

