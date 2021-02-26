package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsCreateReviewEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsCreateReviewResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `848` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsCreateReviewEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsCreateReviewResponseData] = js.native
}
object `848` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsCreateReviewEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsCreateReviewResponseData]
  ): `848` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`848`]
  }
  
  @scala.inline
  implicit class `848MutableBuilder`[Self <: `848`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsCreateReviewEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsCreateReviewResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
