package typingsSlinky.ethereumProtocol.mod

import typingsSlinky.bignumberJs.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbstractBlock extends js.Object {
  var difficulty: default = js.native
  var extraData: String = js.native
  var gasLimit: Double = js.native
  var gasUsed: Double = js.native
  var hash: String | Null = js.native
  var logsBloom: String | Null = js.native
  var miner: String = js.native
  var nonce: String | Null = js.native
  var number: Double | Null = js.native
  var parentHash: String = js.native
  var sha3Uncles: String = js.native
  var size: Double = js.native
  var stateRoot: String = js.native
  var timestamp: Double = js.native
  var totalDifficulty: default = js.native
  var transactionsRoot: String = js.native
  var uncles: js.Array[String] = js.native
}

object AbstractBlock {
  @scala.inline
  def apply(
    difficulty: default,
    extraData: String,
    gasLimit: Double,
    gasUsed: Double,
    miner: String,
    parentHash: String,
    sha3Uncles: String,
    size: Double,
    stateRoot: String,
    timestamp: Double,
    totalDifficulty: default,
    transactionsRoot: String,
    uncles: js.Array[String]
  ): AbstractBlock = {
    val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionsRoot = transactionsRoot.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractBlock]
  }
  @scala.inline
  implicit class AbstractBlockOps[Self <: AbstractBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDifficulty(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("difficulty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGasLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGasUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSha3Uncles(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sha3Uncles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStateRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalDifficulty(value: default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalDifficulty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionsRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionsRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUncles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uncles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHashNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(null)
        ret
    }
    @scala.inline
    def withLogsBloom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsBloom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogsBloomNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsBloom")(null)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(null)
        ret
    }
    @scala.inline
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(null)
        ret
    }
  }
  
}

