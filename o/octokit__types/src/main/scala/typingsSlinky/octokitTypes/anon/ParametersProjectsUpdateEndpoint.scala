package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsUpdateEndpoint extends StObject {
  
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
  implicit class ParametersProjectsUpdateEndpointMutableBuilder[Self <: ParametersProjectsUpdateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsUpdateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsUpdateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
