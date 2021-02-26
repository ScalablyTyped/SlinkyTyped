package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminProvisionAndInviteEnterpriseUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint extends StObject {
  
  var parameters: EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint = js.native
  
  var request: EnterpriseAdminProvisionAndInviteEnterpriseUserRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseUserResponseData] = js.native
}
object ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint,
    request: EnterpriseAdminProvisionAndInviteEnterpriseUserRequestOptions,
    response: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseUserResponseData]
  ): ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpointMutableBuilder[Self <: ParametersEnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminProvisionAndInviteEnterpriseUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminProvisionAndInviteEnterpriseUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminProvisionAndInviteEnterpriseUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
