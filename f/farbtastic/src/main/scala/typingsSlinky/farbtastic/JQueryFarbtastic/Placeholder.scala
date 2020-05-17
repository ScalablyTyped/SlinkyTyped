package typingsSlinky.farbtastic.JQueryFarbtastic

import org.scalajs.dom.raw.Element
import typingsSlinky.farbtastic.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Element
  - typingsSlinky.farbtastic.JQuery
*/
trait Placeholder extends Callback

object Placeholder {
  @scala.inline
  implicit def apply(value: Element): Placeholder = value.asInstanceOf[Placeholder]
  @scala.inline
  implicit def apply(value: JQuery): Placeholder = value.asInstanceOf[Placeholder]
  @scala.inline
  implicit def apply(value: String): Placeholder = value.asInstanceOf[Placeholder]
}

