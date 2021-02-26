package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsRequestReviewersEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsRequestReviewersResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `866` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsRequestReviewersEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsRequestReviewersResponseData] = js.native
}
object `866` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsRequestReviewersEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsRequestReviewersResponseData]
  ): `866` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`866`]
  }
  
  @scala.inline
  implicit class `866MutableBuilder`[Self <: `866`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsRequestReviewersEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsRequestReviewersResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
