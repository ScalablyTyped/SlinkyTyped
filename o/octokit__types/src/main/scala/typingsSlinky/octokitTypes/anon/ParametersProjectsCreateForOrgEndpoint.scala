package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsCreateForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsCreateForOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ProjectsCreateForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsCreateForOrgEndpoint extends StObject {
  
  var parameters: ProjectsCreateForOrgEndpoint = js.native
  
  var request: ProjectsCreateForOrgRequestOptions = js.native
  
  var response: OctokitResponse[ProjectsCreateForOrgResponseData] = js.native
}
object ParametersProjectsCreateForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsCreateForOrgEndpoint,
    request: ProjectsCreateForOrgRequestOptions,
    response: OctokitResponse[ProjectsCreateForOrgResponseData]
  ): ParametersProjectsCreateForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsCreateForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsCreateForOrgEndpointMutableBuilder[Self <: ParametersProjectsCreateForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsCreateForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsCreateForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsCreateForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
