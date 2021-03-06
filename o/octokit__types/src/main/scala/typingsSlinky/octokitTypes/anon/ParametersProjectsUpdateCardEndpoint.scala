package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateCardEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateCardRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ProjectsUpdateCardResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsUpdateCardEndpoint extends StObject {
  
  var parameters: ProjectsUpdateCardEndpoint = js.native
  
  var request: ProjectsUpdateCardRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsUpdateCardResponseData] = js.native
}
object ParametersProjectsUpdateCardEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsUpdateCardEndpoint,
    request: ProjectsUpdateCardRequestOptions,
    response: OctokitResponse[ProjectsUpdateCardResponseData]
  ): ParametersProjectsUpdateCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsUpdateCardEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsUpdateCardEndpointMutableBuilder[Self <: ParametersProjectsUpdateCardEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsUpdateCardEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsUpdateCardRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsUpdateCardResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
