package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withApiId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStageName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessLogSettings(value: AccessLogSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessLogSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessLogSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessLogSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDeploy(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeploy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDeploy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoDeploy")(js.undefined)
        ret
    }
    @scala.inline
    def withClientCertificateId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientCertificateId")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRouteSettings(value: RouteSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRouteSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRouteSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultRouteSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeploymentId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: StringWithLengthBetween0And1024): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteSettings(value: RouteSettingsMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withStageVariables(value: StageVariablesMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StageVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StageVariables")(js.undefined)
        ret
    }
  }
  
}

