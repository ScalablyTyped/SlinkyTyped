package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommitCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetCommitCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `951` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetCommitCommentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetCommitCommentResponseData] = js.native
}
object `951` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetCommitCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetCommitCommentResponseData]
  ): `951` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`951`]
  }
  
  @scala.inline
  implicit class `951MutableBuilder`[Self <: `951`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposGetCommitCommentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetCommitCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
