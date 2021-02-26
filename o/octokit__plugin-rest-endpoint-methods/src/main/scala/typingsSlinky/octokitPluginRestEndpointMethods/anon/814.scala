package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.OrgsSetMembershipForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsSetMembershipForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `814` extends StObject {
  
  var parameters: RequestParameters with (Omit[OrgsSetMembershipForUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[OrgsSetMembershipForUserResponseData] = js.native
}
object `814` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsSetMembershipForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsSetMembershipForUserResponseData]
  ): `814` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`814`]
  }
  
  @scala.inline
  implicit class `814MutableBuilder`[Self <: `814`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[OrgsSetMembershipForUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsSetMembershipForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
