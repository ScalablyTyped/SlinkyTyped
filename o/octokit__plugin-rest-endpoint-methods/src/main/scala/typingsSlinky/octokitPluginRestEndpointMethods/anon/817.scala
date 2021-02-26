package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `817` extends StObject {
  
  var parameters: RequestParameters with (Omit[OrgsUpdateEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[OrgsUpdateResponseData] = js.native
}
object `817` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsUpdateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsUpdateResponseData]
  ): `817` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`817`]
  }
  
  @scala.inline
  implicit class `817MutableBuilder`[Self <: `817`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[OrgsUpdateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
