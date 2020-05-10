package typingsSlinky.libraCore.transactionPbMod.SignedTransactionsBlock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var transactionsList: js.Array[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject] = js.native
  var validatorPublicKey: js.typedarray.Uint8Array | String = js.native
  var validatorSignature: js.typedarray.Uint8Array | String = js.native
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
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransactionsList(value: js.Array[typingsSlinky.libraCore.transactionPbMod.SignedTransaction.AsObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidatorPublicKeyUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidatorPublicKey(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidatorSignatureUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorSignature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidatorSignature(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorSignature")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

