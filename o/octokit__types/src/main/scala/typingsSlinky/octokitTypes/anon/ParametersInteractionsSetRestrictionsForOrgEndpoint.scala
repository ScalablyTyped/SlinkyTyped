package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersInteractionsSetRestrictionsForOrgEndpoint extends js.Object {
  
  var parameters: InteractionsSetRestrictionsForOrgEndpoint = js.native
  
  var request: InteractionsSetRestrictionsForOrgRequestOptions = js.native
  
  var response: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData] = js.native
}
object ParametersInteractionsSetRestrictionsForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: InteractionsSetRestrictionsForOrgEndpoint,
    request: InteractionsSetRestrictionsForOrgRequestOptions,
    response: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]
  ): ParametersInteractionsSetRestrictionsForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersInteractionsSetRestrictionsForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersInteractionsSetRestrictionsForOrgEndpointOps[Self <: ParametersInteractionsSetRestrictionsForOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: InteractionsSetRestrictionsForOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: InteractionsSetRestrictionsForOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
