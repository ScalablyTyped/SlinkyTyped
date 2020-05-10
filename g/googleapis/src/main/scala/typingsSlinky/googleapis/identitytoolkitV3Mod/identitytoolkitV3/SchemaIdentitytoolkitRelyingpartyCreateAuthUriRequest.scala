package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to get the IDP authentication URL.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest extends js.Object {
  /**
    * The app ID of the mobile app, base64(CERT_SHA1):PACKAGE_NAME for Android,
    * BUNDLE_ID for iOS.
    */
  var appId: js.UndefOr[String] = js.native
  /**
    * Explicitly specify the auth flow type. Currently only support
    * &quot;CODE_FLOW&quot; type. The field is only used for Google provider.
    */
  var authFlowType: js.UndefOr[String] = js.native
  /**
    * The relying party OAuth client ID.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * The opaque value used by the client to maintain context info between the
    * authentication request and the IDP callback.
    */
  var context: js.UndefOr[String] = js.native
  /**
    * The URI to which the IDP redirects the user after the federated login
    * flow.
    */
  var continueUri: js.UndefOr[String] = js.native
  /**
    * The query parameter that client can customize by themselves in auth url.
    * The following parameters are reserved for server so that they cannot be
    * customized by clients: client_id, response_type, scope, redirect_uri,
    * state, oauth_token.
    */
  var customParameter: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The hosted domain to restrict sign-in to accounts at that domain for
    * Google Apps hosted accounts.
    */
  var hostedDomain: js.UndefOr[String] = js.native
  /**
    * The email or federated ID of the user.
    */
  var identifier: js.UndefOr[String] = js.native
  /**
    * The developer&#39;s consumer key for OpenId OAuth Extension
    */
  var oauthConsumerKey: js.UndefOr[String] = js.native
  /**
    * Additional oauth scopes, beyond the basid user profile, that the user
    * would be prompted to grant
    */
  var oauthScope: js.UndefOr[String] = js.native
  /**
    * Optional realm for OpenID protocol. The sub string
    * &quot;scheme://domain:port&quot; of the param &quot;continueUri&quot; is
    * used if this is not set.
    */
  var openidRealm: js.UndefOr[String] = js.native
  /**
    * The native app package for OTA installation.
    */
  var otaApp: js.UndefOr[String] = js.native
  /**
    * The IdP ID. For white listed IdPs it&#39;s a short domain name e.g.
    * google.com, aol.com, live.net and yahoo.com. For other OpenID IdPs
    * it&#39;s the OP identifier.
    */
  var providerId: js.UndefOr[String] = js.native
  /**
    * The session_id passed by client.
    */
  var sessionId: js.UndefOr[String] = js.native
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

object SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest {
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest]
  }
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequestOps[Self <: SchemaIdentitytoolkitRelyingpartyCreateAuthUriRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthFlowType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authFlowType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthFlowType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authFlowType")(js.undefined)
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withContinueUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinueUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continueUri")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomParameter(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customParameter")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withOauthConsumerKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthConsumerKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthConsumerKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthConsumerKey")(js.undefined)
        ret
    }
    @scala.inline
    def withOauthScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthScope")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenidRealm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openidRealm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenidRealm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openidRealm")(js.undefined)
        ret
    }
    @scala.inline
    def withOtaApp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtaApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otaApp")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(js.undefined)
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

