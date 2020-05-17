package typingsSlinky.omelette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.omelette.mod.Choices
*/
trait TemplatePrimativeValue extends TemplateValue

object TemplatePrimativeValue {
  @scala.inline
  implicit def apply(value: Choices): TemplatePrimativeValue = value.asInstanceOf[TemplatePrimativeValue]
  @scala.inline
  implicit def apply(value: String): TemplatePrimativeValue = value.asInstanceOf[TemplatePrimativeValue]
}

