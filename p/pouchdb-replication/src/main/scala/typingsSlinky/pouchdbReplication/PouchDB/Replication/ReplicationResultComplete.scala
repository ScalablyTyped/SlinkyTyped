package typingsSlinky.pouchdbReplication.PouchDB.Replication

import typingsSlinky.pouchdbCore.PouchDB.Core.ExistingDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationResultComplete[Content /* <: js.Object */] extends ReplicationResult[Content] {
  var end_time: js.Date = js.native
  var status: String = js.native
}

object ReplicationResultComplete {
  @scala.inline
  def apply[Content](
    doc_write_failures: Double,
    docs: js.Array[ExistingDocument[Content]],
    docs_read: Double,
    docs_written: Double,
    end_time: js.Date,
    errors: js.Array[_],
    last_seq: Double,
    ok: Boolean,
    start_time: js.Date,
    status: String
  ): ReplicationResultComplete[Content] = {
    val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], docs_read = docs_read.asInstanceOf[js.Any], docs_written = docs_written.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], last_seq = last_seq.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationResultComplete[Content]]
  }
  @scala.inline
  implicit class ReplicationResultCompleteOps[Self[content] <: ReplicationResultComplete[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withEnd_time(value: js.Date): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

