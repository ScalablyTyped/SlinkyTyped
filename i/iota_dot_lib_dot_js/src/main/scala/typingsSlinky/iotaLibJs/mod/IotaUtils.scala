package typingsSlinky.iotaLibJs.mod

import typingsSlinky.iotaLibJs.anon.Received
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// iota.utils
//
@js.native
trait IotaUtils extends js.Object {
  
  def addChecksum(inputValue: String): String = js.native
  def addChecksum(inputValue: String, checksumLength: js.UndefOr[scala.Nothing], isAddress: Boolean): String = js.native
  def addChecksum(inputValue: String, checksumLength: Double): String = js.native
  def addChecksum(inputValue: String, checksumLength: Double, isAddress: Boolean): String = js.native
  def addChecksum(inputValue: js.Array[String]): js.Array[String] = js.native
  def addChecksum(inputValue: js.Array[String], checksumLength: js.UndefOr[scala.Nothing], isAddress: Boolean): js.Array[String] = js.native
  def addChecksum(inputValue: js.Array[String], checksumLength: Double): js.Array[String] = js.native
  def addChecksum(inputValue: js.Array[String], checksumLength: Double, isAddress: Boolean): js.Array[String] = js.native
  
  def categorizeTransfers(transfers: js.Array[TransactionObject], addresses: js.Array[String]): Received = js.native
  
  def convertUnits(value: Double, fromUnit: IOTAUnit, toUnit: IOTAUnit): Double = js.native
  
  def extractJson(bundle: js.Array[TransactionObject]): String = js.native
  
  def fromTrytes(trytes: String): String = js.native
  
  def isBundle(bundle: js.Array[TransactionObject]): Boolean = js.native
  
  def isValidChecksum(addressWithChecksum: String): Boolean = js.native
  
  def noChecksum(address: String): String = js.native
  
  def toTrytes(input: String): String = js.native
  
  def transactionObject(trytes: String): TransactionObject = js.native
  
  def transactionTrytes(transaction: TransactionObject): String = js.native
  
  def validateSignatures(signedBundle: js.Array[String], inputAddress: String): Boolean = js.native
}
