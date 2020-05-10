package typingsSlinky.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var proofOfCurrentSequenceNumber: js.UndefOr[typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject] = js.native
  var signedTransactionWithProof: js.UndefOr[typingsSlinky.libraCore.transactionPbMod.SignedTransactionWithProof.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(): AsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProofOfCurrentSequenceNumber(value: typingsSlinky.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proofOfCurrentSequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProofOfCurrentSequenceNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proofOfCurrentSequenceNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withSignedTransactionWithProof(value: typingsSlinky.libraCore.transactionPbMod.SignedTransactionWithProof.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedTransactionWithProof")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignedTransactionWithProof: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signedTransactionWithProof")(js.undefined)
        ret
    }
  }
  
}

