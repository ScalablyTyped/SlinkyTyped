package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint = js.native
  
  var request: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseResponseData] = js.native
}
object ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint,
    request: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseRequestOptions,
    response: OctokitResponse[EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseResponseData]
  ): ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpointOps[Self <: ParametersEnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminListSelfHostedRunnersInGroupForEnterpriseResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
