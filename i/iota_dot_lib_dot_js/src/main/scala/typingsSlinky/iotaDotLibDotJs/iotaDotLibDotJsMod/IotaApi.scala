package typingsSlinky.iotaDotLibDotJs.iotaDotLibDotJsMod

import typingsSlinky.iotaDotLibDotJs.Anon_Address
import typingsSlinky.iotaDotLibDotJs.Anon_AddressInputs
import typingsSlinky.iotaDotLibDotJs.Anon_Addresses
import typingsSlinky.iotaDotLibDotJs.Anon_AddressesBalance
import typingsSlinky.iotaDotLibDotJs.Anon_Checksum
import typingsSlinky.iotaDotLibDotJs.Anon_End
import typingsSlinky.iotaDotLibDotJs.Anon_EndInclusionStates
import typingsSlinky.iotaDotLibDotJs.Anon_EndSecurity
import typingsSlinky.iotaDotLibDotJs.Anon_Inputs
import typingsSlinky.iotaDotLibDotJs.Anon_InputsArray
import typingsSlinky.iotaDotLibDotJs.Anon_Trytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// iota.api
//
@js.native
trait IotaApi extends IriApi {
  def broadcastAndStore(trytes: js.Array[String]): Unit = js.native
  def broadcastAndStore(
    trytes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]
  ): Unit = js.native
  def broadcastBundle(transactionHash: String): Unit = js.native
  def broadcastBundle(
    transactionHash: String,
    callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]
  ): Unit = js.native
  def findTransactionObjects(searchValues: Anon_Addresses): Unit = js.native
  def findTransactionObjects(
    searchValues: Anon_Addresses,
    callback: js.Function2[/* error */ js.Error, /* transactions */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  def getAccountData(seed: String): Unit = js.native
  def getAccountData(seed: String, options: Anon_EndSecurity): Unit = js.native
  def getAccountData(
    seed: String,
    options: Anon_EndSecurity,
    callback: js.Function2[/* error */ js.Error, /* response */ Anon_AddressesBalance, Unit]
  ): Unit = js.native
  def getBundle(transactionHash: String): Unit = js.native
  def getBundle(
    transactionHash: String,
    callback: js.Function2[/* error */ js.Error, /* bundle */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  def getInputs(seed: String): Unit = js.native
  def getInputs(seed: String, options: Anon_End): Unit = js.native
  def getInputs(
    seed: String,
    options: Anon_End,
    callback: js.Function2[/* error */ js.Error, /* response */ Anon_Inputs, Unit]
  ): Unit = js.native
  def getLatestInclusion(hashes: js.Array[String]): Unit = js.native
  def getLatestInclusion(
    hashes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]
  ): Unit = js.native
  def getNewAddress(seed: String): Unit = js.native
  def getNewAddress(seed: String, options: Anon_Checksum): Unit = js.native
  def getNewAddress(
    seed: String,
    options: Anon_Checksum,
    callback: js.Function2[/* error */ js.Error, /* response */ String | js.Array[String], Unit]
  ): Unit = js.native
  def getTransactionsObjects(hashes: js.Array[String]): Unit = js.native
  def getTransactionsObjects(
    hashes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* transactions */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  def getTransfers(seed: String): Unit = js.native
  def getTransfers(seed: String, options: Anon_EndInclusionStates): Unit = js.native
  def getTransfers(
    seed: String,
    options: Anon_EndInclusionStates,
    callback: js.Function2[/* error */ js.Error, /* transfers */ js.Array[js.Array[TransactionObject]], Unit]
  ): Unit = js.native
  def isReattachable(address: String): Unit = js.native
  def isReattachable(
    address: String,
    callback: js.Function2[/* error */ js.Error, /* response */ Boolean | js.Array[Boolean], Unit]
  ): Unit = js.native
  def isReattachable(address: js.Array[String]): Unit = js.native
  def isReattachable(
    address: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* response */ Boolean | js.Array[Boolean], Unit]
  ): Unit = js.native
  def prepareTransfers(seed: String, transfers: js.Array[TransferObject]): Unit = js.native
  def prepareTransfers(seed: String, transfers: js.Array[TransferObject], options: Anon_Address): Unit = js.native
  def prepareTransfers(
    seed: String,
    transfers: js.Array[TransferObject],
    options: Anon_Address,
    callback: js.Function2[/* error */ js.Error, /* response */ Anon_Trytes, Unit]
  ): Unit = js.native
  def replayBundle(transactionHash: String, depth: Double, minWeightMagnitude: Double): Unit = js.native
  def replayBundle(
    transactionHash: String,
    depth: Double,
    minWeightMagnitude: Double,
    callback: js.Function2[/* error */ js.Error, /* response */ js.Object, Unit]
  ): Unit = js.native
  def sendTransfer(seed: String, depth: Double, minWeightMagnitude: Double, transfers: js.Array[TransferObject]): Unit = js.native
  def sendTransfer(
    seed: String,
    depth: Double,
    minWeightMagnitude: Double,
    transfers: js.Array[TransferObject],
    options: Anon_AddressInputs
  ): Unit = js.native
  def sendTransfer(
    seed: String,
    depth: Double,
    minWeightMagnitude: Double,
    transfers: js.Array[TransferObject],
    options: Anon_AddressInputs,
    callback: js.Function2[/* error */ js.Error, /* response */ Anon_InputsArray, Unit]
  ): Unit = js.native
  def sendTrytes(trytes: js.Array[String], depth: Double, minWeightMagnitude: Double): Unit = js.native
  def sendTrytes(
    trytes: js.Array[String],
    depth: Double,
    minWeightMagnitude: Double,
    callback: js.Function2[/* error */ js.Error, /* response */ Anon_InputsArray, Unit]
  ): Unit = js.native
}

