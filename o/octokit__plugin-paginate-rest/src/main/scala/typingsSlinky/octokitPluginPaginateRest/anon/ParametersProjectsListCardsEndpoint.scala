package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsListCardsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsListCardsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsListCardsEndpoint extends StObject {
  
  var parameters: ProjectsListCardsEndpoint = js.native
  
  var response: OctokitResponse[ProjectsListCardsResponseData] = js.native
}
object ParametersProjectsListCardsEndpoint {
  
  @scala.inline
  def apply(parameters: ProjectsListCardsEndpoint, response: OctokitResponse[ProjectsListCardsResponseData]): ParametersProjectsListCardsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsListCardsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsListCardsEndpointMutableBuilder[Self <: ParametersProjectsListCardsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsListCardsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ProjectsListCardsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
