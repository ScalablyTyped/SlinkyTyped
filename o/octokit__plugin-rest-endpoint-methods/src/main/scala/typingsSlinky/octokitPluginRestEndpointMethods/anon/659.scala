package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ChecksGetEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksGetResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `659` extends StObject {
  
  var parameters: RequestParameters with (Omit[ChecksGetEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ChecksGetResponseData] = js.native
}
object `659` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksGetResponseData]
  ): `659` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`659`]
  }
  
  @scala.inline
  implicit class `659MutableBuilder`[Self <: `659`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ChecksGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
