package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to verify the password.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest extends js.Object {
  /**
    * The captcha challenge.
    */
  var captchaChallenge: js.UndefOr[String] = js.native
  /**
    * Response to the captcha.
    */
  var captchaResponse: js.UndefOr[String] = js.native
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  /**
    * The email of the user.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The GITKit token of the authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The password inputed by the user.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * The GITKit token for the non-trusted IDP, which is to be confirmed by the
    * user.
    */
  var pendingIdToken: js.UndefOr[String] = js.native
  /**
    * Whether return sts id token and refresh token instead of gitkit token.
    */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
  /**
    * For multi-tenant use cases, in order to construct sign-in URL with the
    * correct IDP parameters, Firebear needs to know which Tenant to retrieve
    * IDP configs from.
    */
  var tenantId: js.UndefOr[String] = js.native
  /**
    * Tenant project number to be used for idp discovery.
    */
  var tenantProjectNumber: js.UndefOr[String] = js.native
}

object SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest {
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest]
  }
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequestOps[Self <: SchemaIdentitytoolkitRelyingpartyVerifyPasswordRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaptchaChallenge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaChallenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptchaChallenge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaChallenge")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptchaResponse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptchaResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withDelegatedProjectNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatedProjectNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegatedProjectNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegatedProjectNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingIdToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingIdToken")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnSecureToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnSecureToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnSecureToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnSecureToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(js.undefined)
        ret
    }
    @scala.inline
    def withTenantProjectNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantProjectNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenantProjectNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantProjectNumber")(js.undefined)
        ret
    }
  }
  
}

