package typingsSlinky.reactDashIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypesMod {
  import typingsSlinky.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.IntlListFormatOptions
  import typingsSlinky.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.IntlRelativeTimeFormatOptions
  import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatMod.UnifiedNumberFormatOptions
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.localeMatcher
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Intl.DateTimeFormatOptions
  import typingsSlinky.std.Intl.PluralRulesOptions
  import typingsSlinky.std.Pick

  type FormatDateOptions = (Exclude[DateTimeFormatOptions, localeMatcher]) with CustomFormatConfig
  type FormatListOptions = Exclude[IntlListFormatOptions, localeMatcher]
  type FormatNumberOptions = (Exclude[UnifiedNumberFormatOptions, localeMatcher]) with CustomFormatConfig
  type FormatPluralOptions = (Exclude[PluralRulesOptions, localeMatcher]) with CustomFormatConfig
  type FormatRelativeTimeOptions = (Exclude[IntlRelativeTimeFormatOptions, localeMatcher]) with CustomFormatConfig
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
}
