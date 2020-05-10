package typingsSlinky.libraCore.transactionPbMod.TransactionListWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var eventsForVersions: js.UndefOr[typingsSlinky.libraCore.eventsPbMod.EventsForVersions.AsObject] = js.native
  var firstTransactionVersion: js.UndefOr[typingsSlinky.googleProtobuf.wrappersPbMod.UInt64Value.AsObject] = js.native
  var infosList: js.Array[typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo.AsObject] = js.native
  var proofOfFirstTransaction: js.UndefOr[typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.native
  var proofOfLastTransaction: js.UndefOr[typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.native
  var transactionsList: js.Array[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    infosList: js.Array[typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo.AsObject],
    transactionsList: js.Array[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(infosList = infosList.asInstanceOf[js.Any], transactionsList = transactionsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfosList(value: js.Array[typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infosList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionsList(value: js.Array[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsForVersions(value: typingsSlinky.libraCore.eventsPbMod.EventsForVersions.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsForVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventsForVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventsForVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstTransactionVersion(value: typingsSlinky.googleProtobuf.wrappersPbMod.UInt64Value.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstTransactionVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstTransactionVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstTransactionVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withProofOfFirstTransaction(value: typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proofOfFirstTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProofOfFirstTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proofOfFirstTransaction")(js.undefined)
        ret
    }
    @scala.inline
    def withProofOfLastTransaction(value: typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proofOfLastTransaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProofOfLastTransaction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proofOfLastTransaction")(js.undefined)
        ret
    }
  }
  
}

