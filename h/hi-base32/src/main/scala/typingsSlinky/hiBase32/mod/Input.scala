package typingsSlinky.hiBase32.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[scala.Double]
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.Uint8Array
*/
trait Input extends js.Object

object Input {
  @scala.inline
  implicit def apply(value: js.Array[Double]): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: String): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Input = value.asInstanceOf[Input]
}

