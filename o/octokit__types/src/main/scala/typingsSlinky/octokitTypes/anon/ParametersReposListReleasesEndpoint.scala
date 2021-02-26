package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListReleasesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListReleasesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListReleasesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListReleasesEndpoint extends StObject {
  
  var parameters: ReposListReleasesEndpoint = js.native
  
  var request: ReposListReleasesRequestOptions = js.native
  
  var response: OctokitResponse[ReposListReleasesResponseData] = js.native
}
object ParametersReposListReleasesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListReleasesEndpoint,
    request: ReposListReleasesRequestOptions,
    response: OctokitResponse[ReposListReleasesResponseData]
  ): ParametersReposListReleasesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListReleasesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListReleasesEndpointMutableBuilder[Self <: ParametersReposListReleasesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListReleasesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListReleasesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListReleasesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
