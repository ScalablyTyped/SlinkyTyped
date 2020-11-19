package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListDeploymentStatusesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListDeploymentStatusesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListDeploymentStatusesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListDeploymentStatusesEndpoint extends js.Object {
  
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
  implicit class ParametersReposListDeploymentStatusesEndpointOps[Self <: ParametersReposListDeploymentStatusesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: ReposListDeploymentStatusesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListDeploymentStatusesRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListDeploymentStatusesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
