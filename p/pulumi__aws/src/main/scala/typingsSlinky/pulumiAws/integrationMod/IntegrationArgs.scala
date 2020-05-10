package typingsSlinky.pulumiAws.integrationMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.restApiMod.RestApi
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegrationArgs extends js.Object {
  /**
    * A list of cache key parameters for the integration.
    */
  val cacheKeyParameters: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The integration's cache namespace.
    */
  val cacheNamespace: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the VpcLink used for the integration. **Required** if `connectionType` is `VPC_LINK`
    */
  val connectionId: js.UndefOr[Input[String]] = js.native
  /**
    * The integration input's [connectionType](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#connectionType). Valid values are `INTERNET` (default for connections through the public routable internet), and `VPC_LINK` (for private connections between API Gateway and a network load balancer in a VPC).
    */
  val connectionType: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies how to handle request payload content type conversions. Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT`. If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehaviors is configured to support payload pass-through.
    */
  val contentHandling: js.UndefOr[Input[String]] = js.native
  /**
    * The credentials required for the integration. For `AWS` integrations, 2 options are available. To specify an IAM Role for Amazon API Gateway to assume, use the role's ARN. To require that the caller's identity be passed through from the request, specify the string `arn:aws:iam::\*:user/\*`.
    */
  val credentials: js.UndefOr[Input[String]] = js.native
  /**
    * The HTTP method (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTION`, `ANY`)
    * when calling the associated resource.
    */
  val httpMethod: Input[String] = js.native
  /**
    * The integration HTTP method
    * (`GET`, `POST`, `PUT`, `DELETE`, `HEAD`, `OPTIONs`, `ANY`, `PATCH`) specifying how API Gateway will interact with the back end.
    * **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
    * Not all methods are compatible with all `AWS` integrations.
    * e.g. Lambda function [can only be invoked](https://github.com/awslabs/aws-apigateway-importer/issues/9#issuecomment-129651005) via `POST`.
    */
  val integrationHttpMethod: js.UndefOr[Input[String]] = js.native
  /**
    * The integration passthrough behavior (`WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`).  **Required** if `requestTemplates` is used.
    */
  val passthroughBehavior: js.UndefOr[Input[String]] = js.native
  /**
    * A map of request query string parameters and headers that should be passed to the backend responder.
    * For example: `requestParameters = { "integration.request.header.X-Some-Other-Header" = "method.request.header.X-Some-Header" }`
    */
  val requestParameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A map of the integration's request templates.
    */
  val requestTemplates: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The API resource ID.
    */
  val resourceId: Input[String] = js.native
  /**
    * The ID of the associated REST API.
    */
  val restApi: Input[String | RestApi] = js.native
  /**
    * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds.
    */
  val timeoutMilliseconds: js.UndefOr[Input[Double]] = js.native
  /**
    * The integration input's [type](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/). Valid values are `HTTP` (for HTTP backends), `MOCK` (not calling any real backend), `AWS` (for AWS services), `AWS_PROXY` (for Lambda proxy integration) and `HTTP_PROXY` (for HTTP proxy integration). An `HTTP` or `HTTP_PROXY` integration with a `connectionType` of `VPC_LINK` is referred to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a VPC.
    */
  val `type`: Input[String] = js.native
  /**
    * The input's URI. **Required** if `type` is `AWS`, `AWS_PROXY`, `HTTP` or `HTTP_PROXY`.
    * For HTTP integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification . For AWS integrations, the URI should be of the form `arn:aws:apigateway:{region}:{subdomain.service|service}:{path|action}/{service_api}`. `region`, `subdomain` and `service` are used to determine the right endpoint.
    * e.g. `arn:aws:apigateway:eu-west-1:lambda:path/2015-03-31/functions/arn:aws:lambda:eu-west-1:012345678901:function:my-func/invocations`
    */
  val uri: js.UndefOr[Input[String]] = js.native
}

object IntegrationArgs {
  @scala.inline
  def apply(
    httpMethod: Input[String],
    resourceId: Input[String],
    restApi: Input[String | RestApi],
    `type`: Input[String]
  ): IntegrationArgs = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationArgs]
  }
  @scala.inline
  implicit class IntegrationArgsOps[Self <: IntegrationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpMethod(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestApi(value: Input[String | RestApi]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheKeyParameters(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKeyParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheKeyParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheKeyParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheNamespace(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHandling(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHandling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHandling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentHandling")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentials(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrationHttpMethod(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrationHttpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrationHttpMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integrationHttpMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withPassthroughBehavior(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passthroughBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassthroughBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passthroughBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestParameters(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTemplates(value: Input[StringDictionary[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutMilliseconds(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutMilliseconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutMilliseconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutMilliseconds")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

