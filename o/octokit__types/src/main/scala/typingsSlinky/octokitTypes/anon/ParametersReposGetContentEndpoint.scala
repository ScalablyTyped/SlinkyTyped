package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetContentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetContentRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetContentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetContentEndpoint extends StObject {
  
  var parameters: ReposGetContentEndpoint = js.native
  
  var request: ReposGetContentRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetContentResponseData] = js.native
}
object ParametersReposGetContentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetContentEndpoint,
    request: ReposGetContentRequestOptions,
    response: OctokitResponse[ReposGetContentResponseData]
  ): ParametersReposGetContentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetContentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetContentEndpointMutableBuilder[Self <: ParametersReposGetContentEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetContentEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetContentRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetContentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
