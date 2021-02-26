package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsCreateReviewCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsCreateReviewCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `849` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsCreateReviewCommentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsCreateReviewCommentResponseData] = js.native
}
object `849` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsCreateReviewCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsCreateReviewCommentResponseData]
  ): `849` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`849`]
  }
  
  @scala.inline
  implicit class `849MutableBuilder`[Self <: `849`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[PullsCreateReviewCommentEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsCreateReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
