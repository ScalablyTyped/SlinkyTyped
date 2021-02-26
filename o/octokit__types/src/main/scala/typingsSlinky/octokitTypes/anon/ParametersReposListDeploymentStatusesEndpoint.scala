package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListDeploymentStatusesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListDeploymentStatusesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListDeploymentStatusesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListDeploymentStatusesEndpoint extends StObject {
  
  var parameters: ReposListDeploymentStatusesEndpoint = js.native
  
  var request: ReposListDeploymentStatusesRequestOptions = js.native
  
  var response: OctokitResponse[ReposListDeploymentStatusesResponseData] = js.native
}
object ParametersReposListDeploymentStatusesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListDeploymentStatusesEndpoint,
    request: ReposListDeploymentStatusesRequestOptions,
    response: OctokitResponse[ReposListDeploymentStatusesResponseData]
  ): ParametersReposListDeploymentStatusesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListDeploymentStatusesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListDeploymentStatusesEndpointMutableBuilder[Self <: ParametersReposListDeploymentStatusesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListDeploymentStatusesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListDeploymentStatusesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListDeploymentStatusesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
