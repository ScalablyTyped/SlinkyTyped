package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.BillingGetGithubActionsBillingOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.BillingGetGithubActionsBillingOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.BillingGetGithubActionsBillingOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersBillingGetGithubActionsBillingOrgEndpoint extends js.Object {
  
  var parameters: BillingGetGithubActionsBillingOrgEndpoint = js.native
  
  var request: BillingGetGithubActionsBillingOrgRequestOptions = js.native
  
  var response: OctokitResponse[BillingGetGithubActionsBillingOrgResponseData] = js.native
}
object ParametersBillingGetGithubActionsBillingOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: BillingGetGithubActionsBillingOrgEndpoint,
    request: BillingGetGithubActionsBillingOrgRequestOptions,
    response: OctokitResponse[BillingGetGithubActionsBillingOrgResponseData]
  ): ParametersBillingGetGithubActionsBillingOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetGithubActionsBillingOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersBillingGetGithubActionsBillingOrgEndpointOps[Self <: ParametersBillingGetGithubActionsBillingOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: BillingGetGithubActionsBillingOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: BillingGetGithubActionsBillingOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetGithubActionsBillingOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
