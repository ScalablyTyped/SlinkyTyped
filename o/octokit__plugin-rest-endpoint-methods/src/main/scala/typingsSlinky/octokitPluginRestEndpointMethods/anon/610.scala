package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ActivityListStargazersForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponse200Data
import typingsSlinky.octokitTypes.endpointsMod.ActivityListStargazersForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `610` extends StObject {
  
  var parameters: RequestParameters with (Omit[ActivityListStargazersForRepoEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[
    ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
  ] = js.native
}
object `610` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ActivityListStargazersForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
    ]
  ): `610` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`610`]
  }
  
  @scala.inline
  implicit class `610MutableBuilder`[Self <: `610`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ActivityListStargazersForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          ActivityListStargazersForRepoResponseData | ActivityListStargazersForRepoResponse200Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
