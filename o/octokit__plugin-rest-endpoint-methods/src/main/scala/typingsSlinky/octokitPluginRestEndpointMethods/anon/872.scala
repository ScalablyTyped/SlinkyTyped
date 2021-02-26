package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.RateLimitGetEndpoint
import typingsSlinky.octokitTypes.endpointsMod.RateLimitGetResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `872` extends StObject {
  
  var parameters: RequestParameters with (Omit[RateLimitGetEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[RateLimitGetResponseData] = js.native
}
object `872` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[RateLimitGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[RateLimitGetResponseData]
  ): `872` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`872`]
  }
  
  @scala.inline
  implicit class `872MutableBuilder`[Self <: `872`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[RateLimitGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[RateLimitGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
