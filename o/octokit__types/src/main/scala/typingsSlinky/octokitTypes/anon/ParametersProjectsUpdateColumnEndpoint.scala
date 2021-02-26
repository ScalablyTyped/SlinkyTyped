package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateColumnEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateColumnRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateColumnResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsUpdateColumnEndpoint extends StObject {
  
  var parameters: ProjectsUpdateColumnEndpoint = js.native
  
  var request: ProjectsUpdateColumnRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsUpdateColumnResponseData] = js.native
}
object ParametersProjectsUpdateColumnEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsUpdateColumnEndpoint,
    request: ProjectsUpdateColumnRequestOptions,
    response: OctokitResponse[ProjectsUpdateColumnResponseData]
  ): ParametersProjectsUpdateColumnEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsUpdateColumnEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsUpdateColumnEndpointMutableBuilder[Self <: ParametersProjectsUpdateColumnEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsUpdateColumnEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsUpdateColumnRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsUpdateColumnResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
