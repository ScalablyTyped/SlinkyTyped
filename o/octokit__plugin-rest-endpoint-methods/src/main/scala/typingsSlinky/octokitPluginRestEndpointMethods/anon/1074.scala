package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.UsersGetByUsernameEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersGetByUsernameResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1074` extends js.Object {
  
  var parameters: RequestParameters with (Omit[UsersGetByUsernameEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[UsersGetByUsernameResponseData] = js.native
}
object `1074` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersGetByUsernameEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersGetByUsernameResponseData]
  ): `1074` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1074`]
  }
  
  @scala.inline
  implicit class `1074Ops`[Self <: `1074`] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: RequestParameters with (Omit[UsersGetByUsernameEndpoint, baseUrl | headers | mediaType])): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersGetByUsernameResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
