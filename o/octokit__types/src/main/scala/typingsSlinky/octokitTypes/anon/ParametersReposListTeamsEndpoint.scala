package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListTeamsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListTeamsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListTeamsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListTeamsEndpoint extends StObject {
  
  var parameters: ReposListTeamsEndpoint = js.native
  
  var request: ReposListTeamsRequestOptions = js.native
  
  var response: OctokitResponse[ReposListTeamsResponseData] = js.native
}
object ParametersReposListTeamsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListTeamsEndpoint,
    request: ReposListTeamsRequestOptions,
    response: OctokitResponse[ReposListTeamsResponseData]
  ): ParametersReposListTeamsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListTeamsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListTeamsEndpointMutableBuilder[Self <: ParametersReposListTeamsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListTeamsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListTeamsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListTeamsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
