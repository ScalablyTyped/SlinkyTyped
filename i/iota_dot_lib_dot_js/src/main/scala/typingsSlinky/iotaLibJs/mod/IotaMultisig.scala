package typingsSlinky.iotaLibJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// iota.multisig
//
@js.native
trait IotaMultisig extends js.Object {
  
  def addSignature(bundleToSign: js.Array[TransactionObject], inputAddress: String, key: String): Unit = js.native
  def addSignature(
    bundleToSign: js.Array[TransactionObject],
    inputAddress: String,
    key: String,
    callback: js.Function2[/* error */ js.Error, /* bundle */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  
  def address(digestTrytes: String): MultisigAddress = js.native
  def address(digestTrytes: js.Array[String]): MultisigAddress = js.native
  
  def getDigest(seed: String, index: Double, security: Security): String = js.native
  
  def getKey(seed: String, index: Double, security: Security): String = js.native
  
  def initiateTransfer(
    securitySum: Double,
    inputAddress: String,
    remainderAddress: String,
    transfers: js.Array[TransferObject]
  ): Unit = js.native
  def initiateTransfer(
    securitySum: Double,
    inputAddress: String,
    remainderAddress: String,
    transfers: js.Array[TransferObject],
    callback: js.Function2[/* error */ js.Error, /* bundle */ js.Array[TransactionObject], Unit]
  ): Unit = js.native
  
  def validateAddress(multisigAddress: String, digests: js.Array[String]): Boolean = js.native
}
