package typingsSlinky.maximMazurokGapiClientServicecontrol.gapi.client.servicecontrol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportRequest extends StObject {
  
  /** Describes the list of operations to be reported. Each operation is represented as an AttributeContext, and contains all attributes around an API access. */
  var operations: js.UndefOr[js.Array[AttributeContext]] = js.native
  
  /**
    * Specifies the version of the service configuration that should be used to process the request. Must not be empty. Set this field to 'latest' to specify using the latest
    * configuration.
    */
  var serviceConfigId: js.UndefOr[String] = js.native
}
object ReportRequest {
  
  @scala.inline
  def apply(): ReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRequest]
  }
  
  @scala.inline
  implicit class ReportRequestMutableBuilder[Self <: ReportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperations(value: js.Array[AttributeContext]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: AttributeContext*): Self = StObject.set(x, "operations", js.Array(value :_*))
    
    @scala.inline
    def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
  }
}
