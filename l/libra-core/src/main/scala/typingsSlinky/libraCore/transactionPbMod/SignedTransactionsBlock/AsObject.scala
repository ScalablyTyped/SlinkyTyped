package typingsSlinky.libraCore.transactionPbMod.SignedTransactionsBlock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var transactionsList: js.Array[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject]
  var validatorPublicKey: js.typedarray.Uint8Array | String
  var validatorSignature: js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    transactionsList: js.Array[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject],
    validatorPublicKey: js.typedarray.Uint8Array | String,
    validatorSignature: js.typedarray.Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(transactionsList = transactionsList.asInstanceOf[js.Any], validatorPublicKey = validatorPublicKey.asInstanceOf[js.Any], validatorSignature = validatorSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

