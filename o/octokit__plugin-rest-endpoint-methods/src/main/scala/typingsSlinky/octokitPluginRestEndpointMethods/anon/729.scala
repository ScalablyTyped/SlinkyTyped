package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `729` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesGetCommentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesGetCommentResponseData] = js.native
}
object `729` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesGetCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesGetCommentResponseData]
  ): `729` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`729`]
  }
  
  @scala.inline
  implicit class `729MutableBuilder`[Self <: `729`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesGetCommentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
