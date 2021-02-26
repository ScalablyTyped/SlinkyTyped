package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesCreateCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesCreateCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `722` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesCreateCommentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesCreateCommentResponseData] = js.native
}
object `722` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesCreateCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesCreateCommentResponseData]
  ): `722` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`722`]
  }
  
  @scala.inline
  implicit class `722MutableBuilder`[Self <: `722`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesCreateCommentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesCreateCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
