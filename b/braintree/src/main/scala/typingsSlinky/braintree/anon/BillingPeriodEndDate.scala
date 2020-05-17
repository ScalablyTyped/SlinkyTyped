package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingPeriodEndDate extends js.Object {
  var billingPeriodEndDate: js.Date = js.native
  var billingPeriodStartDate: js.Date = js.native
}

object BillingPeriodEndDate {
  @scala.inline
  def apply(billingPeriodEndDate: js.Date, billingPeriodStartDate: js.Date): BillingPeriodEndDate = {
    val __obj = js.Dynamic.literal(billingPeriodEndDate = billingPeriodEndDate.asInstanceOf[js.Any], billingPeriodStartDate = billingPeriodStartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingPeriodEndDate]
  }
  @scala.inline
  implicit class BillingPeriodEndDateOps[Self <: BillingPeriodEndDate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingPeriodEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingPeriodEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBillingPeriodStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingPeriodStartDate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

