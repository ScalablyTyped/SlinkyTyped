package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GistsListStarredEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsListStarredResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `692` extends StObject {
  
  var parameters: RequestParameters with (Omit[GistsListStarredEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GistsListStarredResponseData] = js.native
}
object `692` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsListStarredEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsListStarredResponseData]
  ): `692` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`692`]
  }
  
  @scala.inline
  implicit class `692MutableBuilder`[Self <: `692`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GistsListStarredEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListStarredResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
