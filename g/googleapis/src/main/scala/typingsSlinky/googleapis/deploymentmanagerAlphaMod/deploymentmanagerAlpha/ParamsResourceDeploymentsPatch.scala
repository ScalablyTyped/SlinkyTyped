package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceDeploymentsPatch extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Sets the policy to use for creating new resources.
    */
  var createPolicy: js.UndefOr[String] = js.native
  
  /**
    * Sets the policy to use for deleting resources.
    */
  var deletePolicy: js.UndefOr[String] = js.native
  
  /**
    * The name of the deployment for this request.
    */
  var deployment: js.UndefOr[String] = js.native
  
  /**
    * If set to true, updates the deployment and creates and updates the
    * "shell" resources but does not actually alter or instantiate these
    * resources. This allows you to preview what your deployment will look
    * like. You can use this intent to preview how an update would affect your
    * deployment. You must provide a target.config with a configuration if this
    * is set to true. After previewing a deployment, you can deploy your
    * resources by making a request with the update() or you can
    * cancelPreview() to remove the preview altogether. Note that the
    * deployment will still exist after you cancel the preview and you must
    * separately delete this deployment if you want to remove it.
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
object ParamsResourceDeploymentsPatch {
  
  @scala.inline
  def apply(): ParamsResourceDeploymentsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDeploymentsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceDeploymentsPatchMutableBuilder[Self <: ParamsResourceDeploymentsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCreatePolicy(value: String): Self = StObject.set(x, "createPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatePolicyUndefined: Self = StObject.set(x, "createPolicy", js.undefined)
    
    @scala.inline
    def setDeletePolicy(value: String): Self = StObject.set(x, "deletePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePolicyUndefined: Self = StObject.set(x, "deletePolicy", js.undefined)
    
    @scala.inline
    def setDeployment(value: String): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
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
