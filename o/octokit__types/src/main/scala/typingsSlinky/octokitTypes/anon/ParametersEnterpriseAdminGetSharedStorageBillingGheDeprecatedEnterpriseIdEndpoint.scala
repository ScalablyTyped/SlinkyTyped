package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetSharedStorageBillingGheResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint = js.native
  
  var request: EnterpriseAdminGetSharedStorageBillingGheRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData] = js.native
}
object ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint,
    request: EnterpriseAdminGetSharedStorageBillingGheRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData]
  ): ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpointOps[Self <: ParametersEnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminGetSharedStorageBillingGheDeprecatedEnterpriseIdEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetSharedStorageBillingGheRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetSharedStorageBillingGheResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
