package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateColumnEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateColumnRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateColumnResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersProjectsUpdateColumnEndpoint extends js.Object {
  var parameters: ProjectsUpdateColumnEndpoint = js.native
  var request: ProjectsUpdateColumnRequestOptions = js.native
  var response: OctokitResponse[ProjectsUpdateColumnResponseData] = js.native
}

object ParametersProjectsUpdateColumnEndpoint {
  @scala.inline
  def apply(
    parameters: ProjectsUpdateColumnEndpoint,
    request: ProjectsUpdateColumnRequestOptions,
    response: OctokitResponse[ProjectsUpdateColumnResponseData]
  ): ParametersProjectsUpdateColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsUpdateColumnEndpoint]
  }
  @scala.inline
  implicit class ParametersProjectsUpdateColumnEndpointOps[Self <: ParametersProjectsUpdateColumnEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ProjectsUpdateColumnEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: ProjectsUpdateColumnRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsUpdateColumnResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

