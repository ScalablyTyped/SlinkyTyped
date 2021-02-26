package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.OrgsCreateInvitationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsCreateInvitationResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `790` extends StObject {
  
  var parameters: RequestParameters with (Omit[OrgsCreateInvitationEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[OrgsCreateInvitationResponseData] = js.native
}
object `790` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsCreateInvitationEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsCreateInvitationResponseData]
  ): `790` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`790`]
  }
  
  @scala.inline
  implicit class `790MutableBuilder`[Self <: `790`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[OrgsCreateInvitationEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsCreateInvitationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
