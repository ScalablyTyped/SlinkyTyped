package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersCreateGpgKeyForAuthenticatedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1073` extends StObject {
  
  var parameters: RequestParameters with (Omit[UsersCreateGpgKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData] = js.native
}
object `1073` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersCreateGpgKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData]
  ): `1073` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1073`]
  }
  
  @scala.inline
  implicit class `1073MutableBuilder`[Self <: `1073`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[UsersCreateGpgKeyForAuthenticatedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersCreateGpgKeyForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
