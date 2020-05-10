package typingsSlinky.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
@js.native
trait DatabaseReplicationHistoryItem extends js.Object {
  // Number of document write failures
  var doc_write_failures: Double = js.native
  // Number of documents read
  var docs_read: Double = js.native
  // Number of documents written to target
  var docs_written: Double = js.native
  // Last sequence number in changes stream
  var end_last_seq: Double = js.native
  // Date/Time replication operation completed in RFC 2822 format
  var end_time: String = js.native
  // Number of missing documents checked
  var missing_checked: Double = js.native
  // Number of missing documents found
  var missing_found: Double = js.native
  // Last recorded sequence number
  var recorded_seq: Double = js.native
  // Session ID for this replication operation
  var session_id: String = js.native
  // First sequence number in changes stream
  var start_last_seq: Double = js.native
  // Date/Time replication operation started in RFC 2822 format
  var start_time: String = js.native
}

object DatabaseReplicationHistoryItem {
  @scala.inline
  def apply(
    doc_write_failures: Double,
    docs_read: Double,
    docs_written: Double,
    end_last_seq: Double,
    end_time: String,
    missing_checked: Double,
    missing_found: Double,
    recorded_seq: Double,
    session_id: String,
    start_last_seq: Double,
    start_time: String
  ): DatabaseReplicationHistoryItem = {
    val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures.asInstanceOf[js.Any], docs_read = docs_read.asInstanceOf[js.Any], docs_written = docs_written.asInstanceOf[js.Any], end_last_seq = end_last_seq.asInstanceOf[js.Any], end_time = end_time.asInstanceOf[js.Any], missing_checked = missing_checked.asInstanceOf[js.Any], missing_found = missing_found.asInstanceOf[js.Any], recorded_seq = recorded_seq.asInstanceOf[js.Any], session_id = session_id.asInstanceOf[js.Any], start_last_seq = start_last_seq.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseReplicationHistoryItem]
  }
  @scala.inline
  implicit class DatabaseReplicationHistoryItemOps[Self <: DatabaseReplicationHistoryItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDoc_write_failures(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc_write_failures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocs_read(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs_read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocs_written(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("docs_written")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_last_seq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_last_seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissing_checked(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing_checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMissing_found(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing_found")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecorded_seq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recorded_seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_last_seq(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_last_seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

