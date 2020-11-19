package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsListForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListForRepoRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsListForRepoEndpoint extends js.Object {
  
  var parameters: ProjectsListForRepoEndpoint = js.native
  
  var request: ProjectsListForRepoRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsListForRepoResponseData] = js.native
}
object ParametersProjectsListForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsListForRepoEndpoint,
    request: ProjectsListForRepoRequestOptions,
    response: OctokitResponse[ProjectsListForRepoResponseData]
  ): ParametersProjectsListForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsListForRepoEndpointOps[Self <: ParametersProjectsListForRepoEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ProjectsListForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsListForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
