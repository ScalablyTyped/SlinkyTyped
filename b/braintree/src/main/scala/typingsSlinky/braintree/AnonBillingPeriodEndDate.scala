package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBillingPeriodEndDate extends js.Object {
  var billingPeriodEndDate: js.Date = js.native
  var billingPeriodStartDate: js.Date = js.native
}

object AnonBillingPeriodEndDate {
  @scala.inline
  def apply(billingPeriodEndDate: js.Date, billingPeriodStartDate: js.Date): AnonBillingPeriodEndDate = {
    val __obj = js.Dynamic.literal(billingPeriodEndDate = billingPeriodEndDate.asInstanceOf[js.Any], billingPeriodStartDate = billingPeriodStartDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBillingPeriodEndDate]
  }
  @scala.inline
  implicit class AnonBillingPeriodEndDateOps[Self <: AnonBillingPeriodEndDate] (val x: Self) extends AnyVal {
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

