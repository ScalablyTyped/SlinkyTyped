package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.BillingGetGithubActionsBillingUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.BillingGetGithubActionsBillingUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `652` extends StObject {
  
  var parameters: RequestParameters with (Omit[BillingGetGithubActionsBillingUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[BillingGetGithubActionsBillingUserResponseData] = js.native
}
object `652` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[BillingGetGithubActionsBillingUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[BillingGetGithubActionsBillingUserResponseData]
  ): `652` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`652`]
  }
  
  @scala.inline
  implicit class `652MutableBuilder`[Self <: `652`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[BillingGetGithubActionsBillingUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetGithubActionsBillingUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
