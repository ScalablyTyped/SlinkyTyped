package typingsSlinky.formatjsIntlListformat.mod

import typingsSlinky.formatjsIntlUtils.polyfillUtilsMod.LiteralPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.formatjsIntlUtils.polyfillUtilsMod.LiteralPart
  - typingsSlinky.formatjsIntlListformat.mod.ElementPart
*/
trait Part extends js.Object

object Part {
  @scala.inline
  implicit def apply(value: ElementPart): Part = value.asInstanceOf[Part]
  @scala.inline
  implicit def apply(value: LiteralPart): Part = value.asInstanceOf[Part]
}

