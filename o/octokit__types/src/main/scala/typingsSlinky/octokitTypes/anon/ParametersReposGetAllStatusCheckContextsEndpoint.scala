package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetAllStatusCheckContextsEndpoint extends StObject {
  
  var parameters: ReposGetAllStatusCheckContextsEndpoint = js.native
  
  var request: ReposGetAllStatusCheckContextsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetAllStatusCheckContextsResponseData] = js.native
}
object ParametersReposGetAllStatusCheckContextsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetAllStatusCheckContextsEndpoint,
    request: ReposGetAllStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]
  ): ParametersReposGetAllStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetAllStatusCheckContextsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetAllStatusCheckContextsEndpointMutableBuilder[Self <: ParametersReposGetAllStatusCheckContextsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetAllStatusCheckContextsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetAllStatusCheckContextsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
