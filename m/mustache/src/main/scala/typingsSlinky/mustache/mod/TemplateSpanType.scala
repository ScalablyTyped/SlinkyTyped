package typingsSlinky.mustache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.mustache.mod.RAW_VALUE
  - typingsSlinky.mustache.mod.ESCAPED_VALUE
  - typingsSlinky.mustache.mod.SECTION
  - typingsSlinky.mustache.mod.UNESCAPED_VALUE
  - typingsSlinky.mustache.mod.INVERTED
  - typingsSlinky.mustache.mod.COMMENT
  - typingsSlinky.mustache.mod.PARTIAL
  - typingsSlinky.mustache.mod.EQUAL
*/
trait TemplateSpanType extends js.Object

object TemplateSpanType {
  @scala.inline
  implicit def apply(value: COMMENT): TemplateSpanType = value.asInstanceOf[TemplateSpanType]
  @scala.inline
  implicit def apply(value: EQUAL): TemplateSpanType = value.asInstanceOf[TemplateSpanType]
  @scala.inline
  implicit def apply(value: ESCAPED_VALUE): TemplateSpanType = value.asInstanceOf[TemplateSpanType]
  @scala.inline
  implicit def apply(value: INVERTED): TemplateSpanType = value.asInstanceOf[TemplateSpanType]
  @scala.inline
  implicit def apply(value: PARTIAL): TemplateSpanType = value.asInstanceOf[TemplateSpanType]
  @scala.inline
  implicit def apply(value: RAW_VALUE): TemplateSpanType = value.asInstanceOf[TemplateSpanType]
  @scala.inline
  implicit def apply(value: SECTION): TemplateSpanType = value.asInstanceOf[TemplateSpanType]
  @scala.inline
  implicit def apply(value: UNESCAPED_VALUE): TemplateSpanType = value.asInstanceOf[TemplateSpanType]
}

