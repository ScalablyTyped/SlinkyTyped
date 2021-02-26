package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsListReviewCommentsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListReviewCommentsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `861` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsListReviewCommentsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsListReviewCommentsResponseData] = js.native
}
object `861` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsListReviewCommentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListReviewCommentsResponseData]
  ): `861` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`861`]
  }
  
  @scala.inline
  implicit class `861MutableBuilder`[Self <: `861`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[PullsListReviewCommentsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListReviewCommentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
