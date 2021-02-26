package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GistsListEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsListResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `686` extends StObject {
  
  var parameters: RequestParameters with (Omit[GistsListEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GistsListResponseData] = js.native
}
object `686` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsListEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsListResponseData]
  ): `686` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`686`]
  }
  
  @scala.inline
  implicit class `686MutableBuilder`[Self <: `686`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GistsListEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
