package typingsSlinky.chartmogulNode.mod.Subscription

import typingsSlinky.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSubscriptionParams extends js.Object {
  var cancellation_dates: js.UndefOr[Strings] = js.native
  var cancelled_at: js.UndefOr[String] = js.native
}

object CancelSubscriptionParams {
  @scala.inline
  def apply(): CancelSubscriptionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelSubscriptionParams]
  }
  @scala.inline
  implicit class CancelSubscriptionParamsOps[Self <: CancelSubscriptionParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancellation_dates(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation_dates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancellation_dates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancellation_dates")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelled_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelled_at: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelled_at")(js.undefined)
        ret
    }
  }
  
}

