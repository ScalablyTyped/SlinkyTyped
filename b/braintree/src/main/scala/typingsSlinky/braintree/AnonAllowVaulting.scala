package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowVaulting extends js.Object {
  var allowVaulting: js.UndefOr[Boolean] = js.native
  var includeBillingPostalCode: js.UndefOr[Boolean] = js.native
  var revokeAfter: js.UndefOr[js.Date] = js.native
}

object AnonAllowVaulting {
  @scala.inline
  def apply(): AnonAllowVaulting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAllowVaulting]
  }
  @scala.inline
  implicit class AnonAllowVaultingOps[Self <: AnonAllowVaulting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowVaulting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVaulting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowVaulting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowVaulting")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeBillingPostalCode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBillingPostalCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeBillingPostalCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeBillingPostalCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRevokeAfter(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeAfter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevokeAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revokeAfter")(js.undefined)
        ret
    }
  }
  
}

