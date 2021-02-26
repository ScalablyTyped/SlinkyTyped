package typingsSlinky.formatjsIntl

import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typingsSlinky.formatjsEcma402Abstract.typesPluralRulesMod.LDMLPluralRule
import typingsSlinky.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions
import typingsSlinky.formatjsIntl.anon.DefaultLocale
import typingsSlinky.formatjsIntl.anon.FormatsLocale
import typingsSlinky.formatjsIntl.anon.LocaleOnError
import typingsSlinky.formatjsIntl.anon.TimeZone
import typingsSlinky.formatjsIntl.anon.TypeofDateTimeFormat
import typingsSlinky.formatjsIntl.anon.TypeofDisplayNames
import typingsSlinky.formatjsIntl.anon.TypeofIntlListFormat
import typingsSlinky.formatjsIntl.anon.TypeofIntlRelativeTimeFor
import typingsSlinky.formatjsIntl.anon.TypeofNumberFormat
import typingsSlinky.formatjsIntl.anon.TypeofPluralRules
import typingsSlinky.formatjsIntl.errorMod.IntlErrorCode
import typingsSlinky.formatjsIntl.formatjsIntlStrings.date
import typingsSlinky.formatjsIntl.formatjsIntlStrings.number
import typingsSlinky.formatjsIntl.formatjsIntlStrings.relative
import typingsSlinky.formatjsIntl.formatjsIntlStrings.time
import typingsSlinky.formatjsIntl.typesMod.CustomFormats
import typingsSlinky.formatjsIntl.typesMod.FormatDateOptions
import typingsSlinky.formatjsIntl.typesMod.Formatters
import typingsSlinky.formatjsIntl.typesMod.IntlCache
import typingsSlinky.formatjsIntl.typesMod.IntlShape
import typingsSlinky.formatjsIntl.typesMod.MessageDescriptor
import typingsSlinky.formatjsIntl.typesMod.OnErrorFn
import typingsSlinky.formatjsIntl.typesMod.OptionalIntlConfig
import typingsSlinky.formatjsIntlDisplaynames.mod.DisplayNames
import typingsSlinky.formatjsIntlListformat.mod.default
import typingsSlinky.intlMessageformat.mod.FormatError
import typingsSlinky.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typingsSlinky.intlMessageformat.srcFormattersMod.PrimitiveType
import typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typingsSlinky.std.ConstructorParameters
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.DateTimeFormatPart
import typingsSlinky.std.Intl.NumberFormat
import typingsSlinky.std.Intl.NumberFormatOptions
import typingsSlinky.std.Intl.NumberFormatPart
import typingsSlinky.std.Intl.PluralRules
import typingsSlinky.std.Parameters
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  /* Inlined std.Pick<@formatjs/intl.@formatjs/intl/lib/src/types.IntlConfig<any>, 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
  object DEFAULT_INTL_CONFIG {
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.defaultFormats")
    @js.native
    def defaultFormats: CustomFormats = js.native
    @scala.inline
    def defaultFormats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    @scala.inline
    def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.formats")
    @js.native
    def formats: CustomFormats = js.native
    @scala.inline
    def formats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.messages")
    @js.native
    def messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
    @scala.inline
    def messages_=(x: Record[String, js.Array[MessageFormatElement] | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError: OnErrorFn = js.native
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.InvalidConfigError): Unit = js.native
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MessageFormatError): Unit = js.native
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingDataError): Unit = js.native
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingTranslationError): Unit = js.native
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.UnsupportedFormatterError): Unit = js.native
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: FormatError): Unit = js.native
    @scala.inline
    def onError_=(x: OnErrorFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib", "DEFAULT_INTL_CONFIG.timeZone")
    @js.native
    def timeZone: js.UndefOr[String] = js.native
    @scala.inline
    def timeZone_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@formatjs/intl/lib", "IntlError")
  @js.native
  class IntlError[T /* <: IntlErrorCode */] protected ()
    extends typingsSlinky.formatjsIntl.errorMod.IntlError[T] {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: js.Error) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "InvalidConfigError")
  @js.native
  class InvalidConfigError protected ()
    extends typingsSlinky.formatjsIntl.errorMod.InvalidConfigError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "MessageFormatError")
  @js.native
  class MessageFormatError protected ()
    extends typingsSlinky.formatjsIntl.errorMod.MessageFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: js.UndefOr[scala.Nothing], exception: js.Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: js.Error) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "MissingDataError")
  @js.native
  class MissingDataError protected ()
    extends typingsSlinky.formatjsIntl.errorMod.MissingDataError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "MissingTranslationError")
  @js.native
  class MissingTranslationError protected ()
    extends typingsSlinky.formatjsIntl.errorMod.MissingTranslationError {
    def this(descriptor: MessageDescriptor, locale: String) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "UnsupportedFormatterError")
  @js.native
  class UnsupportedFormatterError protected ()
    extends typingsSlinky.formatjsIntl.errorMod.UnsupportedFormatterError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("@formatjs/intl/lib", "createFormatters")
  @js.native
  def createFormatters(): Formatters = js.native
  @JSImport("@formatjs/intl/lib", "createFormatters")
  @js.native
  def createFormatters(cache: IntlCache): Formatters = js.native
  
  @JSImport("@formatjs/intl/lib", "createIntl")
  @js.native
  def createIntl[T](config: OptionalIntlConfig[T]): IntlShape[T] = js.native
  @JSImport("@formatjs/intl/lib", "createIntl")
  @js.native
  def createIntl[T](config: OptionalIntlConfig[T], cache: IntlCache): IntlShape[T] = js.native
  
  @JSImport("@formatjs/intl/lib", "createIntlCache")
  @js.native
  def createIntlCache(): IntlCache = js.native
  
  @JSImport("@formatjs/intl/lib", "defineMessage")
  @js.native
  def defineMessage[T](msg: T): T = js.native
  
  @JSImport("@formatjs/intl/lib", "defineMessages")
  @js.native
  def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = js.native
  
  @JSImport("@formatjs/intl/lib", "filterProps")
  @js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K]): Pick[T, K] = js.native
  @JSImport("@formatjs/intl/lib", "filterProps")
  @js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K], defaults: Partial[T]): Pick[T, K] = js.native
  
  @JSImport("@formatjs/intl/lib", "formatDate")
  @js.native
  def formatDate(
    config: TimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatDate']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = js.native
  
  @JSImport("@formatjs/intl/lib", "formatDateToParts")
  @js.native
  def formatDateToParts(
    config: TimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatDate']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): js.Array[DateTimeFormatPart] = js.native
  
  @JSImport("@formatjs/intl/lib", "formatDisplayName")
  @js.native
  def formatDisplayName(
    hasLocaleOnError: LocaleOnError,
    getDisplayNames: js.Function1[/* args */ ConstructorParameters[TypeofDisplayNames], DisplayNames],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatDisplayNameOptions): string | undefined>[1] */ js.Any
  ): js.UndefOr[String] = js.native
  
  @JSImport("@formatjs/intl/lib", "formatList")
  @js.native
  def formatList_1(
    hasLocaleOnError: LocaleOnError,
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCallValuesOpts>[1] */ js.Any
  ): String = js.native
  
  @JSImport("@formatjs/intl/lib", "formatMessage")
  @js.native
  def formatMessage(config: DefaultLocale, state: Formatters): String = js.native
  @JSImport("@formatjs/intl/lib", "formatMessage")
  @js.native
  def formatMessage(
    config: DefaultLocale,
    state: Formatters,
    messageDescriptor: js.UndefOr[scala.Nothing],
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = js.native
  @JSImport("@formatjs/intl/lib", "formatMessage")
  @js.native
  def formatMessage(config: DefaultLocale, state: Formatters, messageDescriptor: MessageDescriptor): String = js.native
  @JSImport("@formatjs/intl/lib", "formatMessage")
  @js.native
  def formatMessage(
    config: DefaultLocale,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = js.native
  
  @JSImport("@formatjs/intl/lib", "formatNumber")
  @js.native
  def formatNumber(
    config: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): String = js.native
  @JSImport("@formatjs/intl/lib", "formatNumber")
  @js.native
  def formatNumber(
    config: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): String = js.native
  
  @JSImport("@formatjs/intl/lib", "formatNumberToParts")
  @js.native
  def formatNumberToParts(
    config: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  @JSImport("@formatjs/intl/lib", "formatNumberToParts")
  @js.native
  def formatNumberToParts(
    config: FormatsLocale,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  
  @JSImport("@formatjs/intl/lib", "formatPlural")
  @js.native
  def formatPlural(
    hasLocaleOnError: LocaleOnError,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[TypeofPluralRules], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any
  ): LDMLPluralRule = js.native
  @JSImport("@formatjs/intl/lib", "formatPlural")
  @js.native
  def formatPlural(
    hasLocaleOnError: LocaleOnError,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[TypeofPluralRules], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[1] */ js.Any
  ): LDMLPluralRule = js.native
  
  @JSImport("@formatjs/intl/lib", "formatRelativeTime")
  @js.native
  def formatRelativeTime(
    config: FormatsLocale,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any
  ): String = js.native
  @JSImport("@formatjs/intl/lib", "formatRelativeTime")
  @js.native
  def formatRelativeTime(
    config: FormatsLocale,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: js.UndefOr[scala.Nothing],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = js.native
  @JSImport("@formatjs/intl/lib", "formatRelativeTime")
  @js.native
  def formatRelativeTime(
    config: FormatsLocale,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any
  ): String = js.native
  @JSImport("@formatjs/intl/lib", "formatRelativeTime")
  @js.native
  def formatRelativeTime(
    config: FormatsLocale,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = js.native
  
  @JSImport("@formatjs/intl/lib", "formatTime")
  @js.native
  def formatTime(
    config: TimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatTime']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = js.native
  
  @JSImport("@formatjs/intl/lib", "formatTimeToParts")
  @js.native
  def formatTimeToParts(
    config: TimeZone,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatTimeToParts']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        js.Array[DateTimeFormatPart]
      ]
    ]
  ): js.Array[DateTimeFormatPart] = js.native
  
  @JSImport("@formatjs/intl/lib", "getNamedFormat")
  @js.native
  def getNamedFormat_date(formats: CustomFormats, `type`: date, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSImport("@formatjs/intl/lib", "getNamedFormat")
  @js.native
  def getNamedFormat_number(formats: CustomFormats, `type`: number, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSImport("@formatjs/intl/lib", "getNamedFormat")
  @js.native
  def getNamedFormat_relative(formats: CustomFormats, `type`: relative, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSImport("@formatjs/intl/lib", "getNamedFormat")
  @js.native
  def getNamedFormat_time(formats: CustomFormats, `type`: time, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
}
