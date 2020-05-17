package typingsSlinky.atom.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.HTMLElement
  - java.lang.String
  - js.Function0[typingsSlinky.std.HTMLElement]
*/
trait FocusableHTMLElement extends js.Object

object FocusableHTMLElement {
  @scala.inline
  implicit def apply(value: js.Function0[HTMLElement]): FocusableHTMLElement = value.asInstanceOf[FocusableHTMLElement]
  @scala.inline
  implicit def apply(value: HTMLElement): FocusableHTMLElement = value.asInstanceOf[FocusableHTMLElement]
  @scala.inline
  implicit def apply(value: String): FocusableHTMLElement = value.asInstanceOf[FocusableHTMLElement]
}

