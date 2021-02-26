package typingsSlinky.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdentityPoolRolesResponse extends StObject {
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  
  /**
    * <p>How users for a specific identity provider are to mapped to roles. This is a
    *             String-to-<a>RoleMapping</a> object map. The string identifies the identity
    *          provider, for example, "graph.facebook.com" or
    *          "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".</p>
    */
  var RoleMappings: js.UndefOr[StringDictionary[RoleMapping]] = js.native
  
  /**
    * <p>The map of roles associated with this pool. Currently only authenticated and
    *          unauthenticated roles are supported.</p>
    */
  var Roles: js.UndefOr[StringDictionary[String]] = js.native
}
object GetIdentityPoolRolesResponse {
  
  @scala.inline
  def apply(): GetIdentityPoolRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdentityPoolRolesResponse]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetIdentityPoolRolesResponse.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: GetIdentityPoolRolesResponse): js.Any = js.native
  
  @scala.inline
  implicit class GetIdentityPoolRolesResponseMutableBuilder[Self <: GetIdentityPoolRolesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    @scala.inline
    def setRoleMappings(value: StringDictionary[RoleMapping]): Self = StObject.set(x, "RoleMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleMappingsUndefined: Self = StObject.set(x, "RoleMappings", js.undefined)
    
    @scala.inline
    def setRoles(value: StringDictionary[String]): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesUndefined: Self = StObject.set(x, "Roles", js.undefined)
  }
}
