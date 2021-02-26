package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsListRequestedReviewersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListRequestedReviewersResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `860` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsListRequestedReviewersEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsListRequestedReviewersResponseData] = js.native
}
object `860` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsListRequestedReviewersEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListRequestedReviewersResponseData]
  ): `860` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`860`]
  }
  
  @scala.inline
  implicit class `860MutableBuilder`[Self <: `860`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[PullsListRequestedReviewersEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListRequestedReviewersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
