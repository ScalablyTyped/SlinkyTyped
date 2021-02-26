package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsMergeEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsMergeResponse405Data
import typingsSlinky.octokitTypes.endpointsMod.PullsMergeResponse409Data
import typingsSlinky.octokitTypes.endpointsMod.PullsMergeResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `864` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsMergeEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data] = js.native
}
object `864` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsMergeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data]
  ): `864` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`864`]
  }
  
  @scala.inline
  implicit class `864MutableBuilder`[Self <: `864`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsMergeEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
