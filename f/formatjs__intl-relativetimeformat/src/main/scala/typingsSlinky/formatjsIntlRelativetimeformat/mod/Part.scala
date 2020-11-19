package typingsSlinky.formatjsIntlRelativetimeformat.mod

import typingsSlinky.formatjsIntlRelativetimeformat.formatjsIntlRelativetimeformatStrings.literal
import typingsSlinky.std.Intl.NumberFormatPartTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.formatjsIntlRelativetimeformat.mod.LiteralPart
  - typingsSlinky.formatjsIntlRelativetimeformat.mod.RelativeTimeFormatNumberPart
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
  def RelativeTimeFormatNumberPart(`type`: NumberFormatPartTypes, unit: Unit, value: String): Part = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
}
