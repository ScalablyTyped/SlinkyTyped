package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for ImportDocuments operations.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta1ImportDocumentsMetadata extends js.Object {
  
  /**
    * Which collection ids are being imported.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The time the operation ended, either successfully or otherwise. Unset if
    * the operation is still active.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * The location of the documents being imported.
    */
  var inputUriPrefix: js.UndefOr[String] = js.native
  
  /**
    * The state of the import operation.
    */
  var operationState: js.UndefOr[String] = js.native
  
  /**
    * An estimate of the number of bytes processed.
    */
  var progressBytes: js.UndefOr[SchemaGoogleFirestoreAdminV1beta1Progress] = js.native
  
  /**
    * An estimate of the number of documents processed.
    */
  var progressDocuments: js.UndefOr[SchemaGoogleFirestoreAdminV1beta1Progress] = js.native
  
  /**
    * The time that work began on the operation.
    */
  var startTime: js.UndefOr[String] = js.native
}
object SchemaGoogleFirestoreAdminV1beta1ImportDocumentsMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta1ImportDocumentsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1ImportDocumentsMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta1ImportDocumentsMetadataOps[Self <: SchemaGoogleFirestoreAdminV1beta1ImportDocumentsMetadata] (val x: Self) extends AnyVal {
    
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
    def setCollectionIdsVarargs(value: String*): Self = this.set("collectionIds", js.Array(value :_*))
    
    @scala.inline
    def setCollectionIds(value: js.Array[String]): Self = this.set("collectionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionIds: Self = this.set("collectionIds", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setInputUriPrefix(value: String): Self = this.set("inputUriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputUriPrefix: Self = this.set("inputUriPrefix", js.undefined)
    
    @scala.inline
    def setOperationState(value: String): Self = this.set("operationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationState: Self = this.set("operationState", js.undefined)
    
    @scala.inline
    def setProgressBytes(value: SchemaGoogleFirestoreAdminV1beta1Progress): Self = this.set("progressBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressBytes: Self = this.set("progressBytes", js.undefined)
    
    @scala.inline
    def setProgressDocuments(value: SchemaGoogleFirestoreAdminV1beta1Progress): Self = this.set("progressDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressDocuments: Self = this.set("progressDocuments", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
