package typingsSlinky.rcDialog.idialogproptypesMod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.HTMLElement
*/
trait IStringOrHtmlElement extends js.Object

object IStringOrHtmlElement {
  @scala.inline
  implicit def apply(value: HTMLElement): IStringOrHtmlElement = value.asInstanceOf[IStringOrHtmlElement]
  @scala.inline
  implicit def apply(value: String): IStringOrHtmlElement = value.asInstanceOf[IStringOrHtmlElement]
}

