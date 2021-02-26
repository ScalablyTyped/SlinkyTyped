package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.CodeScanningListRecentAnalysesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.CodeScanningListRecentAnalysesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodeScanningListRecentAnalysesEndpoint extends StObject {
  
  var parameters: CodeScanningListRecentAnalysesEndpoint = js.native
  
  var response: OctokitResponse[CodeScanningListRecentAnalysesResponseData] = js.native
}
object ParametersCodeScanningListRecentAnalysesEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodeScanningListRecentAnalysesEndpoint,
    response: OctokitResponse[CodeScanningListRecentAnalysesResponseData]
  ): ParametersCodeScanningListRecentAnalysesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningListRecentAnalysesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodeScanningListRecentAnalysesEndpointMutableBuilder[Self <: ParametersCodeScanningListRecentAnalysesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: CodeScanningListRecentAnalysesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningListRecentAnalysesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
