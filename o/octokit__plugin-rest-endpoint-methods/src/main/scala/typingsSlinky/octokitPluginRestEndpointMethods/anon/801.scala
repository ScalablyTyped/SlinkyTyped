package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.OrgsListForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `801` extends StObject {
  
  var parameters: RequestParameters with (Omit[OrgsListForUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[OrgsListForUserResponseData] = js.native
}
object `801` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[OrgsListForUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[OrgsListForUserResponseData]
  ): `801` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`801`]
  }
  
  @scala.inline
  implicit class `801MutableBuilder`[Self <: `801`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[OrgsListForUserEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
