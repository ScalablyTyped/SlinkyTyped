package typingsSlinky.nodeForge.mod.pki

import typingsSlinky.nodeForge.mod.pki.ed25519.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeForge.mod.pki.rsa.PrivateKey
  - typingsSlinky.nodeForge.mod.pki.ed25519.Key
*/
trait PrivateKey extends js.Object

object PrivateKey {
  @scala.inline
  implicit def apply(value: Key): PrivateKey = value.asInstanceOf[PrivateKey]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodeForge.mod.pki.rsa.PrivateKey): PrivateKey = value.asInstanceOf[PrivateKey]
}

