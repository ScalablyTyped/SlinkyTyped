package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsGetEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsGetRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ProjectsGetResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsGetEndpoint extends StObject {
  
  var parameters: ProjectsGetEndpoint = js.native
  
  var request: ProjectsGetRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsGetResponseData] = js.native
}
object ParametersProjectsGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsGetEndpoint,
    request: ProjectsGetRequestOptions,
    response: OctokitResponse[ProjectsGetResponseData]
  ): ParametersProjectsGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsGetEndpointMutableBuilder[Self <: ParametersProjectsGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
