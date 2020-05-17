package typingsSlinky.blake2sJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Double]
  - typingsSlinky.std.Uint8Array
*/
trait ByteArray extends js.Object

object ByteArray {
  @scala.inline
  implicit def apply(value: js.Array[Double]): ByteArray = value.asInstanceOf[ByteArray]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ByteArray = value.asInstanceOf[ByteArray]
}

