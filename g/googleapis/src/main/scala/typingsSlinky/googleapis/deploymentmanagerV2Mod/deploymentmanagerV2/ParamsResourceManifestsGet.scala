package typingsSlinky.googleapis.deploymentmanagerV2Mod.deploymentmanagerV2

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceManifestsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The name of the deployment for this request.
    */
  var deployment: js.UndefOr[String] = js.native
  
  /**
    * The name of the manifest for this request.
    */
  var manifest: js.UndefOr[String] = js.native
  
  /**
    * The project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
}
object ParamsResourceManifestsGet {
  
  @scala.inline
  def apply(): ParamsResourceManifestsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManifestsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceManifestsGetOps[Self <: ParamsResourceManifestsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setDeployment(value: String): Self = this.set("deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployment: Self = this.set("deployment", js.undefined)
    
    @scala.inline
    def setManifest(value: String): Self = this.set("manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
  }
}
