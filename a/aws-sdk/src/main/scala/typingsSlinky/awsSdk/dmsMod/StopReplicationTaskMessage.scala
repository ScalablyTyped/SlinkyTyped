package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopReplicationTaskMessage extends js.Object {
  /**
    * The Amazon Resource Name(ARN) of the replication task to be stopped.
    */
  var ReplicationTaskArn: String = js.native
}

object StopReplicationTaskMessage {
  @scala.inline
  def apply(ReplicationTaskArn: String): StopReplicationTaskMessage = {
    val __obj = js.Dynamic.literal(ReplicationTaskArn = ReplicationTaskArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopReplicationTaskMessage]
  }
  @scala.inline
  implicit class StopReplicationTaskMessageOps[Self <: StopReplicationTaskMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationTaskArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTaskArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

