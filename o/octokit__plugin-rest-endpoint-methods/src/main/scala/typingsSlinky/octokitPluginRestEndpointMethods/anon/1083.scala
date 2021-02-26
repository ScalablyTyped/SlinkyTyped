package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersGetPublicSshKeyForAuthenticatedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1083` extends StObject {
  
  var parameters: RequestParameters with (Omit[UsersGetPublicSshKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData] = js.native
}
object `1083` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersGetPublicSshKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData]
  ): `1083` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1083`]
  }
  
  @scala.inline
  implicit class `1083MutableBuilder`[Self <: `1083`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[UsersGetPublicSshKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersGetPublicSshKeyForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
