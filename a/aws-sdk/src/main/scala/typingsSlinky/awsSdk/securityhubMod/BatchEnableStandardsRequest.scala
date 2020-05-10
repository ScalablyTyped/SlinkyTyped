package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchEnableStandardsRequest extends js.Object {
  /**
    * The list of standards checks to enable.
    */
  var StandardsSubscriptionRequests: typingsSlinky.awsSdk.securityhubMod.StandardsSubscriptionRequests = js.native
}

object BatchEnableStandardsRequest {
  @scala.inline
  def apply(StandardsSubscriptionRequests: StandardsSubscriptionRequests): BatchEnableStandardsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionRequests = StandardsSubscriptionRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchEnableStandardsRequest]
  }
  @scala.inline
  implicit class BatchEnableStandardsRequestOps[Self <: BatchEnableStandardsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStandardsSubscriptionRequests(value: StandardsSubscriptionRequests): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsSubscriptionRequests")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

