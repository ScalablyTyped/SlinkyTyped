package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetLatestReleaseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetLatestReleaseRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetLatestReleaseResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetLatestReleaseEndpoint extends StObject {
  
  var parameters: ReposGetLatestReleaseEndpoint = js.native
  
  var request: ReposGetLatestReleaseRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetLatestReleaseResponseData] = js.native
}
object ParametersReposGetLatestReleaseEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetLatestReleaseEndpoint,
    request: ReposGetLatestReleaseRequestOptions,
    response: OctokitResponse[ReposGetLatestReleaseResponseData]
  ): ParametersReposGetLatestReleaseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetLatestReleaseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetLatestReleaseEndpointMutableBuilder[Self <: ParametersReposGetLatestReleaseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetLatestReleaseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetLatestReleaseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetLatestReleaseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
