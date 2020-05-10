package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutIntegrationResponseRequest extends js.Object {
  /**
    * Specifies how to handle response payload content type conversions. Supported values are CONVERT_TO_BINARY and CONVERT_TO_TEXT, with the following behaviors:  CONVERT_TO_BINARY: Converts a response payload from a Base64-encoded string to the corresponding binary blob. CONVERT_TO_TEXT: Converts a response payload from a binary blob to a Base64-encoded string.  If this property is not defined, the response payload will be passed through from the integration response to the method response without modification.
    */
  var contentHandling: js.UndefOr[ContentHandlingStrategy] = js.native
  /**
    * [Required] Specifies a put integration response request's HTTP method.
    */
  var httpMethod: String = js.native
  /**
    * [Required] Specifies a put integration response request's resource identifier.
    */
  var resourceId: String = js.native
  /**
    * A key-value map specifying response parameters that are passed to the method response from the back end. The key is a method response header parameter name and the mapped value is an integration response header value, a static value enclosed within a pair of single quotes, or a JSON expression from the integration response body. The mapping key must match the pattern of method.response.header.{name}, where name is a valid and unique header name. The mapped non-static value must match the pattern of integration.response.header.{name} or integration.response.body.{JSON-expression}, where name must be a valid and unique response header name and JSON-expression a valid JSON expression without the $ prefix.
    */
  var responseParameters: js.UndefOr[MapOfStringToString] = js.native
  /**
    * Specifies a put integration response's templates.
    */
  var responseTemplates: js.UndefOr[MapOfStringToString] = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * Specifies the selection pattern of a put integration response.
    */
  var selectionPattern: js.UndefOr[String] = js.native
  /**
    * [Required] Specifies the status code that is used to map the integration response to an existing MethodResponse.
    */
  var statusCode: StatusCode = js.native
}

object PutIntegrationResponseRequest {
  @scala.inline
  def apply(httpMethod: String, resourceId: String, restApiId: String, statusCode: StatusCode): PutIntegrationResponseRequest = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutIntegrationResponseRequest]
  }
  @scala.inline
  implicit class PutIntegrationResponseRequestOps[Self <: PutIntegrationResponseRequest] (val x: Self) extends AnyVal {
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
    def withStatusCode(value: StatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
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
    def withResponseParameters(value: MapOfStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseParameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseParameters")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTemplates(value: MapOfStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTemplates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTemplates")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionPattern")(js.undefined)
        ret
    }
  }
  
}

