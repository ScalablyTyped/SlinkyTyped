package typingsSlinky.reactIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type FormatDateOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.std.Intl.DateTimeFormatOptions, 
    typingsSlinky.reactIntl.reactIntlStrings.localeMatcher
  ]) with typingsSlinky.reactIntl.typesMod.CustomFormatConfig
  type FormatDisplayNameOptions = typingsSlinky.std.Exclude[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNamesOptions */ js.Any, 
    typingsSlinky.reactIntl.reactIntlStrings.localeMatcher
  ]
  type FormatNumberOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.formatjsIntlUnifiedNumberformat.mod.UnifiedNumberFormatOptions, 
    typingsSlinky.reactIntl.reactIntlStrings.localeMatcher
  ]) with typingsSlinky.reactIntl.typesMod.CustomFormatConfig
  type FormatPluralOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.std.Intl.PluralRulesOptions, 
    typingsSlinky.reactIntl.reactIntlStrings.localeMatcher
  ]) with typingsSlinky.reactIntl.typesMod.CustomFormatConfig
  type FormatRelativeTimeOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.formatjsIntlRelativetimeformat.mod.IntlRelativeTimeFormatOptions, 
    typingsSlinky.reactIntl.reactIntlStrings.localeMatcher
  ]) with typingsSlinky.reactIntl.typesMod.CustomFormatConfig
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
}
