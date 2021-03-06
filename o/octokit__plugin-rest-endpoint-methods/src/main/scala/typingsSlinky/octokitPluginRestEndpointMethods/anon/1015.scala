package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposSetStatusCheckContextsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposSetStatusCheckContextsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1015` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposSetStatusCheckContextsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposSetStatusCheckContextsResponseData] = js.native
}
object `1015` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposSetStatusCheckContextsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposSetStatusCheckContextsResponseData]
  ): `1015` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1015`]
  }
  
  @scala.inline
  implicit class `1015MutableBuilder`[Self <: `1015`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposSetStatusCheckContextsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposSetStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
