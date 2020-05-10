package typingsSlinky.redisInfo.mod

import typingsSlinky.redisInfo.redisInfoStrings.slave
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseReplicationReplicaInfo extends js.Object {
  var connected_slaves: String = js.native
  var master_host: String = js.native
  var master_last_io_seconds_ago: String = js.native
  var master_port: String = js.native
  var min_slaves_good_slaves: String = js.native
  var role: slave = js.native
  var slave_priority: String = js.native
  var slave_read_only: Flag = js.native
  var slave_repl_offset: String = js.native
}

object BaseReplicationReplicaInfo {
  @scala.inline
  def apply(
    connected_slaves: String,
    master_host: String,
    master_last_io_seconds_ago: String,
    master_port: String,
    min_slaves_good_slaves: String,
    role: slave,
    slave_priority: String,
    slave_read_only: Flag,
    slave_repl_offset: String
  ): BaseReplicationReplicaInfo = {
    val __obj = js.Dynamic.literal(connected_slaves = connected_slaves.asInstanceOf[js.Any], master_host = master_host.asInstanceOf[js.Any], master_last_io_seconds_ago = master_last_io_seconds_ago.asInstanceOf[js.Any], master_port = master_port.asInstanceOf[js.Any], min_slaves_good_slaves = min_slaves_good_slaves.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], slave_priority = slave_priority.asInstanceOf[js.Any], slave_read_only = slave_read_only.asInstanceOf[js.Any], slave_repl_offset = slave_repl_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseReplicationReplicaInfo]
  }
  @scala.inline
  implicit class BaseReplicationReplicaInfoOps[Self <: BaseReplicationReplicaInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnected_slaves(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connected_slaves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaster_host(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaster_last_io_seconds_ago(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_last_io_seconds_ago")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaster_port(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("master_port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin_slaves_good_slaves(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min_slaves_good_slaves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRole(value: slave): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlave_priority(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slave_priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlave_read_only(value: Flag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slave_read_only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlave_repl_offset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slave_repl_offset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

