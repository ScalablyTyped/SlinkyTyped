package typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccountStateProof

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
  var transactionInfoToAccountProof: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.SparseMerkleProof.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    ledgerInfoToTransactionInfoProof: typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject = null,
    transactionInfo: typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscoreInfoUnderscorePbMod.TransactionInfo.AsObject = null,
    transactionInfoToAccountProof: typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.SparseMerkleProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (ledgerInfoToTransactionInfoProof != null) __obj.updateDynamic("ledgerInfoToTransactionInfoProof")(ledgerInfoToTransactionInfoProof.asInstanceOf[js.Any])
    if (transactionInfo != null) __obj.updateDynamic("transactionInfo")(transactionInfo.asInstanceOf[js.Any])
    if (transactionInfoToAccountProof != null) __obj.updateDynamic("transactionInfoToAccountProof")(transactionInfoToAccountProof.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

