package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersBillingGetGithubPackagesBillingOrgEndpoint extends js.Object {
  
  var parameters: BillingGetGithubPackagesBillingOrgEndpoint = js.native
  
  var request: BillingGetGithubPackagesBillingOrgRequestOptions = js.native
  
  var response: OctokitResponse[BillingGetGithubPackagesBillingOrgResponseData] = js.native
}
object ParametersBillingGetGithubPackagesBillingOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: BillingGetGithubPackagesBillingOrgEndpoint,
    request: BillingGetGithubPackagesBillingOrgRequestOptions,
    response: OctokitResponse[BillingGetGithubPackagesBillingOrgResponseData]
  ): ParametersBillingGetGithubPackagesBillingOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersBillingGetGithubPackagesBillingOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersBillingGetGithubPackagesBillingOrgEndpointOps[Self <: ParametersBillingGetGithubPackagesBillingOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: BillingGetGithubPackagesBillingOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: BillingGetGithubPackagesBillingOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetGithubPackagesBillingOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
