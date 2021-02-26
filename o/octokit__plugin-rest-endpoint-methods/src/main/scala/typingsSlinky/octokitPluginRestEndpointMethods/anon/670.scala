package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.CodeScanningListRecentAnalysesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.CodeScanningListRecentAnalysesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `670` extends StObject {
  
  var parameters: RequestParameters with (Omit[CodeScanningListRecentAnalysesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[CodeScanningListRecentAnalysesResponseData] = js.native
}
object `670` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[CodeScanningListRecentAnalysesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[CodeScanningListRecentAnalysesResponseData]
  ): `670` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`670`]
  }
  
  @scala.inline
  implicit class `670MutableBuilder`[Self <: `670`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[CodeScanningListRecentAnalysesEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningListRecentAnalysesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
