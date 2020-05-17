package typingsSlinky.intlMessageformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intlMessageformat.mod.LiteralPart
  - typingsSlinky.intlMessageformat.mod.ArgumentPart
*/
trait MessageFormatPart extends js.Object

object MessageFormatPart {
  @scala.inline
  implicit def apply(value: ArgumentPart): MessageFormatPart = value.asInstanceOf[MessageFormatPart]
  @scala.inline
  implicit def apply(value: LiteralPart): MessageFormatPart = value.asInstanceOf[MessageFormatPart]
}

