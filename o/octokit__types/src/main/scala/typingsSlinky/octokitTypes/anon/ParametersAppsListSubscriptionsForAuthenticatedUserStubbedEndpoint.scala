package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserStubbedRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsListSubscriptionsForAuthenticatedUserStubbedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint extends js.Object {
  
  var parameters: AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint = js.native
  
  var request: AppsListSubscriptionsForAuthenticatedUserStubbedRequestOptions = js.native
  
  var response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserStubbedResponseData] = js.native
}
object ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint,
    request: AppsListSubscriptionsForAuthenticatedUserStubbedRequestOptions,
    response: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserStubbedResponseData]
  ): ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpointOps[Self <: ParametersAppsListSubscriptionsForAuthenticatedUserStubbedEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: AppsListSubscriptionsForAuthenticatedUserStubbedEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsListSubscriptionsForAuthenticatedUserStubbedRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListSubscriptionsForAuthenticatedUserStubbedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
