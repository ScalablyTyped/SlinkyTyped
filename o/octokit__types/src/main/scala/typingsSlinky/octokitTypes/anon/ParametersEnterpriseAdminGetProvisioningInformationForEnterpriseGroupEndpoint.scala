package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseGroupRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetProvisioningInformationForEnterpriseGroupResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint extends StObject {
  
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
  implicit class ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpointMutableBuilder[Self <: ParametersEnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetProvisioningInformationForEnterpriseGroupRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetProvisioningInformationForEnterpriseGroupResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
