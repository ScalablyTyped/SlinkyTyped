package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionsLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionsLegacyRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.TeamsListDiscussionsLegacyResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersTeamsListDiscussionsLegacyEndpoint extends js.Object {
  var parameters: TeamsListDiscussionsLegacyEndpoint = js.native
  var request: TeamsListDiscussionsLegacyRequestOptions = js.native
  var response: OctokitResponse[TeamsListDiscussionsLegacyResponseData] = js.native
}

object ParametersTeamsListDiscussionsLegacyEndpoint {
  @scala.inline
  def apply(
    parameters: TeamsListDiscussionsLegacyEndpoint,
    request: TeamsListDiscussionsLegacyRequestOptions,
    response: OctokitResponse[TeamsListDiscussionsLegacyResponseData]
  ): ParametersTeamsListDiscussionsLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersTeamsListDiscussionsLegacyEndpoint]
  }
  @scala.inline
  implicit class ParametersTeamsListDiscussionsLegacyEndpointOps[Self <: ParametersTeamsListDiscussionsLegacyEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: TeamsListDiscussionsLegacyEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: TeamsListDiscussionsLegacyRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListDiscussionsLegacyResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

