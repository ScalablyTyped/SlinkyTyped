package typingsSlinky.formatjsIntl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type FormatDateOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatOptions, 
    typingsSlinky.formatjsIntl.formatjsIntlStrings.localeMatcher
  ]) with typingsSlinky.formatjsIntl.typesMod.CustomFormatConfig
  
  type FormatNumberOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptions, 
    typingsSlinky.formatjsIntl.formatjsIntlStrings.localeMatcher
  ]) with typingsSlinky.formatjsIntl.typesMod.CustomFormatConfig
  
  type FormatPluralOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.std.Intl.PluralRulesOptions, 
    typingsSlinky.formatjsIntl.formatjsIntlStrings.localeMatcher
  ]) with typingsSlinky.formatjsIntl.typesMod.CustomFormatConfig
  
  type FormatRelativeTimeOptions = (typingsSlinky.std.Exclude[
    typingsSlinky.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions, 
    typingsSlinky.formatjsIntl.formatjsIntlStrings.localeMatcher
  ]) with typingsSlinky.formatjsIntl.typesMod.CustomFormatConfig
  
  type OnErrorFn = js.Function1[
    /* err */ typingsSlinky.formatjsIntl.errorMod.MissingTranslationError | typingsSlinky.formatjsIntl.errorMod.MessageFormatError | typingsSlinky.formatjsIntl.errorMod.MissingDataError | typingsSlinky.formatjsIntl.errorMod.InvalidConfigError | typingsSlinky.formatjsIntl.errorMod.UnsupportedFormatterError | typingsSlinky.intlMessageformat.mod.FormatError, 
    scala.Unit
  ]
}
