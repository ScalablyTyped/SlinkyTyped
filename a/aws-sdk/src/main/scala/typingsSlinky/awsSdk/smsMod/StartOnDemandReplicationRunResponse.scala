package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartOnDemandReplicationRunResponse extends js.Object {
  /**
    * The identifier of the replication run.
    */
  var replicationRunId: js.UndefOr[ReplicationRunId] = js.native
}

object StartOnDemandReplicationRunResponse {
  @scala.inline
  def apply(): StartOnDemandReplicationRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOnDemandReplicationRunResponse]
  }
  @scala.inline
  implicit class StartOnDemandReplicationRunResponseOps[Self <: StartOnDemandReplicationRunResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplicationRunId(value: ReplicationRunId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationRunId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationRunId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationRunId")(js.undefined)
        ret
    }
  }
  
}

