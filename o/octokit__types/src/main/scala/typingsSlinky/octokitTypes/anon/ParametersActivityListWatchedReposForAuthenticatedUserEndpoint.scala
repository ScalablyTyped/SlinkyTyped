package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityListWatchedReposForAuthenticatedUserEndpoint extends js.Object {
  
  var parameters: ActivityListWatchedReposForAuthenticatedUserEndpoint = js.native
  
  var request: ActivityListWatchedReposForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData] = js.native
}
object ParametersActivityListWatchedReposForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityListWatchedReposForAuthenticatedUserEndpoint,
    request: ActivityListWatchedReposForAuthenticatedUserRequestOptions,
    response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]
  ): ParametersActivityListWatchedReposForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListWatchedReposForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityListWatchedReposForAuthenticatedUserEndpointOps[Self <: ParametersActivityListWatchedReposForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ActivityListWatchedReposForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityListWatchedReposForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
