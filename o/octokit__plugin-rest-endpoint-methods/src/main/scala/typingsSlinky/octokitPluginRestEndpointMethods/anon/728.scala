package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `728` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesGetEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesGetResponseData] = js.native
}
object `728` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesGetResponseData]
  ): `728` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`728`]
  }
  
  @scala.inline
  implicit class `728MutableBuilder`[Self <: `728`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
