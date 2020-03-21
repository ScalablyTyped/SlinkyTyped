package typingsSlinky.nodeForge.mod.ssh

import typingsSlinky.nodeForge.mod.pki.PEM
import typingsSlinky.nodeForge.mod.pki.PublicKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "ssh.publicKeyToOpenSSH")
@js.native
object publicKeyToOpenSSH extends js.Object {
  /**
    * @description Encodes a public RSA key as an OpenSSH file
    */
  def apply(publicKey: PublicKey): String | PEM = js.native
  def apply(publicKey: PublicKey, comment: String): String | PEM = js.native
}

