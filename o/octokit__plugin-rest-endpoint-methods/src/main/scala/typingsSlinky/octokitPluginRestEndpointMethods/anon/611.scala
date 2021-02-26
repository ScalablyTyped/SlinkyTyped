package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListWatchedReposForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `611` extends StObject {
  
  var parameters: RequestParameters with (Omit[
    ActivityListWatchedReposForAuthenticatedUserEndpoint, 
    baseUrl | headers | mediaType
  ]) = js.native
  
  var response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData] = js.native
}
object `611` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[
      ActivityListWatchedReposForAuthenticatedUserEndpoint, 
      baseUrl | headers | mediaType
    ]),
    response: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]
  ): `611` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`611`]
  }
  
  @scala.inline
  implicit class `611MutableBuilder`[Self <: `611`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[
          ActivityListWatchedReposForAuthenticatedUserEndpoint, 
          baseUrl | headers | mediaType
        ])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityListWatchedReposForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
