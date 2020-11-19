package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionInOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForTeamDiscussionInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsListForTeamDiscussionInOrgEndpoint extends js.Object {
  
  var parameters: ReactionsListForTeamDiscussionInOrgEndpoint = js.native
  
  var request: ReactionsListForTeamDiscussionInOrgRequestOptions = js.native
  
  var response: OctokitResponse[ReactionsListForTeamDiscussionInOrgResponseData] = js.native
}
object ParametersReactionsListForTeamDiscussionInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsListForTeamDiscussionInOrgEndpoint,
    request: ReactionsListForTeamDiscussionInOrgRequestOptions,
    response: OctokitResponse[ReactionsListForTeamDiscussionInOrgResponseData]
  ): ParametersReactionsListForTeamDiscussionInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsListForTeamDiscussionInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsListForTeamDiscussionInOrgEndpointOps[Self <: ParametersReactionsListForTeamDiscussionInOrgEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReactionsListForTeamDiscussionInOrgEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsListForTeamDiscussionInOrgRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForTeamDiscussionInOrgResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
