package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsUpdateEndpoint extends js.Object {
  
  var parameters: ProjectsUpdateEndpoint = js.native
  
  var request: ProjectsUpdateRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsUpdateResponseData] = js.native
}
object ParametersProjectsUpdateEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsUpdateEndpoint,
    request: ProjectsUpdateRequestOptions,
    response: OctokitResponse[ProjectsUpdateResponseData]
  ): ParametersProjectsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsUpdateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsUpdateEndpointOps[Self <: ParametersProjectsUpdateEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: ProjectsUpdateEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsUpdateRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsUpdateResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
