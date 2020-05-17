package typingsSlinky.pouchdbCore.PouchDB.Core

import typingsSlinky.pouchdbCore.anon.Doc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllDocsResponse[Content /* <: js.Object */] extends js.Object {
  /** The `skip` if provided, or in CouchDB the actual offset */
  var offset: Double = js.native
  var rows: js.Array[Doc[Content]] = js.native
  var total_rows: Double = js.native
  var update_seq: js.UndefOr[Double | String] = js.native
}

object AllDocsResponse {
  @scala.inline
  def apply[Content](offset: Double, rows: js.Array[Doc[Content]], total_rows: Double): AllDocsResponse[Content] = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], total_rows = total_rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllDocsResponse[Content]]
  }
  @scala.inline
  implicit class AllDocsResponseOps[Self[content] <: AllDocsResponse[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withOffset(value: Double): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: js.Array[Doc[Content]]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_rows(value: Double): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate_seq(value: Double | String): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdate_seq: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update_seq")(js.undefined)
        ret
    }
  }
  
}

