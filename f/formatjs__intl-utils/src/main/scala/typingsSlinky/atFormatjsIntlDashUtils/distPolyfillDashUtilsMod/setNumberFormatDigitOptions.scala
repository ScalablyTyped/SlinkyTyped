package typingsSlinky.atFormatjsIntlDashUtils.distPolyfillDashUtilsMod

import typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatDigitInternalSlots
import typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatDigitOptions
import typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatNotation
import typingsSlinky.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/polyfill-utils", "setNumberFormatDigitOptions")
@js.native
object setNumberFormatDigitOptions extends js.Object {
  def apply[TObject /* <: js.Object */, TInternalSlots /* <: NumberFormatDigitInternalSlots */](
    internalSlotMap: WeakMap[TObject, TInternalSlots],
    pl: TObject,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double,
    notation: NumberFormatNotation
  ): Unit = js.native
}

