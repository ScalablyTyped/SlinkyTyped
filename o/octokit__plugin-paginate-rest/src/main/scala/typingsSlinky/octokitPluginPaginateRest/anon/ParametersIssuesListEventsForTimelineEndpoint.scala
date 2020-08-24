package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesListEventsForTimelineEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListEventsForTimelineResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersIssuesListEventsForTimelineEndpoint extends js.Object {
  var parameters: IssuesListEventsForTimelineEndpoint = js.native
  var response: OctokitResponse[IssuesListEventsForTimelineResponseData] = js.native
}

object ParametersIssuesListEventsForTimelineEndpoint {
  @scala.inline
  def apply(
    parameters: IssuesListEventsForTimelineEndpoint,
    response: OctokitResponse[IssuesListEventsForTimelineResponseData]
  ): ParametersIssuesListEventsForTimelineEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsForTimelineEndpoint]
  }
  @scala.inline
  implicit class ParametersIssuesListEventsForTimelineEndpointOps[Self <: ParametersIssuesListEventsForTimelineEndpoint] (val x: Self) extends AnyVal {
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
    def setParameters(value: IssuesListEventsForTimelineEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListEventsForTimelineResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
  
}

