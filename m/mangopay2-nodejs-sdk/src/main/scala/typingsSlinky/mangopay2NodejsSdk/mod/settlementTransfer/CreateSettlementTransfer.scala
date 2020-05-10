package typingsSlinky.mangopay2NodejsSdk.mod.settlementTransfer

import typingsSlinky.mangopay2NodejsSdk.mod.MoneyData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.PickPartialRequired<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.settlementTransfer.SettlementTransferData, 'Tag', 'AuthorId' | 'DebitedFunds' | 'Fees'> */
@js.native
trait CreateSettlementTransfer extends js.Object {
  var AuthorId: String = js.native
  var DebitedFunds: MoneyData = js.native
  var Fees: MoneyData = js.native
  var Tag: js.UndefOr[String] = js.native
}

object CreateSettlementTransfer {
  @scala.inline
  def apply(AuthorId: String, DebitedFunds: MoneyData, Fees: MoneyData): CreateSettlementTransfer = {
    val __obj = js.Dynamic.literal(AuthorId = AuthorId.asInstanceOf[js.Any], DebitedFunds = DebitedFunds.asInstanceOf[js.Any], Fees = Fees.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSettlementTransfer]
  }
  @scala.inline
  implicit class CreateSettlementTransferOps[Self <: CreateSettlementTransfer] (val x: Self) extends AnyVal {
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
    def withDebitedFunds(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DebitedFunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFees(value: MoneyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fees")(value.asInstanceOf[js.Any])
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

