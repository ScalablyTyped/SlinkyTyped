package typingsSlinky.pako.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Uint8Array
  - js.Array[scala.Double]
  - java.lang.String
*/
trait Data extends js.Object

object Data {
  @scala.inline
  implicit def apply(value: js.Array[Double]): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: String): Data = value.asInstanceOf[Data]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): Data = value.asInstanceOf[Data]
}

