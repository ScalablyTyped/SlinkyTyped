package typingsSlinky.libraCore.proofPbMod.EventProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var ledgerInfoToTransactionInfoProof: js.UndefOr[typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.undefined
  var transactionInfo: js.UndefOr[typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo.AsObject] = js.undefined
  var transactionInfoToEventProof: js.UndefOr[typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    ledgerInfoToTransactionInfoProof: typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject = null,
    transactionInfo: typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo.AsObject = null,
    transactionInfoToEventProof: typingsSlinky.libraCore.proofPbMod.AccumulatorProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (ledgerInfoToTransactionInfoProof != null) __obj.updateDynamic("ledgerInfoToTransactionInfoProof")(ledgerInfoToTransactionInfoProof.asInstanceOf[js.Any])
    if (transactionInfo != null) __obj.updateDynamic("transactionInfo")(transactionInfo.asInstanceOf[js.Any])
    if (transactionInfoToEventProof != null) __obj.updateDynamic("transactionInfoToEventProof")(transactionInfoToEventProof.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

