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
    def withConsensusBlockIdUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consensusBlockId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsensusBlockId(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consensusBlockId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsensusDataHashUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consensusDataHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsensusDataHash(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consensusDataHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEpochNum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("epochNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestampUsecs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampUsecs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionAccumulatorHashUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionAccumulatorHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionAccumulatorHash(value: js.typedarray.Uint8Array | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionAccumulatorHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

