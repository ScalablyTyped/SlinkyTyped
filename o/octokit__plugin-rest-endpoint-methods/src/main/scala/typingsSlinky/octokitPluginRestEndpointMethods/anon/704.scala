package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GitGetCommitEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitGetCommitResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `704` extends StObject {
  
  var parameters: RequestParameters with (Omit[GitGetCommitEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GitGetCommitResponseData] = js.native
}
object `704` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitGetCommitEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitGetCommitResponseData]
  ): `704` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`704`]
  }
  
  @scala.inline
  implicit class `704MutableBuilder`[Self <: `704`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GitGetCommitEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
