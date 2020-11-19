package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.CodeScanningListAlertsForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.CodeScanningListAlertsForRepoRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.CodeScanningListAlertsForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersCodeScanningListAlertsForRepoEndpoint extends js.Object {
  
  var parameters: CodeScanningListAlertsForRepoEndpoint = js.native
  
  var request: CodeScanningListAlertsForRepoRequestOptions = js.native
  
  var response: OctokitResponse[CodeScanningListAlertsForRepoResponseData] = js.native
}
object ParametersCodeScanningListAlertsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: CodeScanningListAlertsForRepoEndpoint,
    request: CodeScanningListAlertsForRepoRequestOptions,
    response: OctokitResponse[CodeScanningListAlertsForRepoResponseData]
  ): ParametersCodeScanningListAlertsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersCodeScanningListAlertsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersCodeScanningListAlertsForRepoEndpointOps[Self <: ParametersCodeScanningListAlertsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: CodeScanningListAlertsForRepoEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: CodeScanningListAlertsForRepoRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[CodeScanningListAlertsForRepoResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
