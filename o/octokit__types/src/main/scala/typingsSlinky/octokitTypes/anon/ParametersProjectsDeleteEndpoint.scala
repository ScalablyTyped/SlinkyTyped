package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsDeleteEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsDeleteRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsDeleteEndpoint extends StObject {
  
  var parameters: ProjectsDeleteEndpoint = js.native
  
  var request: ProjectsDeleteRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersProjectsDeleteEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsDeleteEndpoint,
    request: ProjectsDeleteRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsDeleteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsDeleteEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsDeleteEndpointMutableBuilder[Self <: ParametersProjectsDeleteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsDeleteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsDeleteRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
