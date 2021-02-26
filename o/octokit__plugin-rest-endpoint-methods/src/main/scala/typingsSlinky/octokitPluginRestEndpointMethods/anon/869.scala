package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsUpdateBranchEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsUpdateBranchResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `869` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsUpdateBranchEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsUpdateBranchResponseData] = js.native
}
object `869` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsUpdateBranchEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsUpdateBranchResponseData]
  ): `869` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`869`]
  }
  
  @scala.inline
  implicit class `869MutableBuilder`[Self <: `869`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsUpdateBranchEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsUpdateBranchResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
