package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GitCreateRefEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitCreateRefResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `699` extends StObject {
  
  var parameters: RequestParameters with (Omit[GitCreateRefEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GitCreateRefResponseData] = js.native
}
object `699` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitCreateRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitCreateRefResponseData]
  ): `699` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`699`]
  }
  
  @scala.inline
  implicit class `699MutableBuilder`[Self <: `699`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GitCreateRefEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitCreateRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
