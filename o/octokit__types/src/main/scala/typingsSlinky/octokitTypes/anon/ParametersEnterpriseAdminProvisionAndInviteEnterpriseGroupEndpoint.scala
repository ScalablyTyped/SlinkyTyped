package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseGroupRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint extends StObject {
  
  var parameters: EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint = js.native
  
  var request: EnterpriseAdminProvisionAndInviteEnterpriseGroupRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData] = js.native
}
object ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint,
    request: EnterpriseAdminProvisionAndInviteEnterpriseGroupRequestOptions,
    response: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData]
  ): ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpointMutableBuilder[Self <: ParametersEnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminProvisionAndInviteEnterpriseGroupEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminProvisionAndInviteEnterpriseGroupRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseGroupResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
