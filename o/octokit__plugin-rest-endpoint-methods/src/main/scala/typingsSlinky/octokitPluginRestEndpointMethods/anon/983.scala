package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposListCommitsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListCommitsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `983` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListCommitsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListCommitsResponseData] = js.native
}
object `983` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListCommitsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListCommitsResponseData]
  ): `983` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`983`]
  }
  
  @scala.inline
  implicit class `983MutableBuilder`[Self <: `983`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposListCommitsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
