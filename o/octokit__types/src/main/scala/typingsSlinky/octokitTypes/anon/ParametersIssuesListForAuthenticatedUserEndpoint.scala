package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListForAuthenticatedUserEndpoint extends js.Object {
  
  var parameters: IssuesListForAuthenticatedUserEndpoint = js.native
  
  var request: IssuesListForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[IssuesListForAuthenticatedUserResponseData] = js.native
}
object ParametersIssuesListForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListForAuthenticatedUserEndpoint,
    request: IssuesListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[IssuesListForAuthenticatedUserResponseData]
  ): ParametersIssuesListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListForAuthenticatedUserEndpointOps[Self <: ParametersIssuesListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: IssuesListForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
