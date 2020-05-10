package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicationTaskResponse extends js.Object {
  /**
    * The replication task that was created.
    */
  var ReplicationTask: js.UndefOr[typingsSlinky.awsSdk.dmsMod.ReplicationTask] = js.native
}

object CreateReplicationTaskResponse {
  @scala.inline
  def apply(): CreateReplicationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicationTaskResponse]
  }
  @scala.inline
  implicit class CreateReplicationTaskResponseOps[Self <: CreateReplicationTaskResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationTask(value: ReplicationTask): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplicationTask")(js.undefined)
        ret
    }
  }
  
}

