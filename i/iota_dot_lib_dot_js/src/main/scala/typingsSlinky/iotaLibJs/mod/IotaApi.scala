package typingsSlinky.iotaLibJs.mod

import typingsSlinky.iotaLibJs.anon.Address
import typingsSlinky.iotaLibJs.anon.AddressInputs
import typingsSlinky.iotaLibJs.anon.Addresses
import typingsSlinky.iotaLibJs.anon.Balance
import typingsSlinky.iotaLibJs.anon.Checksum
import typingsSlinky.iotaLibJs.anon.End
import typingsSlinky.iotaLibJs.anon.InclusionStates
import typingsSlinky.iotaLibJs.anon.Inputs
import typingsSlinky.iotaLibJs.anon.InputsArray
import typingsSlinky.iotaLibJs.anon.Trytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  def findTransactionObjects(searchValues: Addresses): Unit = js.native
  def findTransactionObjects(
    searchValues: Addresses,
    callback: js.Function2[/* error */ js.Error, /* transactions */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  
  def getAccountData(seed: String): Unit = js.native
  def getAccountData(
    seed: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Error, /* response */ Balance, Unit]
  ): Unit = js.native
  def getAccountData(seed: String, options: typingsSlinky.iotaLibJs.anon.Security): Unit = js.native
  def getAccountData(
    seed: String,
    options: typingsSlinky.iotaLibJs.anon.Security,
    callback: js.Function2[/* error */ js.Error, /* response */ Balance, Unit]
  ): Unit = js.native
  
  def getBundle(transactionHash: String): Unit = js.native
  def getBundle(
    transactionHash: String,
    callback: js.Function2[/* error */ js.Error, /* bundle */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  
  def getInputs(seed: String): Unit = js.native
  def getInputs(
    seed: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Error, /* response */ Inputs, Unit]
  ): Unit = js.native
  def getInputs(seed: String, options: End): Unit = js.native
  def getInputs(
    seed: String,
    options: End,
    callback: js.Function2[/* error */ js.Error, /* response */ Inputs, Unit]
  ): Unit = js.native
  
  def getLatestInclusion(hashes: js.Array[String]): Unit = js.native
  def getLatestInclusion(
    hashes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* states */ js.Array[Boolean], Unit]
  ): Unit = js.native
  
  def getNewAddress(seed: String): Unit = js.native
  def getNewAddress(
    seed: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Error, /* response */ String | js.Array[String], Unit]
  ): Unit = js.native
  def getNewAddress(seed: String, options: Checksum): Unit = js.native
  def getNewAddress(
    seed: String,
    options: Checksum,
    callback: js.Function2[/* error */ js.Error, /* response */ String | js.Array[String], Unit]
  ): Unit = js.native
  
  def getTransactionsObjects(hashes: js.Array[String]): Unit = js.native
  def getTransactionsObjects(
    hashes: js.Array[String],
    callback: js.Function2[/* error */ js.Error, /* transactions */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  
  def getTransfers(seed: String): Unit = js.native
  def getTransfers(
    seed: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Error, /* transfers */ js.Array[js.Array[TransactionObject]], Unit]
  ): Unit = js.native
  def getTransfers(seed: String, options: InclusionStates): Unit = js.native
  def getTransfers(
    seed: String,
    options: InclusionStates,
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
  def prepareTransfers(
    seed: String,
    transfers: js.Array[TransferObject],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Error, /* response */ Trytes, Unit]
  ): Unit = js.native
  def prepareTransfers(seed: String, transfers: js.Array[TransferObject], options: Address): Unit = js.native
  def prepareTransfers(
    seed: String,
    transfers: js.Array[TransferObject],
    options: Address,
    callback: js.Function2[/* error */ js.Error, /* response */ Trytes, Unit]
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
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Error, /* response */ InputsArray, Unit]
  ): Unit = js.native
  def sendTransfer(
    seed: String,
    depth: Double,
    minWeightMagnitude: Double,
    transfers: js.Array[TransferObject],
    options: AddressInputs
  ): Unit = js.native
  def sendTransfer(
    seed: String,
    depth: Double,
    minWeightMagnitude: Double,
    transfers: js.Array[TransferObject],
    options: AddressInputs,
    callback: js.Function2[/* error */ js.Error, /* response */ InputsArray, Unit]
  ): Unit = js.native
  
  def sendTrytes(trytes: js.Array[String], depth: Double, minWeightMagnitude: Double): Unit = js.native
  def sendTrytes(
    trytes: js.Array[String],
    depth: Double,
    minWeightMagnitude: Double,
    callback: js.Function2[/* error */ js.Error, /* response */ InputsArray, Unit]
  ): Unit = js.native
}
