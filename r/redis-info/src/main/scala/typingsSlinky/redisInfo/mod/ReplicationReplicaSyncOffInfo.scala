package typingsSlinky.redisInfo.mod

import typingsSlinky.redisInfo.mod.Flag.OFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationReplicaSyncOffInfo extends js.Object {
  var master_sync_in_progress: OFF = js.native
}

object ReplicationReplicaSyncOffInfo {
  @scala.inline
  def apply(master_sync_in_progress: OFF): ReplicationReplicaSyncOffInfo = {
    val __obj = js.Dynamic.literal(master_sync_in_progress = master_sync_in_progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationReplicaSyncOffInfo]
  }
  @scala.inline
  implicit class ReplicationReplicaSyncOffInfoOps[Self <: ReplicationReplicaSyncOffInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaster_sync_in_progress(value: OFF): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_sync_in_progress")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

