package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutIntegrationRequest extends js.Object {
  /**
    * An API-specific tag group of related cached parameters.
    */
  var cacheKeyParameters: js.UndefOr[ListOfString] = js.native
  /**
    * A list of request parameters whose values are to be cached.
    */
  var cacheNamespace: js.UndefOr[String] = js.native
  /**
    * The (id) of the VpcLink used for the integration when connectionType=VPC_LINK and undefined, otherwise.
    */
  var connectionId: js.UndefOr[String] = js.native
  /**
    * The type of the network connection to the integration endpoint. The valid value is INTERNET for connections through the public routable internet or VPC_LINK for private connections between API Gateway and a network load balancer in a VPC. The default value is INTERNET.
    */
  var connectionType: js.UndefOr[ConnectionType] = js.native
  /**
    * Specifies how to handle request payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:  CONVERT_TO_BINARY: Converts a request payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a request payload from a binary blob to a Base64-encoded string.  If this property is not defined, the request payload will be passed through from the method request to integration request without modification, provided that the passthroughBehavior is configured to support payload pass-through.
    */
  var contentHandling: js.UndefOr[ContentHandlingStrategy] = js.native
  /**
    * Specifies whether credentials are required for a put integration.
    */
  var credentials: js.UndefOr[String] = js.native
  /**
    * [Required] Specifies a put integration request's HTTP method.
    */
  var httpMethod: String = js.native
  /**
    * Specifies a put integration HTTP method. When the integration type is HTTP or AWS, this field is required.
    */
  var integrationHttpMethod: js.UndefOr[String] = js.native
  /**
    * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the requestTemplates property on the Integration resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER.   WHEN_NO_MATCH passes the request body for unmapped content types through to the integration back end without transformation. NEVER rejects unmapped content types with an HTTP 415 'Unsupported Media Type' response. WHEN_NO_TEMPLATES allows pass-through when the integration has NO content types mapped to templates. However if there is at least one content type defined, unmapped content types will be rejected with the same 415 response. 
    */
  var passthroughBehavior: js.UndefOr[String] = js.native
  /**
    * A key-value map specifying request parameters that are passed from the method request to the back end. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the back end. The method request parameter value must match the pattern of method.request.{location}.{name}, where location is querystring, path, or header and name must be a valid and unique method request parameter name.
    */
  var requestParameters: js.UndefOr[MapOfStringToString] = js.native
  /**
    * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value.
    */
  var requestTemplates: js.UndefOr[MapOfStringToString] = js.native
  /**
    * [Required] Specifies a put integration request's resource ID.
    */
  var resourceId: String = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds.
    */
  var timeoutInMillis: js.UndefOr[NullableInteger] = js.native
  /**
    * [Required] Specifies a put integration input's type.
    */
  var `type`: IntegrationType = js.native
  /**
    * Specifies Uniform Resource Identifier (URI) of the integration endpoint.   For HTTP or HTTP_PROXY integrations, the URI must be a fully formed, encoded HTTP(S) URL according to the RFC-3986 specification, for either standard integration, where connectionType is not VPC_LINK, or private integration, where connectionType is VPC_LINK. For a private HTTP integration, the URI is not used for routing.    For AWS or AWS_PROXY integrations, the URI is of the form arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}. Here, {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS service for fast host-name lookup. action can be used for an AWS service action-based API, using an Action={name}&amp;{p1}={v1}&amp;p2={v2}... query string. The ensuing {service_api} refers to a supported action {name} plus any required input parameters. Alternatively, path can be used for an AWS service path-based API. The ensuing service_api refers to the path to an AWS service resource, including the region of the integrated AWS service, if applicable. For example, for integration with the S3 API of GetObject, the uri can be either arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key} or arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key} 
    */
  var uri: js.UndefOr[String] = js.native
}

object PutIntegrationRequest {
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String, `type`: IntegrationType): PutIntegrationRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutIntegrationRequest]
  }
  @scala.inline
  implicit class PutIntegrationRequestOps[Self <: PutIntegrationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: IntegrationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheKeyParameters(value: ListOfString): Self = {
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
    def withCacheNamespace(value: String): Self = {
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
    def withConnectionId(value: String): Self = {
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
    def withConnectionType(value: ConnectionType): Self = {
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
    def withContentHandling(value: ContentHandlingStrategy): Self = {
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
    def withCredentials(value: String): Self = {
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
    def withIntegrationHttpMethod(value: String): Self = {
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
    def withPassthroughBehavior(value: String): Self = {
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
    def withRequestParameters(value: MapOfStringToString): Self = {
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
    def withRequestTemplates(value: MapOfStringToString): Self = {
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
    def withTimeoutInMillis(value: NullableInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutInMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
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

