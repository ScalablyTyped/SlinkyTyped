package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint = js.native
  
  var response: OctokitResponse[EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData] with DataArray = js.native
}
object ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint,
    response: OctokitResponse[EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData] with DataArray
  ): ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpointOps[Self <: ParametersEnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[EnterpriseAdminListOrgAccessToSelfHostedRunnerGroupInEnterpriseResponseData] with DataArray
    ): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
