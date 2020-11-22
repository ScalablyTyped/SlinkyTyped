package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.EnterpriseAdminGetGithubActionsBillingGheResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersEnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint extends js.Object {
  
  var parameters: EnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint = js.native
  
  var request: EnterpriseAdminGetGithubActionsBillingGheRequestOptions = js.native
  
  var response: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData] = js.native
}
object ParametersEnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint {
  
  @scala.inline
  def apply(
    parameters: EnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint,
    request: EnterpriseAdminGetGithubActionsBillingGheRequestOptions,
    response: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData]
  ): ParametersEnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersEnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint]
  }
  
  @scala.inline
  implicit class ParametersEnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpointOps[Self <: ParametersEnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: EnterpriseAdminGetGithubActionsBillingGheDeprecatedEnterpriseIdEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: EnterpriseAdminGetGithubActionsBillingGheRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[EnterpriseAdminGetGithubActionsBillingGheResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
