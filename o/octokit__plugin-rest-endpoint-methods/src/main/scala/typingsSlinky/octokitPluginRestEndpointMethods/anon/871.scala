package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsUpdateReviewCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsUpdateReviewCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `871` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsUpdateReviewCommentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsUpdateReviewCommentResponseData] = js.native
}
object `871` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsUpdateReviewCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsUpdateReviewCommentResponseData]
  ): `871` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`871`]
  }
  
  @scala.inline
  implicit class `871MutableBuilder`[Self <: `871`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[PullsUpdateReviewCommentEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsUpdateReviewCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
