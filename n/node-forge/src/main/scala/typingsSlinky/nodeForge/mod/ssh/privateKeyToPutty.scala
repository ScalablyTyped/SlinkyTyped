package typingsSlinky.nodeForge.mod.ssh

import typingsSlinky.nodeForge.mod.pki.PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "ssh.privateKeyToPutty")
@js.native
object privateKeyToPutty extends js.Object {
  
  /**
    * @description Encodes (and optionally encrypts) a private RSA key as a Putty PPK file
    */
  def apply(privateKey: PrivateKey): String = js.native
  def apply(privateKey: PrivateKey, passphrase: js.UndefOr[scala.Nothing], comment: String): String = js.native
  def apply(privateKey: PrivateKey, passphrase: String): String = js.native
  def apply(privateKey: PrivateKey, passphrase: String, comment: String): String = js.native
}
