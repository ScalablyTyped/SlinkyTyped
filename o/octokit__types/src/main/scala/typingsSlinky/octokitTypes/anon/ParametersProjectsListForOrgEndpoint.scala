package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsListForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListForOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsListForOrgEndpoint extends StObject {
  
  var parameters: ProjectsListForOrgEndpoint = js.native
  
  var request: ProjectsListForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsListForOrgResponseData] = js.native
}
object ParametersProjectsListForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsListForOrgEndpoint,
    request: ProjectsListForOrgRequestOptions,
    response: OctokitResponse[ProjectsListForOrgResponseData]
  ): ParametersProjectsListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsListForOrgEndpointMutableBuilder[Self <: ParametersProjectsListForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsListForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsListForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
