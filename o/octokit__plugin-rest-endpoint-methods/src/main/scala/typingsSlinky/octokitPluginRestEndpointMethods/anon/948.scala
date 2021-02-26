package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCombinedStatusForRefResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `948` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetCombinedStatusForRefEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetCombinedStatusForRefResponseData] = js.native
}
object `948` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetCombinedStatusForRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCombinedStatusForRefResponseData]
  ): `948` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`948`]
  }
  
  @scala.inline
  implicit class `948MutableBuilder`[Self <: `948`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetCombinedStatusForRefEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCombinedStatusForRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
