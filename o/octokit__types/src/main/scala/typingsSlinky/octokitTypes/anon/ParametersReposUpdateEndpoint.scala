package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposUpdateEndpoint extends StObject {
  
  var parameters: ReposUpdateEndpoint = js.native
  
  var request: ReposUpdateRequestOptions = js.native
  
  var response: OctokitResponse[ReposUpdateResponseData] = js.native
}
object ParametersReposUpdateEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposUpdateEndpoint,
    request: ReposUpdateRequestOptions,
    response: OctokitResponse[ReposUpdateResponseData]
  ): ParametersReposUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposUpdateEndpointMutableBuilder[Self <: ParametersReposUpdateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposUpdateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUpdateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
