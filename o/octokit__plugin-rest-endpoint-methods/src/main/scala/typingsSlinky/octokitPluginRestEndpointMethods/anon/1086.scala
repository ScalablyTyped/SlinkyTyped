package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListEmailsForAuthenticatedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1086` extends js.Object {
  
  var parameters: RequestParameters with (Omit[UsersListEmailsForAuthenticatedEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[UsersListEmailsForAuthenticatedResponseData] = js.native
}
object `1086` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListEmailsForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]
  ): `1086` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1086`]
  }
  
  @scala.inline
  implicit class `1086Ops`[Self <: `1086`] (val x: Self) extends AnyVal {
    
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
    def setParameters(
      value: RequestParameters with (Omit[UsersListEmailsForAuthenticatedEndpoint, baseUrl | headers | mediaType])
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListEmailsForAuthenticatedResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
