package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutGatewayResponseRequest extends js.Object {
  /**
    * Response parameters (paths, query strings and headers) of the GatewayResponse as a string-to-string map of key-value pairs.
    */
  var responseParameters: js.UndefOr[MapOfStringToString] = js.native
  /**
    * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
    */
  var responseTemplates: js.UndefOr[MapOfStringToString] = js.native
  /**
    * [Required] The response type of the associated GatewayResponse. Valid values are ACCESS_DENIEDAPI_CONFIGURATION_ERRORAUTHORIZER_FAILURE AUTHORIZER_CONFIGURATION_ERRORBAD_REQUEST_PARAMETERSBAD_REQUEST_BODYDEFAULT_4XXDEFAULT_5XXEXPIRED_TOKENINVALID_SIGNATUREINTEGRATION_FAILUREINTEGRATION_TIMEOUTINVALID_API_KEYMISSING_AUTHENTICATION_TOKEN QUOTA_EXCEEDEDREQUEST_TOO_LARGERESOURCE_NOT_FOUNDTHROTTLEDUNAUTHORIZEDUNSUPPORTED_MEDIA_TYPE 
    */
  var responseType: GatewayResponseType = js.native
  /**
    * [Required] The string identifier of the associated RestApi.
    */
  var restApiId: String = js.native
  /**
    * The HTTP status code of the GatewayResponse.
    */
  var statusCode: js.UndefOr[StatusCode] = js.native
}

object PutGatewayResponseRequest {
  @scala.inline
  def apply(responseType: GatewayResponseType, restApiId: String): PutGatewayResponseRequest = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutGatewayResponseRequest]
  }
  @scala.inline
  implicit class PutGatewayResponseRequestOps[Self <: PutGatewayResponseRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResponseType(value: GatewayResponseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApiId")(value.asInstanceOf[js.Any])
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
    def withStatusCode(value: StatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
  }
  
}

