package typingsSlinky.formatjsIntl

import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typingsSlinky.formatjsEcma402Abstract.typesPluralRulesMod.LDMLPluralRule
import typingsSlinky.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions
import typingsSlinky.formatjsIntl.anon.DefaultFormats
import typingsSlinky.formatjsIntl.anon.Formats
import typingsSlinky.formatjsIntl.anon.Locale
import typingsSlinky.formatjsIntl.anon.OnError
import typingsSlinky.formatjsIntl.anon.TypeofDateTimeFormat
import typingsSlinky.formatjsIntl.anon.TypeofDisplayNames
import typingsSlinky.formatjsIntl.anon.TypeofIntlListFormat
import typingsSlinky.formatjsIntl.anon.TypeofIntlRelativeTimeFor
import typingsSlinky.formatjsIntl.anon.TypeofNumberFormat
import typingsSlinky.formatjsIntl.anon.TypeofPluralRules
import typingsSlinky.formatjsIntl.formatjsIntlStrings.date
import typingsSlinky.formatjsIntl.formatjsIntlStrings.number
import typingsSlinky.formatjsIntl.formatjsIntlStrings.relative
import typingsSlinky.formatjsIntl.formatjsIntlStrings.time
import typingsSlinky.formatjsIntl.srcErrorMod.IntlErrorCode
import typingsSlinky.formatjsIntl.srcTypesMod.CustomFormats
import typingsSlinky.formatjsIntl.srcTypesMod.FormatDateOptions
import typingsSlinky.formatjsIntl.srcTypesMod.Formatters
import typingsSlinky.formatjsIntl.srcTypesMod.IntlCache
import typingsSlinky.formatjsIntl.srcTypesMod.IntlShape
import typingsSlinky.formatjsIntl.srcTypesMod.MessageDescriptor
import typingsSlinky.formatjsIntl.srcTypesMod.OnErrorFn
import typingsSlinky.formatjsIntl.srcTypesMod.OptionalIntlConfig
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

object mod {
  
