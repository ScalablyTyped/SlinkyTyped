package typingsSlinky.jsMd5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[js.Any]
  - typingsSlinky.std.Uint8Array
  - typingsSlinky.std.ArrayBuffer
*/
trait message extends js.Object

object message {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): message = value.asInstanceOf[message]
  @scala.inline
  implicit def apply(value: js.typedarray.ArrayBuffer): message = value.asInstanceOf[message]
  @scala.inline
  implicit def apply(value: String): message = value.asInstanceOf[message]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): message = value.asInstanceOf[message]
}

