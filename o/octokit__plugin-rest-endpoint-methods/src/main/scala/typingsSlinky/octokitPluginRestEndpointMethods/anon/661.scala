package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ChecksListAnnotationsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksListAnnotationsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `661` extends StObject {
  
  var parameters: RequestParameters with (Omit[ChecksListAnnotationsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ChecksListAnnotationsResponseData] = js.native
}
object `661` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksListAnnotationsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksListAnnotationsResponseData]
  ): `661` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`661`]
  }
  
  @scala.inline
  implicit class `661MutableBuilder`[Self <: `661`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ChecksListAnnotationsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListAnnotationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
