package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetDeployKeyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetDeployKeyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetDeployKeyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetDeployKeyEndpoint extends StObject {
  
  var parameters: ReposGetDeployKeyEndpoint = js.native
  
  var request: ReposGetDeployKeyRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetDeployKeyResponseData] = js.native
}
object ParametersReposGetDeployKeyEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetDeployKeyEndpoint,
    request: ReposGetDeployKeyRequestOptions,
    response: OctokitResponse[ReposGetDeployKeyResponseData]
  ): ParametersReposGetDeployKeyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetDeployKeyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetDeployKeyEndpointMutableBuilder[Self <: ParametersReposGetDeployKeyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetDeployKeyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetDeployKeyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetDeployKeyResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
