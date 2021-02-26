package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposListInvitationsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListInvitationsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `992` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListInvitationsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListInvitationsResponseData] = js.native
}
object `992` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListInvitationsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListInvitationsResponseData]
  ): `992` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`992`]
  }
  
  @scala.inline
  implicit class `992MutableBuilder`[Self <: `992`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposListInvitationsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListInvitationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
