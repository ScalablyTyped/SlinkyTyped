package typingsSlinky.node.cryptoMod

import typingsSlinky.node.nodeStrings.der
import typingsSlinky.node.nodeStrings.dsa
import typingsSlinky.node.nodeStrings.ec
import typingsSlinky.node.nodeStrings.pem
import typingsSlinky.node.nodeStrings.rsa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "generateKeyPairSync")
@js.native
object generateKeyPairSync extends js.Object {
  def apply(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
  def apply(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): KeyPairSyncResult[String, String] = js.native
}

