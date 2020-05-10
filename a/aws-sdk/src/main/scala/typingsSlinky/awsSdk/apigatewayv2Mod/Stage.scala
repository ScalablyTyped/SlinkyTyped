package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stage extends js.Object {
  /**
    * Settings for logging access in this stage.
    */
  var AccessLogSettings: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.AccessLogSettings] = js.native
  /**
    * Specifies whether a stage is managed by API Gateway. If you created an API using quick create, the $default stage is managed by API Gateway. You can't modify the $default stage.
    */
  var ApiGatewayManaged: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether updates to an API automatically trigger a new deployment. The default value is false.
    */
  var AutoDeploy: js.UndefOr[boolean] = js.native
  /**
    * The identifier of a client certificate for a Stage. Supported only for WebSocket APIs.
    */
  var ClientCertificateId: js.UndefOr[Id] = js.native
  /**
    * The timestamp when the stage was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * Default route settings for the stage.
    */
  var DefaultRouteSettings: js.UndefOr[RouteSettings] = js.native
  /**
    * The identifier of the Deployment that the Stage is associated with. Can't be updated if autoDeploy is enabled.
    */
  var DeploymentId: js.UndefOr[Id] = js.native
  /**
    * The description of the stage.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * Describes the status of the last deployment of a stage. Supported only for stages with autoDeploy enabled.
    */
  var LastDeploymentStatusMessage: js.UndefOr[string] = js.native
  /**
    * The timestamp when the stage was last updated.
    */
  var LastUpdatedDate: js.UndefOr[js.Date] = js.native
  /**
    * Route settings for the stage, by routeKey.
    */
  var RouteSettings: js.UndefOr[RouteSettingsMap] = js.native
  /**
    * The name of the stage.
    */
  var StageName: StringWithLengthBetween1And128 = js.native
  /**
    * A map that defines the stage variables for a stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var StageVariables: js.UndefOr[StageVariablesMap] = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.Tags] = js.native
}

object Stage {
  @scala.inline
  def apply(StageName: StringWithLengthBetween1And128): Stage = {
    val __obj = js.Dynamic.literal(StageName = StageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stage]
  }
  @scala.inline
  implicit class StageOps[Self <: Stage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStageName(value: StringWithLengthBetween1And128): Self = {
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
    def withApiGatewayManaged(value: boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiGatewayManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiGatewayManaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApiGatewayManaged")(js.undefined)
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
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedDate")(js.undefined)
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
    def withLastDeploymentStatusMessage(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastDeploymentStatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDeploymentStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastDeploymentStatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedDate")(js.undefined)
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
    @scala.inline
    def withTags(value: Tags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

