package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegrationResponse extends js.Object {
  
  /**
    * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:  CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.  If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
    */
  var contentHandling: js.UndefOr[ContentHandlingStrategy] = js.native
  
  /**
    * A key-value map specifying response parameters that are passed to the method response from the back end. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header name. The mapped non-static value must match the pattern of integration.response.header.{name} or integration.response.body.{JSON-expression}, where name is a valid and unique response header name and JSON-expression is a valid JSON expression without the $ prefix.
    */
  var responseParameters: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * Specifies the templates used to transform the integration response body. Response templates are represented as a key/value map, with a content-type as the key and a template as the value.
    */
  var responseTemplates: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * Specifies the regular expression (regex) pattern used to choose an integration response based on the response from the back end. For example, if the success response returns nothing and the error response returns some string, you could use the .+ regex to match error response. However, make sure that the error response does not contain any newline (\n) character in such cases. If the back end is an AWS Lambda function, the AWS Lambda function error header is matched. For all other HTTP and AWS back ends, the HTTP status code is matched.
    */
  var selectionPattern: js.UndefOr[String] = js.native
  
  /**
    * Specifies the status code that is used to map the integration response to an existing MethodResponse.
    */
  var statusCode: js.UndefOr[StatusCode] = js.native
}
object IntegrationResponse {
  
  @scala.inline
  def apply(): IntegrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegrationResponse]
  }
  
  @scala.inline
  implicit class IntegrationResponseOps[Self <: IntegrationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentHandling(value: ContentHandlingStrategy): Self = this.set("contentHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentHandling: Self = this.set("contentHandling", js.undefined)
    
    @scala.inline
    def setResponseParameters(value: MapOfStringToString): Self = this.set("responseParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseParameters: Self = this.set("responseParameters", js.undefined)
    
    @scala.inline
    def setResponseTemplates(value: MapOfStringToString): Self = this.set("responseTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTemplates: Self = this.set("responseTemplates", js.undefined)
    
    @scala.inline
    def setSelectionPattern(value: String): Self = this.set("selectionPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionPattern: Self = this.set("selectionPattern", js.undefined)
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
}
