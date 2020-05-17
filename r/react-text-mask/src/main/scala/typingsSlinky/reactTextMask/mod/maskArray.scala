package typingsSlinky.reactTextMask.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[java.lang.String | typingsSlinky.std.RegExp]
  - scala.Boolean
*/
trait maskArray extends js.Object

object maskArray {
  @scala.inline
  implicit def apply(value: js.Array[String | js.RegExp]): maskArray = value.asInstanceOf[maskArray]
  @scala.inline
  implicit def apply(value: Boolean): maskArray = value.asInstanceOf[maskArray]
}

