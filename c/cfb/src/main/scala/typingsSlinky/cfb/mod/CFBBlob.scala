package typingsSlinky.cfb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Double]
  - typingsSlinky.std.Uint8Array
*/
trait CFBBlob extends js.Object

object CFBBlob {
  @scala.inline
  implicit def apply(value: js.Array[Double]): CFBBlob = value.asInstanceOf[CFBBlob]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): CFBBlob = value.asInstanceOf[CFBBlob]
}

