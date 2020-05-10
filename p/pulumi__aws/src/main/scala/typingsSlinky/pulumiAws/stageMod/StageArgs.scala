package typingsSlinky.pulumiAws.stageMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.deploymentMod.Deployment
import typingsSlinky.pulumiAws.inputMod.apigateway.StageAccessLogSettings
import typingsSlinky.pulumiAws.restApiMod.RestApi
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageArgs extends js.Object {
  /**
    * Enables access logs for the API stage. Detailed below.
    */
  val accessLogSettings: js.UndefOr[Input[StageAccessLogSettings]] = js.native
  /**
    * Specifies whether a cache cluster is enabled for the stage
    */
  val cacheClusterEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The size of the cache cluster for the stage, if enabled.
    * Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
    */
  val cacheClusterSize: js.UndefOr[Input[String]] = js.native
  /**
    * The identifier of a client certificate for the stage.
    */
  val clientCertificateId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the deployment that the stage points to
    */
  val deployment: Input[String | Deployment] = js.native
  /**
    * The description of the stage
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the associated API documentation
    */
  val documentationVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[String | RestApi] = js.native
  /**
    * The name of the stage
    */
  val stageName: Input[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * A map that defines the stage variables
    */
  val variables: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Whether active tracing with X-ray is enabled. Defaults to `false`.
    */
  val xrayTracingEnabled: js.UndefOr[Input[Boolean]] = js.native
}

object StageArgs {
  @scala.inline
  def apply(deployment: Input[String | Deployment], restApi: Input[String | RestApi], stageName: Input[String]): StageArgs = {
    val __obj = js.Dynamic.literal(deployment = deployment.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageArgs]
  }
  @scala.inline
  implicit class StageArgsOps[Self <: StageArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployment(value: Input[String | Deployment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestApi(value: Input[String | RestApi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStageName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessLogSettings(value: Input[StageAccessLogSettings]): Self = {
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
    def withCacheClusterEnabled(value: Input[Boolean]): Self = {
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
    def withCacheClusterSize(value: Input[String]): Self = {
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
    def withClientCertificateId(value: Input[String]): Self = {
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
    def withDescription(value: Input[String]): Self = {
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
    def withDocumentationVersion(value: Input[String]): Self = {
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
    def withTags(value: Input[StringDictionary[_]]): Self = {
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
    def withVariables(value: Input[StringDictionary[_]]): Self = {
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
    def withXrayTracingEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrayTracingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXrayTracingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xrayTracingEnabled")(js.undefined)
        ret
    }
  }
  
}

