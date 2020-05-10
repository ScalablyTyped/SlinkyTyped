package typingsSlinky.mangopay2NodejsSdk

import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.transfer.CreateTransfer> */
@js.native
trait PartialCreateTransfer extends js.Object {
  var AuthorId: js.UndefOr[String] = js.native
  var CreditedUserId: js.UndefOr[String] = js.native
  var CreditedWalletId: js.UndefOr[String] = js.native
  var DebitedFunds: js.UndefOr[MoneyData] = js.native
  var DebitedWalletId: js.UndefOr[String] = js.native
  var Fees: js.UndefOr[MoneyData] = js.native
  var Tag: js.UndefOr[String] = js.native
}

object PartialCreateTransfer {
  @scala.inline
  def apply(): PartialCreateTransfer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCreateTransfer]
  }
  @scala.inline
  implicit class PartialCreateTransferOps[Self <: PartialCreateTransfer] (val x: Self) extends AnyVal {
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
    def withoutAuthorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthorId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditedUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditedUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withCreditedWalletId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedWalletId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreditedWalletId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreditedWalletId")(js.undefined)
        ret
    }
    @scala.inline
    def withDebitedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedFunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebitedFunds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedFunds")(js.undefined)
        ret
    }
    @scala.inline
    def withDebitedWalletId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedWalletId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebitedWalletId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedWalletId")(js.undefined)
        ret
    }
    @scala.inline
    def withFees(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fees")(js.undefined)
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

