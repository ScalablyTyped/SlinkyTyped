package typingsSlinky.connectLivereload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.RegExp
*/
trait FileMatcher extends js.Object

object FileMatcher {
  @scala.inline
  implicit def apply(value: js.RegExp): FileMatcher = value.asInstanceOf[FileMatcher]
  @scala.inline
  implicit def apply(value: String): FileMatcher = value.asInstanceOf[FileMatcher]
}

