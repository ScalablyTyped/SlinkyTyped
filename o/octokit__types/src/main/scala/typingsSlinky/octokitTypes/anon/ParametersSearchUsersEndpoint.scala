package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.SearchUsersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.SearchUsersRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.SearchUsersResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersSearchUsersEndpoint extends StObject {
  
  var parameters: SearchUsersEndpoint = js.native
  
  var request: SearchUsersRequestOptions = js.native
  
  var response: OctokitResponse[SearchUsersResponseData] = js.native
}
object ParametersSearchUsersEndpoint {
  
  @scala.inline
  def apply(
    parameters: SearchUsersEndpoint,
    request: SearchUsersRequestOptions,
    response: OctokitResponse[SearchUsersResponseData]
  ): ParametersSearchUsersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchUsersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchUsersEndpointMutableBuilder[Self <: ParametersSearchUsersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchUsersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: SearchUsersRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchUsersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
