package typingsSlinky.iotaLibJs.mod

import typingsSlinky.iotaLibJs.anon.Addresses
import typingsSlinky.iotaLibJs.anon.Balances
import typingsSlinky.iotaLibJs.anon.BranchTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// iota.api
//
@js.native
trait IriApi extends js.Object {
  def addNeighbors(
    uris: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* addedNeighbors */ Double, Unit]
  ): Unit = js.native
  def attachToTangle(
    trunkTransaction: String,
    branchTransaction: String,
    minWeightMagnitude: Double,
    trytes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]
  ): Unit = js.native
  def broadcastTransactions(
    trytes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]
  ): Unit = js.native
  def findTransactions(
    searchValues: Addresses,
    callback: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]
  ): Unit = js.native
  def getBalances(
    addresses: js.Array[String],
    treshold: Double,
    callback: js.Function2[/* error */ js.Error, /* response */ Balances, Unit]
  ): Unit = js.native
  def getInclusionStates(
    transactions: js.Array[String],
    tips: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]
  ): Unit = js.native
  def getNeighbors(callback: js.Function2[/* error */ js.Error, /* neighbors */ js.Array[Neighbor], Unit]): Unit = js.native
  def getNodeInfo(callback: js.Function2[/* error */ js.Error, /* info */ NodeInfo, Unit]): Unit = js.native
  def getTips(callback: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]): Unit = js.native
  def getTransactionsToApprove(
    depth: Double,
    callback: js.Function2[/* error */ js.Error, /* response */ BranchTransaction, Unit]
  ): Unit = js.native
  def getTrytes(
    hashes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]
  ): Unit = js.native
  def interruptAttachingToTangle(callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]): Unit = js.native
  def removeNeighbors(
    uris: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* removedNeighbors */ js.Array[Double], Unit]
  ): Unit = js.native
  def storeTransactions(
    trytes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]
  ): Unit = js.native
}

object IriApi {
  @scala.inline
  def apply(
    addNeighbors: (js.Array[String], js.Function2[/* error */ js.Error, /* addedNeighbors */ Double, Unit]) => Unit,
    attachToTangle: (String, String, Double, js.Array[String], js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => Unit,
    broadcastTransactions: (js.Array[String], js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => Unit,
    findTransactions: (Addresses, js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]) => Unit,
    getBalances: (js.Array[String], Double, js.Function2[/* error */ js.Error, /* response */ Balances, Unit]) => Unit,
    getInclusionStates: (js.Array[String], js.Array[String], js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]) => Unit,
    getNeighbors: js.Function2[/* error */ js.Error, /* neighbors */ js.Array[Neighbor], Unit] => Unit,
    getNodeInfo: js.Function2[/* error */ js.Error, /* info */ NodeInfo, Unit] => Unit,
    getTips: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit] => Unit,
    getTransactionsToApprove: (Double, js.Function2[/* error */ js.Error, /* response */ BranchTransaction, Unit]) => Unit,
    getTrytes: (js.Array[String], js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => Unit,
    interruptAttachingToTangle: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit] => Unit,
    removeNeighbors: (js.Array[String], js.Function2[/* error */ js.Error, /* removedNeighbors */ js.Array[Double], Unit]) => Unit,
    storeTransactions: (js.Array[String], js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => Unit
  ): IriApi = {
    val __obj = js.Dynamic.literal(addNeighbors = js.Any.fromFunction2(addNeighbors), attachToTangle = js.Any.fromFunction5(attachToTangle), broadcastTransactions = js.Any.fromFunction2(broadcastTransactions), findTransactions = js.Any.fromFunction2(findTransactions), getBalances = js.Any.fromFunction3(getBalances), getInclusionStates = js.Any.fromFunction3(getInclusionStates), getNeighbors = js.Any.fromFunction1(getNeighbors), getNodeInfo = js.Any.fromFunction1(getNodeInfo), getTips = js.Any.fromFunction1(getTips), getTransactionsToApprove = js.Any.fromFunction2(getTransactionsToApprove), getTrytes = js.Any.fromFunction2(getTrytes), interruptAttachingToTangle = js.Any.fromFunction1(interruptAttachingToTangle), removeNeighbors = js.Any.fromFunction2(removeNeighbors), storeTransactions = js.Any.fromFunction2(storeTransactions))
    __obj.asInstanceOf[IriApi]
  }
  @scala.inline
  implicit class IriApiOps[Self <: IriApi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddNeighbors(
      value: (js.Array[String], js.Function2[/* error */ js.Error, /* addedNeighbors */ Double, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addNeighbors")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withAttachToTangle(
      value: (String, String, Double, js.Array[String], js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachToTangle")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withBroadcastTransactions(
      value: (js.Array[String], js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadcastTransactions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFindTransactions(
      value: (Addresses, js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findTransactions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetBalances(
      value: (js.Array[String], Double, js.Function2[/* error */ js.Error, /* response */ Balances, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBalances")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetInclusionStates(
      value: (js.Array[String], js.Array[String], js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInclusionStates")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withGetNeighbors(value: js.Function2[/* error */ js.Error, /* neighbors */ js.Array[Neighbor], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNeighbors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetNodeInfo(value: js.Function2[/* error */ js.Error, /* info */ NodeInfo, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTips(value: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTips")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTransactionsToApprove(
      value: (Double, js.Function2[/* error */ js.Error, /* response */ BranchTransaction, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTransactionsToApprove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetTrytes(
      value: (js.Array[String], js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTrytes")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInterruptAttachingToTangle(value: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interruptAttachingToTangle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveNeighbors(
      value: (js.Array[String], js.Function2[/* error */ js.Error, /* removedNeighbors */ js.Array[Double], Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeNeighbors")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withStoreTransactions(
      value: (js.Array[String], js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeTransactions")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

