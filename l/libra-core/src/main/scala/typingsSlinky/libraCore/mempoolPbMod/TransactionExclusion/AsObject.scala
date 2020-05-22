package typingsSlinky.libraCore.mempoolPbMod.TransactionExclusion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var sender: js.typedarray.Uint8Array | String
  var sequenceNumber: String
}

object AsObject {
  @scala.inline
  def apply(sender: js.typedarray.Uint8Array | String, sequenceNumber: String): AsObject = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

