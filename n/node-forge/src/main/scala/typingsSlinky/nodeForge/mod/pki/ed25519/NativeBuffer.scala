package typingsSlinky.nodeForge.mod.pki.ed25519

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
*/
trait NativeBuffer extends BinaryBuffer

object NativeBuffer {
  @scala.inline
  implicit def apply(value: Buffer): NativeBuffer = value.asInstanceOf[NativeBuffer]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): NativeBuffer = value.asInstanceOf[NativeBuffer]
}

