package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint extends js.Object {
  
  var parameters: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint = js.native
  
  var response: OctokitResponse[ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData] with `3` = js.native
}
object ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint,
    response: OctokitResponse[ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData] with `3`
  ): ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpointOps[Self <: ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData] with `3`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
