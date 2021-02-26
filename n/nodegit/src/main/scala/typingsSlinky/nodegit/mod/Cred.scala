package typingsSlinky.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Cred")
@js.native
class Cred ()
  extends typingsSlinky.nodegit.credMod.Cred
/* static members */
object Cred {
  
  @JSImport("nodegit", "Cred.defaultNew")
  @js.native
  def defaultNew(): typingsSlinky.nodegit.credMod.Cred = js.native
  
  @JSImport("nodegit", "Cred.sshKeyFromAgent")
  @js.native
  def sshKeyFromAgent(username: String): typingsSlinky.nodegit.credMod.Cred = js.native
  
  @JSImport("nodegit", "Cred.sshKeyMemoryNew")
  @js.native
  def sshKeyMemoryNew(username: String, publicKey: String, privateKey: String, passphrase: String): js.Promise[typingsSlinky.nodegit.credMod.Cred] = js.native
  
  @JSImport("nodegit", "Cred.sshKeyNew")
  @js.native
  def sshKeyNew(username: String, publicKey: String, privateKey: String, passphrase: String): typingsSlinky.nodegit.credMod.Cred = js.native
  
  @JSImport("nodegit", "Cred.usernameNew")
  @js.native
  def usernameNew(username: String): js.Promise[typingsSlinky.nodegit.credMod.Cred] = js.native
  
  @JSImport("nodegit", "Cred.userpassPlaintextNew")
  @js.native
  def userpassPlaintextNew(username: String, password: String): typingsSlinky.nodegit.credMod.Cred = js.native
}
