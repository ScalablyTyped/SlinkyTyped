package typingsSlinky.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operation extends StObject {
  
  /** If the value is `false`, it means the operation is still in progress. If `true`, the operation is completed, and either `error` or `response` is available. */
  var done: js.UndefOr[Boolean] = js.native
  
  /** The error result of the operation in case of failure or cancellation. */
  var error: js.UndefOr[Status] = js.native
  
  /**
    * Service-specific metadata associated with the operation. It typically contains progress information and common metadata such as create time. Some services might not provide such
    * metadata. Any method that returns a long-running operation should document the metadata type, if any.
    */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.Operation with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The server-assigned name, which is only unique within the same service that originally returns it. If you use the default HTTP mapping, the `name` should be a resource name ending
    * with `operations/{unique_id}`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The normal response of the operation in case of success. If the original method returns no data on success, such as `Delete`, the response is `google.protobuf.Empty`. If the
    * original method is standard `Get`/`Create`/`Update`, the response should be the resource. For other methods, the response should have the type `XxxResponse`, where `Xxx` is the
    * original method name. For example, if the original method name is `TakeSnapshot()`, the inferred response type is `TakeSnapshotResponse`.
    */
  var response: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.Operation with TopLevel[js.Any]
  ] = js.native
}
object Operation {
  
  @scala.inline
  def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  @scala.inline
  implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setError(value: Status): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.Operation with TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResponse(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientDatamigration.maximMazurokGapiClientDatamigrationStrings.Operation with TopLevel[js.Any]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
