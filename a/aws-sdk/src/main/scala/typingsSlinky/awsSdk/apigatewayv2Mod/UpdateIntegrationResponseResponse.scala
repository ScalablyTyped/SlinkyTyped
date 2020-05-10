package typingsSlinky.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIntegrationResponseResponse extends js.Object {
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
  var IntegrationResponseKey: js.UndefOr[SelectionKey] = js.native
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

object UpdateIntegrationResponseResponse {
  @scala.inline
  def apply(): UpdateIntegrationResponseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateIntegrationResponseResponse]
  }
  @scala.inline
  implicit class UpdateIntegrationResponseResponseOps[Self <: UpdateIntegrationResponseResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withIntegrationResponseId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationResponseId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrationResponseId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationResponseId")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegrationResponseKey(value: SelectionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationResponseKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegrationResponseKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IntegrationResponseKey")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseParameters(value: IntegrationParameters): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTemplates(value: TemplateMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseTemplates")(js.undefined)
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
  }
  
}

