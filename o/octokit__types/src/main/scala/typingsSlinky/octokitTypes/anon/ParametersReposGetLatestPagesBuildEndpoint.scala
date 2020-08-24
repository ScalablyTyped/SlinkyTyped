package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetLatestPagesBuildEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetLatestPagesBuildRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetLatestPagesBuildResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetLatestPagesBuildEndpoint extends js.Object {
  var parameters: ReposGetLatestPagesBuildEndpoint = js.native
  var request: ReposGetLatestPagesBuildRequestOptions = js.native
  var response: OctokitResponse[ReposGetLatestPagesBuildResponseData] = js.native
}

object ParametersReposGetLatestPagesBuildEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetLatestPagesBuildEndpoint,
    request: ReposGetLatestPagesBuildRequestOptions,
    response: OctokitResponse[ReposGetLatestPagesBuildResponseData]
  ): ParametersReposGetLatestPagesBuildEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetLatestPagesBuildEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetLatestPagesBuildEndpointOps[Self <: ParametersReposGetLatestPagesBuildEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetLatestPagesBuildEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetLatestPagesBuildRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetLatestPagesBuildResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

