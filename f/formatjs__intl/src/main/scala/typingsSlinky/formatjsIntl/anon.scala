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
import typingsSlinky.formatjsIntl.errorMod.InvalidConfigError
import typingsSlinky.formatjsIntl.errorMod.MessageFormatError
import typingsSlinky.formatjsIntl.errorMod.MissingDataError
import typingsSlinky.formatjsIntl.errorMod.MissingTranslationError
import typingsSlinky.formatjsIntl.errorMod.UnsupportedFormatterError
import typingsSlinky.formatjsIntl.typesMod.CustomFormats
import typingsSlinky.formatjsIntl.typesMod.FormatListOptions
import typingsSlinky.formatjsIntl.typesMod.OnErrorFn
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait Call
    extends Instantiable0[DateTimeFormat]
       with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), DateTimeFormat]
       with Instantiable2[
          js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
          /* options */ DateTimeFormatOptions, 
          DateTimeFormat
        ] {
    
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
  trait DefaultFormats extends js.Object {
    
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
  trait FnCall extends js.Object {
    
    def apply(values: js.Array[String]): String = js.native
    def apply(values: js.Array[String], opts: FormatListOptions): String = js.native
  }
  
  @js.native
  trait FnCallCode extends js.Object {
    
    def apply(code: String): js.UndefOr[String] = js.native
    def apply(code: js.Object): js.UndefOr[String] = js.native
    def apply(code: Double): js.UndefOr[String] = js.native
  }
  
  @js.native
  trait FnCallDate extends js.Object {
    
    def apply(): String = js.native
    def apply(date: Double): String = js.native
    def apply(date: js.Date): String = js.native
  }
  
  @js.native
  trait FnCallStartDateEndDate extends js.Object {
    
    def apply(startDate: Double, endDate: Double): String = js.native
    def apply(startDate: Double, endDate: js.Date): String = js.native
    def apply(startDate: js.Date, endDate: Double): String = js.native
    def apply(startDate: js.Date, endDate: js.Date): String = js.native
  }
  
  @js.native
  trait FnCallValue extends js.Object {
    
    def apply(value: js.BigInt): String = js.native
    def apply(value: Double): String = js.native
  }
  
  @js.native
  trait Formats extends js.Object {
    
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
  trait Instantiable
    extends Instantiable0[PluralRules]
       with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), PluralRules]
       with Instantiable2[
          js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
          /* options */ PluralRulesOptions, 
          PluralRules
        ] {
    
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
  
  @js.native
  trait Locale extends js.Object {
    
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
  trait OnError extends js.Object {
    
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
  trait SupportedLocalesOf
    extends Instantiable0[NumberFormat]
       with Instantiable1[(/* locales */ js.Array[String]) | (/* locales */ String), NumberFormat]
       with Instantiable2[
          js.UndefOr[(/* locales */ js.Array[String]) | (/* locales */ String)], 
          /* options */ NumberFormatOptions, 
          NumberFormat
        ] {
    
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
  trait TimeZone extends js.Object {
    
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
}
