package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetClonesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetClonesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetClonesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposGetClonesEndpoint extends js.Object {
  var parameters: ReposGetClonesEndpoint = js.native
  var request: ReposGetClonesRequestOptions = js.native
  var response: OctokitResponse[ReposGetClonesResponseData] = js.native
}

object ParametersReposGetClonesEndpoint {
  @scala.inline
  def apply(
    parameters: ReposGetClonesEndpoint,
    request: ReposGetClonesRequestOptions,
    response: OctokitResponse[ReposGetClonesResponseData]
  ): ParametersReposGetClonesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetClonesEndpoint]
  }
  @scala.inline
  implicit class ParametersReposGetClonesEndpointOps[Self <: ParametersReposGetClonesEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposGetClonesEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposGetClonesRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetClonesResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

