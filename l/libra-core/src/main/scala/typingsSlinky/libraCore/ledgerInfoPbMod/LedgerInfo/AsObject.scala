package typingsSlinky.libraCore.ledgerInfoPbMod.LedgerInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var consensusBlockId: js.typedarray.Uint8Array | String
  var consensusDataHash: js.typedarray.Uint8Array | String
  var epochNum: String
  var timestampUsecs: String
  var transactionAccumulatorHash: js.typedarray.Uint8Array | String
  var version: String
}

object AsObject {
  @scala.inline
  def apply(
    consensusBlockId: js.typedarray.Uint8Array | String,
    consensusDataHash: js.typedarray.Uint8Array | String,
    epochNum: String,
    timestampUsecs: String,
    transactionAccumulatorHash: js.typedarray.Uint8Array | String,
    version: String
  ): AsObject = {
    val __obj = js.Dynamic.literal(consensusBlockId = consensusBlockId.asInstanceOf[js.Any], consensusDataHash = consensusDataHash.asInstanceOf[js.Any], epochNum = epochNum.asInstanceOf[js.Any], timestampUsecs = timestampUsecs.asInstanceOf[js.Any], transactionAccumulatorHash = transactionAccumulatorHash.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

