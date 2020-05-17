package typingsSlinky.omelette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.omelette.mod.TemplatePrimativeValue
  - typingsSlinky.omelette.mod.Callback
*/
trait TemplateValue extends js.Object

object TemplateValue {
  @scala.inline
  implicit def apply(value: Callback): TemplateValue = value.asInstanceOf[TemplateValue]
  @scala.inline
  implicit def apply(value: TemplatePrimativeValue): TemplateValue = value.asInstanceOf[TemplateValue]
}

