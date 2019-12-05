package typingsSlinky.nodeDashForge.nodeDashForgeMod.ssh

import typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "ssh.privateKeyToOpenSSH")
@js.native
object privateKeyToOpenSSH extends js.Object {
  /**
    * @description Encodes a private RSA key as an OpenSSH file
    */
  def apply(privateKey: PrivateKey): String = js.native
  def apply(privateKey: PrivateKey, passphrase: String): String = js.native
}

