package typingsSlinky.jsSha3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[scala.Double]
  - typingsSlinky.std.ArrayBuffer
  - typingsSlinky.std.Uint8Array
*/
trait Message extends js.Object

object Message {
  @scala.inline
  implicit def apply(value: js.Array[Double]): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: String): Message = value.asInstanceOf[Message]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Message = value.asInstanceOf[Message]
}

