package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposListBranchesForHeadCommitEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListBranchesForHeadCommitResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `978` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListBranchesForHeadCommitEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListBranchesForHeadCommitResponseData] = js.native
}
object `978` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListBranchesForHeadCommitEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListBranchesForHeadCommitResponseData]
  ): `978` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`978`]
  }
  
  @scala.inline
  implicit class `978MutableBuilder`[Self <: `978`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposListBranchesForHeadCommitEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListBranchesForHeadCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
