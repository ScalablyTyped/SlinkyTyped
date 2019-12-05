package typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.TransactionListWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var eventsForVersions: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventsForVersions.AsObject
  ] = js.undefined
  var firstTransactionVersion: js.UndefOr[
    typingsSlinky.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod.UInt64Value.AsObject
  ] = js.undefined
  var infosList: js.Array[
    typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscoreInfoUnderscorePbMod.TransactionInfo.AsObject
  ]
  var proofOfFirstTransaction: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject
  ] = js.undefined
  var proofOfLastTransaction: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject
  ] = js.undefined
  var transactionsList: js.Array[
    typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject
  ]
}

object AsObject {
  @scala.inline
  def apply(
    infosList: js.Array[
      typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscoreInfoUnderscorePbMod.TransactionInfo.AsObject
    ],
    transactionsList: js.Array[
      typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction.AsObject
    ],
    eventsForVersions: typingsSlinky.libraDashCore.libAtGeneratedEventsUnderscorePbMod.EventsForVersions.AsObject = null,
    firstTransactionVersion: typingsSlinky.googleDashProtobuf.googleProtobufWrappersUnderscorePbMod.UInt64Value.AsObject = null,
    proofOfFirstTransaction: typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject = null,
    proofOfLastTransaction: typingsSlinky.libraDashCore.libAtGeneratedProofUnderscorePbMod.AccumulatorProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(infosList = infosList.asInstanceOf[js.Any], transactionsList = transactionsList.asInstanceOf[js.Any])
    if (eventsForVersions != null) __obj.updateDynamic("eventsForVersions")(eventsForVersions.asInstanceOf[js.Any])
    if (firstTransactionVersion != null) __obj.updateDynamic("firstTransactionVersion")(firstTransactionVersion.asInstanceOf[js.Any])
    if (proofOfFirstTransaction != null) __obj.updateDynamic("proofOfFirstTransaction")(proofOfFirstTransaction.asInstanceOf[js.Any])
    if (proofOfLastTransaction != null) __obj.updateDynamic("proofOfLastTransaction")(proofOfLastTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

