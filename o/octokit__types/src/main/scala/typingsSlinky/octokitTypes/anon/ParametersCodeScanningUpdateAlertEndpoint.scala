package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.CodeScanningUpdateAlertEndpoint
import typingsSlinky.octokitTypes.endpointsMod.CodeScanningUpdateAlertRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.CodeScanningUpdateAlertResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodeScanningUpdateAlertEndpoint extends StObject {
  
  var parameters: CodeScanningUpdateAlertEndpoint = js.native
  
  var request: CodeScanningUpdateAlertRequestOptions = js.native
  
  var response: OctokitResponse[CodeScanningUpdateAlertResponseData] = js.native
}
object ParametersCodeScanningUpdateAlertEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodeScanningUpdateAlertEndpoint,
    request: CodeScanningUpdateAlertRequestOptions,
    response: OctokitResponse[CodeScanningUpdateAlertResponseData]
  ): ParametersCodeScanningUpdateAlertEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningUpdateAlertEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodeScanningUpdateAlertEndpointMutableBuilder[Self <: ParametersCodeScanningUpdateAlertEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: CodeScanningUpdateAlertEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodeScanningUpdateAlertRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningUpdateAlertResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
