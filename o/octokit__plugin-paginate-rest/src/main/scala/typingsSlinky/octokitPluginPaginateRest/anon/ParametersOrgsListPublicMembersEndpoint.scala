package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListPublicMembersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListPublicMembersResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListPublicMembersEndpoint extends StObject {
  
  var parameters: OrgsListPublicMembersEndpoint = js.native
  
  var response: OctokitResponse[OrgsListPublicMembersResponseData] = js.native
}
object ParametersOrgsListPublicMembersEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListPublicMembersEndpoint,
    response: OctokitResponse[OrgsListPublicMembersResponseData]
  ): ParametersOrgsListPublicMembersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListPublicMembersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListPublicMembersEndpointMutableBuilder[Self <: ParametersOrgsListPublicMembersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListPublicMembersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListPublicMembersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
