package typingsSlinky.libraCore.transactionPbMod.RawTransaction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var expirationTime: String
  var gasUnitPrice: String
  var maxGasAmount: String
  var program: js.UndefOr[typingsSlinky.libraCore.transactionPbMod.Program.AsObject] = js.undefined
  var senderAccount: js.typedarray.Uint8Array | String
  var sequenceNumber: String
  var writeSet: js.UndefOr[typingsSlinky.libraCore.transactionPbMod.WriteSet.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    expirationTime: String,
    gasUnitPrice: String,
    maxGasAmount: String,
    senderAccount: js.typedarray.Uint8Array | String,
    sequenceNumber: String,
    program: typingsSlinky.libraCore.transactionPbMod.Program.AsObject = null,
    writeSet: typingsSlinky.libraCore.transactionPbMod.WriteSet.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(expirationTime = expirationTime.asInstanceOf[js.Any], gasUnitPrice = gasUnitPrice.asInstanceOf[js.Any], maxGasAmount = maxGasAmount.asInstanceOf[js.Any], senderAccount = senderAccount.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (writeSet != null) __obj.updateDynamic("writeSet")(writeSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

