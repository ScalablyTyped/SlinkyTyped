package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminSetSelfHostedInGroupForEnterpriseRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminSetSelfHostedInGroupForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersEnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint,
    request: EnterpriseAdminSetSelfHostedInGroupForEnterpriseRequestOptions,
    response: OctokitResponse[_]
  ): ParametersEnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpointOps[Self <: ParametersEnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminSetSelfHostedInGroupForEnterpriseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminSetSelfHostedInGroupForEnterpriseRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
