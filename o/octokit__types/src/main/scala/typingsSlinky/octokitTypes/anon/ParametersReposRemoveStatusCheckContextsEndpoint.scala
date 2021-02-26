package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveStatusCheckContextsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveStatusCheckContextsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveStatusCheckContextsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposRemoveStatusCheckContextsEndpoint extends StObject {
  
  var parameters: ReposRemoveStatusCheckContextsEndpoint = js.native
  
  var request: ReposRemoveStatusCheckContextsRequestOptions = js.native
  
  var response: OctokitResponse[ReposRemoveStatusCheckContextsResponseData] = js.native
}
object ParametersReposRemoveStatusCheckContextsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposRemoveStatusCheckContextsEndpoint,
    request: ReposRemoveStatusCheckContextsRequestOptions,
    response: OctokitResponse[ReposRemoveStatusCheckContextsResponseData]
  ): ParametersReposRemoveStatusCheckContextsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveStatusCheckContextsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposRemoveStatusCheckContextsEndpointMutableBuilder[Self <: ParametersReposRemoveStatusCheckContextsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposRemoveStatusCheckContextsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposRemoveStatusCheckContextsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposRemoveStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
