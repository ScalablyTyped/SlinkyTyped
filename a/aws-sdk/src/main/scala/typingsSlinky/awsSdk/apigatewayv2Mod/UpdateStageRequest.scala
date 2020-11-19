package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateStageRequest extends js.Object {
  
  /**
    * Settings for logging access in this stage.
    */
  var AccessLogSettings: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.AccessLogSettings] = js.native
  
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  
  /**
    * Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
    */
  var AutoDeploy: js.UndefOr[boolean] = js.native
  
  /**
    * The identifier of a client certificate for a Stage.
    */
  var ClientCertificateId: js.UndefOr[Id] = js.native
  
  /**
    * The default route settings for the stage.
    */
  var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.native
  
  /**
    * The deployment identifier for the API stage. Can't be updated if autoDeploy is enabled.
    */
  var DeploymentId: js.UndefOr[Id] = js.native
  
  /**
    * The description for the API stage.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  
  /**
    * Route settings for the stage.
    */
  var RouteSettings: js.UndefOr[RouteSettingsMap] = js.native
  
  /**
    * The stage name. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var StageName: string = js.native
  
  /**
    * A map that defines the stage variables for a Stage. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var StageVariables: js.UndefOr[StageVariablesMap] = js.native
}
object UpdateStageRequest {
  
  @scala.inline
  def apply(ApiId: string, StageName: string): UpdateStageRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateStageRequest]
  }
  
  @scala.inline
  implicit class UpdateStageRequestOps[Self <: UpdateStageRequest] (val x: Self) extends AnyVal {
    
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
    def setApiId(value: string): Self = this.set("ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: string): Self = this.set("StageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLogSettings(value: AccessLogSettings): Self = this.set("AccessLogSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLogSettings: Self = this.set("AccessLogSettings", js.undefined)
    
    @scala.inline
    def setAutoDeploy(value: boolean): Self = this.set("AutoDeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDeploy: Self = this.set("AutoDeploy", js.undefined)
    
    @scala.inline
    def setClientCertificateId(value: Id): Self = this.set("ClientCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertificateId: Self = this.set("ClientCertificateId", js.undefined)
    
    @scala.inline
    def setDefaultRouteSettings(value: RouteSettings): Self = this.set("DefaultRouteSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRouteSettings: Self = this.set("DefaultRouteSettings", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: Id): Self = this.set("DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentId: Self = this.set("DeploymentId", js.undefined)
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setRouteSettings(value: RouteSettingsMap): Self = this.set("RouteSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteSettings: Self = this.set("RouteSettings", js.undefined)
    
    @scala.inline
    def setStageVariables(value: StageVariablesMap): Self = this.set("StageVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageVariables: Self = this.set("StageVariables", js.undefined)
  }
}
