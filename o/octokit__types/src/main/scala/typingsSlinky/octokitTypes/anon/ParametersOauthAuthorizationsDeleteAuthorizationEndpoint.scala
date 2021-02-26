package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsDeleteAuthorizationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsDeleteAuthorizationRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsDeleteAuthorizationEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsDeleteAuthorizationEndpoint = js.native
  
  var request: OauthAuthorizationsDeleteAuthorizationRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersOauthAuthorizationsDeleteAuthorizationEndpoint {
  
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsDeleteAuthorizationEndpoint,
    request: OauthAuthorizationsDeleteAuthorizationRequestOptions,
    response: OctokitResponse[_]
  ): ParametersOauthAuthorizationsDeleteAuthorizationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsDeleteAuthorizationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOauthAuthorizationsDeleteAuthorizationEndpointMutableBuilder[Self <: ParametersOauthAuthorizationsDeleteAuthorizationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OauthAuthorizationsDeleteAuthorizationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsDeleteAuthorizationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
