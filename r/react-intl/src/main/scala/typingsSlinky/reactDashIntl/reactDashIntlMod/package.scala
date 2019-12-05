package typingsSlinky.reactDashIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashIntlMod {
  import typingsSlinky.atFormatjsIntlDashListformat.atFormatjsIntlDashListformatMod.IntlListFormatOptions
  import typingsSlinky.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.IntlRelativeTimeFormatOptions
  import typingsSlinky.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatMod.UnifiedNumberFormatOptions
  import typingsSlinky.reactDashIntl.Anon_ForwardedRef
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.defaultFormats
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.defaultLocale
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.formats
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.localeMatcher
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.messages
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.onError
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.textComponent
  import typingsSlinky.reactDashIntl.reactDashIntlStrings.timeZone
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Intl.DateTimeFormatOptions
  import typingsSlinky.std.Intl.PluralRulesOptions
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick

  type FormatDateOptions = (Exclude[DateTimeFormatOptions, localeMatcher]) with CustomFormatConfig
  type FormatListOptions = Exclude[IntlListFormatOptions, localeMatcher]
  type FormatNumberOptions = (Exclude[UnifiedNumberFormatOptions, localeMatcher]) with CustomFormatConfig
  type FormatPluralOptions = (Exclude[PluralRulesOptions, localeMatcher]) with CustomFormatConfig
  type FormatRelativeTimeOptions = (Exclude[IntlRelativeTimeFormatOptions, localeMatcher]) with CustomFormatConfig
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type OptionalIntlConfig = (Omit[IntlConfig, String]) with (Partial[
    Pick[
      IntlConfig, 
      formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
    ]
  ])
  type WithIntlProps[P] = (Omit[P, String]) with Anon_ForwardedRef
  type WrappedComponentProps[IntlPropName /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in IntlPropName ]: react-intl.react-intl.IntlShape}
    */ typingsSlinky.reactDashIntl.reactDashIntlStrings.WrappedComponentProps with js.Any
}
