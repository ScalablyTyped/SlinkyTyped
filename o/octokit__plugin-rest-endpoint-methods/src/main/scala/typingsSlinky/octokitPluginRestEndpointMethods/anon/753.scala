package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesUpdateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `753` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesUpdateEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesUpdateResponseData] = js.native
}
object `753` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesUpdateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesUpdateResponseData]
  ): `753` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`753`]
  }
  
  @scala.inline
  implicit class `753MutableBuilder`[Self <: `753`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesUpdateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
