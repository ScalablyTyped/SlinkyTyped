package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveCollaboratorEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveCollaboratorRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposRemoveCollaboratorEndpoint extends js.Object {
  
  var parameters: ReposRemoveCollaboratorEndpoint = js.native
  
  var request: ReposRemoveCollaboratorRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposRemoveCollaboratorEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposRemoveCollaboratorEndpoint,
    request: ReposRemoveCollaboratorRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposRemoveCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposRemoveCollaboratorEndpointOps[Self <: ParametersReposRemoveCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ReposRemoveCollaboratorEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposRemoveCollaboratorRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
