package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetCombinedStatusForRefEndpoint extends StObject {
  
  var parameters: ReposGetCombinedStatusForRefEndpoint = js.native
  
  var request: ReposGetCombinedStatusForRefRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetCombinedStatusForRefResponseData] = js.native
}
object ParametersReposGetCombinedStatusForRefEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetCombinedStatusForRefEndpoint,
    request: ReposGetCombinedStatusForRefRequestOptions,
    response: OctokitResponse[ReposGetCombinedStatusForRefResponseData]
  ): ParametersReposGetCombinedStatusForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetCombinedStatusForRefEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetCombinedStatusForRefEndpointMutableBuilder[Self <: ParametersReposGetCombinedStatusForRefEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetCombinedStatusForRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetCombinedStatusForRefRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCombinedStatusForRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
