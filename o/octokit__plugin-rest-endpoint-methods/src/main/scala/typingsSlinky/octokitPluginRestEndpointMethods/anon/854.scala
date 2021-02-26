package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsGetReviewEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsGetReviewResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `854` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsGetReviewEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsGetReviewResponseData] = js.native
}
object `854` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsGetReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsGetReviewResponseData]
  ): `854` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`854`]
  }
  
  @scala.inline
  implicit class `854MutableBuilder`[Self <: `854`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsGetReviewEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsGetReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
