package typingsSlinky.iotaLibJs.mod

import typingsSlinky.iotaLibJs.AnonAddresses
import typingsSlinky.iotaLibJs.AnonBalances
import typingsSlinky.iotaLibJs.AnonBranchTransaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// iota.api
//
trait IriApi extends js.Object {
  def addNeighbors(
    uris: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* addedNeighbors */ Double, Unit]
  ): Unit
  def attachToTangle(
    trunkTransaction: String,
    branchTransaction: String,
    minWeightMagnitude: Double,
    trytes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]
  ): Unit
  def broadcastTransactions(
    trytes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]
  ): Unit
  def findTransactions(
    searchValues: AnonAddresses,
    callback: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]
  ): Unit
  def getBalances(
    addresses: js.Array[String],
    treshold: Double,
    callback: js.Function2[/* error */ js.Error, /* response */ AnonBalances, Unit]
  ): Unit
  def getInclusionStates(
    transactions: js.Array[String],
    tips: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]
  ): Unit
  def getNeighbors(callback: js.Function2[/* error */ js.Error, /* neighbors */ js.Array[Neighbor], Unit]): Unit
  def getNodeInfo(callback: js.Function2[/* error */ js.Error, /* info */ NodeInfo, Unit]): Unit
  def getTips(callback: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]): Unit
  def getTransactionsToApprove(
    depth: Double,
    callback: js.Function2[/* error */ js.Error, /* response */ AnonBranchTransaction, Unit]
  ): Unit
  def getTrytes(
    hashes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]
  ): Unit
  def interruptAttachingToTangle(callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]): Unit
  def removeNeighbors(
    uris: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* removedNeighbors */ js.Array[Double], Unit]
  ): Unit
  def storeTransactions(
    trytes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]
  ): Unit
}

object IriApi {
  @scala.inline
  def apply(
    addNeighbors: (js.Array[String], js.Function2[/* error */ js.Error, /* addedNeighbors */ Double, Unit]) => Unit,
    attachToTangle: (String, String, Double, js.Array[String], js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => Unit,
    broadcastTransactions: (js.Array[String], js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => Unit,
    findTransactions: (AnonAddresses, js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit]) => Unit,
    getBalances: (js.Array[String], Double, js.Function2[/* error */ js.Error, /* response */ AnonBalances, Unit]) => Unit,
    getInclusionStates: (js.Array[String], js.Array[String], js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]) => Unit,
    getNeighbors: js.Function2[/* error */ js.Error, /* neighbors */ js.Array[Neighbor], Unit] => Unit,
    getNodeInfo: js.Function2[/* error */ js.Error, /* info */ NodeInfo, Unit] => Unit,
    getTips: js.Function2[/* error */ js.Error, /* hashes */ js.Array[String], Unit] => Unit,
    getTransactionsToApprove: (Double, js.Function2[/* error */ js.Error, /* response */ AnonBranchTransaction, Unit]) => Unit,
    getTrytes: (js.Array[String], js.Function2[/* error */ js.Error, /* trytes */ js.Array[String], Unit]) => Unit,
    interruptAttachingToTangle: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit] => Unit,
    removeNeighbors: (js.Array[String], js.Function2[/* error */ js.Error, /* removedNeighbors */ js.Array[Double], Unit]) => Unit,
    storeTransactions: (js.Array[String], js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]) => Unit
  ): IriApi = {
    val __obj = js.Dynamic.literal(addNeighbors = js.Any.fromFunction2(addNeighbors), attachToTangle = js.Any.fromFunction5(attachToTangle), broadcastTransactions = js.Any.fromFunction2(broadcastTransactions), findTransactions = js.Any.fromFunction2(findTransactions), getBalances = js.Any.fromFunction3(getBalances), getInclusionStates = js.Any.fromFunction3(getInclusionStates), getNeighbors = js.Any.fromFunction1(getNeighbors), getNodeInfo = js.Any.fromFunction1(getNodeInfo), getTips = js.Any.fromFunction1(getTips), getTransactionsToApprove = js.Any.fromFunction2(getTransactionsToApprove), getTrytes = js.Any.fromFunction2(getTrytes), interruptAttachingToTangle = js.Any.fromFunction1(interruptAttachingToTangle), removeNeighbors = js.Any.fromFunction2(removeNeighbors), storeTransactions = js.Any.fromFunction2(storeTransactions))
  
    __obj.asInstanceOf[IriApi]
  }
}

