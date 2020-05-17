package typingsSlinky.aesJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.Uint8Array
  - js.Array[scala.Double]
*/
trait ByteSource extends js.Object

object ByteSource {
  @scala.inline
  implicit def apply(value: js.Array[Double]): ByteSource = value.asInstanceOf[ByteSource]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): ByteSource = value.asInstanceOf[ByteSource]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ByteSource = value.asInstanceOf[ByteSource]
}

