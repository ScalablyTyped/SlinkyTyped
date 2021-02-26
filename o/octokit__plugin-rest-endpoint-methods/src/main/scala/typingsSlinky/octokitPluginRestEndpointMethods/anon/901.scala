package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateCommitCommentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateCommitCommentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `901` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposCreateCommitCommentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposCreateCommitCommentResponseData] = js.native
}
object `901` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateCommitCommentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateCommitCommentResponseData]
  ): `901` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`901`]
  }
  
  @scala.inline
  implicit class `901MutableBuilder`[Self <: `901`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposCreateCommitCommentEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateCommitCommentResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
