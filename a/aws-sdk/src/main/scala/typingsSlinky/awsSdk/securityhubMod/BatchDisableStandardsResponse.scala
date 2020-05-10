package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDisableStandardsResponse extends js.Object {
  /**
    * The details of the standards subscriptions that were disabled.
    */
  var StandardsSubscriptions: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.StandardsSubscriptions] = js.native
}

object BatchDisableStandardsResponse {
  @scala.inline
  def apply(): BatchDisableStandardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisableStandardsResponse]
  }
  @scala.inline
  implicit class BatchDisableStandardsResponseOps[Self <: BatchDisableStandardsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStandardsSubscriptions(value: StandardsSubscriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsSubscriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardsSubscriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StandardsSubscriptions")(js.undefined)
        ret
    }
  }
  
}

