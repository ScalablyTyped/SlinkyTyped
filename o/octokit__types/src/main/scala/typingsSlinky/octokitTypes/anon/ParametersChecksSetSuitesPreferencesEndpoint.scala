package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ChecksSetSuitesPreferencesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksSetSuitesPreferencesEndpoint extends StObject {
  
  var parameters: ChecksSetSuitesPreferencesEndpoint = js.native
  
  var request: ChecksSetSuitesPreferencesRequestOptions = js.native
  
  var response: OctokitResponse[ChecksSetSuitesPreferencesResponseData] = js.native
}
object ParametersChecksSetSuitesPreferencesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksSetSuitesPreferencesEndpoint,
    request: ChecksSetSuitesPreferencesRequestOptions,
    response: OctokitResponse[ChecksSetSuitesPreferencesResponseData]
  ): ParametersChecksSetSuitesPreferencesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksSetSuitesPreferencesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksSetSuitesPreferencesEndpointMutableBuilder[Self <: ParametersChecksSetSuitesPreferencesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksSetSuitesPreferencesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksSetSuitesPreferencesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksSetSuitesPreferencesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
