package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicationJobResponse extends js.Object {
  /**
    * The unique identifier of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.native
}

object CreateReplicationJobResponse {
  @scala.inline
  def apply(): CreateReplicationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReplicationJobResponse]
  }
  @scala.inline
  implicit class CreateReplicationJobResponseOps[Self <: CreateReplicationJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationJobId(value: ReplicationJobId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationJobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationJobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationJobId")(js.undefined)
        ret
    }
  }
  
}

