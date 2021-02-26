package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposListForksEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListForksResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `991` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListForksEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListForksResponseData] = js.native
}
object `991` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListForksEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListForksResponseData]
  ): `991` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`991`]
  }
  
  @scala.inline
  implicit class `991MutableBuilder`[Self <: `991`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposListForksEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListForksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
