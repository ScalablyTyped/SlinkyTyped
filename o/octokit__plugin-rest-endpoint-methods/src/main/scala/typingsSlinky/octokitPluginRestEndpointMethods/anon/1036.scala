package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.SearchTopicsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.SearchTopicsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1036` extends StObject {
  
  var parameters: RequestParameters with (Omit[SearchTopicsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[SearchTopicsResponseData] = js.native
}
object `1036` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[SearchTopicsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[SearchTopicsResponseData]
  ): `1036` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1036`]
  }
  
  @scala.inline
  implicit class `1036MutableBuilder`[Self <: `1036`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[SearchTopicsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchTopicsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
