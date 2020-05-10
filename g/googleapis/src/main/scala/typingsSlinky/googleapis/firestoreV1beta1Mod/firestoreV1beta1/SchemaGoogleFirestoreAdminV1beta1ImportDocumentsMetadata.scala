package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withCollectionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionIds")(js.undefined)
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
    def withInputUriPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputUriPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputUriPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputUriPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationState")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressBytes(value: SchemaGoogleFirestoreAdminV1beta1Progress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressDocuments(value: SchemaGoogleFirestoreAdminV1beta1Progress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressDocuments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressDocuments")(js.undefined)
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

