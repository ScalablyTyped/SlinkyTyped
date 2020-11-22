package typingsSlinky.mz.mod.crypto

import typingsSlinky.mz.mzStrings.der
import typingsSlinky.mz.mzStrings.dsa
import typingsSlinky.mz.mzStrings.ec
import typingsSlinky.mz.mzStrings.ed25519
import typingsSlinky.mz.mzStrings.ed448
import typingsSlinky.mz.mzStrings.pem
import typingsSlinky.mz.mzStrings.rsa
import typingsSlinky.mz.mzStrings.x25519
import typingsSlinky.mz.mzStrings.x448
import typingsSlinky.node.cryptoMod.DSAKeyPairOptions
import typingsSlinky.node.cryptoMod.ECKeyPairOptions
import typingsSlinky.node.cryptoMod.ED25519KeyPairOptions
import typingsSlinky.node.cryptoMod.ED448KeyPairOptions
import typingsSlinky.node.cryptoMod.KeyPairSyncResult
import typingsSlinky.node.cryptoMod.RSAKeyPairOptions
import typingsSlinky.node.cryptoMod.X25519KeyPairOptions
import typingsSlinky.node.cryptoMod.X448KeyPairOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.generateKeyPairSync")
@js.native
object generateKeyPairSync extends js.Object {
  
  def apply(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: ed25519, options: ED25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: ed448, options: ED448KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: x25519, options: X25519KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: x448, options: X448KeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
}
