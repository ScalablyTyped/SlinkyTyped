package typingsSlinky.pouchdbReplication.PouchDB.Replication

import typingsSlinky.pouchdbCore.PouchDB.Core.ExistingDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationResult[Content /* <: js.Object */] extends js.Object {
  var doc_write_failures: Double = js.native
  var docs: js.Array[ExistingDocument[Content]] = js.native
  var docs_read: Double = js.native
  var docs_written: Double = js.native
  var errors: js.Array[_] = js.native
  var last_seq: Double = js.native
  var ok: Boolean = js.native
  var start_time: js.Date = js.native
}

object ReplicationResult {
  @scala.inline
  def apply[Content](
    doc_write_failures: Double,
    docs: js.Array[ExistingDocument[Content]],
    docs_read: Double,
    docs_written: Double,
    errors: js.Array[_],
    last_seq: Double,
    ok: Boolean,
    start_time: js.Date
  ): ReplicationResult[Content] = {
    val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], docs_read = docs_read.asInstanceOf[js.Any], docs_written = docs_written.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], last_seq = last_seq.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationResult[Content]]
  }
  @scala.inline
  implicit class ReplicationResultOps[Self[content] <: ReplicationResult[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withDoc_write_failures(value: Double): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_write_failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocs(value: js.Array[ExistingDocument[Content]]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocs_read(value: Double): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs_read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocs_written(value: Double): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs_written")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrors(value: js.Array[_]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_seq(value: Double): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOk(value: Boolean): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_time(value: js.Date): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

