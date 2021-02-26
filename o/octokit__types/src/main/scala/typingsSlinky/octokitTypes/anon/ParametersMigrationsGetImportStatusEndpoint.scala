package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.MigrationsGetImportStatusEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsGetImportStatusRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.MigrationsGetImportStatusResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsGetImportStatusEndpoint extends StObject {
  
  var parameters: MigrationsGetImportStatusEndpoint = js.native
  
  var request: MigrationsGetImportStatusRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsGetImportStatusResponseData] = js.native
}
object ParametersMigrationsGetImportStatusEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsGetImportStatusEndpoint,
    request: MigrationsGetImportStatusRequestOptions,
    response: OctokitResponse[MigrationsGetImportStatusResponseData]
  ): ParametersMigrationsGetImportStatusEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsGetImportStatusEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsGetImportStatusEndpointMutableBuilder[Self <: ParametersMigrationsGetImportStatusEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsGetImportStatusEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsGetImportStatusRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsGetImportStatusResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
