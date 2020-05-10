package typingsSlinky.libraCore.transactionPbMod.SignedTransaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var rawTxnBytes: js.typedarray.Uint8Array | String = js.native
  var senderPublicKey: js.typedarray.Uint8Array | String = js.native
  var senderSignature: js.typedarray.Uint8Array | String = js.native
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
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRawTxnBytesUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawTxnBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawTxnBytes(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawTxnBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderPublicKey(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderSignatureUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderSignature(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderSignature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

