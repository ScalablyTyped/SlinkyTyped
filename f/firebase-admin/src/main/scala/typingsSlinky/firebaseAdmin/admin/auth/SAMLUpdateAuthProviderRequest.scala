package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request interface for updating a SAML Auth provider. This is used
  * when updating a SAML provider's configuration via
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#updateProviderConfig `updateProviderConfig()`}.
  */
@js.native
trait SAMLUpdateAuthProviderRequest extends UpdateAuthProviderRequest {
  /**
    * The SAML provider's callback URL. If not provided, the existing
    * configuration's value is not modified.
    */
  var callbackURL: js.UndefOr[String] = js.native
  /**
    * The SAML provider's updated display name. If not provided, the existing
    * configuration's value is not modified.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Whether the SAML provider is enabled or not. If not provided, the existing
    * configuration's setting is not modified.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The SAML provider's updated IdP entity ID. If not provided, the existing
    * configuration's value is not modified.
    */
  var idpEntityId: js.UndefOr[String] = js.native
  /**
    * The SAML provider's updated RP entity ID. If not provided, the existing
    * configuration's value is not modified.
    */
  var rpEntityId: js.UndefOr[String] = js.native
  /**
    * The SAML provider's updated SSO URL. If not provided, the existing
    * configuration's value is not modified.
    */
  var ssoURL: js.UndefOr[String] = js.native
  /**
    * The SAML provider's updated list of X.509 certificated. If not provided, the
    * existing configuration list is not modified.
    */
  var x509Certificates: js.UndefOr[js.Array[String]] = js.native
}

object SAMLUpdateAuthProviderRequest {
  @scala.inline
  def apply(): SAMLUpdateAuthProviderRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAMLUpdateAuthProviderRequest]
  }
  @scala.inline
  implicit class SAMLUpdateAuthProviderRequestOps[Self <: SAMLUpdateAuthProviderRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallbackURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackURL")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIdpEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idpEntityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdpEntityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idpEntityId")(js.undefined)
        ret
    }
    @scala.inline
    def withRpEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpEntityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRpEntityId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpEntityId")(js.undefined)
        ret
    }
    @scala.inline
    def withSsoURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssoURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSsoURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssoURL")(js.undefined)
        ret
    }
    @scala.inline
    def withX509Certificates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x509Certificates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX509Certificates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x509Certificates")(js.undefined)
        ret
    }
  }
  
}

