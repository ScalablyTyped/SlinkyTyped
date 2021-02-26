package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetAuthorizationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetAuthorizationRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetAuthorizationResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsGetAuthorizationEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsGetAuthorizationEndpoint = js.native
  
  var request: OauthAuthorizationsGetAuthorizationRequestOptions = js.native
  
  var response: OctokitResponse[OauthAuthorizationsGetAuthorizationResponseData] = js.native
}
object ParametersOauthAuthorizationsGetAuthorizationEndpoint {
  
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsGetAuthorizationEndpoint,
    request: OauthAuthorizationsGetAuthorizationRequestOptions,
    response: OctokitResponse[OauthAuthorizationsGetAuthorizationResponseData]
  ): ParametersOauthAuthorizationsGetAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsGetAuthorizationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOauthAuthorizationsGetAuthorizationEndpointMutableBuilder[Self <: ParametersOauthAuthorizationsGetAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OauthAuthorizationsGetAuthorizationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsGetAuthorizationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsGetAuthorizationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
