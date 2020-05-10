package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for FirestoreAdmin.ImportDocuments.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1ImportDocumentsRequest extends js.Object {
  /**
    * Which collection ids to import. Unspecified means all collections
    * included in the import.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Location of the exported files. This must match the output_uri_prefix of
    * an ExportDocumentsResponse from an export that has completed
    * successfully. See:
    * google.firestore.admin.v1.ExportDocumentsResponse.output_uri_prefix.
    */
  var inputUriPrefix: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1ImportDocumentsRequest {
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1ImportDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1ImportDocumentsRequest]
  }
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1ImportDocumentsRequestOps[Self <: SchemaGoogleFirestoreAdminV1ImportDocumentsRequest] (val x: Self) extends AnyVal {
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
  }
  
}

