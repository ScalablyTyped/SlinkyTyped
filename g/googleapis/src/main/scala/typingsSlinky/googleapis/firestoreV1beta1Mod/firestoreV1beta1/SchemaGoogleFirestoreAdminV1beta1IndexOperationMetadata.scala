package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for index operations. This metadata populates the metadata field
  * of google.longrunning.Operation.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata extends js.Object {
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
  implicit class SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadataOps[Self <: SchemaGoogleFirestoreAdminV1beta1IndexOperationMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancelled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentProgress(value: SchemaGoogleFirestoreAdminV1beta1Progress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationType")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

