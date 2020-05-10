package typingsSlinky.redisInfo.mod

import typingsSlinky.redisInfo.mod.Flag.ON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersistenceAOFOnInfo extends js.Object {
  var aof_base_size: String = js.native
  var aof_buffer_length: String = js.native
  var aof_current_size: String = js.native
  var aof_delayed_fsync: String = js.native
  var aof_enabled: ON = js.native
  var aof_pending_bio_fsync: String = js.native
  var aof_pending_rewrite: Flag = js.native
  var aof_rewrite_buffer_length: String = js.native
}

object PersistenceAOFOnInfo {
  @scala.inline
  def apply(
    aof_base_size: String,
    aof_buffer_length: String,
    aof_current_size: String,
    aof_delayed_fsync: String,
    aof_enabled: ON,
    aof_pending_bio_fsync: String,
    aof_pending_rewrite: Flag,
    aof_rewrite_buffer_length: String
  ): PersistenceAOFOnInfo = {
    val __obj = js.Dynamic.literal(aof_base_size = aof_base_size.asInstanceOf[js.Any], aof_buffer_length = aof_buffer_length.asInstanceOf[js.Any], aof_current_size = aof_current_size.asInstanceOf[js.Any], aof_delayed_fsync = aof_delayed_fsync.asInstanceOf[js.Any], aof_enabled = aof_enabled.asInstanceOf[js.Any], aof_pending_bio_fsync = aof_pending_bio_fsync.asInstanceOf[js.Any], aof_pending_rewrite = aof_pending_rewrite.asInstanceOf[js.Any], aof_rewrite_buffer_length = aof_rewrite_buffer_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceAOFOnInfo]
  }
  @scala.inline
  implicit class PersistenceAOFOnInfoOps[Self <: PersistenceAOFOnInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAof_base_size(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aof_base_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAof_buffer_length(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aof_buffer_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAof_current_size(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aof_current_size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAof_delayed_fsync(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aof_delayed_fsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAof_enabled(value: ON): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aof_enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAof_pending_bio_fsync(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aof_pending_bio_fsync")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAof_pending_rewrite(value: Flag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aof_pending_rewrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAof_rewrite_buffer_length(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aof_rewrite_buffer_length")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

