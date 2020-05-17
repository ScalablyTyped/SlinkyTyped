package typingsSlinky.jqueryValidationUnobtrusive.MicrosoftJQueryUnobtrusiveValidation

import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.std.Document
  - typingsSlinky.std.Element
  - typingsSlinky.jquery.JQuery[typingsSlinky.std.HTMLElement]
*/
trait JQuerySelector extends js.Object

object JQuerySelector {
  @scala.inline
  implicit def apply(value: Document): JQuerySelector = value.asInstanceOf[JQuerySelector]
  @scala.inline
  implicit def apply(value: Element): JQuerySelector = value.asInstanceOf[JQuerySelector]
  @scala.inline
  implicit def apply(value: JQuery[HTMLElement]): JQuerySelector = value.asInstanceOf[JQuerySelector]
  @scala.inline
  implicit def apply(value: String): JQuerySelector = value.asInstanceOf[JQuerySelector]
}

