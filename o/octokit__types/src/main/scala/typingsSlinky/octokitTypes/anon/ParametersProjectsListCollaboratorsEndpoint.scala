package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsListCollaboratorsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListCollaboratorsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListCollaboratorsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsListCollaboratorsEndpoint extends StObject {
  
  var parameters: ProjectsListCollaboratorsEndpoint = js.native
  
  var request: ProjectsListCollaboratorsRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsListCollaboratorsResponseData] = js.native
}
object ParametersProjectsListCollaboratorsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsListCollaboratorsEndpoint,
    request: ProjectsListCollaboratorsRequestOptions,
    response: OctokitResponse[ProjectsListCollaboratorsResponseData]
  ): ParametersProjectsListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListCollaboratorsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsListCollaboratorsEndpointMutableBuilder[Self <: ParametersProjectsListCollaboratorsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsListCollaboratorsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsListCollaboratorsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListCollaboratorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
