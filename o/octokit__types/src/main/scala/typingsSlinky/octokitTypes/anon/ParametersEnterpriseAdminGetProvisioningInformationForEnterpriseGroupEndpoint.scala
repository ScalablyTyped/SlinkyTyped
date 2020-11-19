package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseGroupRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseGroupResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint = js.native
  
  var request: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminGetProvisioningInformationForEnterpriseGroupResponseData] = js.native
}
object ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint,
    request: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetProvisioningInformationForEnterpriseGroupResponseData]
  ): ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpointOps[Self <: ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetProvisioningInformationForEnterpriseGroupResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
