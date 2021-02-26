package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsSubmitReviewEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsSubmitReviewResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `867` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsSubmitReviewEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsSubmitReviewResponseData] = js.native
}
object `867` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsSubmitReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsSubmitReviewResponseData]
  ): `867` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`867`]
  }
  
  @scala.inline
  implicit class `867MutableBuilder`[Self <: `867`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsSubmitReviewEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsSubmitReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
