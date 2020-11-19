package typingsSlinky.redisInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePersistenceInfo extends js.Object {
  
  var aof_current_rewrite_time_sec: String = js.native
  
  var aof_last_bgrewrite_status: String = js.native
  
  var aof_last_cow_size: String = js.native
  
  var aof_last_rewrite_time_sec: String = js.native
  
  var aof_last_write_status: String = js.native
  
  var aof_rewrite_in_progress: Flag = js.native
  
  var aof_rewrite_scheduled: Flag = js.native
  
  var rdb_bgsave_in_progress: Flag = js.native
  
  var rdb_changes_since_last_save: String = js.native
  
  var rdb_current_bgsave_time_sec: String = js.native
  
  var rdb_last_bgsave_status: String = js.native
  
  var rdb_last_bgsave_time_sec: String = js.native
  
  var rdb_last_cow_size: String = js.native
  
  var rdb_last_save_time: String = js.native
}
object BasePersistenceInfo {
  
  @scala.inline
  def apply(
    aof_current_rewrite_time_sec: String,
    aof_last_bgrewrite_status: String,
    aof_last_cow_size: String,
    aof_last_rewrite_time_sec: String,
    aof_last_write_status: String,
    aof_rewrite_in_progress: Flag,
    aof_rewrite_scheduled: Flag,
    rdb_bgsave_in_progress: Flag,
    rdb_changes_since_last_save: String,
    rdb_current_bgsave_time_sec: String,
    rdb_last_bgsave_status: String,
    rdb_last_bgsave_time_sec: String,
    rdb_last_cow_size: String,
    rdb_last_save_time: String
  ): BasePersistenceInfo = {
    val __obj = js.Dynamic.literal(aof_current_rewrite_time_sec = aof_current_rewrite_time_sec.asInstanceOf[js.Any], aof_last_bgrewrite_status = aof_last_bgrewrite_status.asInstanceOf[js.Any], aof_last_cow_size = aof_last_cow_size.asInstanceOf[js.Any], aof_last_rewrite_time_sec = aof_last_rewrite_time_sec.asInstanceOf[js.Any], aof_last_write_status = aof_last_write_status.asInstanceOf[js.Any], aof_rewrite_in_progress = aof_rewrite_in_progress.asInstanceOf[js.Any], aof_rewrite_scheduled = aof_rewrite_scheduled.asInstanceOf[js.Any], rdb_bgsave_in_progress = rdb_bgsave_in_progress.asInstanceOf[js.Any], rdb_changes_since_last_save = rdb_changes_since_last_save.asInstanceOf[js.Any], rdb_current_bgsave_time_sec = rdb_current_bgsave_time_sec.asInstanceOf[js.Any], rdb_last_bgsave_status = rdb_last_bgsave_status.asInstanceOf[js.Any], rdb_last_bgsave_time_sec = rdb_last_bgsave_time_sec.asInstanceOf[js.Any], rdb_last_cow_size = rdb_last_cow_size.asInstanceOf[js.Any], rdb_last_save_time = rdb_last_save_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePersistenceInfo]
  }
  
  @scala.inline
  implicit class BasePersistenceInfoOps[Self <: BasePersistenceInfo] (val x: Self) extends AnyVal {
    
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
    def setAof_current_rewrite_time_sec(value: String): Self = this.set("aof_current_rewrite_time_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAof_last_bgrewrite_status(value: String): Self = this.set("aof_last_bgrewrite_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAof_last_cow_size(value: String): Self = this.set("aof_last_cow_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAof_last_rewrite_time_sec(value: String): Self = this.set("aof_last_rewrite_time_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAof_last_write_status(value: String): Self = this.set("aof_last_write_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAof_rewrite_in_progress(value: Flag): Self = this.set("aof_rewrite_in_progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAof_rewrite_scheduled(value: Flag): Self = this.set("aof_rewrite_scheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdb_bgsave_in_progress(value: Flag): Self = this.set("rdb_bgsave_in_progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdb_changes_since_last_save(value: String): Self = this.set("rdb_changes_since_last_save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdb_current_bgsave_time_sec(value: String): Self = this.set("rdb_current_bgsave_time_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdb_last_bgsave_status(value: String): Self = this.set("rdb_last_bgsave_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdb_last_bgsave_time_sec(value: String): Self = this.set("rdb_last_bgsave_time_sec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdb_last_cow_size(value: String): Self = this.set("rdb_last_cow_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdb_last_save_time(value: String): Self = this.set("rdb_last_save_time", value.asInstanceOf[js.Any])
  }
}
