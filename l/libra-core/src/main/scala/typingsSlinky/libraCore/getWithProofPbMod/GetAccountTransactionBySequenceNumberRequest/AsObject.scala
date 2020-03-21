package typingsSlinky.libraCore.getWithProofPbMod.GetAccountTransactionBySequenceNumberRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var account: scala.scalajs.js.typedarray.Uint8Array | String
  var fetchEvents: Boolean
  var sequenceNumber: String
}

object AsObject {
  @scala.inline
  def apply(
    account: scala.scalajs.js.typedarray.Uint8Array | String,
    fetchEvents: Boolean,
    sequenceNumber: String
  ): AsObject = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], fetchEvents = fetchEvents.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

