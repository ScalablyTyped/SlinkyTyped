package typingsSlinky.formatjsIntlUtils.polyfillUtilsMod

import typingsSlinky.formatjsIntlUtils.numberTypesMod.NumberFormatDigitInternalSlots
import typingsSlinky.formatjsIntlUtils.numberTypesMod.NumberFormatDigitOptions
import typingsSlinky.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@formatjs/intl-utils/dist/polyfill-utils", "setNumberFormatDigitOptions")
@js.native
object setNumberFormatDigitOptions extends js.Object {
  def apply[TObject /* <: js.Object */, TInternalSlots /* <: NumberFormatDigitInternalSlots */](
    internalSlotMap: WeakMap[TObject, TInternalSlots],
    intlObj: TObject,
    opts: NumberFormatDigitOptions,
    mnfdDefault: Double,
    mxfdDefault: Double
  ): Unit = js.native
}

