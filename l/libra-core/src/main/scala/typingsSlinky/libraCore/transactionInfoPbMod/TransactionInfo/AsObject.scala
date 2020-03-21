package typingsSlinky.libraCore.transactionInfoPbMod.TransactionInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var eventRootHash: scala.scalajs.js.typedarray.Uint8Array | String
  var gasUsed: String
  var signedTransactionHash: scala.scalajs.js.typedarray.Uint8Array | String
  var stateRootHash: scala.scalajs.js.typedarray.Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    eventRootHash: scala.scalajs.js.typedarray.Uint8Array | String,
    gasUsed: String,
    signedTransactionHash: scala.scalajs.js.typedarray.Uint8Array | String,
    stateRootHash: scala.scalajs.js.typedarray.Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(eventRootHash = eventRootHash.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], signedTransactionHash = signedTransactionHash.asInstanceOf[js.Any], stateRootHash = stateRootHash.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

