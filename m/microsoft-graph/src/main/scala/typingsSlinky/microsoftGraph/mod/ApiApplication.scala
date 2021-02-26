package typingsSlinky.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiApplication extends StObject {
  
  // When true, allows an application to use claims mapping without specifying a custom signing key.
  var acceptMappedClaims: js.UndefOr[NullableOption[Boolean]] = js.native
  
  /**
    * Used for bundling consent if you have a solution that contains two parts: a client app and a custom web API app. If you
    * set the appID of the client app to this value, the user only consents once to the client app. Azure AD knows that
    * consenting to the client means implicitly consenting to the web API and automatically provisions service principals for
    * both APIs at the same time. Both the client and the web API app must be registered in the same tenant.
    */
  var knownClientApplications: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  /**
    * The definition of the delegated permissions exposed by the web API represented by this application registration. These
    * delegated permissions may be requested by a client application, and may be granted by users or administrators during
    * consent. Delegated permissions are sometimes referred to as OAuth 2.0 scopes.
    */
  var oauth2PermissionScopes: js.UndefOr[js.Array[PermissionScope]] = js.native
  
  /**
    * Lists the client applications that are pre-authorized with the specified delegated permissions to access this
    * application's APIs. Users are not required to consent to any pre-authorized application (for the permissions
    * specified). However, any additional permissions not listed in preAuthorizedApplications (requested through incremental
    * consent for example) will require user consent.
    */
  var preAuthorizedApplications: js.UndefOr[NullableOption[js.Array[PreAuthorizedApplication]]] = js.native
  
  /**
    * Specifies the access token version expected by this resource. This changes the version and format of the JWT produced
    * independent of the endpoint or client used to request the access token. The endpoint used, v1.0 or v2.0, is chosen by
    * the client and only impacts the version of id_tokens. Resources need to explicitly configure
    * requestedAccessTokenVersion to indicate the supported access token format. Possible values for
    * requestedAccessTokenVersion are 1, 2, or null. If the value is null, this defaults to 1, which corresponds to the v1.0
    * endpoint. If signInAudience on the application is configured as AzureADandPersonalMicrosoftAccount, the value for this
    * property must be 2
    */
  var requestedAccessTokenVersion: js.UndefOr[NullableOption[Double]] = js.native
}
object ApiApplication {
  
  @scala.inline
  def apply(): ApiApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiApplication]
  }
  
  @scala.inline
  implicit class ApiApplicationMutableBuilder[Self <: ApiApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptMappedClaims(value: NullableOption[Boolean]): Self = StObject.set(x, "acceptMappedClaims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptMappedClaimsNull: Self = StObject.set(x, "acceptMappedClaims", null)
    
    @scala.inline
    def setAcceptMappedClaimsUndefined: Self = StObject.set(x, "acceptMappedClaims", js.undefined)
    
    @scala.inline
    def setKnownClientApplications(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "knownClientApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnownClientApplicationsNull: Self = StObject.set(x, "knownClientApplications", null)
    
    @scala.inline
    def setKnownClientApplicationsUndefined: Self = StObject.set(x, "knownClientApplications", js.undefined)
    
    @scala.inline
    def setKnownClientApplicationsVarargs(value: String*): Self = StObject.set(x, "knownClientApplications", js.Array(value :_*))
    
    @scala.inline
    def setOauth2PermissionScopes(value: js.Array[PermissionScope]): Self = StObject.set(x, "oauth2PermissionScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2PermissionScopesUndefined: Self = StObject.set(x, "oauth2PermissionScopes", js.undefined)
    
    @scala.inline
    def setOauth2PermissionScopesVarargs(value: PermissionScope*): Self = StObject.set(x, "oauth2PermissionScopes", js.Array(value :_*))
    
    @scala.inline
    def setPreAuthorizedApplications(value: NullableOption[js.Array[PreAuthorizedApplication]]): Self = StObject.set(x, "preAuthorizedApplications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreAuthorizedApplicationsNull: Self = StObject.set(x, "preAuthorizedApplications", null)
    
    @scala.inline
    def setPreAuthorizedApplicationsUndefined: Self = StObject.set(x, "preAuthorizedApplications", js.undefined)
    
    @scala.inline
    def setPreAuthorizedApplicationsVarargs(value: PreAuthorizedApplication*): Self = StObject.set(x, "preAuthorizedApplications", js.Array(value :_*))
    
    @scala.inline
    def setRequestedAccessTokenVersion(value: NullableOption[Double]): Self = StObject.set(x, "requestedAccessTokenVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedAccessTokenVersionNull: Self = StObject.set(x, "requestedAccessTokenVersion", null)
    
    @scala.inline
    def setRequestedAccessTokenVersionUndefined: Self = StObject.set(x, "requestedAccessTokenVersion", js.undefined)
  }
}
