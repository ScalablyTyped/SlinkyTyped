package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GistsGetEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsGetResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `683` extends StObject {
  
  var parameters: RequestParameters with (Omit[GistsGetEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GistsGetResponseData] = js.native
}
object `683` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsGetResponseData]
  ): `683` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`683`]
  }
  
  @scala.inline
  implicit class `683MutableBuilder`[Self <: `683`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GistsGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
