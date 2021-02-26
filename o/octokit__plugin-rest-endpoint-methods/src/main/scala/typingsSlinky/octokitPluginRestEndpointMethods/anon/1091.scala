package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListGpgKeysForAuthenticatedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1091` extends StObject {
  
  var parameters: RequestParameters with (Omit[UsersListGpgKeysForAuthenticatedEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData] = js.native
}
object `1091` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListGpgKeysForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData]
  ): `1091` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1091`]
  }
  
  @scala.inline
  implicit class `1091MutableBuilder`[Self <: `1091`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[UsersListGpgKeysForAuthenticatedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListGpgKeysForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
