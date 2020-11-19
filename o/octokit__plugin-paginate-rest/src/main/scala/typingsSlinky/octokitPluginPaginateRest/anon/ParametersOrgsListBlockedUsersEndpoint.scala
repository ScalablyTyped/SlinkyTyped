package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListBlockedUsersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListBlockedUsersResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListBlockedUsersEndpoint extends js.Object {
  
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
  implicit class ParametersOrgsListBlockedUsersEndpointOps[Self <: ParametersOrgsListBlockedUsersEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: OrgsListBlockedUsersEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListBlockedUsersResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
