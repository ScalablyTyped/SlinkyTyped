package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListCollaboratorsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListCollaboratorsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListCollaboratorsEndpoint extends StObject {
  
  var parameters: ReposListCollaboratorsEndpoint = js.native
  
  var response: OctokitResponse[ReposListCollaboratorsResponseData] = js.native
}
object ParametersReposListCollaboratorsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListCollaboratorsEndpoint,
    response: OctokitResponse[ReposListCollaboratorsResponseData]
  ): ParametersReposListCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListCollaboratorsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListCollaboratorsEndpointMutableBuilder[Self <: ParametersReposListCollaboratorsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListCollaboratorsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCollaboratorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
