package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListInvitationTeamsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListInvitationTeamsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListInvitationTeamsEndpoint extends js.Object {
  
  var parameters: OrgsListInvitationTeamsEndpoint = js.native
  
  var response: OctokitResponse[OrgsListInvitationTeamsResponseData] = js.native
}
object ParametersOrgsListInvitationTeamsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListInvitationTeamsEndpoint,
    response: OctokitResponse[OrgsListInvitationTeamsResponseData]
  ): ParametersOrgsListInvitationTeamsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListInvitationTeamsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListInvitationTeamsEndpointOps[Self <: ParametersOrgsListInvitationTeamsEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OrgsListInvitationTeamsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListInvitationTeamsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
