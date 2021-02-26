package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.SearchCodeEndpoint
import typingsSlinky.octokitTypes.endpointsMod.SearchCodeResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1031` extends StObject {
  
  var parameters: RequestParameters with (Omit[SearchCodeEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[SearchCodeResponseData] = js.native
}
object `1031` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[SearchCodeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[SearchCodeResponseData]
  ): `1031` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1031`]
  }
  
  @scala.inline
  implicit class `1031MutableBuilder`[Self <: `1031`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[SearchCodeEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchCodeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
