package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsListCardsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListCardsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersProjectsListCardsEndpoint extends js.Object {
  var parameters: ProjectsListCardsEndpoint = js.native
  var response: OctokitResponse[ProjectsListCardsResponseData] = js.native
}

object ParametersProjectsListCardsEndpoint {
  @scala.inline
  def apply(parameters: ProjectsListCardsEndpoint, response: OctokitResponse[ProjectsListCardsResponseData]): ParametersProjectsListCardsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListCardsEndpoint]
  }
  @scala.inline
  implicit class ParametersProjectsListCardsEndpointOps[Self <: ParametersProjectsListCardsEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: ProjectsListCardsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListCardsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

