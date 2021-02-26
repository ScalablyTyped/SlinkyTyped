package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ChecksCreateSuiteEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksCreateSuiteRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ChecksCreateSuiteResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksCreateSuiteEndpoint extends StObject {
  
  var parameters: ChecksCreateSuiteEndpoint = js.native
  
  var request: ChecksCreateSuiteRequestOptions = js.native
  
  var response: OctokitResponse[ChecksCreateSuiteResponseData] = js.native
}
object ParametersChecksCreateSuiteEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksCreateSuiteEndpoint,
    request: ChecksCreateSuiteRequestOptions,
    response: OctokitResponse[ChecksCreateSuiteResponseData]
  ): ParametersChecksCreateSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksCreateSuiteEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksCreateSuiteEndpointMutableBuilder[Self <: ParametersChecksCreateSuiteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksCreateSuiteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksCreateSuiteRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksCreateSuiteResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
