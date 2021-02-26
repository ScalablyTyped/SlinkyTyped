package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActivityGetThreadEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityGetThreadResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `594` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActivityGetThreadEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActivityGetThreadResponseData] = js.native
}
object `594` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivityGetThreadEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActivityGetThreadResponseData]
  ): `594` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`594`]
  }
  
  @scala.inline
  implicit class `594MutableBuilder`[Self <: `594`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ActivityGetThreadEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityGetThreadResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
