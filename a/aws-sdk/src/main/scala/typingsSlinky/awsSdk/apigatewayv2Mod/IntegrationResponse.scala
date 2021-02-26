package typingsSlinky.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegrationResponse extends StObject {
  
  /**
    * Supported only for WebSocket APIs. Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors: CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string. If this property is not defined, the response payload will be passed through from the integration response to the route response or method response without modification.
    */
  var ContentHandlingStrategy: js.UndefOr[typingsSlinky.awsSdk.apigatewayv2Mod.ContentHandlingStrategy] = js.native
  
  /**
    * The integration response ID.
    */
  var IntegrationResponseId: js.UndefOr[Id] = js.native
  
  /**
    * The integration response key.
    */
  var IntegrationResponseKey: SelectionKey = js.native
  
  /**
    * A key-value map specifying response parameters that are passed to the method response from the backend. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header name. The mapped non-static value must match the pattern of integration.response.header.{name} or integration.response.body.{JSON-expression}, where name is a valid and unique response header name and JSON-expression is a valid JSON expression without the $ prefix.
    */
  var ResponseParameters: js.UndefOr[IntegrationParameters] = js.native
  
  /**
    * The collection of response templates for the integration response as a string-to-string map of key-value pairs. Response templates are represented as a key/value map, with a content-type as the key and a template as the value.
    */
  var ResponseTemplates: js.UndefOr[TemplateMap] = js.native
  
  /**
    * The template selection expressions for the integration response.
    */
  var TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.native
}
object IntegrationResponse {
  
  @scala.inline
  def apply(IntegrationResponseKey: SelectionKey): IntegrationResponse = {
    val __obj = js.Dynamic.literal(IntegrationResponseKey = IntegrationResponseKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegrationResponse]
  }
  
  @scala.inline
  implicit class IntegrationResponseMutableBuilder[Self <: IntegrationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentHandlingStrategy(value: ContentHandlingStrategy): Self = StObject.set(x, "ContentHandlingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHandlingStrategyUndefined: Self = StObject.set(x, "ContentHandlingStrategy", js.undefined)
    
    @scala.inline
    def setIntegrationResponseId(value: Id): Self = StObject.set(x, "IntegrationResponseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegrationResponseIdUndefined: Self = StObject.set(x, "IntegrationResponseId", js.undefined)
    
    @scala.inline
    def setIntegrationResponseKey(value: SelectionKey): Self = StObject.set(x, "IntegrationResponseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseParameters(value: IntegrationParameters): Self = StObject.set(x, "ResponseParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseParametersUndefined: Self = StObject.set(x, "ResponseParameters", js.undefined)
    
    @scala.inline
    def setResponseTemplates(value: TemplateMap): Self = StObject.set(x, "ResponseTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTemplatesUndefined: Self = StObject.set(x, "ResponseTemplates", js.undefined)
    
    @scala.inline
    def setTemplateSelectionExpression(value: SelectionExpression): Self = StObject.set(x, "TemplateSelectionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateSelectionExpressionUndefined: Self = StObject.set(x, "TemplateSelectionExpression", js.undefined)
  }
}
