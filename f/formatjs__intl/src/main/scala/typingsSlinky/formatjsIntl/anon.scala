package typingsSlinky.formatjsIntl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesData
import typingsSlinky.formatjsEcma402Abstract.typesDisplaynamesMod.DisplayNamesLocaleData
import typingsSlinky.formatjsEcma402Abstract.typesListMod.ListPatternFieldsData
import typingsSlinky.formatjsEcma402Abstract.typesListMod.ListPatternLocaleData
import typingsSlinky.formatjsEcma402Abstract.typesRelativeTimeMod.LocaleFieldsData
import typingsSlinky.formatjsEcma402Abstract.typesRelativeTimeMod.RelativeTimeLocaleData
import typingsSlinky.formatjsIntl.srcErrorMod.InvalidConfigError
import typingsSlinky.formatjsIntl.srcErrorMod.MessageFormatError
import typingsSlinky.formatjsIntl.srcErrorMod.MissingDataError
import typingsSlinky.formatjsIntl.srcErrorMod.MissingTranslationError
import typingsSlinky.formatjsIntl.srcErrorMod.UnsupportedFormatterError
import typingsSlinky.formatjsIntl.srcTypesMod.CustomFormats
import typingsSlinky.formatjsIntl.srcTypesMod.FormatListOptions
import typingsSlinky.formatjsIntl.srcTypesMod.OnErrorFn
import typingsSlinky.formatjsIntlDisplaynames.anon.PickDisplayNamesOptionslo
import typingsSlinky.formatjsIntlDisplaynames.mod.DisplayNames
import typingsSlinky.formatjsIntlDisplaynames.mod.DisplayNamesOptions
import typingsSlinky.formatjsIntlListformat.anon.PickIntlListFormatOptions
import typingsSlinky.formatjsIntlListformat.mod.default
import typingsSlinky.formatjsIntlRelativetimeformat.anon.PickIntlRelativeTimeForma
import typingsSlinky.intlMessageformat.anon.Date
import typingsSlinky.intlMessageformat.mod.FormatError
import typingsSlinky.intlMessageformat.mod.IntlMessageFormat
import typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typingsSlinky.std.Intl.DateTimeFormat
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.NumberFormatOptions
import typingsSlinky.std.Intl.PluralRules
import typingsSlinky.std.Intl.PluralRulesOptions
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait DefaultFormats extends StObject {
    
    var defaultFormats: CustomFormats = js.native
    
    var defaultLocale: String = js.native
    
    var formats: CustomFormats = js.native
    
    var locale: String = js.native
    
    var messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
    
    def onError(err: InvalidConfigError): Unit = js.native
    def onError(err: MessageFormatError): Unit = js.native
    def onError(err: MissingDataError): Unit = js.native
    def onError(err: MissingTranslationError): Unit = js.native
    def onError(err: UnsupportedFormatterError): Unit = js.native
    def onError(err: FormatError): Unit = js.native
    @JSName("onError")
    var onError_Original: OnErrorFn = js.native
    
    var timeZone: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait DefaultLocale extends StObject {
    
    var defaultFormats: typingsSlinky.formatjsIntl.typesMod.CustomFormats = js.native
    
    var defaultLocale: String = js.native
    
    var formats: typingsSlinky.formatjsIntl.typesMod.CustomFormats = js.native
    
    var locale: String = js.native
    
    var messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
    
    def onError(err: typingsSlinky.formatjsIntl.errorMod.InvalidConfigError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MessageFormatError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingDataError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingTranslationError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.UnsupportedFormatterError): Unit = js.native
    def onError(err: FormatError): Unit = js.native
    @JSName("onError")
    var onError_Original: typingsSlinky.formatjsIntl.typesMod.OnErrorFn = js.native
    
    var timeZone: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(values: js.Array[String]): String = js.native
    def apply(values: js.Array[String], opts: FormatListOptions): String = js.native
  }
  
  @js.native
  trait FnCallCode extends StObject {
    
    def apply(code: String): js.UndefOr[String] = js.native
    def apply(code: js.Object): js.UndefOr[String] = js.native
    def apply(code: Double): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait FnCallDate extends StObject {
    
    def apply(): String = js.native
    def apply(date: js.Date): String = js.native
    def apply(date: Double): String = js.native
  }
  
  @js.native
  trait FnCallStartDateEndDate extends StObject {
    
    def apply(startDate: js.Date, endDate: js.Date): String = js.native
    def apply(startDate: js.Date, endDate: Double): String = js.native
    def apply(startDate: Double, endDate: js.Date): String = js.native
    def apply(startDate: Double, endDate: Double): String = js.native
  }
  
  @js.native
  trait FnCallValue extends StObject {
    
    def apply(value: js.BigInt): String = js.native
    def apply(value: Double): String = js.native
  }
  
  @js.native
  trait FnCallValuesOpts extends StObject {
    
    def apply(values: js.Array[String]): String = js.native
    def apply(values: js.Array[String], opts: typingsSlinky.formatjsIntl.typesMod.FormatListOptions): String = js.native
  }
  
  @js.native
  trait Formats extends StObject {
    
    var formats: CustomFormats = js.native
    
    var locale: String = js.native
    
    def onError(err: InvalidConfigError): Unit = js.native
    def onError(err: MessageFormatError): Unit = js.native
    def onError(err: MissingDataError): Unit = js.native
    def onError(err: MissingTranslationError): Unit = js.native
    def onError(err: UnsupportedFormatterError): Unit = js.native
    def onError(err: FormatError): Unit = js.native
    @JSName("onError")
    var onError_Original: OnErrorFn = js.native
    
    var timeZone: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait FormatsLocale extends StObject {
    
    var formats: typingsSlinky.formatjsIntl.typesMod.CustomFormats = js.native
    
    var locale: String = js.native
    
    def onError(err: typingsSlinky.formatjsIntl.errorMod.InvalidConfigError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MessageFormatError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingDataError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingTranslationError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.UnsupportedFormatterError): Unit = js.native
    def onError(err: FormatError): Unit = js.native
    @JSName("onError")
    var onError_Original: typingsSlinky.formatjsIntl.typesMod.OnErrorFn = js.native
  }
  
  @js.native
  trait Locale extends StObject {
    
    var locale: String = js.native
    
    def onError(err: InvalidConfigError): Unit = js.native
    def onError(err: MessageFormatError): Unit = js.native
    def onError(err: MissingDataError): Unit = js.native
    def onError(err: MissingTranslationError): Unit = js.native
    def onError(err: UnsupportedFormatterError): Unit = js.native
    def onError(err: FormatError): Unit = js.native
    @JSName("onError")
    var onError_Original: OnErrorFn = js.native
  }
  
  @js.native
  trait LocaleOnError extends StObject {
    
    var locale: String = js.native
    
    def onError(err: typingsSlinky.formatjsIntl.errorMod.InvalidConfigError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MessageFormatError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingDataError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingTranslationError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.UnsupportedFormatterError): Unit = js.native
    def onError(err: FormatError): Unit = js.native
    @JSName("onError")
    var onError_Original: typingsSlinky.formatjsIntl.typesMod.OnErrorFn = js.native
  }
  
  @js.native
  trait LocaleOnErrorTimeZone extends StObject {
    
    var locale: String = js.native
    
    def onError(err: InvalidConfigError): Unit = js.native
    def onError(err: MessageFormatError): Unit = js.native
    def onError(err: MissingDataError): Unit = js.native
    def onError(err: MissingTranslationError): Unit = js.native
    def onError(err: UnsupportedFormatterError): Unit = js.native
    def onError(err: FormatError): Unit = js.native
    @JSName("onError")
    var onError_Original: OnErrorFn = js.native
    
    var timeZone: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait OnError extends StObject {
    
    var formats: CustomFormats = js.native
    
    var locale: String = js.native
    
    def onError(err: InvalidConfigError): Unit = js.native
    def onError(err: MessageFormatError): Unit = js.native
    def onError(err: MissingDataError): Unit = js.native
    def onError(err: MissingTranslationError): Unit = js.native
    def onError(err: UnsupportedFormatterError): Unit = js.native
    def onError(err: FormatError): Unit = js.native
    @JSName("onError")
    var onError_Original: OnErrorFn = js.native
  }
  
  @js.native
  trait OnErrorTimeZone extends StObject {
    
    var locale: String = js.native
    
    def onError(err: typingsSlinky.formatjsIntl.errorMod.InvalidConfigError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MessageFormatError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingDataError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingTranslationError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.UnsupportedFormatterError): Unit = js.native
    def onError(err: FormatError): Unit = js.native
    @JSName("onError")
    var onError_Original: typingsSlinky.formatjsIntl.typesMod.OnErrorFn = js.native
    
    var timeZone: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait TimeZone extends StObject {
    
    var formats: typingsSlinky.formatjsIntl.typesMod.CustomFormats = js.native
    
    var locale: String = js.native
    
    def onError(err: typingsSlinky.formatjsIntl.errorMod.InvalidConfigError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MessageFormatError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingDataError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingTranslationError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.UnsupportedFormatterError): Unit = js.native
    def onError(err: FormatError): Unit = js.native
    @JSName("onError")
    var onError_Original: typingsSlinky.formatjsIntl.typesMod.OnErrorFn = js.native
    
    var timeZone: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait TypeofDateTimeFormat extends StObject {
    
    def apply(): DateTimeFormat = js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: String): DateTimeFormat = js.native
    def apply(locales: String, options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: js.Array[String]): DateTimeFormat = js.native
    def apply(locales: js.Array[String], options: DateTimeFormatOptions): DateTimeFormat = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofDisplayNames extends Instantiable2[/* locales */ String, /* options */ DisplayNamesOptions, DisplayNames] {
    
    def __addLocaleData(data: DisplayNamesLocaleData*): Unit = js.native
    
    var __defaultLocale: js.Any = js.native
    
    var availableLocales: js.Any = js.native
    
    var getDefaultLocale: js.Any = js.native
    
    var localeData: Record[String, js.UndefOr[DisplayNamesData]] = js.native
    
    val polyfilled: /* true */ Boolean = js.native
    
    def supportedLocalesOf(): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.UndefOr[scala.Nothing], options: PickDisplayNamesOptionslo): js.Array[String] = js.native
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PickDisplayNamesOptionslo): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PickDisplayNamesOptionslo): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofIntlListFormat extends Instantiable0[default] {
    
    val __INTERNAL_SLOT_MAP__ : js.Any = js.native
    
    def __addLocaleData(data: ListPatternLocaleData*): Unit = js.native
    
    var __defaultLocale: js.Any = js.native
    
    var availableLocales: js.Any = js.native
    
    var getDefaultLocale: js.Any = js.native
    
    var localeData: Record[String, js.UndefOr[ListPatternFieldsData]] = js.native
    
    var polyfilled: Boolean = js.native
    
    var relevantExtensionKeys: js.Any = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PickIntlListFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PickIntlListFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofIntlMessageFormat extends Instantiable1[/* message */ String, IntlMessageFormat] {
    
    var __parse: js.UndefOr[typingsSlinky.intlMessageformat.anon.FnCall] = js.native
    
    def defaultLocale: String = js.native
    
    var formats: Date = js.native
    
    var memoizedDefaultLocale: js.Any = js.native
  }
  
  @js.native
  trait TypeofIntlRelativeTimeFor
    extends Instantiable0[typingsSlinky.formatjsIntlRelativetimeformat.mod.default] {
    
    def __addLocaleData(data: RelativeTimeLocaleData*): Unit = js.native
    
    var __defaultLocale: js.Any = js.native
    
    var availableLocales: js.Any = js.native
    
    var getDefaultLocale: js.Any = js.native
    
    var localeData: Record[String, LocaleFieldsData] = js.native
    
    var polyfilled: Boolean = js.native
    
    var relevantExtensionKeys: js.Any = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PickIntlRelativeTimeForma): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PickIntlRelativeTimeForma): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofNumberFormat extends StObject {
    
    def apply(): NumberFormat = js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): NumberFormat = js.native
    def apply(locales: String): NumberFormat = js.native
    def apply(locales: String, options: NumberFormatOptions): NumberFormat = js.native
    def apply(locales: js.Array[String]): NumberFormat = js.native
    def apply(locales: js.Array[String], options: NumberFormatOptions): NumberFormat = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: NumberFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: NumberFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofPluralRules extends StObject {
    
    def apply(): PluralRules = js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: String): PluralRules = js.native
    def apply(locales: String, options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: js.Array[String]): PluralRules = js.native
    def apply(locales: js.Array[String], options: PluralRulesOptions): PluralRules = js.native
    
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: PluralRulesOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: PluralRulesOptions): js.Array[String] = js.native
  }
}
