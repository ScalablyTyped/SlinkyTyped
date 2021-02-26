package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposCreateDeploymentStatusEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateDeploymentStatusRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateDeploymentStatusResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateDeploymentStatusEndpoint extends StObject {
  
  var parameters: ReposCreateDeploymentStatusEndpoint = js.native
  
  var request: ReposCreateDeploymentStatusRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateDeploymentStatusResponseData] = js.native
}
object ParametersReposCreateDeploymentStatusEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateDeploymentStatusEndpoint,
    request: ReposCreateDeploymentStatusRequestOptions,
    response: OctokitResponse[ReposCreateDeploymentStatusResponseData]
  ): ParametersReposCreateDeploymentStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateDeploymentStatusEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateDeploymentStatusEndpointMutableBuilder[Self <: ParametersReposCreateDeploymentStatusEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreateDeploymentStatusEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateDeploymentStatusRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateDeploymentStatusResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
