package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsListMembershipsForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListMembershipsForAuthenticatedUserEndpoint extends js.Object {
  
  var parameters: OrgsListMembershipsForAuthenticatedUserEndpoint = js.native
  
  var request: OrgsListMembershipsForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData] = js.native
}
object ParametersOrgsListMembershipsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListMembershipsForAuthenticatedUserEndpoint,
    request: OrgsListMembershipsForAuthenticatedUserRequestOptions,
    response: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]
  ): ParametersOrgsListMembershipsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListMembershipsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListMembershipsForAuthenticatedUserEndpointOps[Self <: ParametersOrgsListMembershipsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OrgsListMembershipsForAuthenticatedUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListMembershipsForAuthenticatedUserRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListMembershipsForAuthenticatedUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
