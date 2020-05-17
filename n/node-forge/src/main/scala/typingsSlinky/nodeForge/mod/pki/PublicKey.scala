package typingsSlinky.nodeForge.mod.pki

import typingsSlinky.nodeForge.mod.pki.ed25519.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeForge.mod.pki.rsa.PublicKey
  - typingsSlinky.nodeForge.mod.pki.ed25519.Key
*/
trait PublicKey extends js.Object

object PublicKey {
  @scala.inline
  implicit def apply(value: Key): PublicKey = value.asInstanceOf[PublicKey]
  @scala.inline
  implicit def apply(value: typingsSlinky.nodeForge.mod.pki.rsa.PublicKey): PublicKey = value.asInstanceOf[PublicKey]
}

