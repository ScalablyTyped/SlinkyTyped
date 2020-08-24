package typingsSlinky.formatjsIntlUtils.polyfillUtilsMod

import typingsSlinky.formatjsIntlUtils.numberTypesMod.NumberFormatDigitInternalSlots
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NumberFormatDigitOptions
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NumberFormatNotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/lib/src/polyfill-utils", "setNumberFormatDigitOptions")
@js.native
object setNumberFormatDigitOptions extends js.Object {
  def apply(
    internalSlots: NumberFormatDigitInternalSlots,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double,
    notation: NumberFormatNotation
  ): Unit = js.native
}

