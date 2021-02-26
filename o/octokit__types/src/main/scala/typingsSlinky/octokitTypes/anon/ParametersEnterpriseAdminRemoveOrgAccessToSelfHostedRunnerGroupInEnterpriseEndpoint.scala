package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint extends StObject {
  
  var parameters: EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersEnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint,
    request: EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions,
    response: OctokitResponse[_]
  ): ParametersEnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpointMutableBuilder[Self <: ParametersEnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminRemoveOrgAccessToSelfHostedRunnerGroupInEnterpriseRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
