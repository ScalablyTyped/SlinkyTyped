package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to verify the IDP assertion.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest extends js.Object {
  /**
    * When it&#39;s true, automatically creates a new account if the user
    * doesn&#39;t exist. When it&#39;s false, allows existing user to sign in
    * normally and throws exception if the user doesn&#39;t exist.
    */
  var autoCreate: js.UndefOr[Boolean] = js.native
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  /**
    * The GITKit token of the authenticated user.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * Instance id token of the app.
    */
  var instanceId: js.UndefOr[String] = js.native
  /**
    * The GITKit token for the non-trusted IDP pending to be confirmed by the
    * user.
    */
  var pendingIdToken: js.UndefOr[String] = js.native
  /**
    * The post body if the request is a HTTP POST.
    */
  var postBody: js.UndefOr[String] = js.native
  /**
    * The URI to which the IDP redirects the user back. It may contain
    * federated login result params added by the IDP.
    */
  var requestUri: js.UndefOr[String] = js.native
  /**
    * Whether return 200 and IDP credential rather than throw exception when
    * federated id is already linked.
    */
  var returnIdpCredential: js.UndefOr[Boolean] = js.native
  /**
    * Whether to return refresh tokens.
    */
  var returnRefreshToken: js.UndefOr[Boolean] = js.native
  /**
    * Whether return sts id token and refresh token instead of gitkit token.
    */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
  /**
    * Session ID, which should match the one in previous createAuthUri request.
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

object SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest {
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest]
  }
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequestOps[Self <: SchemaIdentitytoolkitRelyingpartyVerifyAssertionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCreate")(js.undefined)
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
    def withPostBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postBody")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestUri")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnIdpCredential(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnIdpCredential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnIdpCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnIdpCredential")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnRefreshToken(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnRefreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnRefreshToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnRefreshToken")(js.undefined)
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

