package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The
  * [SAML](http://docs.oasis-open.org/security/saml/Post2.0/sstc-saml-tech-overview-2.0.html)
  * Auth provider configuration interface. A SAML provider can be created via
  * {@link https://firebase.google.com/docs/reference/admin/node/admin.auth.Auth#createProviderConfig `createProviderConfig()`}.
  */
@js.native
trait SAMLAuthProviderConfig extends AuthProviderConfig {
  /**
    * This is fixed and must always be the same as the OAuth redirect URL
    * provisioned by Firebase Auth,
    * `https://project-id.firebaseapp.com/__/auth/handler` unless a custom
    * `authDomain` is used.
    * The callback URL should also be provided to the SAML IdP during
    * configuration.
    */
  var callbackURL: js.UndefOr[String] = js.native
  /**
    * The SAML IdP entity identifier.
    */
  var idpEntityId: String = js.native
  /**
    * The SAML relying party (service provider) entity ID.
    * This is defined by the developer but needs to be provided to the SAML IdP.
    */
  var rpEntityId: String = js.native
  /**
    * The SAML IdP SSO URL. This must be a valid URL.
    */
  var ssoURL: String = js.native
  /**
    * The list of SAML IdP X.509 certificates issued by CA for this provider.
    * Multiple certificates are accepted to prevent outages during
    * IdP key rotation (for example ADFS rotates every 10 days). When the Auth
    * server receives a SAML response, it will match the SAML response with the
    * certificate on record. Otherwise the response is rejected.
    * Developers are expected to manage the certificate updates as keys are
    * rotated.
    */
  var x509Certificates: js.Array[String] = js.native
}

object SAMLAuthProviderConfig {
  @scala.inline
  def apply(
    displayName: String,
    enabled: Boolean,
    idpEntityId: String,
    providerId: String,
    rpEntityId: String,
    ssoURL: String,
    x509Certificates: js.Array[String]
  ): SAMLAuthProviderConfig = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], idpEntityId = idpEntityId.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], rpEntityId = rpEntityId.asInstanceOf[js.Any], ssoURL = ssoURL.asInstanceOf[js.Any], x509Certificates = x509Certificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAMLAuthProviderConfig]
  }
  @scala.inline
  implicit class SAMLAuthProviderConfigOps[Self <: SAMLAuthProviderConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdpEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idpEntityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRpEntityId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rpEntityId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSsoURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssoURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX509Certificates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x509Certificates")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

