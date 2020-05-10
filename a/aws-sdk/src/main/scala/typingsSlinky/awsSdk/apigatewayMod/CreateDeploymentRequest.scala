package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDeploymentRequest extends js.Object {
  /**
    * Enables a cache cluster for the Stage resource specified in the input.
    */
  var cacheClusterEnabled: js.UndefOr[NullableBoolean] = js.native
  /**
    * Specifies the cache cluster size for the Stage resource specified in the input, if a cache cluster is enabled.
    */
  var cacheClusterSize: js.UndefOr[CacheClusterSize] = js.native
  /**
    * The input configuration for the canary deployment when the deployment is a canary release deployment. 
    */
  var canarySettings: js.UndefOr[DeploymentCanarySettings] = js.native
  /**
    * The description for the Deployment resource to create.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * The description of the Stage resource for the Deployment resource to create.
    */
  var stageDescription: js.UndefOr[String] = js.native
  /**
    * The name of the Stage resource for the Deployment resource to create.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * Specifies whether active tracing with X-ray is enabled for the Stage.
    */
  var tracingEnabled: js.UndefOr[NullableBoolean] = js.native
  /**
    * A map that defines the stage variables for the Stage resource that is associated with the new deployment. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var variables: js.UndefOr[MapOfStringToString] = js.native
}

object CreateDeploymentRequest {
  @scala.inline
  def apply(restApiId: String): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
  @scala.inline
  implicit class CreateDeploymentRequestOps[Self <: CreateDeploymentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheClusterEnabled(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheClusterEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheClusterEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheClusterEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheClusterSize(value: CacheClusterSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheClusterSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheClusterSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheClusterSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCanarySettings(value: DeploymentCanarySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canarySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanarySettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canarySettings")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withStageDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withStageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(js.undefined)
        ret
    }
    @scala.inline
    def withTracingEnabled(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withVariables(value: MapOfStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variables")(js.undefined)
        ret
    }
  }
  
}

