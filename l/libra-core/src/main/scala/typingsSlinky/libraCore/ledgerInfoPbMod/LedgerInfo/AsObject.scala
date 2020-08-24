package typingsSlinky.libraCore.ledgerInfoPbMod.LedgerInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var consensusBlockId: js.typedarray.Uint8Array | String = js.native
  var consensusDataHash: js.typedarray.Uint8Array | String = js.native
  var epochNum: String = js.native
  var timestampUsecs: String = js.native
  var transactionAccumulatorHash: js.typedarray.Uint8Array | String = js.native
  var version: String = js.native
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
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConsensusBlockIdUint8Array(value: js.typedarray.Uint8Array): Self = this.set("consensusBlockId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsensusBlockId(value: js.typedarray.Uint8Array | String): Self = this.set("consensusBlockId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsensusDataHashUint8Array(value: js.typedarray.Uint8Array): Self = this.set("consensusDataHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsensusDataHash(value: js.typedarray.Uint8Array | String): Self = this.set("consensusDataHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setEpochNum(value: String): Self = this.set("epochNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestampUsecs(value: String): Self = this.set("timestampUsecs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionAccumulatorHashUint8Array(value: js.typedarray.Uint8Array): Self = this.set("transactionAccumulatorHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransactionAccumulatorHash(value: js.typedarray.Uint8Array | String): Self = this.set("transactionAccumulatorHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

