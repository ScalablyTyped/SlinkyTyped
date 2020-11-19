package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsDeleteForTeamDiscussionCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsDeleteForTeamDiscussionCommentRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsDeleteForTeamDiscussionCommentEndpoint extends js.Object {
  
  var parameters: ReactionsDeleteForTeamDiscussionCommentEndpoint = js.native
  
  var request: ReactionsDeleteForTeamDiscussionCommentRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReactionsDeleteForTeamDiscussionCommentEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsDeleteForTeamDiscussionCommentEndpoint,
    request: ReactionsDeleteForTeamDiscussionCommentRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteForTeamDiscussionCommentEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteForTeamDiscussionCommentEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsDeleteForTeamDiscussionCommentEndpointOps[Self <: ParametersReactionsDeleteForTeamDiscussionCommentEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReactionsDeleteForTeamDiscussionCommentEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsDeleteForTeamDiscussionCommentRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
