package typingsSlinky.nano.mod

import typingsSlinky.nano.anon.Doc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentSearchResponse[V] extends js.Object {
  // token which if supplied to a subsequent search will return the next page of results.
  var bookmark: String = js.native
  // facet counts
  var counts: js.UndefOr[js.Object] = js.native
  var highlights: js.UndefOr[js.Object] = js.native
  // facet range results
  var ranges: js.UndefOr[js.Object] = js.native
  //  Array of search results
  var rows: js.Array[Doc[V]] = js.native
  // Number of documents in the search resykts
  var total_rows: Double = js.native
}

object DocumentSearchResponse {
  @scala.inline
  def apply[V](bookmark: String, rows: js.Array[Doc[V]], total_rows: Double): DocumentSearchResponse[V] = {
    val __obj = js.Dynamic.literal(bookmark = bookmark.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentSearchResponse[V]]
  }
  @scala.inline
  implicit class DocumentSearchResponseOps[Self[v] <: DocumentSearchResponse[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withBookmark(value: String): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[Doc[V]]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_rows(value: Double): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCounts(value: js.Object): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounts: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counts")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlights(value: js.Object): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlights")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlights: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlights")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: js.Object): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
  }
  
}

