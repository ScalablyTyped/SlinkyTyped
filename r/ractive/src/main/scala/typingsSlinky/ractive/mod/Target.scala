package typingsSlinky.ractive.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.HTMLElement
  - typingsSlinky.std.ArrayLike[js.Any]
*/
trait Target extends js.Object

object Target {
  @scala.inline
  implicit def apply(value: ArrayLike[js.Any]): Target = value.asInstanceOf[Target]
  @scala.inline
  implicit def apply(value: HTMLElement): Target = value.asInstanceOf[Target]
  @scala.inline
  implicit def apply(value: String): Target = value.asInstanceOf[Target]
}

