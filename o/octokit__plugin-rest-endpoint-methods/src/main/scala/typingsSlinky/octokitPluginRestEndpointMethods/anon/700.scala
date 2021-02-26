package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GitCreateTagEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitCreateTagResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `700` extends StObject {
  
  var parameters: RequestParameters with (Omit[GitCreateTagEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GitCreateTagResponseData] = js.native
}
object `700` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitCreateTagEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitCreateTagResponseData]
  ): `700` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`700`]
  }
  
  @scala.inline
  implicit class `700MutableBuilder`[Self <: `700`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GitCreateTagEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitCreateTagResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
