package typingsSlinky.intlMessageformatParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intlMessageformatParser.mod.LiteralElement
  - typingsSlinky.intlMessageformatParser.mod.ArgumentElement
  - typingsSlinky.intlMessageformatParser.mod.NumberElement
  - typingsSlinky.intlMessageformatParser.mod.DateElement
  - typingsSlinky.intlMessageformatParser.mod.TimeElement
  - typingsSlinky.intlMessageformatParser.mod.SelectElement
  - typingsSlinky.intlMessageformatParser.mod.PluralElement
  - typingsSlinky.intlMessageformatParser.mod.PoundElement
*/
trait MessageFormatElement extends js.Object

object MessageFormatElement {
  @scala.inline
  implicit def apply(value: ArgumentElement | DateElement | LiteralElement | NumberElement | TimeElement): MessageFormatElement = value.asInstanceOf[MessageFormatElement]
  @scala.inline
  implicit def apply(value: PluralElement): MessageFormatElement = value.asInstanceOf[MessageFormatElement]
  @scala.inline
  implicit def apply(value: PoundElement): MessageFormatElement = value.asInstanceOf[MessageFormatElement]
  @scala.inline
  implicit def apply(value: SelectElement): MessageFormatElement = value.asInstanceOf[MessageFormatElement]
}

