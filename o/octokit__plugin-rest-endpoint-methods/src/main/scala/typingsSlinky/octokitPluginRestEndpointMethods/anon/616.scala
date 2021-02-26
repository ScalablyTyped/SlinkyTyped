package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivitySetRepoSubscriptionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `616` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActivitySetRepoSubscriptionEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ActivitySetRepoSubscriptionResponseData] = js.native
}
object `616` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivitySetRepoSubscriptionEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ActivitySetRepoSubscriptionResponseData]
  ): `616` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`616`]
  }
  
  @scala.inline
  implicit class `616MutableBuilder`[Self <: `616`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActivitySetRepoSubscriptionEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivitySetRepoSubscriptionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
