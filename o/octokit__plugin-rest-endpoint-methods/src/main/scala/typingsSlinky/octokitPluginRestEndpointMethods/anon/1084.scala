package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.UsersListEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersListResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1084` extends StObject {
  
  var parameters: RequestParameters with (Omit[UsersListEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[UsersListResponseData] = js.native
}
object `1084` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersListEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersListResponseData]
  ): `1084` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1084`]
  }
  
  @scala.inline
  implicit class `1084MutableBuilder`[Self <: `1084`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[UsersListEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
