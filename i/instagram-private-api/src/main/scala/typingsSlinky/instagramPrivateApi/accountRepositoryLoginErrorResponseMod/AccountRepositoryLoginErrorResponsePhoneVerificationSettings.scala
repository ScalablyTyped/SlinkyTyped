package typingsSlinky.instagramPrivateApi.accountRepositoryLoginErrorResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRepositoryLoginErrorResponsePhoneVerificationSettings extends js.Object {
  var max_sms_count: Double = js.native
  var resend_sms_delay_sec: Double = js.native
  var robocall_after_max_sms: Boolean = js.native
  var robocall_count_down_time_sec: Double = js.native
}

object AccountRepositoryLoginErrorResponsePhoneVerificationSettings {
  @scala.inline
  def apply(
    max_sms_count: Double,
    resend_sms_delay_sec: Double,
    robocall_after_max_sms: Boolean,
    robocall_count_down_time_sec: Double
  ): AccountRepositoryLoginErrorResponsePhoneVerificationSettings = {
    val __obj = js.Dynamic.literal(max_sms_count = max_sms_count.asInstanceOf[js.Any], resend_sms_delay_sec = resend_sms_delay_sec.asInstanceOf[js.Any], robocall_after_max_sms = robocall_after_max_sms.asInstanceOf[js.Any], robocall_count_down_time_sec = robocall_count_down_time_sec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRepositoryLoginErrorResponsePhoneVerificationSettings]
  }
  @scala.inline
  implicit class AccountRepositoryLoginErrorResponsePhoneVerificationSettingsOps[Self <: AccountRepositoryLoginErrorResponsePhoneVerificationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax_sms_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max_sms_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResend_sms_delay_sec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resend_sms_delay_sec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRobocall_after_max_sms(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robocall_after_max_sms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRobocall_count_down_time_sec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("robocall_count_down_time_sec")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