  /* Inlined std.Pick<@formatjs/intl.@formatjs/intl/src/types.IntlConfig<any>, 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
  object DEFAULT_INTL_CONFIG {
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.defaultFormats")
    @js.native
    def defaultFormats: CustomFormats = js.native
    @scala.inline
    def defaultFormats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    @scala.inline
    def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.formats")
    @js.native
    def formats: CustomFormats = js.native
    @scala.inline
    def formats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.messages")
    @js.native
    def messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
    @scala.inline
    def messages_=(x: Record[String, js.Array[MessageFormatElement] | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError: OnErrorFn = js.native
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: typingsSlinky.formatjsIntl.srcErrorMod.InvalidConfigError): Unit = js.native
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: typingsSlinky.formatjsIntl.srcErrorMod.MessageFormatError): Unit = js.native
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: typingsSlinky.formatjsIntl.srcErrorMod.MissingDataError): Unit = js.native
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: typingsSlinky.formatjsIntl.srcErrorMod.MissingTranslationError): Unit = js.native
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: typingsSlinky.formatjsIntl.srcErrorMod.UnsupportedFormatterError): Unit = js.native
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: FormatError): Unit = js.native
    @scala.inline
    def onError_=(x: OnErrorFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl", "DEFAULT_INTL_CONFIG.timeZone")
    @js.native
    def timeZone: js.UndefOr[String] = js.native
    @scala.inline
    def timeZone_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@formatjs/intl", "IntlError")
  @js.native
  class IntlError[T /* <: IntlErrorCode */] protected ()
    extends typingsSlinky.formatjsIntl.srcErrorMod.IntlError[T] {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: js.Error) = this()
  }
  
  @JSImport("@formatjs/intl", "InvalidConfigError")
  @js.native
  class InvalidConfigError protected ()
    extends typingsSlinky.formatjsIntl.srcErrorMod.InvalidConfigError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("@formatjs/intl", "MessageFormatError")
  @js.native
  class MessageFormatError protected ()
    extends typingsSlinky.formatjsIntl.srcErrorMod.MessageFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: js.UndefOr[scala.Nothing], exception: js.Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: js.Error) = this()
  }
  
  @JSImport("@formatjs/intl", "MissingDataError")
  @js.native
  class MissingDataError protected ()
    extends typingsSlinky.formatjsIntl.srcErrorMod.MissingDataError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("@formatjs/intl", "MissingTranslationError")
  @js.native
  class MissingTranslationError protected ()
    extends typingsSlinky.formatjsIntl.srcErrorMod.MissingTranslationError {
    def this(descriptor: MessageDescriptor, locale: String) = this()
  }
  
  @JSImport("@formatjs/intl", "UnsupportedFormatterError")
  @js.native
  class UnsupportedFormatterError protected ()
    extends typingsSlinky.formatjsIntl.srcErrorMod.UnsupportedFormatterError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("@formatjs/intl", "createFormatters")
  @js.native
  def createFormatters(): Formatters = js.native
  @JSImport("@formatjs/intl", "createFormatters")
  @js.native
  def createFormatters(cache: IntlCache): Formatters = js.native
  
  @JSImport("@formatjs/intl", "createIntl")
  @js.native
  def createIntl[T](config: OptionalIntlConfig[T]): IntlShape[T] = js.native
  @JSImport("@formatjs/intl", "createIntl")
  @js.native
  def createIntl[T](config: OptionalIntlConfig[T], cache: IntlCache): IntlShape[T] = js.native
  
  @JSImport("@formatjs/intl", "createIntlCache")
  @js.native
  def createIntlCache(): IntlCache = js.native
  
  @JSImport("@formatjs/intl", "defineMessage")
  @js.native
  def defineMessage[T](msg: T): T = js.native
  
  @JSImport("@formatjs/intl", "defineMessages")
  @js.native
  def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = js.native
  
  @JSImport("@formatjs/intl", "filterProps")
  @js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K]): Pick[T, K] = js.native
  @JSImport("@formatjs/intl", "filterProps")
  @js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K], defaults: Partial[T]): Pick[T, K] = js.native
  
  @JSImport("@formatjs/intl", "formatDate")
  @js.native
  def formatDate(
    config: Formats,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatDate']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = js.native
  
  @JSImport("@formatjs/intl", "formatDateToParts")
  @js.native
  def formatDateToParts(
    config: Formats,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatDate']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): js.Array[DateTimeFormatPart] = js.native
  
  @JSImport("@formatjs/intl", "formatDisplayName")
  @js.native
  def formatDisplayName(
    hasLocaleOnError: Locale,
    getDisplayNames: js.Function1[/* args */ ConstructorParameters[TypeofDisplayNames], DisplayNames],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatDisplayNameOptions): string | undefined>[1] */ js.Any
  ): js.UndefOr[String] = js.native
  
  @JSImport("@formatjs/intl", "formatList")
  @js.native
  def formatList_1(
    hasLocaleOnError: Locale,
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCall>[1] */ js.Any
  ): String = js.native
  
  @JSImport("@formatjs/intl", "formatMessage")
  @js.native
  def formatMessage(config: DefaultFormats, state: Formatters): String = js.native
  @JSImport("@formatjs/intl", "formatMessage")
  @js.native
  def formatMessage(
    config: DefaultFormats,
    state: Formatters,
    messageDescriptor: js.UndefOr[scala.Nothing],
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = js.native
  @JSImport("@formatjs/intl", "formatMessage")
  @js.native
  def formatMessage(config: DefaultFormats, state: Formatters, messageDescriptor: MessageDescriptor): String = js.native
  @JSImport("@formatjs/intl", "formatMessage")
  @js.native
  def formatMessage(
    config: DefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = js.native
  
  @JSImport("@formatjs/intl", "formatNumber")
  @js.native
  def formatNumber(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): String = js.native
  @JSImport("@formatjs/intl", "formatNumber")
  @js.native
  def formatNumber(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): String = js.native
  
  @JSImport("@formatjs/intl", "formatNumberToParts")
  @js.native
  def formatNumberToParts(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  @JSImport("@formatjs/intl", "formatNumberToParts")
  @js.native
  def formatNumberToParts(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[TypeofNumberFormat], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  
  @JSImport("@formatjs/intl", "formatPlural")
  @js.native
  def formatPlural(
    hasLocaleOnError: Locale,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[TypeofPluralRules], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any
  ): LDMLPluralRule = js.native
  @JSImport("@formatjs/intl", "formatPlural")
  @js.native
  def formatPlural(
    hasLocaleOnError: Locale,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[TypeofPluralRules], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[1] */ js.Any
  ): LDMLPluralRule = js.native
  
  @JSImport("@formatjs/intl", "formatRelativeTime")
  @js.native
  def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any
  ): String = js.native
  @JSImport("@formatjs/intl", "formatRelativeTime")
  @js.native
  def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: js.UndefOr[scala.Nothing],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = js.native
  @JSImport("@formatjs/intl", "formatRelativeTime")
  @js.native
  def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any
  ): String = js.native
  @JSImport("@formatjs/intl", "formatRelativeTime")
  @js.native
  def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = js.native
  
  @JSImport("@formatjs/intl", "formatTime")
  @js.native
  def formatTime(
    config: Formats,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatTime']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = js.native
  
  @JSImport("@formatjs/intl", "formatTimeToParts")
  @js.native
  def formatTimeToParts(
    config: Formats,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[TypeofDateTimeFormat], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatTimeToParts']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        js.Array[DateTimeFormatPart]
      ]
    ]
  ): js.Array[DateTimeFormatPart] = js.native
  
  @JSImport("@formatjs/intl", "getNamedFormat")
  @js.native
  def getNamedFormat_date(formats: CustomFormats, `type`: date, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSImport("@formatjs/intl", "getNamedFormat")
  @js.native
  def getNamedFormat_number(formats: CustomFormats, `type`: number, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSImport("@formatjs/intl", "getNamedFormat")
  @js.native
  def getNamedFormat_relative(formats: CustomFormats, `type`: relative, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSImport("@formatjs/intl", "getNamedFormat")
  @js.native
  def getNamedFormat_time(formats: CustomFormats, `type`: time, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
}
