package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsCreateAuthorizationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsCreateAuthorizationRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsCreateAuthorizationResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsCreateAuthorizationEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsCreateAuthorizationEndpoint = js.native
  
  var request: OauthAuthorizationsCreateAuthorizationRequestOptions = js.native
  
  var response: OctokitResponse[OauthAuthorizationsCreateAuthorizationResponseData] = js.native
}
object ParametersOauthAuthorizationsCreateAuthorizationEndpoint {
  
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsCreateAuthorizationEndpoint,
    request: OauthAuthorizationsCreateAuthorizationRequestOptions,
    response: OctokitResponse[OauthAuthorizationsCreateAuthorizationResponseData]
  ): ParametersOauthAuthorizationsCreateAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsCreateAuthorizationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOauthAuthorizationsCreateAuthorizationEndpointMutableBuilder[Self <: ParametersOauthAuthorizationsCreateAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OauthAuthorizationsCreateAuthorizationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsCreateAuthorizationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsCreateAuthorizationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
