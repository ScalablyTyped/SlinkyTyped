package typingsSlinky.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobQueuesResponse extends js.Object {
  /**
    * The list of job queues.
    */
  var jobQueues: js.UndefOr[JobQueueDetailList] = js.native
  /**
    * The nextToken value to include in a future DescribeJobQueues request. When the results of a DescribeJobQueues request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeJobQueuesResponse {
  @scala.inline
  def apply(): DescribeJobQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobQueuesResponse]
  }
  @scala.inline
  implicit class DescribeJobQueuesResponseOps[Self <: DescribeJobQueuesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJobQueues(value: JobQueueDetailList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobQueues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobQueues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobQueues")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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
  }
  
}

