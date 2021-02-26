package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ChecksListForSuiteEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksListForSuiteResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksListForSuiteEndpoint extends StObject {
  
  var parameters: ChecksListForSuiteEndpoint = js.native
  
  var response: OctokitResponse[ChecksListForSuiteResponseData] with `13` = js.native
}
object ParametersChecksListForSuiteEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksListForSuiteEndpoint,
    response: OctokitResponse[ChecksListForSuiteResponseData] with `13`
  ): ParametersChecksListForSuiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListForSuiteEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksListForSuiteEndpointMutableBuilder[Self <: ParametersChecksListForSuiteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksListForSuiteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListForSuiteResponseData] with `13`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
