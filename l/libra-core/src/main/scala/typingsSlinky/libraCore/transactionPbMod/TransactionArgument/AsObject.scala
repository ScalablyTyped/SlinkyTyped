package typingsSlinky.libraCore.transactionPbMod.TransactionArgument

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var data: scala.scalajs.js.typedarray.Uint8Array | String
  var `type`: ArgType
}

object AsObject {
  @scala.inline
  def apply(data: scala.scalajs.js.typedarray.Uint8Array | String, `type`: ArgType): AsObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

