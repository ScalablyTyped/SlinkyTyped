package typingsSlinky.nano.mod

import typingsSlinky.nano.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/ddoc/views.html#get--db-_design-ddoc-_view-view
@js.native
trait DocumentViewResponse[V, D] extends js.Object {
  // Offset where the document list started.
  var offset: Double = js.native
  //  Array of view row objects. By default the information returned contains only the document ID and revision.
  var rows: js.Array[Id[V, D]] = js.native
  // Number of documents in the database/view.
  var total_rows: Double = js.native
  // Current update sequence for the database
  var update_seq: js.Any = js.native
}

object DocumentViewResponse {
  @scala.inline
  def apply[V, D](offset: Double, rows: js.Array[Id[V, D]], total_rows: Double, update_seq: js.Any): DocumentViewResponse[V, D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any], update_seq = update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentViewResponse[V, D]]
  }
  @scala.inline
  implicit class DocumentViewResponseOps[Self[v, d] <: DocumentViewResponse[v, d], V, D] (val x: Self[V, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[V, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[V, D]) with Other]
    @scala.inline
    def withOffset(value: Double): Self[V, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[Id[V, D]]): Self[V, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_rows(value: Double): Self[V, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate_seq(value: js.Any): Self[V, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_seq")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

