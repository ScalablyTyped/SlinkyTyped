package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersCreatePublicSshKeyForAuthenticatedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1074` extends StObject {
  
  var parameters: RequestParameters with (Omit[UsersCreatePublicSshKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData] = js.native
}
object `1074` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersCreatePublicSshKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData]
  ): `1074` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1074`]
  }
  
  @scala.inline
  implicit class `1074MutableBuilder`[Self <: `1074`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[UsersCreatePublicSshKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersCreatePublicSshKeyForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
