package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposListCommitStatusesForRefEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListCommitStatusesForRefResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `982` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListCommitStatusesForRefEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListCommitStatusesForRefResponseData] = js.native
}
object `982` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListCommitStatusesForRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListCommitStatusesForRefResponseData]
  ): `982` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`982`]
  }
  
  @scala.inline
  implicit class `982MutableBuilder`[Self <: `982`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposListCommitStatusesForRefEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCommitStatusesForRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
