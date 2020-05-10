package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationInstanceTaskLog extends js.Object {
  /**
    * The size, in bytes, of the replication task log.
    */
  var ReplicationInstanceTaskLogSize: js.UndefOr[Long] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication task.
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.native
  /**
    * The name of the replication task.
    */
  var ReplicationTaskName: js.UndefOr[String] = js.native
}

object ReplicationInstanceTaskLog {
  @scala.inline
  def apply(): ReplicationInstanceTaskLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationInstanceTaskLog]
  }
  @scala.inline
  implicit class ReplicationInstanceTaskLogOps[Self <: ReplicationInstanceTaskLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationInstanceTaskLogSize(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceTaskLogSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationInstanceTaskLogSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationInstanceTaskLogSize")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationTaskArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskArn")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationTaskName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTaskName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskName")(js.undefined)
        ret
    }
  }
  
}

