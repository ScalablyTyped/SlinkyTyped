package typingsSlinky.emberTestHelpers.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Element
*/
trait Target extends js.Object

object Target {
  @scala.inline
  implicit def apply(value: Element): Target = value.asInstanceOf[Target]
  @scala.inline
  implicit def apply(value: String): Target = value.asInstanceOf[Target]
}

