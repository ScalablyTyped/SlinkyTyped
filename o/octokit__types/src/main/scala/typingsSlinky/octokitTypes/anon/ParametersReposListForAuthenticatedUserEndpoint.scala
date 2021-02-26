package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ReposListForAuthenticatedUserEndpoint = js.native
  
  var request: ReposListForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposListForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListForAuthenticatedUserEndpoint,
    request: ReposListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersReposListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
