package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForPullRequestReviewCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForPullRequestReviewCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `876` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReactionsCreateForPullRequestReviewCommentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReactionsCreateForPullRequestReviewCommentResponseData] = js.native
}
object `876` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReactionsCreateForPullRequestReviewCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsCreateForPullRequestReviewCommentResponseData]
  ): `876` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`876`]
  }
  
  @scala.inline
  implicit class `876MutableBuilder`[Self <: `876`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReactionsCreateForPullRequestReviewCommentEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForPullRequestReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
