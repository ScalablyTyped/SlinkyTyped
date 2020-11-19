package typingsSlinky.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "pki.decryptRsaPrivateKey")
@js.native
object decryptRsaPrivateKey extends js.Object {
  
  def apply(pem: PEM): PrivateKey = js.native
  def apply(pem: PEM, passphrase: String): PrivateKey = js.native
}
