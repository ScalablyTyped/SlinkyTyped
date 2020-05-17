package typingsSlinky.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A part of a {@link Path} that can be any JSON value type. All types are coerced to string, except null. This makes the number 1 and the string "1" equivalent.
  **/
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
*/
trait Key extends KeySet

object Key {
  @scala.inline
  implicit def apply(value: Boolean): Key = value.asInstanceOf[Key]
  @scala.inline
  implicit def apply(value: Double): Key = value.asInstanceOf[Key]
  @scala.inline
  implicit def apply(value: String): Key = value.asInstanceOf[Key]
}

