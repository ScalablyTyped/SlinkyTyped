package typingsSlinky.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The streamed response for Firestore.BatchGetDocuments.
  */
@js.native
trait SchemaBatchGetDocumentsResponse extends js.Object {
  /**
    * A document that was requested.
    */
  var found: js.UndefOr[SchemaDocument] = js.native
  /**
    * A document name that was requested but does not exist. In the format:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var missing: js.UndefOr[String] = js.native
  /**
    * The time at which the document was read. This may be monotically
    * increasing, in this case the previous documents in the result stream are
    * guaranteed not to have changed between their read_time and this one.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * The transaction that was started as part of this request. Will only be
    * set in the first response, and only if
    * BatchGetDocumentsRequest.new_transaction was set in the request.
    */
  var transaction: js.UndefOr[String] = js.native
}

object SchemaBatchGetDocumentsResponse {
  @scala.inline
  def apply(): SchemaBatchGetDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetDocumentsResponse]
  }
  @scala.inline
  implicit class SchemaBatchGetDocumentsResponseOps[Self <: SchemaBatchGetDocumentsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFound(value: SchemaDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("found")(js.undefined)
        ret
    }
    @scala.inline
    def withMissing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(js.undefined)
        ret
    }
    @scala.inline
    def withReadTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTransaction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transaction")(js.undefined)
        ret
    }
  }
  
}

