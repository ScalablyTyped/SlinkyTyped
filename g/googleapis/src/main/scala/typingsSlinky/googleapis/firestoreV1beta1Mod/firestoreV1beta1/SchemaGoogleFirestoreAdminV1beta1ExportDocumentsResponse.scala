package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returned in the google.longrunning.Operation response field.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1beta1ExportDocumentsResponse extends js.Object {
  /**
    * Location of the output files. This can be used to begin an import into
    * Cloud Firestore (this project or another project) after the operation
    * completes successfully.
    */
  var outputUriPrefix: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1beta1ExportDocumentsResponse {
  @scala.inline
  def apply(): SchemaGoogleFirestoreAdminV1beta1ExportDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1beta1ExportDocumentsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleFirestoreAdminV1beta1ExportDocumentsResponseOps[Self <: SchemaGoogleFirestoreAdminV1beta1ExportDocumentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

