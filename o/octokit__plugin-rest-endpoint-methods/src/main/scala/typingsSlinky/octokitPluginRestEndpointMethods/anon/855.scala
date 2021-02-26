package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsGetReviewCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsGetReviewCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `855` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsGetReviewCommentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsGetReviewCommentResponseData] = js.native
}
object `855` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsGetReviewCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsGetReviewCommentResponseData]
  ): `855` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`855`]
  }
  
  @scala.inline
  implicit class `855MutableBuilder`[Self <: `855`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsGetReviewCommentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsGetReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
