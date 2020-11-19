package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRemoveTokenForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsCreateRemoveTokenForOrgEndpoint extends js.Object {
  
  var parameters: ActionsCreateRemoveTokenForOrgEndpoint = js.native
  
  var request: ActionsCreateRemoveTokenForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData] = js.native
}
object ParametersActionsCreateRemoveTokenForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCreateRemoveTokenForOrgEndpoint,
    request: ActionsCreateRemoveTokenForOrgRequestOptions,
    response: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData]
  ): ParametersActionsCreateRemoveTokenForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateRemoveTokenForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCreateRemoveTokenForOrgEndpointOps[Self <: ParametersActionsCreateRemoveTokenForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActionsCreateRemoveTokenForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCreateRemoveTokenForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateRemoveTokenForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
