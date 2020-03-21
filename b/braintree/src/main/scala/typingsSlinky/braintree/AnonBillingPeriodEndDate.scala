package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBillingPeriodEndDate extends js.Object {
  var billingPeriodEndDate: js.Date
  var billingPeriodStartDate: js.Date
}

object AnonBillingPeriodEndDate {
  @scala.inline
  def apply(billingPeriodEndDate: js.Date, billingPeriodStartDate: js.Date): AnonBillingPeriodEndDate = {
    val __obj = js.Dynamic.literal(billingPeriodEndDate = billingPeriodEndDate.asInstanceOf[js.Any], billingPeriodStartDate = billingPeriodStartDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBillingPeriodEndDate]
  }
}

