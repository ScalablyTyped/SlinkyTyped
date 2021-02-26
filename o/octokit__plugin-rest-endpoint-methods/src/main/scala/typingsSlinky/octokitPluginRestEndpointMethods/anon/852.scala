package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsDismissReviewEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsDismissReviewResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `852` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsDismissReviewEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsDismissReviewResponseData] = js.native
}
object `852` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsDismissReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsDismissReviewResponseData]
  ): `852` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`852`]
  }
  
  @scala.inline
  implicit class `852MutableBuilder`[Self <: `852`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsDismissReviewEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsDismissReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
