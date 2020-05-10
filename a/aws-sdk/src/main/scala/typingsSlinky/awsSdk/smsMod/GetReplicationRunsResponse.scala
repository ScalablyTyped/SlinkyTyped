package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReplicationRunsResponse extends js.Object {
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Information about the replication job.
    */
  var replicationJob: js.UndefOr[ReplicationJob] = js.native
  /**
    * Information about the replication runs.
    */
  var replicationRunList: js.UndefOr[ReplicationRunList] = js.native
}

object GetReplicationRunsResponse {
  @scala.inline
  def apply(): GetReplicationRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReplicationRunsResponse]
  }
  @scala.inline
  implicit class GetReplicationRunsResponseOps[Self <: GetReplicationRunsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationJob(value: ReplicationJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationJob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationJob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationJob")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicationRunList(value: ReplicationRunList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationRunList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicationRunList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicationRunList")(js.undefined)
        ret
    }
  }
  
}

