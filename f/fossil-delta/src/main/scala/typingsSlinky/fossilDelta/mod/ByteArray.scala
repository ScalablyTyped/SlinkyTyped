package typingsSlinky.fossilDelta.mod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Double]
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.node.Buffer
*/
trait ByteArray extends js.Object

object ByteArray {
  @scala.inline
  implicit def apply(value: js.Array[Double]): ByteArray = value.asInstanceOf[ByteArray]
  @scala.inline
  implicit def apply(value: Buffer): ByteArray = value.asInstanceOf[ByteArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ByteArray = value.asInstanceOf[ByteArray]
}

