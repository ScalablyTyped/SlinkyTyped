package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposCompareCommitsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCompareCommitsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposCompareCommitsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposCompareCommitsEndpoint extends js.Object {
  var parameters: ReposCompareCommitsEndpoint = js.native
  var request: ReposCompareCommitsRequestOptions = js.native
  var response: OctokitResponse[ReposCompareCommitsResponseData] = js.native
}

object ParametersReposCompareCommitsEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCompareCommitsEndpoint,
    request: ReposCompareCommitsRequestOptions,
    response: OctokitResponse[ReposCompareCommitsResponseData]
  ): ParametersReposCompareCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCompareCommitsEndpoint]
  }
  @scala.inline
  implicit class ParametersReposCompareCommitsEndpointOps[Self <: ParametersReposCompareCommitsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposCompareCommitsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposCompareCommitsRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCompareCommitsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

