package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.CodeScanningListRecentAnalysesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.CodeScanningListRecentAnalysesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.CodeScanningListRecentAnalysesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodeScanningListRecentAnalysesEndpoint extends StObject {
  
  var parameters: CodeScanningListRecentAnalysesEndpoint = js.native
  
  var request: CodeScanningListRecentAnalysesRequestOptions = js.native
  
  var response: OctokitResponse[CodeScanningListRecentAnalysesResponseData] = js.native
}
object ParametersCodeScanningListRecentAnalysesEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodeScanningListRecentAnalysesEndpoint,
    request: CodeScanningListRecentAnalysesRequestOptions,
    response: OctokitResponse[CodeScanningListRecentAnalysesResponseData]
  ): ParametersCodeScanningListRecentAnalysesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningListRecentAnalysesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodeScanningListRecentAnalysesEndpointMutableBuilder[Self <: ParametersCodeScanningListRecentAnalysesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: CodeScanningListRecentAnalysesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodeScanningListRecentAnalysesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningListRecentAnalysesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
