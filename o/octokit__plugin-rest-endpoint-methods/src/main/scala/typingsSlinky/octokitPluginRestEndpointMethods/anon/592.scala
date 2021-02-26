package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActivityGetFeedsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityGetFeedsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `592` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActivityGetFeedsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActivityGetFeedsResponseData] = js.native
}
object `592` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivityGetFeedsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActivityGetFeedsResponseData]
  ): `592` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`592`]
  }
  
  @scala.inline
  implicit class `592MutableBuilder`[Self <: `592`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ActivityGetFeedsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityGetFeedsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
