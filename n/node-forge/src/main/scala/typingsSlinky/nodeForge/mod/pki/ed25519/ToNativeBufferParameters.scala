package typingsSlinky.nodeForge.mod.pki.ed25519

import typingsSlinky.nodeForge.anon.Encoding
import typingsSlinky.nodeForge.anon.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeForge.anon.Message
  - typingsSlinky.nodeForge.anon.Encoding
*/
trait ToNativeBufferParameters extends js.Object

object ToNativeBufferParameters {
  @scala.inline
  implicit def apply(value: Encoding): ToNativeBufferParameters = value.asInstanceOf[ToNativeBufferParameters]
  @scala.inline
  implicit def apply(value: Message): ToNativeBufferParameters = value.asInstanceOf[ToNativeBufferParameters]
}

