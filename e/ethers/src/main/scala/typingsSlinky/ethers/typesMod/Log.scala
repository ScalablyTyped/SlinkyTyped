package typingsSlinky.ethers.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Log extends js.Object {
  var address: String = js.native
  var blockHash: js.UndefOr[String] = js.native
  var blockNumber: js.UndefOr[Double] = js.native
  var data: String = js.native
  var logIndex: js.UndefOr[Double] = js.native
  var removed: js.UndefOr[Boolean] = js.native
  var topics: js.Array[String] = js.native
  var transactionHash: js.UndefOr[String] = js.native
  var transactionIndex: js.UndefOr[Double] = js.native
  var transactionLogIndex: js.UndefOr[Double] = js.native
}

object Log {
  @scala.inline
  def apply(address: String, data: String, topics: js.Array[String]): Log = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  @scala.inline
  implicit class LogOps[Self <: Log] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTopics(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topics")(value.asInstanceOf[js.Any])
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
    def withLogIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(js.undefined)
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
    @scala.inline
    def withTransactionLogIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionLogIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionLogIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionLogIndex")(js.undefined)
        ret
    }
  }
  
}

