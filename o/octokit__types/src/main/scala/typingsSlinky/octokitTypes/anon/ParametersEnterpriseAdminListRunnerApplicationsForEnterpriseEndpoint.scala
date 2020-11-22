package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminListRunnerApplicationsForEnterpriseRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminListRunnerApplicationsForEnterpriseResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminListRunnerApplicationsForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminListRunnerApplicationsForEnterpriseResponseData] = js.native
}
object ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint,
    request: EnterpriseAdminListRunnerApplicationsForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminListRunnerApplicationsForEnterpriseResponseData]
  ): ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpointOps[Self <: ParametersEnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminListRunnerApplicationsForEnterpriseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminListRunnerApplicationsForEnterpriseRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminListRunnerApplicationsForEnterpriseResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
