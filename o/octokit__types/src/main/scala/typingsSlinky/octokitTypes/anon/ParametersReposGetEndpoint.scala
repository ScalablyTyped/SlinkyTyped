package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetEndpoint extends StObject {
  
  var parameters: ReposGetEndpoint = js.native
  
  var request: ReposGetRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetResponseData] = js.native
}
object ParametersReposGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetEndpoint,
    request: ReposGetRequestOptions,
    response: OctokitResponse[ReposGetResponseData]
  ): ParametersReposGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetEndpointMutableBuilder[Self <: ParametersReposGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
