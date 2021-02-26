package typingsSlinky.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the processing error of one Operation in the request.
  */
@js.native
trait SchemaReportError extends StObject {
  
  /**
    * The Operation.operation_id value from the request.
    */
  var operationId: js.UndefOr[String] = js.native
  
  /**
    * Details of the error when processing the Operation.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}
object SchemaReportError {
  
  @scala.inline
  def apply(): SchemaReportError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportError]
  }
  
  @scala.inline
  implicit class SchemaReportErrorMutableBuilder[Self <: SchemaReportError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
