package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminCreateRemoveTokenForEnterpriseRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminCreateRemoveTokenForEnterpriseResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminCreateRemoveTokenForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminCreateRemoveTokenForEnterpriseResponseData] = js.native
}
object ParametersEnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint,
    request: EnterpriseAdminCreateRemoveTokenForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminCreateRemoveTokenForEnterpriseResponseData]
  ): ParametersEnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminCreateRemoveTokenForEnterpriseEndpointOps[Self <: ParametersEnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminCreateRemoveTokenForEnterpriseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminCreateRemoveTokenForEnterpriseRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminCreateRemoveTokenForEnterpriseResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
