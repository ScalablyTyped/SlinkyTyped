package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForIssueCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForIssueCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `888` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReactionsListForIssueCommentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReactionsListForIssueCommentResponseData] = js.native
}
object `888` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReactionsListForIssueCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsListForIssueCommentResponseData]
  ): `888` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`888`]
  }
  
  @scala.inline
  implicit class `888MutableBuilder`[Self <: `888`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReactionsListForIssueCommentEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForIssueCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
