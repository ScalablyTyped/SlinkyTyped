package typingsSlinky.redisInfo.mod

import typingsSlinky.redisInfo.mod.LinkStatus.DOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationReplicaLinkDownInfo extends js.Object {
  var master_link_down_since_seconds: String = js.native
  var master_link_status: DOWN = js.native
}

object ReplicationReplicaLinkDownInfo {
  @scala.inline
  def apply(master_link_down_since_seconds: String, master_link_status: DOWN): ReplicationReplicaLinkDownInfo = {
    val __obj = js.Dynamic.literal(master_link_down_since_seconds = master_link_down_since_seconds.asInstanceOf[js.Any], master_link_status = master_link_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationReplicaLinkDownInfo]
  }
  @scala.inline
  implicit class ReplicationReplicaLinkDownInfoOps[Self <: ReplicationReplicaLinkDownInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaster_link_down_since_seconds(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_link_down_since_seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaster_link_status(value: DOWN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_link_status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

