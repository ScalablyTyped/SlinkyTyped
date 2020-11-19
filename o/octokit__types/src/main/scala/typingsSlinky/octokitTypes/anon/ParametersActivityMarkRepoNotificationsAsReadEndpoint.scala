package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityMarkRepoNotificationsAsReadEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityMarkRepoNotificationsAsReadRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityMarkRepoNotificationsAsReadEndpoint extends js.Object {
  
  var parameters: ActivityMarkRepoNotificationsAsReadEndpoint = js.native
  
  var request: ActivityMarkRepoNotificationsAsReadRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityMarkRepoNotificationsAsReadEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityMarkRepoNotificationsAsReadEndpoint,
    request: ActivityMarkRepoNotificationsAsReadRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityMarkRepoNotificationsAsReadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityMarkRepoNotificationsAsReadEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityMarkRepoNotificationsAsReadEndpointOps[Self <: ParametersActivityMarkRepoNotificationsAsReadEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActivityMarkRepoNotificationsAsReadEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityMarkRepoNotificationsAsReadRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
