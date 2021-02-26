package typingsSlinky.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
@js.native
trait DatabaseReplicationHistoryItem extends StObject {
  
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
  implicit class DatabaseReplicationHistoryItemMutableBuilder[Self <: DatabaseReplicationHistoryItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoc_write_failures(value: Double): Self = StObject.set(x, "doc_write_failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocs_read(value: Double): Self = StObject.set(x, "docs_read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocs_written(value: Double): Self = StObject.set(x, "docs_written", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_last_seq(value: Double): Self = StObject.set(x, "end_last_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_time(value: String): Self = StObject.set(x, "end_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissing_checked(value: Double): Self = StObject.set(x, "missing_checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissing_found(value: Double): Self = StObject.set(x, "missing_found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecorded_seq(value: Double): Self = StObject.set(x, "recorded_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_last_seq(value: Double): Self = StObject.set(x, "start_last_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
  }
}
