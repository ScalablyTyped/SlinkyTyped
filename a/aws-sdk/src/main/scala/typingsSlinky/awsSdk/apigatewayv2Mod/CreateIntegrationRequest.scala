package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateIntegrationRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  
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
    * The description of the integration.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  
  /**
    * Specifies the integration's HTTP method type.
    */
  var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.native
  
  /**
    * Supported only for HTTP API AWS_PROXY integrations. Specifies the AWS service action to invoke. To learn more, see Integration subtype reference.
    */
  var IntegrationSubtype: js.UndefOr[StringWithLengthBetween1And128] = js.native
  
  /**
    * The integration type of an integration. One of the following: AWS: for integrating the route or method request with an AWS service action, including the Lambda function-invoking action. With the Lambda function-invoking action, this is referred to as the Lambda custom integration. With any other AWS service action, this is known as AWS integration. Supported only for WebSocket APIs. AWS_PROXY: for integrating the route or method request with a Lambda function or other AWS service action. This integration is also referred to as a Lambda proxy integration. HTTP: for integrating the route or method request with an HTTP endpoint. This integration is also referred to as the HTTP custom integration. Supported only for WebSocket APIs. HTTP_PROXY: for integrating the route or method request with an HTTP endpoint, with the client request passed through as-is. This is also referred to as HTTP proxy integration. For HTTP API private integrations, use an HTTP_PROXY integration. MOCK: for integrating the route or method request with API Gateway as a "loopback" endpoint without invoking any backend. Supported only for WebSocket APIs.
    */
  var IntegrationType: typingsSlinky.awsSdk.apigatewayv2Mod.IntegrationType = js.native
  
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
    * For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request to the backend. The key is an integration request parameter name and the associated value is a method request parameter value or static value that must be enclosed within single quotes and pre-encoded as required by the backend. The method request parameter value must match the pattern of method.request.{location}.{name}
    , where  {location}  is querystring, path, or header; and {name} must be a valid and unique method request parameter name. For HTTP APIs, request parameters are a key-value map specifying parameters that are passed to AWS_PROXY integrations with a specified integrationSubtype. You can provide static values, or map request data, stage variables, or context variables that are evaluated at runtime. To learn more, see Working with AWS service integrations for HTTP APIs.
    */
  var RequestParameters: js.UndefOr[IntegrationParameters] = js.native
  
  /**
    * Represents a map of Velocity templates that are applied on the request payload based on the value of the Content-Type header sent by the client. The content type value is the key in this map, and the template (as a String) is the value. Supported only for WebSocket APIs.
    */
  var RequestTemplates: js.UndefOr[TemplateMap] = js.native
  
  /**
    * The template selection expression for the integration.
    */
  var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.native
  
  /**
    * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000 milliseconds for HTTP APIs. The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
    */
  var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000] = js.native
  
  /**
    * The TLS configuration for a private integration. If you specify a TLS configuration, private integration traffic uses the HTTPS protocol. Supported only for HTTP APIs.
    */
  var TlsConfig: js.UndefOr[TlsConfigInput] = js.native
}
object CreateIntegrationRequest {
  
  @scala.inline
  def apply(ApiId: string, IntegrationType: IntegrationType): CreateIntegrationRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], IntegrationType = IntegrationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntegrationRequest]
  }
  
  @scala.inline
  implicit class CreateIntegrationRequestMutableBuilder[Self <: CreateIntegrationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionId(value: StringWithLengthBetween1And1024): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionIdUndefined: Self = StObject.set(x, "ConnectionId", js.undefined)
    
    @scala.inline
    def setConnectionType(value: ConnectionType): Self = StObject.set(x, "ConnectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTypeUndefined: Self = StObject.set(x, "ConnectionType", js.undefined)
    
    @scala.inline
    def setContentHandlingStrategy(value: ContentHandlingStrategy): Self = StObject.set(x, "ContentHandlingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHandlingStrategyUndefined: Self = StObject.set(x, "ContentHandlingStrategy", js.undefined)
    
    @scala.inline
    def setCredentialsArn(value: Arn): Self = StObject.set(x, "CredentialsArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsArnUndefined: Self = StObject.set(x, "CredentialsArn", js.undefined)
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setIntegrationMethod(value: StringWithLengthBetween1And64): Self = StObject.set(x, "IntegrationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationMethodUndefined: Self = StObject.set(x, "IntegrationMethod", js.undefined)
    
    @scala.inline
    def setIntegrationSubtype(value: StringWithLengthBetween1And128): Self = StObject.set(x, "IntegrationSubtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationSubtypeUndefined: Self = StObject.set(x, "IntegrationSubtype", js.undefined)
    
    @scala.inline
    def setIntegrationType(value: IntegrationType): Self = StObject.set(x, "IntegrationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationUri(value: UriWithLengthBetween1And2048): Self = StObject.set(x, "IntegrationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationUriUndefined: Self = StObject.set(x, "IntegrationUri", js.undefined)
    
    @scala.inline
    def setPassthroughBehavior(value: PassthroughBehavior): Self = StObject.set(x, "PassthroughBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassthroughBehaviorUndefined: Self = StObject.set(x, "PassthroughBehavior", js.undefined)
    
    @scala.inline
    def setPayloadFormatVersion(value: StringWithLengthBetween1And64): Self = StObject.set(x, "PayloadFormatVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadFormatVersionUndefined: Self = StObject.set(x, "PayloadFormatVersion", js.undefined)
    
    @scala.inline
    def setRequestParameters(value: IntegrationParameters): Self = StObject.set(x, "RequestParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestParametersUndefined: Self = StObject.set(x, "RequestParameters", js.undefined)
    
    @scala.inline
    def setRequestTemplates(value: TemplateMap): Self = StObject.set(x, "RequestTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTemplatesUndefined: Self = StObject.set(x, "RequestTemplates", js.undefined)
    
    @scala.inline
    def setTemplateSelectionExpression(value: SelectionExpression): Self = StObject.set(x, "TemplateSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateSelectionExpressionUndefined: Self = StObject.set(x, "TemplateSelectionExpression", js.undefined)
    
    @scala.inline
    def setTimeoutInMillis(value: IntegerWithLengthBetween50And30000): Self = StObject.set(x, "TimeoutInMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMillisUndefined: Self = StObject.set(x, "TimeoutInMillis", js.undefined)
    
    @scala.inline
    def setTlsConfig(value: TlsConfigInput): Self = StObject.set(x, "TlsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTlsConfigUndefined: Self = StObject.set(x, "TlsConfig", js.undefined)
  }
}
