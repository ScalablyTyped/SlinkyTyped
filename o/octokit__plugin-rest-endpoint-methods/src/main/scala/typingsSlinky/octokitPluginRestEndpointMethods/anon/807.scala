package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.OrgsListPublicMembersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListPublicMembersResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `807` extends StObject {
  
  var parameters: RequestParameters with (Omit[OrgsListPublicMembersEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[OrgsListPublicMembersResponseData] = js.native
}
object `807` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsListPublicMembersEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsListPublicMembersResponseData]
  ): `807` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`807`]
  }
  
  @scala.inline
  implicit class `807MutableBuilder`[Self <: `807`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[OrgsListPublicMembersEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListPublicMembersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
