package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatewayResponse extends StObject {
  
  /**
    * A Boolean flag to indicate whether this GatewayResponse is the default gateway response (true) or not (false). A default gateway response is one generated by API Gateway without any customization by an API developer. 
    */
  var defaultResponse: js.UndefOr[Boolean] = js.native
  
  /**
    * Response parameters (paths, query strings and headers) of the GatewayResponse as a string-to-string map of key-value pairs.
    */
  var responseParameters: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
    */
  var responseTemplates: js.UndefOr[MapOfStringToString] = js.native
  
  /**
    * The response type of the associated GatewayResponse. Valid values are ACCESS_DENIEDAPI_CONFIGURATION_ERRORAUTHORIZER_FAILURE AUTHORIZER_CONFIGURATION_ERRORBAD_REQUEST_PARAMETERSBAD_REQUEST_BODYDEFAULT_4XXDEFAULT_5XXEXPIRED_TOKENINVALID_SIGNATUREINTEGRATION_FAILUREINTEGRATION_TIMEOUTINVALID_API_KEYMISSING_AUTHENTICATION_TOKEN QUOTA_EXCEEDEDREQUEST_TOO_LARGERESOURCE_NOT_FOUNDTHROTTLEDUNAUTHORIZEDUNSUPPORTED_MEDIA_TYPE 
    */
  var responseType: js.UndefOr[GatewayResponseType] = js.native
  
  /**
    * The HTTP status code for this GatewayResponse.
    */
  var statusCode: js.UndefOr[StatusCode] = js.native
}
object GatewayResponse {
  
  @scala.inline
  def apply(): GatewayResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayResponse]
  }
  
  @scala.inline
  implicit class GatewayResponseMutableBuilder[Self <: GatewayResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultResponse(value: Boolean): Self = StObject.set(x, "defaultResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultResponseUndefined: Self = StObject.set(x, "defaultResponse", js.undefined)
    
    @scala.inline
    def setResponseParameters(value: MapOfStringToString): Self = StObject.set(x, "responseParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseParametersUndefined: Self = StObject.set(x, "responseParameters", js.undefined)
    
    @scala.inline
    def setResponseTemplates(value: MapOfStringToString): Self = StObject.set(x, "responseTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTemplatesUndefined: Self = StObject.set(x, "responseTemplates", js.undefined)
    
    @scala.inline
    def setResponseType(value: GatewayResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
