package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsListAuthorizationsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersResponse extends js.Object {
  
  var parameters: OauthAuthorizationsListAuthorizationsEndpoint = js.native
  
  var response: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData] = js.native
}
object ParametersResponse {
  
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsListAuthorizationsEndpoint,
    response: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]
  ): ParametersResponse = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersResponse]
  }
  
  @scala.inline
  implicit class ParametersResponseOps[Self <: ParametersResponse] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: OauthAuthorizationsListAuthorizationsEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OauthAuthorizationsListAuthorizationsResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
