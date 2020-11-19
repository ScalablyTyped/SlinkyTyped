package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListAccountsForPlanStubbedEndpoint extends js.Object {
  
  var parameters: AppsListAccountsForPlanStubbedEndpoint = js.native
  
  var request: AppsListAccountsForPlanStubbedRequestOptions = js.native
  
  var response: OctokitResponse[AppsListAccountsForPlanStubbedResponseData] = js.native
}
object ParametersAppsListAccountsForPlanStubbedEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListAccountsForPlanStubbedEndpoint,
    request: AppsListAccountsForPlanStubbedRequestOptions,
    response: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]
  ): ParametersAppsListAccountsForPlanStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListAccountsForPlanStubbedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListAccountsForPlanStubbedEndpointOps[Self <: ParametersAppsListAccountsForPlanStubbedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: AppsListAccountsForPlanStubbedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsListAccountsForPlanStubbedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
