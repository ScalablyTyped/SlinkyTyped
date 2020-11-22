package typingsSlinky.formatjsEcma402Abstract

import typingsSlinky.formatjsEcma402Abstract.numberMod.NumberFormatDigitInternalSlots
import typingsSlinky.formatjsEcma402Abstract.numberMod.NumberFormatDigitOptions
import typingsSlinky.formatjsEcma402Abstract.numberMod.NumberFormatNotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/NumberFormat/SetNumberFormatDigitOptions", JSImport.Namespace)
@js.native
object setNumberFormatDigitOptionsMod extends js.Object {
  
  def SetNumberFormatDigitOptions(
    internalSlots: NumberFormatDigitInternalSlots,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double,
    notation: NumberFormatNotation
  ): Unit = js.native
}
