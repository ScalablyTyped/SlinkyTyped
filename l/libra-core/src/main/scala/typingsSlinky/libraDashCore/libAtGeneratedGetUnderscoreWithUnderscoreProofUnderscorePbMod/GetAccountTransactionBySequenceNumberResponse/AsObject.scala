package typingsSlinky.libraDashCore.libAtGeneratedGetUnderscoreWithUnderscoreProofUnderscorePbMod.GetAccountTransactionBySequenceNumberResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var proofOfCurrentSequenceNumber: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedAccountUnderscoreStateUnderscoreBlobUnderscorePbMod.AccountStateWithProof.AsObject
  ] = js.undefined
  var signedTransactionWithProof: js.UndefOr[
    typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransactionWithProof.AsObject
  ] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    proofOfCurrentSequenceNumber: typingsSlinky.libraDashCore.libAtGeneratedAccountUnderscoreStateUnderscoreBlobUnderscorePbMod.AccountStateWithProof.AsObject = null,
    signedTransactionWithProof: typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransactionWithProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal()
    if (proofOfCurrentSequenceNumber != null) __obj.updateDynamic("proofOfCurrentSequenceNumber")(proofOfCurrentSequenceNumber.asInstanceOf[js.Any])
    if (signedTransactionWithProof != null) __obj.updateDynamic("signedTransactionWithProof")(signedTransactionWithProof.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

