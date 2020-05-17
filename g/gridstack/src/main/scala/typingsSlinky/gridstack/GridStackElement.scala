package typingsSlinky.gridstack

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Other items in https://github.com/gridstack/gridstack.js/blob/develop/doc/README.md
  * Grid attributes
  * Item attributes
  * Events
  */
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.HTMLElement
  - typingsSlinky.gridstack.JQuery
*/
trait GridStackElement extends js.Object

object GridStackElement {
  @scala.inline
  implicit def apply(value: HTMLElement): GridStackElement = value.asInstanceOf[GridStackElement]
  @scala.inline
  implicit def apply(value: JQuery): GridStackElement = value.asInstanceOf[GridStackElement]
  @scala.inline
  implicit def apply(value: String): GridStackElement = value.asInstanceOf[GridStackElement]
}

