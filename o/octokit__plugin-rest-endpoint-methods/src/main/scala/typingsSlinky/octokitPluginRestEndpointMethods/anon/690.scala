package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GistsListForksEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsListForksResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `690` extends StObject {
  
  var parameters: RequestParameters with (Omit[GistsListForksEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GistsListForksResponseData] = js.native
}
object `690` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsListForksEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsListForksResponseData]
  ): `690` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`690`]
  }
  
  @scala.inline
  implicit class `690MutableBuilder`[Self <: `690`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GistsListForksEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListForksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
