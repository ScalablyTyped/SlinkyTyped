package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposDeleteEndpoint extends js.Object {
  var parameters: ReposDeleteEndpoint = js.native
  var request: ReposDeleteRequestOptions = js.native
  var response: OctokitResponse[ReposDeleteResponseData] = js.native
}

object ParametersReposDeleteEndpoint {
  @scala.inline
  def apply(
    parameters: ReposDeleteEndpoint,
    request: ReposDeleteRequestOptions,
    response: OctokitResponse[ReposDeleteResponseData]
  ): ParametersReposDeleteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteEndpoint]
  }
  @scala.inline
  implicit class ParametersReposDeleteEndpointOps[Self <: ParametersReposDeleteEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposDeleteEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposDeleteRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposDeleteResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

