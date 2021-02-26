package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.UsersListPublicKeysForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListPublicKeysForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1094` extends StObject {
  
  var parameters: RequestParameters with (Omit[UsersListPublicKeysForUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[UsersListPublicKeysForUserResponseData] = js.native
}
object `1094` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListPublicKeysForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListPublicKeysForUserResponseData]
  ): `1094` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1094`]
  }
  
  @scala.inline
  implicit class `1094MutableBuilder`[Self <: `1094`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[UsersListPublicKeysForUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListPublicKeysForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
