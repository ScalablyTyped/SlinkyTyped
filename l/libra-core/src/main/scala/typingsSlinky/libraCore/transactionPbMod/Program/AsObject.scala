package typingsSlinky.libraCore.transactionPbMod.Program

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var argumentsList: js.Array[typingsSlinky.libraCore.transactionPbMod.TransactionArgument.AsObject]
  var code: js.typedarray.Uint8Array | String
  var modulesList: js.Array[js.typedarray.Uint8Array | String]
}

object AsObject {
  @scala.inline
  def apply(
    argumentsList: js.Array[typingsSlinky.libraCore.transactionPbMod.TransactionArgument.AsObject],
    code: js.typedarray.Uint8Array | String,
    modulesList: js.Array[js.typedarray.Uint8Array | String]
  ): AsObject = {
    val __obj = js.Dynamic.literal(argumentsList = argumentsList.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], modulesList = modulesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

