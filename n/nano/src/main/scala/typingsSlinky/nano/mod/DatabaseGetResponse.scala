package typingsSlinky.nano.mod

import typingsSlinky.nano.anon.Active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/common.html#get--db
@js.native
trait DatabaseGetResponse extends js.Object {
  
  // Set to true if the database compaction routine is operating on this database.
  var compact_running: Boolean = js.native
  
  // The number of bytes of live data inside the database file.
  var data_size: Double = js.native
  
  // The name of the database.
  var db_name: String = js.native
  
  // The version of the physical format used for the data when it is stored on disk.
  var disk_format_version: Double = js.native
  
  // The length of the database file on disk. Views indexes are not included in the calculation.
  var disk_size: Double = js.native
  
  // A count of the documents in the specified database.
  var doc_count: Double = js.native
  
  // Number of deleted documents
  var doc_del_count: Double = js.native
  
  // Timestamp of when the database was opened, expressed in microseconds since the epoch.
  var instance_start_time: String = js.native
  
  // The number of purge operations on the database.
  var purge_seq: Double = js.native
  
  var sizes: Active = js.native
  
  // The current number of updates to the database.
  var update_seq: Double = js.native
}
object DatabaseGetResponse {
  
  @scala.inline
  def apply(
    compact_running: Boolean,
    data_size: Double,
    db_name: String,
    disk_format_version: Double,
    disk_size: Double,
    doc_count: Double,
    doc_del_count: Double,
    instance_start_time: String,
    purge_seq: Double,
    sizes: Active,
    update_seq: Double
  ): DatabaseGetResponse = {
    val __obj = js.Dynamic.literal(compact_running = compact_running.asInstanceOf[js.Any], data_size = data_size.asInstanceOf[js.Any], db_name = db_name.asInstanceOf[js.Any], disk_format_version = disk_format_version.asInstanceOf[js.Any], disk_size = disk_size.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], doc_del_count = doc_del_count.asInstanceOf[js.Any], instance_start_time = instance_start_time.asInstanceOf[js.Any], purge_seq = purge_seq.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], update_seq = update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseGetResponse]
  }
  
  @scala.inline
  implicit class DatabaseGetResponseOps[Self <: DatabaseGetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompact_running(value: Boolean): Self = this.set("compact_running", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_size(value: Double): Self = this.set("data_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb_name(value: String): Self = this.set("db_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisk_format_version(value: Double): Self = this.set("disk_format_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisk_size(value: Double): Self = this.set("disk_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc_count(value: Double): Self = this.set("doc_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoc_del_count(value: Double): Self = this.set("doc_del_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance_start_time(value: String): Self = this.set("instance_start_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurge_seq(value: Double): Self = this.set("purge_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizes(value: Active): Self = this.set("sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_seq(value: Double): Self = this.set("update_seq", value.asInstanceOf[js.Any])
  }
}
