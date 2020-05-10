package typingsSlinky.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantFunding extends js.Object {
  var accountNumber: js.UndefOr[String] = js.native
  var accountNumberLast4: js.UndefOr[String] = js.native
  var descriptor: js.UndefOr[String] = js.native
  var destination: String = js.native
  var email: js.UndefOr[String] = js.native
  var mobilePhone: js.UndefOr[String] = js.native
  var routingNumber: js.UndefOr[String] = js.native
}

object MerchantFunding {
  @scala.inline
  def apply(destination: String): MerchantFunding = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantFunding]
  }
  @scala.inline
  implicit class MerchantFundingOps[Self <: MerchantFunding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccountNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withAccountNumberLast4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountNumberLast4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountNumberLast4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountNumberLast4")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptor")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withMobilePhone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobilePhone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobilePhone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobilePhone")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutingNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutingNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routingNumber")(js.undefined)
        ret
    }
  }
  
}

