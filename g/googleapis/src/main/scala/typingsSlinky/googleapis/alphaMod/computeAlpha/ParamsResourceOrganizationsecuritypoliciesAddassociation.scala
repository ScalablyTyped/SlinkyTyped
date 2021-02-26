package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceOrganizationsecuritypoliciesAddassociation extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Indicates whether or not to replace it if an association of the
    * attachment already exists. This is false by default, in which case an
    * error will be returned if an assocation already exists.
    */
  var replaceExistingAssociation: js.UndefOr[Boolean] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSecurityPolicyAssociation] = js.native
  
  /**
    * An optional request ID to identify requests. Specify a unique request ID
    * so that if you must retry your request, the server will know to ignore
    * the request if it has already been completed.  For example, consider a
    * situation where you make an initial request and the request times out. If
    * you make the request again with the same request ID, the server can check
    * if original operation with the same request ID was received, and if so,
    * will ignore the second request. This prevents clients from accidentally
    * creating duplicate commitments.  The request ID must be a valid UUID with
    * the exception that zero UUID is not supported
    * (00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.native
  
  /**
    * Name of the security policy to update.
    */
  var securityPolicy: js.UndefOr[String] = js.native
}
object ParamsResourceOrganizationsecuritypoliciesAddassociation {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsecuritypoliciesAddassociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsecuritypoliciesAddassociation]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsecuritypoliciesAddassociationMutableBuilder[Self <: ParamsResourceOrganizationsecuritypoliciesAddassociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setReplaceExistingAssociation(value: Boolean): Self = StObject.set(x, "replaceExistingAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceExistingAssociationUndefined: Self = StObject.set(x, "replaceExistingAssociation", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaSecurityPolicyAssociation): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
  }
}
