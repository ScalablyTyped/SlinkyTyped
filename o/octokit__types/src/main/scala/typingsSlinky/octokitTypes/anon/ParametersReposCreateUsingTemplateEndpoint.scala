package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposCreateUsingTemplateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateUsingTemplateRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateUsingTemplateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersReposCreateUsingTemplateEndpoint extends js.Object {
  var parameters: ReposCreateUsingTemplateEndpoint = js.native
  var request: ReposCreateUsingTemplateRequestOptions = js.native
  var response: OctokitResponse[ReposCreateUsingTemplateResponseData] = js.native
}

object ParametersReposCreateUsingTemplateEndpoint {
  @scala.inline
  def apply(
    parameters: ReposCreateUsingTemplateEndpoint,
    request: ReposCreateUsingTemplateRequestOptions,
    response: OctokitResponse[ReposCreateUsingTemplateResponseData]
  ): ParametersReposCreateUsingTemplateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateUsingTemplateEndpoint]
  }
  @scala.inline
  implicit class ParametersReposCreateUsingTemplateEndpointOps[Self <: ParametersReposCreateUsingTemplateEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ReposCreateUsingTemplateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ReposCreateUsingTemplateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateUsingTemplateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

