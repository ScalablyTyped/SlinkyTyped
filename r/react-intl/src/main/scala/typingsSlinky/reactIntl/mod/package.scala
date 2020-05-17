package typingsSlinky.reactIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type FormatDateOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.std.Intl.DateTimeFormatOptions, 
    typingsSlinky.reactIntl.reactIntlStrings.localeMatcher
  ]) with typingsSlinky.reactIntl.mod.CustomFormatConfig
  type FormatDisplayNameOptions = typingsSlinky.std.Exclude[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DisplayNamesOptions */ js.Any, 
    typingsSlinky.reactIntl.reactIntlStrings.localeMatcher
  ]
  type FormatNumberOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.formatjsIntlUnifiedNumberformat.mod.UnifiedNumberFormatOptions, 
    typingsSlinky.reactIntl.reactIntlStrings.localeMatcher
  ]) with typingsSlinky.reactIntl.mod.CustomFormatConfig
  type FormatPluralOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.std.Intl.PluralRulesOptions, 
    typingsSlinky.reactIntl.reactIntlStrings.localeMatcher
  ]) with typingsSlinky.reactIntl.mod.CustomFormatConfig
  type FormatRelativeTimeOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.formatjsIntlRelativetimeformat.mod.IntlRelativeTimeFormatOptions, 
    typingsSlinky.reactIntl.reactIntlStrings.localeMatcher
  ]) with typingsSlinky.reactIntl.mod.CustomFormatConfig
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type WithIntlProps[P] = (typingsSlinky.reactIntl.mod.Omit[P, typingsSlinky.reactIntl.reactIntlStrings.intl]) with typingsSlinky.reactIntl.anon.ForwardedRef
  type WrappedComponentProps[IntlPropName /* <: java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in IntlPropName ]: react-intl.react-intl.IntlShape}
    */ typingsSlinky.reactIntl.reactIntlStrings.WrappedComponentProps with org.scalablytyped.runtime.TopLevel[js.Any]
}
