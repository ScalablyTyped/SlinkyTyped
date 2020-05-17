package typingsSlinky.ky.mod

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Request
  - typingsSlinky.std.URL
  - java.lang.String
*/
trait Input extends js.Object

object Input {
  @scala.inline
  implicit def apply(value: Request): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: String): Input = value.asInstanceOf[Input]
  @scala.inline
  implicit def apply(value: URL): Input = value.asInstanceOf[Input]
}

