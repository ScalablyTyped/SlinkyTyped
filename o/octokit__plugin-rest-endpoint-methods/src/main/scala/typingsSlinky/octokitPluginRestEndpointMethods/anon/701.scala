package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GitCreateTreeEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitCreateTreeResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `701` extends StObject {
  
  var parameters: RequestParameters with (Omit[GitCreateTreeEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GitCreateTreeResponseData] = js.native
}
object `701` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitCreateTreeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitCreateTreeResponseData]
  ): `701` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`701`]
  }
  
  @scala.inline
  implicit class `701MutableBuilder`[Self <: `701`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GitCreateTreeEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitCreateTreeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
