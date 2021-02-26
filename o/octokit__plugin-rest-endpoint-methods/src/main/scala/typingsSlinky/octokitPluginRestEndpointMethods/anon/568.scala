package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsGetSelfHostedRunnerForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `568` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActionsGetSelfHostedRunnerForRepoEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActionsGetSelfHostedRunnerForRepoResponseData] = js.native
}
object `568` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActionsGetSelfHostedRunnerForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActionsGetSelfHostedRunnerForRepoResponseData]
  ): `568` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`568`]
  }
  
  @scala.inline
  implicit class `568MutableBuilder`[Self <: `568`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActionsGetSelfHostedRunnerForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsGetSelfHostedRunnerForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
