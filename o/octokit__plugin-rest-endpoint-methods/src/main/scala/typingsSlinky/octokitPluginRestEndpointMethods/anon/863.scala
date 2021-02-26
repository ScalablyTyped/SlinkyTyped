package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsListReviewsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListReviewsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `863` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsListReviewsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsListReviewsResponseData] = js.native
}
object `863` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsListReviewsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListReviewsResponseData]
  ): `863` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`863`]
  }
  
  @scala.inline
  implicit class `863MutableBuilder`[Self <: `863`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsListReviewsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListReviewsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
