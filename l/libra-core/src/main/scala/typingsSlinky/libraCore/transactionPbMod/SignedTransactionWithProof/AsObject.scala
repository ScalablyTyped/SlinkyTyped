package typingsSlinky.libraCore.transactionPbMod.SignedTransactionWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var events: js.UndefOr[typingsSlinky.libraCore.eventsPbMod.EventsList.AsObject] = js.undefined
  var proof: js.UndefOr[typingsSlinky.libraCore.proofPbMod.SignedTransactionProof.AsObject] = js.undefined
  var signedTransaction: js.UndefOr[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.undefined
  var version: String
}

object AsObject {
  @scala.inline
  def apply(
    version: String,
    events: typingsSlinky.libraCore.eventsPbMod.EventsList.AsObject = null,
    proof: typingsSlinky.libraCore.proofPbMod.SignedTransactionProof.AsObject = null,
    signedTransaction: typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (proof != null) __obj.updateDynamic("proof")(proof.asInstanceOf[js.Any])
    if (signedTransaction != null) __obj.updateDynamic("signedTransaction")(signedTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

