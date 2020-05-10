package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
@js.native
trait DocumentListResponse[D] extends js.Object {
  // Offset where the document list started.
  var offset: Double = js.native
  // Array of view row objects. By default the information returned contains only the document ID and revision.
  var rows: js.Array[DocumentResponseRow[D]] = js.native
  // Number of documents in the database/view. Note that this is not the number of rows returned in the actual
  // query.
  var total_rows: Double = js.native
  // Current update sequence for the database.
  var update_seq: js.UndefOr[Double] = js.native
}

object DocumentListResponse {
  @scala.inline
  def apply[D](offset: Double, rows: js.Array[DocumentResponseRow[D]], total_rows: Double): DocumentListResponse[D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentListResponse[D]]
  }
  @scala.inline
  implicit class DocumentListResponseOps[Self[d] <: DocumentListResponse[d], D] (val x: Self[D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[D] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[D] with Other]
    @scala.inline
    def withOffset(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[DocumentResponseRow[D]]): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_rows(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate_seq(value: Double): Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate_seq: Self[D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_seq")(js.undefined)
        ret
    }
  }
  
}

