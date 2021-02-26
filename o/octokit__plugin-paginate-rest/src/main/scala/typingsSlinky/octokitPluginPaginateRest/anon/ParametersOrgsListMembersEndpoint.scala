package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListMembersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListMembersResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListMembersEndpoint extends StObject {
  
  var parameters: OrgsListMembersEndpoint = js.native
  
  var response: OctokitResponse[OrgsListMembersResponseData] = js.native
}
object ParametersOrgsListMembersEndpoint {
  
  @scala.inline
  def apply(parameters: OrgsListMembersEndpoint, response: OctokitResponse[OrgsListMembersResponseData]): ParametersOrgsListMembersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListMembersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListMembersEndpointMutableBuilder[Self <: ParametersOrgsListMembersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListMembersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListMembersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
