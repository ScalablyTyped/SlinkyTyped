package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDisableStandardsRequest extends js.Object {
  /**
    * The ARNs of the standards subscriptions to disable.
    */
  var StandardsSubscriptionArns: typingsSlinky.awsSdk.securityhubMod.StandardsSubscriptionArns = js.native
}

object BatchDisableStandardsRequest {
  @scala.inline
  def apply(StandardsSubscriptionArns: StandardsSubscriptionArns): BatchDisableStandardsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionArns = StandardsSubscriptionArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisableStandardsRequest]
  }
  @scala.inline
  implicit class BatchDisableStandardsRequestOps[Self <: BatchDisableStandardsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStandardsSubscriptionArns(value: StandardsSubscriptionArns): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsSubscriptionArns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

