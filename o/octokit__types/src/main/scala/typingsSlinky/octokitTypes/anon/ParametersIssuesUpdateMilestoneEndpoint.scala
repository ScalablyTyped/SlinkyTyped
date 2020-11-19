package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateMilestoneEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateMilestoneRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateMilestoneResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesUpdateMilestoneEndpoint extends js.Object {
  
  var parameters: IssuesUpdateMilestoneEndpoint = js.native
  
  var request: IssuesUpdateMilestoneRequestOptions = js.native
  
  var response: OctokitResponse[IssuesUpdateMilestoneResponseData] = js.native
}
object ParametersIssuesUpdateMilestoneEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesUpdateMilestoneEndpoint,
    request: IssuesUpdateMilestoneRequestOptions,
    response: OctokitResponse[IssuesUpdateMilestoneResponseData]
  ): ParametersIssuesUpdateMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesUpdateMilestoneEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesUpdateMilestoneEndpointOps[Self <: ParametersIssuesUpdateMilestoneEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesUpdateMilestoneEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesUpdateMilestoneRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesUpdateMilestoneResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
