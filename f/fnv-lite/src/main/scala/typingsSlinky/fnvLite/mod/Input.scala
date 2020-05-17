package typingsSlinky.fnvLite.mod

import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.ArrayLike[scala.Double]
*/
trait Input extends js.Object

object Input {
  @scala.inline
  implicit def apply(value: ArrayLike[Double]): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: String): Input = value.asInstanceOf[Input]
}

