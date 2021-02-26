package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPagesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPagesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `961` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetPagesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetPagesResponseData] = js.native
}
object `961` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetPagesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetPagesResponseData]
  ): `961` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`961`]
  }
  
  @scala.inline
  implicit class `961MutableBuilder`[Self <: `961`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposGetPagesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPagesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
