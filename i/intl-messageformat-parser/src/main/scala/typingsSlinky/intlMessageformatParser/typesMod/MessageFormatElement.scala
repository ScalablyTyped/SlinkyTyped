package typingsSlinky.intlMessageformatParser.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intlMessageformatParser.typesMod.LiteralElement
  - typingsSlinky.intlMessageformatParser.typesMod.ArgumentElement
  - typingsSlinky.intlMessageformatParser.typesMod.NumberElement
  - typingsSlinky.intlMessageformatParser.typesMod.DateElement
  - typingsSlinky.intlMessageformatParser.typesMod.TimeElement
  - typingsSlinky.intlMessageformatParser.typesMod.SelectElement
  - typingsSlinky.intlMessageformatParser.typesMod.PluralElement
  - typingsSlinky.intlMessageformatParser.typesMod.PoundElement
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

