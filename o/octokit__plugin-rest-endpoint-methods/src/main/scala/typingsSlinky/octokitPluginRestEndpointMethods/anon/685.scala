package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GistsGetRevisionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsGetRevisionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `685` extends StObject {
  
  var parameters: RequestParameters with (Omit[GistsGetRevisionEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GistsGetRevisionResponseData] = js.native
}
object `685` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsGetRevisionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsGetRevisionResponseData]
  ): `685` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`685`]
  }
  
  @scala.inline
  implicit class `685MutableBuilder`[Self <: `685`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GistsGetRevisionEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsGetRevisionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
