package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for Firestore.ListDocuments.
  */
@js.native
trait SchemaListDocumentsResponse extends js.Object {
  /**
    * The Documents found.
    */
  var documents: js.UndefOr[js.Array[SchemaDocument]] = js.native
  /**
    * The next page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDocumentsResponse {
  @scala.inline
  def apply(): SchemaListDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDocumentsResponse]
  }
  @scala.inline
  implicit class SchemaListDocumentsResponseOps[Self <: SchemaListDocumentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocuments(value: js.Array[SchemaDocument]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocuments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documents")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

