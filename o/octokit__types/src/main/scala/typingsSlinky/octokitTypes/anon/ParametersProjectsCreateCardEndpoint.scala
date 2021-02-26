package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsCreateCardEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsCreateCardRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ProjectsCreateCardResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsCreateCardEndpoint extends StObject {
  
  var parameters: ProjectsCreateCardEndpoint = js.native
  
  var request: ProjectsCreateCardRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsCreateCardResponseData] = js.native
}
object ParametersProjectsCreateCardEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsCreateCardEndpoint,
    request: ProjectsCreateCardRequestOptions,
    response: OctokitResponse[ProjectsCreateCardResponseData]
  ): ParametersProjectsCreateCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateCardEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsCreateCardEndpointMutableBuilder[Self <: ParametersProjectsCreateCardEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsCreateCardEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsCreateCardRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsCreateCardResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
