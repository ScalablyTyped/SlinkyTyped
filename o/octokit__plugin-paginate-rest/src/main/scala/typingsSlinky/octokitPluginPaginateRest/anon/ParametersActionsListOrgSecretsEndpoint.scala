package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListOrgSecretsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListOrgSecretsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListOrgSecretsEndpoint extends js.Object {
  
  var parameters: ActionsListOrgSecretsEndpoint = js.native
  
  var response: OctokitResponse[ActionsListOrgSecretsResponseData] with `4` = js.native
}
object ParametersActionsListOrgSecretsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListOrgSecretsEndpoint,
    response: OctokitResponse[ActionsListOrgSecretsResponseData] with `4`
  ): ParametersActionsListOrgSecretsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListOrgSecretsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListOrgSecretsEndpointOps[Self <: ParametersActionsListOrgSecretsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsListOrgSecretsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListOrgSecretsResponseData] with `4`): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
