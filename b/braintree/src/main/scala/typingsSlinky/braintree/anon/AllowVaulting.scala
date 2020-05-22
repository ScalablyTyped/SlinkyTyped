package typingsSlinky.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowVaulting extends js.Object {
  var allowVaulting: js.UndefOr[Boolean] = js.undefined
  var includeBillingPostalCode: js.UndefOr[Boolean] = js.undefined
  var revokeAfter: js.UndefOr[js.Date] = js.undefined
}

object AllowVaulting {
  @scala.inline
  def apply(
    allowVaulting: js.UndefOr[Boolean] = js.undefined,
    includeBillingPostalCode: js.UndefOr[Boolean] = js.undefined,
    revokeAfter: js.Date = null
  ): AllowVaulting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowVaulting)) __obj.updateDynamic("allowVaulting")(allowVaulting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeBillingPostalCode)) __obj.updateDynamic("includeBillingPostalCode")(includeBillingPostalCode.get.asInstanceOf[js.Any])
    if (revokeAfter != null) __obj.updateDynamic("revokeAfter")(revokeAfter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowVaulting]
  }
}

