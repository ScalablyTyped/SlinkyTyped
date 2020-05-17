package typingsSlinky.jpegJs.mod

import typingsSlinky.node.Buffer
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.std.ArrayLike[scala.Double]
  - typingsSlinky.std.Iterable[scala.Double]
  - typingsSlinky.std.ArrayBuffer
*/
trait BufferLike extends js.Object

object BufferLike {
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): BufferLike = value.asInstanceOf[BufferLike]
  @scala.inline
  implicit def apply(value: ArrayLike[Double]): BufferLike = value.asInstanceOf[BufferLike]
  @scala.inline
  implicit def apply(value: Buffer): BufferLike = value.asInstanceOf[BufferLike]
  @scala.inline
  implicit def apply(value: js.Iterable[Double]): BufferLike = value.asInstanceOf[BufferLike]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): BufferLike = value.asInstanceOf[BufferLike]
}

