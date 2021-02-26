package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GistsListForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsListForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `689` extends StObject {
  
  var parameters: RequestParameters with (Omit[GistsListForUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GistsListForUserResponseData] = js.native
}
object `689` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsListForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsListForUserResponseData]
  ): `689` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`689`]
  }
  
  @scala.inline
  implicit class `689MutableBuilder`[Self <: `689`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GistsListForUserEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
