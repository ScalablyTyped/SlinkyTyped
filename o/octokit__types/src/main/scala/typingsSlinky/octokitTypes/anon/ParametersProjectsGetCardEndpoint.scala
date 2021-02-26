package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsGetCardEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsGetCardRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ProjectsGetCardResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsGetCardEndpoint extends StObject {
  
  var parameters: ProjectsGetCardEndpoint = js.native
  
  var request: ProjectsGetCardRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsGetCardResponseData] = js.native
}
object ParametersProjectsGetCardEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsGetCardEndpoint,
    request: ProjectsGetCardRequestOptions,
    response: OctokitResponse[ProjectsGetCardResponseData]
  ): ParametersProjectsGetCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsGetCardEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsGetCardEndpointMutableBuilder[Self <: ParametersProjectsGetCardEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsGetCardEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsGetCardRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsGetCardResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
