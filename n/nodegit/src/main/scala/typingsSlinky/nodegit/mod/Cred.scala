package typingsSlinky.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Cred")
@js.native
class Cred ()
  extends typingsSlinky.nodegit.credMod.Cred

/* static members */
@JSImport("nodegit", "Cred")
@js.native
object Cred extends js.Object {
  def defaultNew(): typingsSlinky.nodegit.credMod.Cred = js.native
  def sshKeyFromAgent(username: String): typingsSlinky.nodegit.credMod.Cred = js.native
  def sshKeyMemoryNew(username: String, publicKey: String, privateKey: String, passphrase: String): js.Promise[typingsSlinky.nodegit.credMod.Cred] = js.native
  def sshKeyNew(username: String, publicKey: String, privateKey: String, passphrase: String): typingsSlinky.nodegit.credMod.Cred = js.native
  def usernameNew(username: String): js.Promise[typingsSlinky.nodegit.credMod.Cred] = js.native
  def userpassPlaintextNew(username: String, password: String): typingsSlinky.nodegit.credMod.Cred = js.native
}

