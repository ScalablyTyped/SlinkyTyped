package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stage extends js.Object {
  /**
    * Settings for logging access in this stage.
    */
  var accessLogSettings: js.UndefOr[AccessLogSettings] = js.native
  /**
    * Specifies whether a cache cluster is enabled for the stage.
    */
  var cacheClusterEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The size of the cache cluster for the stage, if enabled.
    */
  var cacheClusterSize: js.UndefOr[CacheClusterSize] = js.native
  /**
    * The status of the cache cluster for the stage, if enabled.
    */
  var cacheClusterStatus: js.UndefOr[CacheClusterStatus] = js.native
  /**
    * Settings for the canary deployment in this stage.
    */
  var canarySettings: js.UndefOr[CanarySettings] = js.native
  /**
    * The identifier of a client certificate for an API stage.
    */
  var clientCertificateId: js.UndefOr[String] = js.native
  /**
    * The timestamp when the stage was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.native
  /**
    * The identifier of the Deployment that the stage points to.
    */
  var deploymentId: js.UndefOr[String] = js.native
  /**
    * The stage's description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The version of the associated API documentation.
    */
  var documentationVersion: js.UndefOr[String] = js.native
  /**
    * The timestamp when the stage last updated.
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.native
  /**
    * A map that defines the method settings for a Stage resource. Keys (designated as /{method_setting_key below) are method paths defined as {resource_path}/{http_method} for an individual method override, or /\*\* for overriding all methods in the stage. 
    */
  var methodSettings: js.UndefOr[MapOfMethodSettings] = js.native
  /**
    * The name of the stage is the first path segment in the Uniform Resource Identifier (URI) of a call to API Gateway. Stage names can only contain alphanumeric characters, hyphens, and underscores. Maximum length is 128 characters.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  /**
    * Specifies whether active tracing with X-ray is enabled for the Stage.
    */
  var tracingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * A map that defines the stage variables for a Stage resource. Variable names can have alphanumeric and underscore characters, and the values must match [A-Za-z0-9-._~:/?#&amp;=,]+.
    */
  var variables: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The ARN of the WebAcl associated with the Stage.
    */
  var webAclArn: js.UndefOr[String] = js.native
}

object Stage {
  @scala.inline
  def apply(): Stage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stage]
  }
  @scala.inline
  implicit class StageOps[Self <: Stage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessLogSettings(value: AccessLogSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLogSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessLogSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessLogSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheClusterEnabled(value: Boolean): Self = {
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
    def withCacheClusterStatus(value: CacheClusterStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheClusterStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheClusterStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheClusterStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withCanarySettings(value: CanarySettings): Self = {
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
    def withClientCertificateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertificateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientCertificateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientCertificateId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDeploymentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(js.undefined)
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
    def withDocumentationVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentationVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentationVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentationVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdatedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodSettings(value: MapOfMethodSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodSettings")(js.undefined)
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
    def withTags(value: MapOfStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTracingEnabled(value: Boolean): Self = {
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
    @scala.inline
    def withWebAclArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAclArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebAclArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webAclArn")(js.undefined)
        ret
    }
  }
  
}

