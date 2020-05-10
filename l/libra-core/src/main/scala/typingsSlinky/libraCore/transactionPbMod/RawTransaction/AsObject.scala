package typingsSlinky.libraCore.transactionPbMod.RawTransaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var expirationTime: String = js.native
  var gasUnitPrice: String = js.native
  var maxGasAmount: String = js.native
  var program: js.UndefOr[typingsSlinky.libraCore.transactionPbMod.Program.AsObject] = js.native
  var senderAccount: js.typedarray.Uint8Array | String = js.native
  var sequenceNumber: String = js.native
  var writeSet: js.UndefOr[typingsSlinky.libraCore.transactionPbMod.WriteSet.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    expirationTime: String,
    gasUnitPrice: String,
    maxGasAmount: String,
    senderAccount: js.typedarray.Uint8Array | String,
    sequenceNumber: String
  ): AsObject = {
    val __obj = js.Dynamic.literal(expirationTime = expirationTime.asInstanceOf[js.Any], gasUnitPrice = gasUnitPrice.asInstanceOf[js.Any], maxGasAmount = maxGasAmount.asInstanceOf[js.Any], senderAccount = senderAccount.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGasUnitPrice(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasUnitPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxGasAmount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxGasAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderAccountUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderAccount(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderAccount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProgram(value: typingsSlinky.libraCore.transactionPbMod.Program.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgram: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("program")(js.undefined)
        ret
    }
    @scala.inline
    def withWriteSet(value: typingsSlinky.libraCore.transactionPbMod.WriteSet.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWriteSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writeSet")(js.undefined)
        ret
    }
  }
  
}

