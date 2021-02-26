package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsListCommentsForReviewEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListCommentsForReviewResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `857` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsListCommentsForReviewEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsListCommentsForReviewResponseData] = js.native
}
object `857` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsListCommentsForReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListCommentsForReviewResponseData]
  ): `857` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`857`]
  }
  
  @scala.inline
  implicit class `857MutableBuilder`[Self <: `857`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[PullsListCommentsForReviewEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListCommentsForReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
