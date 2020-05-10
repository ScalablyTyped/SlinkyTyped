package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of getting the project configuration.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse extends js.Object {
  /**
    * Whether to allow password user sign in or sign up.
    */
  var allowPasswordUser: js.UndefOr[Boolean] = js.native
  /**
    * Browser API key, needed when making http request to Apiary.
    */
  var apiKey: js.UndefOr[String] = js.native
  /**
    * Authorized domains.
    */
  var authorizedDomains: js.UndefOr[js.Array[String]] = js.native
  /**
    * Change email template.
    */
  var changeEmailTemplate: js.UndefOr[SchemaEmailTemplate] = js.native
  var dynamicLinksDomain: js.UndefOr[String] = js.native
  /**
    * Whether anonymous user is enabled.
    */
  var enableAnonymousUser: js.UndefOr[Boolean] = js.native
  /**
    * OAuth2 provider configuration.
    */
  var idpConfig: js.UndefOr[js.Array[SchemaIdpConfig]] = js.native
  /**
    * Legacy reset password email template.
    */
  var legacyResetPasswordTemplate: js.UndefOr[SchemaEmailTemplate] = js.native
  /**
    * Project ID of the relying party.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Reset password email template.
    */
  var resetPasswordTemplate: js.UndefOr[SchemaEmailTemplate] = js.native
  /**
    * Whether to use email sending provided by Firebear.
    */
  var useEmailSending: js.UndefOr[Boolean] = js.native
  /**
    * Verify email template.
    */
  var verifyEmailTemplate: js.UndefOr[SchemaEmailTemplate] = js.native
}

object SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse {
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse]
  }
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponseOps[Self <: SchemaIdentitytoolkitRelyingpartyGetProjectConfigResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPasswordUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPasswordUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPasswordUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPasswordUser")(js.undefined)
        ret
    }
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizedDomains(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedDomains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizedDomains: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizedDomains")(js.undefined)
        ret
    }
    @scala.inline
    def withChangeEmailTemplate(value: SchemaEmailTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeEmailTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeEmailTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeEmailTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicLinksDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicLinksDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicLinksDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicLinksDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableAnonymousUser(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnonymousUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableAnonymousUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableAnonymousUser")(js.undefined)
        ret
    }
    @scala.inline
    def withIdpConfig(value: js.Array[SchemaIdpConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idpConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdpConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idpConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLegacyResetPasswordTemplate(value: SchemaEmailTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyResetPasswordTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegacyResetPasswordTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legacyResetPasswordTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
    @scala.inline
    def withResetPasswordTemplate(value: SchemaEmailTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetPasswordTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetPasswordTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetPasswordTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEmailSending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEmailSending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEmailSending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEmailSending")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifyEmailTemplate(value: SchemaEmailTemplate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyEmailTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifyEmailTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyEmailTemplate")(js.undefined)
        ret
    }
  }
  
}

