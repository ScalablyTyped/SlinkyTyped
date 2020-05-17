package typingsSlinky.egg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
*/
trait RouterPath extends js.Object

object RouterPath {
  @scala.inline
  implicit def apply(value: js.RegExp): RouterPath = value.asInstanceOf[RouterPath]
  @scala.inline
  implicit def apply(value: String): RouterPath = value.asInstanceOf[RouterPath]
}

