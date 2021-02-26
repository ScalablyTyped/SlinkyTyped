package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GistsListPublicEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsListPublicResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `691` extends StObject {
  
  var parameters: RequestParameters with (Omit[GistsListPublicEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GistsListPublicResponseData] = js.native
}
object `691` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GistsListPublicEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GistsListPublicResponseData]
  ): `691` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`691`]
  }
  
  @scala.inline
  implicit class `691MutableBuilder`[Self <: `691`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GistsListPublicEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListPublicResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
