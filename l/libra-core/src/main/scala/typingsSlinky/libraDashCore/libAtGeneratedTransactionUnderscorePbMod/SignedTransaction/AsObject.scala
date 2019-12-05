package typingsSlinky.libraDashCore.libAtGeneratedTransactionUnderscorePbMod.SignedTransaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var rawTxnBytes: scala.scalajs.js.typedarray.Uint8Array | String
  var senderPublicKey: scala.scalajs.js.typedarray.Uint8Array | String
  var senderSignature: scala.scalajs.js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    rawTxnBytes: scala.scalajs.js.typedarray.Uint8Array | String,
    senderPublicKey: scala.scalajs.js.typedarray.Uint8Array | String,
    senderSignature: scala.scalajs.js.typedarray.Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(rawTxnBytes = rawTxnBytes.asInstanceOf[js.Any], senderPublicKey = senderPublicKey.asInstanceOf[js.Any], senderSignature = senderSignature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

