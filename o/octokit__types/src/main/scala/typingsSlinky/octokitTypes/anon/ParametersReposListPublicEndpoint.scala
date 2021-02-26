package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListPublicEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListPublicRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListPublicResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListPublicEndpoint extends StObject {
  
  var parameters: ReposListPublicEndpoint = js.native
  
  var request: ReposListPublicRequestOptions = js.native
  
  var response: OctokitResponse[ReposListPublicResponseData] = js.native
}
object ParametersReposListPublicEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListPublicEndpoint,
    request: ReposListPublicRequestOptions,
    response: OctokitResponse[ReposListPublicResponseData]
  ): ParametersReposListPublicEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListPublicEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListPublicEndpointMutableBuilder[Self <: ParametersReposListPublicEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListPublicEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListPublicRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListPublicResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
