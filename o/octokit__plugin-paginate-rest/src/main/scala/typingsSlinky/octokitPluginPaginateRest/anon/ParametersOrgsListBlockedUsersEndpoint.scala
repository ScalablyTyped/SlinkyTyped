package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListBlockedUsersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListBlockedUsersResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListBlockedUsersEndpoint extends StObject {
  
  var parameters: OrgsListBlockedUsersEndpoint = js.native
  
  var response: OctokitResponse[OrgsListBlockedUsersResponseData] = js.native
}
object ParametersOrgsListBlockedUsersEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListBlockedUsersEndpoint,
    response: OctokitResponse[OrgsListBlockedUsersResponseData]
  ): ParametersOrgsListBlockedUsersEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListBlockedUsersEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListBlockedUsersEndpointMutableBuilder[Self <: ParametersOrgsListBlockedUsersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListBlockedUsersEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListBlockedUsersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
