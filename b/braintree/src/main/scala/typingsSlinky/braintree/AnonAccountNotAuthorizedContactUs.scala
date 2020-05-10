package typingsSlinky.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccountNotAuthorizedContactUs extends js.Object {
  var AccountNotAuthorizedContactUs: String = js.native
  var AnotherUsBankMerchantAccount: String = js.native
  var Approve: String = js.native
  var BankRejectedNone: String = js.native
  var BankRejectedUpdateFundingInformation: String = js.native
  var InsufficientFundsContactUs: String = js.native
  var UsBankMerchantAccount: String = js.native
}

object AnonAccountNotAuthorizedContactUs {
  @scala.inline
  def apply(
    AccountNotAuthorizedContactUs: String,
    AnotherUsBankMerchantAccount: String,
    Approve: String,
    BankRejectedNone: String,
    BankRejectedUpdateFundingInformation: String,
    InsufficientFundsContactUs: String,
    UsBankMerchantAccount: String
  ): AnonAccountNotAuthorizedContactUs = {
    val __obj = js.Dynamic.literal(AccountNotAuthorizedContactUs = AccountNotAuthorizedContactUs.asInstanceOf[js.Any], AnotherUsBankMerchantAccount = AnotherUsBankMerchantAccount.asInstanceOf[js.Any], Approve = Approve.asInstanceOf[js.Any], BankRejectedNone = BankRejectedNone.asInstanceOf[js.Any], BankRejectedUpdateFundingInformation = BankRejectedUpdateFundingInformation.asInstanceOf[js.Any], InsufficientFundsContactUs = InsufficientFundsContactUs.asInstanceOf[js.Any], UsBankMerchantAccount = UsBankMerchantAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccountNotAuthorizedContactUs]
  }
  @scala.inline
  implicit class AnonAccountNotAuthorizedContactUsOps[Self <: AnonAccountNotAuthorizedContactUs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountNotAuthorizedContactUs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountNotAuthorizedContactUs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnotherUsBankMerchantAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnotherUsBankMerchantAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApprove(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Approve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBankRejectedNone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankRejectedNone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBankRejectedUpdateFundingInformation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankRejectedUpdateFundingInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsufficientFundsContactUs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InsufficientFundsContactUs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsBankMerchantAccount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsBankMerchantAccount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

