package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsUpdateReviewEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsUpdateReviewResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `870` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsUpdateReviewEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsUpdateReviewResponseData] = js.native
}
object `870` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsUpdateReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsUpdateReviewResponseData]
  ): `870` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`870`]
  }
  
  @scala.inline
  implicit class `870MutableBuilder`[Self <: `870`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsUpdateReviewEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsUpdateReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
