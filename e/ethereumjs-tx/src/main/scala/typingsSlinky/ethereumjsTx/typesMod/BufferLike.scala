package typingsSlinky.ethereumjsTx.typesMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.Buffer
  - typingsSlinky.ethereumjsTx.typesMod.TransformableToBuffer
  - typingsSlinky.ethereumjsTx.typesMod.PrefixedHexString
  - scala.Double
*/
trait BufferLike extends js.Object

object BufferLike {
  @scala.inline
  implicit def apply(value: Buffer): BufferLike = value.asInstanceOf[BufferLike]
  @scala.inline
  implicit def apply(value: Double): BufferLike = value.asInstanceOf[BufferLike]
  @scala.inline
  implicit def apply(value: PrefixedHexString): BufferLike = value.asInstanceOf[BufferLike]
  @scala.inline
  implicit def apply(value: TransformableToBuffer): BufferLike = value.asInstanceOf[BufferLike]
}

