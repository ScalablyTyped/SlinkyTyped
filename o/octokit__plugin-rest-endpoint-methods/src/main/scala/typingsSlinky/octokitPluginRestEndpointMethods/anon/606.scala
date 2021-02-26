package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActivityListRepoNotificationsForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListRepoNotificationsForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `606` extends StObject {
  
  var parameters: RequestParameters with (Omit[
    ActivityListRepoNotificationsForAuthenticatedUserEndpoint, 
    baseUrl | headers | mediaType
  ]) = js.native
  
  var response: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData] = js.native
}
object `606` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[
      ActivityListRepoNotificationsForAuthenticatedUserEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData]
  ): `606` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`606`]
  }
  
  @scala.inline
  implicit class `606MutableBuilder`[Self <: `606`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[
          ActivityListRepoNotificationsForAuthenticatedUserEndpoint, 
          baseUrl | headers | mediaType
        ])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListRepoNotificationsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
