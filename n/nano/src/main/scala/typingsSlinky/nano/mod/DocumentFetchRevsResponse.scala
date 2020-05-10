package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentFetchRevsResponse[D] extends js.Object {
  var offset: Double = js.native
  var rows: js.Array[DocumentResponseRow[D] | DocumentLookupFailure] = js.native
  var total_rows: Double = js.native
  var update_seq: js.UndefOr[Double] = js.native
}

object DocumentFetchRevsResponse {
  @scala.inline
  def apply[D](offset: Double, rows: js.Array[DocumentResponseRow[D] | DocumentLookupFailure], total_rows: Double): DocumentFetchRevsResponse[D] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentFetchRevsResponse[D]]
  }
  @scala.inline
  implicit class DocumentFetchRevsResponseOps[Self[d] <: DocumentFetchRevsResponse[d], D] (val x: Self[D]) extends AnyVal {
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
    def withRows(value: js.Array[DocumentResponseRow[D] | DocumentLookupFailure]): Self[D] = {
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

