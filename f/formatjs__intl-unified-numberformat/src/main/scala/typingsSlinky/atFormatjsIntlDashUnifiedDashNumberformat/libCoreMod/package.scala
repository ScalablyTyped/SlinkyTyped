package typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libCoreMod {
  import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.Anon_Accounting
  import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.compactDisplay
  import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.currencySign
  import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.notation
  import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.signDisplay
  import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.unit
  import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.unitDisplay
  import typingsSlinky.atFormatjsIntlDashUtils.distNumberDashTypesMod.NumberFormatDigitOptions
  import typingsSlinky.std.Intl.NumberFormatOptions
  import typingsSlinky.std.Intl.NumberFormatPartTypes
  import typingsSlinky.std.Intl.ResolvedNumberFormatOptions
  import typingsSlinky.std.Pick

  type ResolvedUnifiedNumberFormatOptions = ResolvedNumberFormatOptions with (Pick[
    UnifiedNumberFormatInternal, 
    currencySign | unit | unitDisplay | notation | compactDisplay | signDisplay
  ])
  type UnifiedNumberFormatOptions = NumberFormatOptions with NumberFormatDigitOptions with Anon_Accounting
  /* Rewritten from type alias, can be one of: 
    - typings.std.Intl.NumberFormatPartTypes
    - typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.exponentSeparator
    - typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.exponentMinusSign
    - typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.exponentInteger
    - typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.compact
    - typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.unit
  */
  type UnifiedNumberFormatPartTypes = _UnifiedNumberFormatPartTypes | NumberFormatPartTypes
}
