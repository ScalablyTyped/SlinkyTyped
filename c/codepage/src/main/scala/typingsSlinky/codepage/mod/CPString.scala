package typingsSlinky.codepage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.std.Uint8Array
*/
trait CPString extends js.Object

object CPString {
  @scala.inline
  implicit def apply(value: js.Array[String]): CPString = value.asInstanceOf[CPString]
  @scala.inline
  implicit def apply(value: String): CPString = value.asInstanceOf[CPString]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): CPString = value.asInstanceOf[CPString]
}

