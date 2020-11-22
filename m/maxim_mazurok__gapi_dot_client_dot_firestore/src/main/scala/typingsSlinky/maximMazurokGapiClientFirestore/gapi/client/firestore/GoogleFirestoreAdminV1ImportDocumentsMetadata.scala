package typingsSlinky.maximMazurokGapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleFirestoreAdminV1ImportDocumentsMetadata extends js.Object {
  
  /** Which collection ids are being imported. */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  
  /** The time this operation completed. Will be unset if operation still in progress. */
  var endTime: js.UndefOr[String] = js.native
  
  /** The location of the documents being imported. */
  var inputUriPrefix: js.UndefOr[String] = js.native
  
  /** The state of the import operation. */
  var operationState: js.UndefOr[String] = js.native
  
  /** The progress, in bytes, of this operation. */
  var progressBytes: js.UndefOr[GoogleFirestoreAdminV1Progress] = js.native
  
  /** The progress, in documents, of this operation. */
  var progressDocuments: js.UndefOr[GoogleFirestoreAdminV1Progress] = js.native
  
  /** The time this operation started. */
  var startTime: js.UndefOr[String] = js.native
}
object GoogleFirestoreAdminV1ImportDocumentsMetadata {
  
  @scala.inline
  def apply(): GoogleFirestoreAdminV1ImportDocumentsMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleFirestoreAdminV1ImportDocumentsMetadata]
  }
  
  @scala.inline
  implicit class GoogleFirestoreAdminV1ImportDocumentsMetadataOps[Self <: GoogleFirestoreAdminV1ImportDocumentsMetadata] (val x: Self) extends AnyVal {
    
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
    def setProgressBytes(value: GoogleFirestoreAdminV1Progress): Self = this.set("progressBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressBytes: Self = this.set("progressBytes", js.undefined)
    
    @scala.inline
    def setProgressDocuments(value: GoogleFirestoreAdminV1Progress): Self = this.set("progressDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressDocuments: Self = this.set("progressDocuments", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
