package typingsSlinky.int64Buffer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.std.ArrayBuffer
  - js.Array[scala.Double]
*/
trait ArrayType extends js.Object

object ArrayType {
  @scala.inline
  implicit def apply(value: js.Array[Double]): ArrayType = value.asInstanceOf[ArrayType]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): ArrayType = value.asInstanceOf[ArrayType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ArrayType = value.asInstanceOf[ArrayType]
}

