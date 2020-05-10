package typingsSlinky.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionReceipt extends js.Object {
  var blockHash: js.UndefOr[String] = js.native
  var blockNumber: js.UndefOr[Double] = js.native
  var byzantium: Boolean = js.native
  var contractAddress: js.UndefOr[String] = js.native
  var cumulativeGasUsed: js.UndefOr[BigNumber] = js.native
  var gasUsed: js.UndefOr[BigNumber] = js.native
  var logs: js.UndefOr[js.Array[Log]] = js.native
  var logsBloom: js.UndefOr[String] = js.native
  var root: js.UndefOr[String] = js.native
  var status: js.UndefOr[Double] = js.native
  var transactionHash: js.UndefOr[String] = js.native
  var transactionIndex: js.UndefOr[Double] = js.native
}

object TransactionReceipt {
  @scala.inline
  def apply(byzantium: Boolean): TransactionReceipt = {
    val __obj = js.Dynamic.literal(byzantium = byzantium.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionReceipt]
  }
  @scala.inline
  implicit class TransactionReceiptOps[Self <: TransactionReceipt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withByzantium(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("byzantium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlockHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockHash")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withContractAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contractAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContractAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contractAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withCumulativeGasUsed(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulativeGasUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCumulativeGasUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cumulativeGasUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withGasUsed(value: BigNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGasUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gasUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withLogs(value: js.Array[Log]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logs")(js.undefined)
        ret
    }
    @scala.inline
    def withLogsBloom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsBloom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogsBloom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logsBloom")(js.undefined)
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionHash")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionIndex")(js.undefined)
        ret
    }
  }
  
}

