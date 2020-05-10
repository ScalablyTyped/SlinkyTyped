package typingsSlinky.libraCore.proofPbMod.AccountStateProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var ledgerInfoToTransactionInfoProof: js.UndefOr[typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.native
  var transactionInfo: js.UndefOr[typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo.AsObject] = js.native
  var transactionInfoToAccountProof: js.UndefOr[typingsSlinky.libraCore.proofPbMod.SparseMerkleProof.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLedgerInfoToTransactionInfoProof(value: typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ledgerInfoToTransactionInfoProof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLedgerInfoToTransactionInfoProof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ledgerInfoToTransactionInfoProof")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionInfo(value: typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionInfoToAccountProof(value: typingsSlinky.libraCore.proofPbMod.SparseMerkleProof.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionInfoToAccountProof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionInfoToAccountProof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionInfoToAccountProof")(js.undefined)
        ret
    }
  }
  
}

