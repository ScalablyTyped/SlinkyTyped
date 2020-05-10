package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntegrationResult extends js.Object {
  /**
    * Specifies whether an integration is managed by API Gateway. If you created an API using using quick create, the resulting integration is managed by API Gateway. You can update a managed integration, but you can't delete it.
    */
  var ApiGatewayManaged: js.UndefOr[boolean] = js.native
  /**
    * The ID of the VPC link for a private integration. Supported only for HTTP APIs.
    */
  var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.native
  /**
    * The type of the network connection to the integration endpoint. Specify INTERNET for connections through the public routable internet or VPC_LINK for private connections between API Gateway and resources in a VPC. The default value is INTERNET.
    */
  var ConnectionType: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.ConnectionType] = js.native
  /**
    * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string. If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
    */
  var ContentHandlingStrategy: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.ContentHandlingStrategy] = js.native
  /**
    * Specifies the credentials required for the integration, if any. For AWS integrations, three options are available. To specify an IAM Role for API Gateway to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed through from the request, specify the string arn:aws:iam::*:user/ *. To use resource-based permissions on supported AWS services, specify null.
    */
  var CredentialsArn: js.UndefOr[Arn] = js.native
  /**
    * Represents the description of an integration.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * Represents the identifier of an integration.
    */
  var IntegrationId: js.UndefOr[Id] = js.native
  /**
    * Specifies the integration's HTTP method type.
    */
  var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.native
  /**
    * The integration response selection expression for the integration. Supported only for WebSocket APIs. See Integration Response Selection Expressions.
    */
  var IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * The integration type of an integration. One of the following: AWS: for integrating the route or method request with an AWS service action, including the Lambda function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom integration. With any other AWS service action, this is known as AWS integration. Supported only for WebSocket APIs. AWS_PROXY: for integrating the route or method request with the Lambda function-invoking action with the client request passed through as-is. This integration is also referred to as Lambda proxy integration. HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred to as the HTTP custom integration. Supported only for WebSocket APIs. HTTP_PROXY: for integrating the route or method request with an HTTP endpoint, with the client request passed through as-is. This is also referred to as HTTP proxy integration. MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any backend. Supported only for WebSocket APIs.
    */
  var IntegrationType: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.IntegrationType] = js.native
  /**
    * For a Lambda integration, specify the URI of a Lambda function. For an HTTP integration, specify a fully-qualified URL. For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map service. If you specify the ARN of an AWS Cloud Map service, API Gateway uses DiscoverInstances to identify resources. You can use query parameters to target specific resources. To learn more, see DiscoverInstances. For private integrations, all resources must be owned by the same AWS account.
    */
  var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.native
  /**
    * Specifies the pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the requestTemplates property on the Integration resource. There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and NEVER. Supported only for WebSocket APIs. WHEN_NO_MATCH passes the request body for unmapped content types through to the integration backend without transformation. NEVER rejects unmapped content types with an HTTP 415 Unsupported Media Type response. WHEN_NO_TEMPLATES allows pass-through when the integration has no content types mapped to templates. However, if there is at least one content type defined, unmapped content types will be rejected with the same HTTP 415 Unsupported Media Type response.
    */
  var PassthroughBehavior: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.PassthroughBehavior] = js.native
  /**
    * Specifies the format of the payload sent to an integration. Required for HTTP APIs.
    */
  var PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64] = js.native
  /**
    * A key-value map specifying request parameters that are passed from the method request to the backend. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The method request parameter value must match the pattern of method.request.{location}.{name}
    , where 
    {location}
    is querystring, path, or header; and 
    {name}
    must be a valid and unique method request parameter name. Supported only for WebSocket APIs.
    */
  var RequestParameters: js.UndefOr[IntegrationParameters] = js.native
  /**
    * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value. Supported only for WebSocket APIs.
    */
  var RequestTemplates: js.UndefOr[TemplateMap] = js.native
  /**
    * The template selection expression for the integration. Supported only for WebSocket APIs.
    */
  var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  /**
    * Custom timeout between 50 and 29,000 milliseconds. The default value is 29,000 milliseconds or 29 seconds for WebSocket APIs. The default value is 5,000 milliseconds, or 5 seconds for HTTP APIs.
    */
  var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.native
  /**
    * The TLS configuration for a private integration. If you specify a TLS configuration, private integration traffic uses the HTTPS protocol. Supported only for HTTP APIs.
    */
  var TlsConfig: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.TlsConfig] = js.native
}

object GetIntegrationResult {
  @scala.inline
  def apply(): GetIntegrationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntegrationResult]
  }
  @scala.inline
  implicit class GetIntegrationResultOps[Self <: GetIntegrationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withConnectionId(value: StringWithLengthBetween1And1024): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionId")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionType(value: ConnectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withContentHandlingStrategy(value: ContentHandlingStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentHandlingStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentHandlingStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentHandlingStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withCredentialsArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CredentialsArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentialsArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CredentialsArn")(js.undefined)
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
    def withIntegrationId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationId")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrationMethod(value: StringWithLengthBetween1And64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrationMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrationResponseSelectionExpression(value: SelectionExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationResponseSelectionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrationResponseSelectionExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationResponseSelectionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrationType(value: IntegrationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationType")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrationUri(value: UriWithLengthBetween1And2048): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrationUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationUri")(js.undefined)
        ret
    }
    @scala.inline
    def withPassthroughBehavior(value: PassthroughBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PassthroughBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassthroughBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PassthroughBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadFormatVersion(value: StringWithLengthBetween1And64): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PayloadFormatVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadFormatVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PayloadFormatVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestParameters(value: IntegrationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTemplates(value: TemplateMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateSelectionExpression(value: SelectionExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateSelectionExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateSelectionExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplateSelectionExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutInMillis(value: IntegerWithLengthBetween50And29000): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutInMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutInMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeoutInMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withTlsConfig(value: TlsConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TlsConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTlsConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TlsConfig")(js.undefined)
        ret
    }
  }
  
}

