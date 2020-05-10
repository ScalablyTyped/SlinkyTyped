package typingsSlinky.instagramPrivateApi.accountRepositoryLoginErrorResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRepositoryLoginErrorResponse extends js.Object {
  var buttons: js.Array[AccountRepositoryLoginBadPasswordResponseButtonsItem] = js.native
  var error_title: String = js.native
  var error_type: String = js.native
  var invalid_credentials: Boolean = js.native
  var message: String = js.native
  var phone_verification_settings: AccountRepositoryLoginErrorResponsePhoneVerificationSettings = js.native
  var status: String = js.native
  var two_factor_info: AccountRepositoryLoginErrorResponseTwoFactorInfo = js.native
  var two_factor_required: Boolean = js.native
}

object AccountRepositoryLoginErrorResponse {
  @scala.inline
  def apply(
    buttons: js.Array[AccountRepositoryLoginBadPasswordResponseButtonsItem],
    error_title: String,
    error_type: String,
    invalid_credentials: Boolean,
    message: String,
    phone_verification_settings: AccountRepositoryLoginErrorResponsePhoneVerificationSettings,
    status: String,
    two_factor_info: AccountRepositoryLoginErrorResponseTwoFactorInfo,
    two_factor_required: Boolean
  ): AccountRepositoryLoginErrorResponse = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], error_title = error_title.asInstanceOf[js.Any], error_type = error_type.asInstanceOf[js.Any], invalid_credentials = invalid_credentials.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], phone_verification_settings = phone_verification_settings.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], two_factor_info = two_factor_info.asInstanceOf[js.Any], two_factor_required = two_factor_required.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRepositoryLoginErrorResponse]
  }
  @scala.inline
  implicit class AccountRepositoryLoginErrorResponseOps[Self <: AccountRepositoryLoginErrorResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtons(value: js.Array[AccountRepositoryLoginBadPasswordResponseButtonsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError_title(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalid_credentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalid_credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhone_verification_settings(value: AccountRepositoryLoginErrorResponsePhoneVerificationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phone_verification_settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwo_factor_info(value: AccountRepositoryLoginErrorResponseTwoFactorInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two_factor_info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwo_factor_required(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("two_factor_required")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

