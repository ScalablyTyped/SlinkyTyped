package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminSetInformationForProvisionedEnterpriseUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint extends StObject {
  
  var parameters: EnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint = js.native
  
  var request: EnterpriseAdminSetInformationForProvisionedEnterpriseUserRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData] = js.native
}
object ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint,
    request: EnterpriseAdminSetInformationForProvisionedEnterpriseUserRequestOptions,
    response: OctokitResponse[EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData]
  ): ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpointMutableBuilder[Self <: ParametersEnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminSetInformationForProvisionedEnterpriseUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminSetInformationForProvisionedEnterpriseUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminSetInformationForProvisionedEnterpriseUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
