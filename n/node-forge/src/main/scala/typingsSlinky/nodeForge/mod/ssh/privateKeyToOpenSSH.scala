package typingsSlinky.nodeForge.mod.ssh

import typingsSlinky.nodeForge.mod.pki.PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "ssh.privateKeyToOpenSSH")
@js.native
object privateKeyToOpenSSH extends js.Object {
  
  /**
    * @description Encodes a private RSA key as an OpenSSH file
    */
  def apply(privateKey: PrivateKey): String = js.native
  def apply(privateKey: PrivateKey, passphrase: String): String = js.native
}
