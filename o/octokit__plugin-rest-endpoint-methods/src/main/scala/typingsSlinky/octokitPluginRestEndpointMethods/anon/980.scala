package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposListCommentsForCommitEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListCommentsForCommitResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `980` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListCommentsForCommitEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListCommentsForCommitResponseData] = js.native
}
object `980` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListCommentsForCommitEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListCommentsForCommitResponseData]
  ): `980` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`980`]
  }
  
  @scala.inline
  implicit class `980MutableBuilder`[Self <: `980`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposListCommentsForCommitEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListCommentsForCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
