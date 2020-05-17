package typingsSlinky.leaflet.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.HTMLElement
*/
trait Content extends js.Object

object Content {
  @scala.inline
  implicit def apply(value: HTMLElement): Content = value.asInstanceOf[Content]
  @scala.inline
  implicit def apply(value: String): Content = value.asInstanceOf[Content]
}

