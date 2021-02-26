package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2PermissionGrant extends Entity {
  
  /**
    * The id of the client service principal for the application which is authorized to act on behalf of a signed-in user
    * when accessing an API. Required. Supports $filter (eq only).
    */
  var clientId: js.UndefOr[String] = js.native
  
  /**
    * Indicates if authorization is granted for the client application to impersonate all users or only a specific user.
    * AllPrincipals indicates authorization to impersonate all users. Principal indicates authorization to impersonate a
    * specific user. Consent on behalf of all users can be granted by an administrator. Non-admin users may be authorized to
    * consent on behalf of themselves in some cases, for some delegated permissions. Required. Supports $filter (eq only).
    */
  var consentType: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The id of the user on behalf of whom the client is authorized to access the resource, when consentType is Principal. If
    * consentType is AllPrincipals this value is null. Required when consentType is Principal.
    */
  var principalId: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * The id of the resource service principal to which access is authorized. This identifies the API which the client is
    * authorized to attempt to call on behalf of a signed-in user.
    */
  var resourceId: js.UndefOr[String] = js.native
  
  /**
    * A space-separated list of the claim values for delegated permissions which should be included in access tokens for the
    * resource application (the API). For example, openid User.Read GroupMember.Read.All. Each claim value should match the
    * value field of one of the delegated permissions defined by the API, listed in the publishedPermissionScopes property of
    * the resource service principal.
    */
  var scope: js.UndefOr[NullableOption[String]] = js.native
}
object OAuth2PermissionGrant {
  
  @scala.inline
  def apply(): OAuth2PermissionGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuth2PermissionGrant]
  }
  
  @scala.inline
  implicit class OAuth2PermissionGrantMutableBuilder[Self <: OAuth2PermissionGrant] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setConsentType(value: NullableOption[String]): Self = StObject.set(x, "consentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsentTypeNull: Self = StObject.set(x, "consentType", null)
    
    @scala.inline
    def setConsentTypeUndefined: Self = StObject.set(x, "consentType", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: NullableOption[String]): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalIdNull: Self = StObject.set(x, "principalId", null)
    
    @scala.inline
    def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    @scala.inline
    def setScope(value: NullableOption[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeNull: Self = StObject.set(x, "scope", null)
    
    @scala.inline
    def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
