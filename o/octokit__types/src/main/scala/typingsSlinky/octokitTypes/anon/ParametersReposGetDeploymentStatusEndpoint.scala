package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetDeploymentStatusEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetDeploymentStatusRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetDeploymentStatusResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetDeploymentStatusEndpoint extends js.Object {
  
  var parameters: ReposGetDeploymentStatusEndpoint = js.native
  
  var request: ReposGetDeploymentStatusRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetDeploymentStatusResponseData] = js.native
}
object ParametersReposGetDeploymentStatusEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetDeploymentStatusEndpoint,
    request: ReposGetDeploymentStatusRequestOptions,
    response: OctokitResponse[ReposGetDeploymentStatusResponseData]
  ): ParametersReposGetDeploymentStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetDeploymentStatusEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetDeploymentStatusEndpointOps[Self <: ParametersReposGetDeploymentStatusEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposGetDeploymentStatusEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetDeploymentStatusRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetDeploymentStatusResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
