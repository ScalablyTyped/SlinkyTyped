package typingsSlinky.paystack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accountnumber extends js.Object {
  var account_number: String = js.native
  var business_name: String = js.native
  var percentage_charge: Double = js.native
  var settlement_bank: String = js.native
}

object Accountnumber {
  @scala.inline
  def apply(account_number: String, business_name: String, percentage_charge: Double, settlement_bank: String): Accountnumber = {
    val __obj = js.Dynamic.literal(account_number = account_number.asInstanceOf[js.Any], business_name = business_name.asInstanceOf[js.Any], percentage_charge = percentage_charge.asInstanceOf[js.Any], settlement_bank = settlement_bank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountnumber]
  }
  @scala.inline
  implicit class AccountnumberOps[Self <: Accountnumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccount_number(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("account_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBusiness_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPercentage_charge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentage_charge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettlement_bank(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settlement_bank")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

