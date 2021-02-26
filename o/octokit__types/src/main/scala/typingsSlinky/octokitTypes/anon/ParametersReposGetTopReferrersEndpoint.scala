package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetTopReferrersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetTopReferrersRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetTopReferrersResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetTopReferrersEndpoint extends StObject {
  
  var parameters: ReposGetTopReferrersEndpoint = js.native
  
  var request: ReposGetTopReferrersRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetTopReferrersResponseData] = js.native
}
object ParametersReposGetTopReferrersEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetTopReferrersEndpoint,
    request: ReposGetTopReferrersRequestOptions,
    response: OctokitResponse[ReposGetTopReferrersResponseData]
  ): ParametersReposGetTopReferrersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetTopReferrersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetTopReferrersEndpointMutableBuilder[Self <: ParametersReposGetTopReferrersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetTopReferrersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetTopReferrersRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetTopReferrersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
