package typingsSlinky.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The request for FirestoreAdmin.ExportDocuments.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta2ExportDocumentsRequest extends js.Object {
  /**
    * Which collection ids to export. Unspecified means all collections.
    */
  var collectionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The output URI. Currently only supports Google Cloud Storage URIs of the
    * form: `gs://BUCKET_NAME[/NAMESPACE_PATH]`, where `BUCKET_NAME` is the
    * name of the Google Cloud Storage bucket and `NAMESPACE_PATH` is an
    * optional Google Cloud Storage namespace path. When choosing a name, be
    * sure to consider Google Cloud Storage naming guidelines:
    * https://cloud.google.com/storage/docs/naming. If the URI is a bucket
    * (without a namespace path), a prefix will be generated based on the start
    * time.
    */
  var outputUriPrefix: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1beta2ExportDocumentsRequest {
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta2ExportDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta2ExportDocumentsRequest]
  }
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta2ExportDocumentsRequestOps[Self <: SchemaGoogleFirestoreAdminV1beta2ExportDocumentsRequest] (val x: Self) extends AnyVal {
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
    def withOutputUriPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUriPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputUriPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputUriPrefix")(js.undefined)
        ret
    }
  }
  
}

