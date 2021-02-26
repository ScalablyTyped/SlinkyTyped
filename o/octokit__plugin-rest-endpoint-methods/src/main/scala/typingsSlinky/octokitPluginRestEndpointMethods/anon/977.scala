package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposListBranchesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListBranchesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `977` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListBranchesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListBranchesResponseData] = js.native
}
object `977` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListBranchesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListBranchesResponseData]
  ): `977` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`977`]
  }
  
  @scala.inline
  implicit class `977MutableBuilder`[Self <: `977`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposListBranchesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListBranchesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
