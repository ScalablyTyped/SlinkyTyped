package typingsSlinky.formik.typesMod

import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.react.mod.SelectHTMLAttributes
import typingsSlinky.react.mod.TextareaHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.InputHTMLAttributes[typingsSlinky.std.HTMLInputElement]
  - typingsSlinky.react.mod.SelectHTMLAttributes[typingsSlinky.std.HTMLSelectElement]
  - typingsSlinky.react.mod.TextareaHTMLAttributes[typingsSlinky.std.HTMLTextAreaElement]
*/
trait GenericFieldHTMLAttributes extends js.Object

object GenericFieldHTMLAttributes {
  @scala.inline
  implicit def apply(value: InputHTMLAttributes[HTMLInputElement]): GenericFieldHTMLAttributes = value.asInstanceOf[GenericFieldHTMLAttributes]
  @scala.inline
  implicit def apply(value: SelectHTMLAttributes[HTMLSelectElement]): GenericFieldHTMLAttributes = value.asInstanceOf[GenericFieldHTMLAttributes]
  @scala.inline
  implicit def apply(value: TextareaHTMLAttributes[HTMLTextAreaElement]): GenericFieldHTMLAttributes = value.asInstanceOf[GenericFieldHTMLAttributes]
}

