package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserResponse200Data
import typingsSlinky.octokitTypes.endpointsMod.ActivityListReposStarredByAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `607` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActivityListReposStarredByAuthenticatedUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[
    ActivityListReposStarredByAuthenticatedUserResponseData | ActivityListReposStarredByAuthenticatedUserResponse200Data
  ] = js.native
}
object `607` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivityListReposStarredByAuthenticatedUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      ActivityListReposStarredByAuthenticatedUserResponseData | ActivityListReposStarredByAuthenticatedUserResponse200Data
    ]
  ): `607` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`607`]
  }
  
  @scala.inline
  implicit class `607MutableBuilder`[Self <: `607`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActivityListReposStarredByAuthenticatedUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          ActivityListReposStarredByAuthenticatedUserResponseData | ActivityListReposStarredByAuthenticatedUserResponse200Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
