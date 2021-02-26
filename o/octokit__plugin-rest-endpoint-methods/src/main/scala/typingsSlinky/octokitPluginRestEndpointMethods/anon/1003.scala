package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposMergeEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposMergeResponse404Data
import typingsSlinky.octokitTypes.endpointsMod.ReposMergeResponse409Data
import typingsSlinky.octokitTypes.endpointsMod.ReposMergeResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1003` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposMergeEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposMergeResponseData | ReposMergeResponse404Data | ReposMergeResponse409Data] = js.native
}
object `1003` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposMergeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposMergeResponseData | ReposMergeResponse404Data | ReposMergeResponse409Data]
  ): `1003` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1003`]
  }
  
  @scala.inline
  implicit class `1003MutableBuilder`[Self <: `1003`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposMergeEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[ReposMergeResponseData | ReposMergeResponse404Data | ReposMergeResponse409Data]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
