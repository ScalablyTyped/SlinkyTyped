package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposAddStatusCheckContextsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposAddStatusCheckContextsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposAddStatusCheckContextsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposAddStatusCheckContextsEndpoint extends StObject {
  
  var parameters: ReposAddStatusCheckContextsEndpoint = js.native
  
  var request: ReposAddStatusCheckContextsRequestOptions = js.native
  
  var response: OctokitResponse[ReposAddStatusCheckContextsResponseData] = js.native
}
object ParametersReposAddStatusCheckContextsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposAddStatusCheckContextsEndpoint,
    request: ReposAddStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposAddStatusCheckContextsResponseData]
  ): ParametersReposAddStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddStatusCheckContextsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposAddStatusCheckContextsEndpointMutableBuilder[Self <: ParametersReposAddStatusCheckContextsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposAddStatusCheckContextsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposAddStatusCheckContextsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposAddStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
