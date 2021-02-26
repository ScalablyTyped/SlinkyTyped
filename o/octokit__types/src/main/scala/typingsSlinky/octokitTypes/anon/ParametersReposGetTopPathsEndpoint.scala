package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetTopPathsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetTopPathsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetTopPathsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetTopPathsEndpoint extends StObject {
  
  var parameters: ReposGetTopPathsEndpoint = js.native
  
  var request: ReposGetTopPathsRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetTopPathsResponseData] = js.native
}
object ParametersReposGetTopPathsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetTopPathsEndpoint,
    request: ReposGetTopPathsRequestOptions,
    response: OctokitResponse[ReposGetTopPathsResponseData]
  ): ParametersReposGetTopPathsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetTopPathsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetTopPathsEndpointMutableBuilder[Self <: ParametersReposGetTopPathsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetTopPathsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetTopPathsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetTopPathsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
