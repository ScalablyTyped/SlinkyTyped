package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteDeployKeyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteDeployKeyRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteDeployKeyEndpoint extends StObject {
  
  var parameters: ReposDeleteDeployKeyEndpoint = js.native
  
  var request: ReposDeleteDeployKeyRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeleteDeployKeyEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteDeployKeyEndpoint,
    request: ReposDeleteDeployKeyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteDeployKeyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteDeployKeyEndpointMutableBuilder[Self <: ParametersReposDeleteDeployKeyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteDeployKeyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteDeployKeyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
