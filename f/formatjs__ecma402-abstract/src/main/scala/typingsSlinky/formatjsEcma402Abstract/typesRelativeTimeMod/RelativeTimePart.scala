package typingsSlinky.formatjsEcma402Abstract.typesRelativeTimeMod

import typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractStrings.literal
import typingsSlinky.std.Intl.NumberFormatPartTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.formatjsEcma402Abstract.formatjsEcma402AbstractUtilsMod.LiteralPart
  - typingsSlinky.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeFormatNumberPart
*/
trait RelativeTimePart extends js.Object
object RelativeTimePart {
  
  @scala.inline
  def LiteralPart(`type`: literal, value: String): RelativeTimePart = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimePart]
  }
  
  @scala.inline
  def RelativeTimeFormatNumberPart(`type`: NumberFormatPartTypes, unit: RelativeTimeUnit, value: String): RelativeTimePart = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimePart]
  }
}
