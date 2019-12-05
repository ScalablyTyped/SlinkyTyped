package typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.EventProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var ledgerInfoToTransactionInfoProof: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject
  ] = js.undefined
  var transactionInfo: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscoreInfoUnderscorePbMod.TransactionInfo.AsObject
  ] = js.undefined
  var transactionInfoToEventProof: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    ledgerInfoToTransactionInfoProof: typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject = null,
    transactionInfo: typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscoreInfoUnderscorePbMod.TransactionInfo.AsObject = null,
    transactionInfoToEventProof: typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (ledgerInfoToTransactionInfoProof != null) __obj.updateDynamic("ledgerInfoToTransactionInfoProof")(ledgerInfoToTransactionInfoProof.asInstanceOf[js.Any])
    if (transactionInfo != null) __obj.updateDynamic("transactionInfo")(transactionInfo.asInstanceOf[js.Any])
    if (transactionInfoToEventProof != null) __obj.updateDynamic("transactionInfoToEventProof")(transactionInfoToEventProof.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

