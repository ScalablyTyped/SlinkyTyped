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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInfosListVarargs(value: typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo.AsObject*): Self = this.set("infosList", js.Array(value :_*))
    @scala.inline
    def setInfosList(value: js.Array[typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo.AsObject]): Self = this.set("infosList", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionsListVarargs(value: typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject*): Self = this.set("transactionsList", js.Array(value :_*))
    @scala.inline
    def setTransactionsList(value: js.Array[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject]): Self = this.set("transactionsList", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventsForVersions(value: typingsSlinky.libraCore.eventsPbMod.EventsForVersions.AsObject): Self = this.set("eventsForVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventsForVersions: Self = this.set("eventsForVersions", js.undefined)
    @scala.inline
    def setFirstTransactionVersion(value: typingsSlinky.googleProtobuf.wrappersPbMod.UInt64Value.AsObject): Self = this.set("firstTransactionVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstTransactionVersion: Self = this.set("firstTransactionVersion", js.undefined)
    @scala.inline
    def setProofOfFirstTransaction(value: typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject): Self = this.set("proofOfFirstTransaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProofOfFirstTransaction: Self = this.set("proofOfFirstTransaction", js.undefined)
    @scala.inline
    def setProofOfLastTransaction(value: typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject): Self = this.set("proofOfLastTransaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProofOfLastTransaction: Self = this.set("proofOfLastTransaction", js.undefined)
  }
  
}

