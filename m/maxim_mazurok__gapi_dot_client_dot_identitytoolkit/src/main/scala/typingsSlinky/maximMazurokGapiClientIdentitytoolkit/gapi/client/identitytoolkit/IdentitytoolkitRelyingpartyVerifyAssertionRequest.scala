package typingsSlinky.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentitytoolkitRelyingpartyVerifyAssertionRequest extends StObject {
  
  /**
    * When it's true, automatically creates a new account if the user doesn't exist. When it's false, allows existing user to sign in normally and throws exception if the user doesn't
    * exist.
    */
  var autoCreate: js.UndefOr[Boolean] = js.native
  
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  
  /** The GITKit token of the authenticated user. */
  var idToken: js.UndefOr[String] = js.native
  
  /** Instance id token of the app. */
  var instanceId: js.UndefOr[String] = js.native
  
  /** The GITKit token for the non-trusted IDP pending to be confirmed by the user. */
  var pendingIdToken: js.UndefOr[String] = js.native
  
  /** The post body if the request is a HTTP POST. */
  var postBody: js.UndefOr[String] = js.native
  
  /** The URI to which the IDP redirects the user back. It may contain federated login result params added by the IDP. */
  var requestUri: js.UndefOr[String] = js.native
  
  /** Whether return 200 and IDP credential rather than throw exception when federated id is already linked. */
  var returnIdpCredential: js.UndefOr[Boolean] = js.native
  
  /** Whether to return refresh tokens. */
  var returnRefreshToken: js.UndefOr[Boolean] = js.native
  
  /** Whether return sts id token and refresh token instead of gitkit token. */
  var returnSecureToken: js.UndefOr[Boolean] = js.native
  
  /** Session ID, which should match the one in previous createAuthUri request. */
  var sessionId: js.UndefOr[String] = js.native
  
  /** For multi-tenant use cases, in order to construct sign-in URL with the correct IDP parameters, Firebear needs to know which Tenant to retrieve IDP configs from. */
  var tenantId: js.UndefOr[String] = js.native
  
  /** Tenant project number to be used for idp discovery. */
  var tenantProjectNumber: js.UndefOr[String] = js.native
}
object IdentitytoolkitRelyingpartyVerifyAssertionRequest {
  
  @scala.inline
  def apply(): IdentitytoolkitRelyingpartyVerifyAssertionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyVerifyAssertionRequest]
  }
  
  @scala.inline
  implicit class IdentitytoolkitRelyingpartyVerifyAssertionRequestMutableBuilder[Self <: IdentitytoolkitRelyingpartyVerifyAssertionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoCreate(value: Boolean): Self = StObject.set(x, "autoCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoCreateUndefined: Self = StObject.set(x, "autoCreate", js.undefined)
    
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setPendingIdToken(value: String): Self = StObject.set(x, "pendingIdToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingIdTokenUndefined: Self = StObject.set(x, "pendingIdToken", js.undefined)
    
    @scala.inline
    def setPostBody(value: String): Self = StObject.set(x, "postBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostBodyUndefined: Self = StObject.set(x, "postBody", js.undefined)
    
    @scala.inline
    def setRequestUri(value: String): Self = StObject.set(x, "requestUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUriUndefined: Self = StObject.set(x, "requestUri", js.undefined)
    
    @scala.inline
    def setReturnIdpCredential(value: Boolean): Self = StObject.set(x, "returnIdpCredential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnIdpCredentialUndefined: Self = StObject.set(x, "returnIdpCredential", js.undefined)
    
    @scala.inline
    def setReturnRefreshToken(value: Boolean): Self = StObject.set(x, "returnRefreshToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnRefreshTokenUndefined: Self = StObject.set(x, "returnRefreshToken", js.undefined)
    
    @scala.inline
    def setReturnSecureToken(value: Boolean): Self = StObject.set(x, "returnSecureToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnSecureTokenUndefined: Self = StObject.set(x, "returnSecureToken", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    @scala.inline
    def setTenantProjectNumber(value: String): Self = StObject.set(x, "tenantProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantProjectNumberUndefined: Self = StObject.set(x, "tenantProjectNumber", js.undefined)
  }
}
