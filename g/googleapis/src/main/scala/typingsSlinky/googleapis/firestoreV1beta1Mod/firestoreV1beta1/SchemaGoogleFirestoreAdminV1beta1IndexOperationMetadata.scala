package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for index operations. This metadata populates the metadata field
  * of google.longrunning.Operation.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata extends StObject {
  
  /**
    * True if the [google.longrunning.Operation] was cancelled. If the
    * cancellation is in progress, cancelled will be true but
    * google.longrunning.Operation.done will be false.
    */
  var cancelled: js.UndefOr[Boolean] = js.native
  
  /**
    * Progress of the existing operation, measured in number of documents.
    */
  var documentProgress: js.UndefOr[SchemaGoogleFirestoreAdminV1beta1Progress] = js.native
  
  /**
    * The time the operation ended, either successfully or otherwise. Unset if
    * the operation is still active.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * The index resource that this operation is acting on. For example:
    * `projects/{project_id}/databases/{database_id}/indexes/{index_id}`
    */
  var index: js.UndefOr[String] = js.native
  
  /**
    * The type of index operation.
    */
  var operationType: js.UndefOr[String] = js.native
  
  /**
    * The time that work began on the operation.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadataMutableBuilder[Self <: SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelledUndefined: Self = StObject.set(x, "cancelled", js.undefined)
    
    @scala.inline
    def setDocumentProgress(value: SchemaGoogleFirestoreAdminV1beta1Progress): Self = StObject.set(x, "documentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentProgressUndefined: Self = StObject.set(x, "documentProgress", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
