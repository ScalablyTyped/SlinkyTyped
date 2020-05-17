package typingsSlinky.codepage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[scala.Double]
  - typingsSlinky.std.Uint8Array
*/
trait CPData extends js.Object

object CPData {
  @scala.inline
  implicit def apply(value: js.Array[Double]): CPData = value.asInstanceOf[CPData]
  @scala.inline
  implicit def apply(value: String): CPData = value.asInstanceOf[CPData]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): CPData = value.asInstanceOf[CPData]
}

