package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsListGrantsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsListGrantsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsListGrantsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsListGrantsEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsListGrantsEndpoint = js.native
  
  var request: OauthAuthorizationsListGrantsRequestOptions = js.native
  
  var response: OctokitResponse[OauthAuthorizationsListGrantsResponseData] = js.native
}
object ParametersOauthAuthorizationsListGrantsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsListGrantsEndpoint,
    request: OauthAuthorizationsListGrantsRequestOptions,
    response: OctokitResponse[OauthAuthorizationsListGrantsResponseData]
  ): ParametersOauthAuthorizationsListGrantsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsListGrantsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOauthAuthorizationsListGrantsEndpointMutableBuilder[Self <: ParametersOauthAuthorizationsListGrantsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OauthAuthorizationsListGrantsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsListGrantsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsListGrantsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
