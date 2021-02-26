package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteEndpoint extends StObject {
  
  var parameters: ReposDeleteEndpoint = js.native
  
  var request: ReposDeleteRequestOptions = js.native
  
  var response: OctokitResponse[ReposDeleteResponseData] = js.native
}
object ParametersReposDeleteEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteEndpoint,
    request: ReposDeleteRequestOptions,
    response: OctokitResponse[ReposDeleteResponseData]
  ): ParametersReposDeleteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteEndpointMutableBuilder[Self <: ParametersReposDeleteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposDeleteResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
