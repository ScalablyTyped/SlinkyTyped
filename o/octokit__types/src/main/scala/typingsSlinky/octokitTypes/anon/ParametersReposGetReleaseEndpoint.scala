package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetReleaseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetReleaseRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetReleaseResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetReleaseEndpoint extends StObject {
  
  var parameters: ReposGetReleaseEndpoint = js.native
  
  var request: ReposGetReleaseRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetReleaseResponseData] = js.native
}
object ParametersReposGetReleaseEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetReleaseEndpoint,
    request: ReposGetReleaseRequestOptions,
    response: OctokitResponse[ReposGetReleaseResponseData]
  ): ParametersReposGetReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetReleaseEndpointMutableBuilder[Self <: ParametersReposGetReleaseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetReleaseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetReleaseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetReleaseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
