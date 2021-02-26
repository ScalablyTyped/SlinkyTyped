package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsListOutsideCollaboratorsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListOutsideCollaboratorsEndpoint extends StObject {
  
  var parameters: OrgsListOutsideCollaboratorsEndpoint = js.native
  
  var request: OrgsListOutsideCollaboratorsRequestOptions = js.native
  
  var response: OctokitResponse[OrgsListOutsideCollaboratorsResponseData] = js.native
}
object ParametersOrgsListOutsideCollaboratorsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListOutsideCollaboratorsEndpoint,
    request: OrgsListOutsideCollaboratorsRequestOptions,
    response: OctokitResponse[OrgsListOutsideCollaboratorsResponseData]
  ): ParametersOrgsListOutsideCollaboratorsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListOutsideCollaboratorsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListOutsideCollaboratorsEndpointMutableBuilder[Self <: ParametersOrgsListOutsideCollaboratorsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListOutsideCollaboratorsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListOutsideCollaboratorsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListOutsideCollaboratorsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
