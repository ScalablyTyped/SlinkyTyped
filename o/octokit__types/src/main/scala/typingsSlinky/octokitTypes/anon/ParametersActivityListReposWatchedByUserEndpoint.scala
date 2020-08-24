package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposWatchedByUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposWatchedByUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposWatchedByUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersActivityListReposWatchedByUserEndpoint extends js.Object {
  var parameters: ActivityListReposWatchedByUserEndpoint = js.native
  var request: ActivityListReposWatchedByUserRequestOptions = js.native
  var response: OctokitResponse[ActivityListReposWatchedByUserResponseData] = js.native
}

object ParametersActivityListReposWatchedByUserEndpoint {
  @scala.inline
  def apply(
    parameters: ActivityListReposWatchedByUserEndpoint,
    request: ActivityListReposWatchedByUserRequestOptions,
    response: OctokitResponse[ActivityListReposWatchedByUserResponseData]
  ): ParametersActivityListReposWatchedByUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityListReposWatchedByUserEndpoint]
  }
  @scala.inline
  implicit class ParametersActivityListReposWatchedByUserEndpointOps[Self <: ParametersActivityListReposWatchedByUserEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ActivityListReposWatchedByUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ActivityListReposWatchedByUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListReposWatchedByUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

