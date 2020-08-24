package typingsSlinky.formatjsIntlListformat.mod

import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.element
import typingsSlinky.formatjsIntlListformat.formatjsIntlListformatStrings.literal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.formatjsIntlListformat.mod.LiteralPart
  - typingsSlinky.formatjsIntlListformat.mod.ElementPart
*/
trait Part extends js.Object

object Part {
  @scala.inline
  def LiteralPart(`type`: literal, value: String): Part = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
  @scala.inline
  def ElementPart(`type`: element, value: String): Part = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
}

