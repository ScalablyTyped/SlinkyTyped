package typingsSlinky.mangopay2NodejsSdk.mod.PayOut

import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePayOut extends js.Object {
  /**
    * A user's ID
    */
  var AuthorId: String = js.native
  /**
    * An ID of a Bank Account
    */
  var BankAccountId: String = js.native
  /**
    * A custom reference you wish to appear on the user’s bank statement (your Client Name is already shown). This reference can contain max 12 characters
    */
  var BankWireRef: js.UndefOr[String] = js.native
  /**
    * Information about the funds that are being debited
    */
  var DebitedFunds: MoneyData = js.native
  /**
    * The ID of the wallet that was debited
    */
  var DebitedWalletId: String = js.native
  /**
    * Information about the fees that were taken by the client for this transaction (and were hence transferred to the Client's platform wallet)
    */
  var Fees: MoneyData = js.native
  var Tag: js.UndefOr[String] = js.native
}

object CreatePayOut {
  @scala.inline
  def apply(
    AuthorId: String,
    BankAccountId: String,
    DebitedFunds: MoneyData,
    DebitedWalletId: String,
    Fees: MoneyData
  ): CreatePayOut = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], BankAccountId = BankAccountId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], DebitedWalletId = DebitedWalletId.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePayOut]
  }
  @scala.inline
  implicit class CreatePayOutOps[Self <: CreatePayOut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBankAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebitedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedFunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebitedWalletId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedWalletId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFees(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBankWireRef(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankWireRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBankWireRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BankWireRef")(js.undefined)
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tag")(js.undefined)
        ret
    }
  }
  
}

