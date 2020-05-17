package typingsSlinky.nodeForge.mod.pki.ed25519

import typingsSlinky.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// `string`s will be converted by toNativeBuffer with `encoding: 'binary'`
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeForge.mod.pki.ed25519.NativeBuffer
  - typingsSlinky.nodeForge.mod.util.ByteBuffer
  - java.lang.String
*/
trait BinaryBuffer extends js.Object

object BinaryBuffer {
  @scala.inline
  implicit def apply(value: ByteBuffer): BinaryBuffer = value.asInstanceOf[BinaryBuffer]
  @scala.inline
  implicit def apply(value: NativeBuffer): BinaryBuffer = value.asInstanceOf[BinaryBuffer]
  @scala.inline
  implicit def apply(value: String): BinaryBuffer = value.asInstanceOf[BinaryBuffer]
}

