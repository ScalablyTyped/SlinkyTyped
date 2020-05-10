package typingsSlinky.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchEnableStandardsResponse extends js.Object {
  /**
    * The details of the standards subscriptions that were enabled.
    */
  var StandardsSubscriptions: js.UndefOr[typingsSlinky.awsSdk.securityhubMod.StandardsSubscriptions] = js.native
}

object BatchEnableStandardsResponse {
  @scala.inline
  def apply(): BatchEnableStandardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchEnableStandardsResponse]
  }
  @scala.inline
  implicit class BatchEnableStandardsResponseOps[Self <: BatchEnableStandardsResponse] (val x: Self) extends AnyVal {
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

