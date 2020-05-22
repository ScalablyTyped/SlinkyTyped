package typingsSlinky.libraCore.transactionPbMod.SignedTransaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var rawTxnBytes: js.typedarray.Uint8Array | String
  var senderPublicKey: js.typedarray.Uint8Array | String
  var senderSignature: js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    rawTxnBytes: js.typedarray.Uint8Array | String,
    senderPublicKey: js.typedarray.Uint8Array | String,
    senderSignature: js.typedarray.Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(rawTxnBytes = rawTxnBytes.asInstanceOf[js.Any], senderPublicKey = senderPublicKey.asInstanceOf[js.Any], senderSignature = senderSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

