package typingsSlinky.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDeploymentsInsert extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Sets the policy to use for creating new resources.
    */
  var createPolicy: js.UndefOr[String] = js.native
  
  /**
    * If set to true, creates a deployment and creates "shell" resources but
    * does not actually instantiate these resources. This allows you to preview
    * what your deployment looks like. After previewing a deployment, you can
    * deploy your resources by making a request with the update() method or you
    * can use the cancelPreview() method to cancel the preview altogether. Note
    * that the deployment will still exist after you cancel the preview and you
    * must separately delete this deployment if you want to remove it.
    */
  var preview: js.UndefOr[Boolean] = js.native
  
  /**
    * The project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDeployment] = js.native
}
object ParamsResourceDeploymentsInsert {
  
  @scala.inline
  def apply(): ParamsResourceDeploymentsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDeploymentsInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceDeploymentsInsertMutableBuilder[Self <: ParamsResourceDeploymentsInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCreatePolicy(value: String): Self = StObject.set(x, "createPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatePolicyUndefined: Self = StObject.set(x, "createPolicy", js.undefined)
    
    @scala.inline
    def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaDeployment): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
