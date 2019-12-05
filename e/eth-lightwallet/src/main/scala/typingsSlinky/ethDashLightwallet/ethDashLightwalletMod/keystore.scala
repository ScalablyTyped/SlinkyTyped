package typingsSlinky.ethDashLightwallet.ethDashLightwalletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eth-lightwallet", "keystore")
@js.native
class keystore () extends js.Object {
  def exportPrivateKey(address: String, pwDerivedKey: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def generateNewAddress(pwDerivedKey: scala.scalajs.js.typedarray.Uint8Array, numberOfAddresses: Double): Unit = js.native
  def getAddresses(): js.Array[String] = js.native
  def getSeed(pwDerivedKey: scala.scalajs.js.typedarray.Uint8Array): String = js.native
  def isDerivedKeyCorrect(pwDerivedKey: scala.scalajs.js.typedarray.Uint8Array): Boolean = js.native
  def keyFromPassword(password: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def keyFromPassword(
    password: String,
    callback: js.Function2[
      /* error */ js.Error, 
      /* pwDerivedKey */ scala.scalajs.js.typedarray.Uint8Array, 
      Unit
    ]
  ): scala.scalajs.js.typedarray.Uint8Array = js.native
  def serialize(): String = js.native
}

/* static members */
@JSImport("eth-lightwallet", "keystore")
@js.native
object keystore extends js.Object {
  def createVault(options: js.Any): keystore = js.native
  def createVault(options: js.Any, callback: js.Function2[/* error */ js.Error, /* keystore */ this.type, Unit]): keystore = js.native
  def deserialize(keystore: String): keystore = js.native
  def generateRandomSeed(): String = js.native
  def isSeedValid(seed: String): Boolean = js.native
}

