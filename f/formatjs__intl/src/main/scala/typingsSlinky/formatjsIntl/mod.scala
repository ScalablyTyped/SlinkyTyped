package typingsSlinky.formatjsIntl

import typingsSlinky.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormat
import typingsSlinky.formatjsEcma402Abstract.typesPluralRulesMod.LDMLPluralRule
import typingsSlinky.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions
import typingsSlinky.formatjsIntl.anon.Call
import typingsSlinky.formatjsIntl.anon.DefaultFormats
import typingsSlinky.formatjsIntl.anon.Formats
import typingsSlinky.formatjsIntl.anon.Instantiable
import typingsSlinky.formatjsIntl.anon.Locale
import typingsSlinky.formatjsIntl.anon.OnError
import typingsSlinky.formatjsIntl.anon.SupportedLocalesOf
import typingsSlinky.formatjsIntl.anon.TypeofDisplayNames
import typingsSlinky.formatjsIntl.anon.TypeofIntlListFormat
import typingsSlinky.formatjsIntl.anon.TypeofIntlRelativeTimeFor
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl/lib", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createFormatters(): Formatters = js.native
  def createFormatters(cache: IntlCache): Formatters = js.native
  
  def createIntl[T](config: OptionalIntlConfig[T]): IntlShape[T] = js.native
  def createIntl[T](config: OptionalIntlConfig[T], cache: IntlCache): IntlShape[T] = js.native
  
  def createIntlCache(): IntlCache = js.native
  
  def defineMessage[T](msg: T): T = js.native
  
  def defineMessages[K /* <: /* keyof any */ String */, T, U /* <: Record[K, T] */](msgs: U): U = js.native
  
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K]): Pick[T, K] = js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K], defaults: Partial[T]): Pick[T, K] = js.native
  
  def formatDate(
    config: Formats,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Call], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatDate']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = js.native
  
  def formatDateToParts(
    config: Formats,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Call], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatDate']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): js.Array[DateTimeFormatPart] = js.native
  
  def formatDisplayName(
    hasLocaleOnError: Locale,
    getDisplayNames: js.Function1[/* args */ ConstructorParameters[TypeofDisplayNames], DisplayNames],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatDisplayNameOptions): string | undefined>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-displaynames.@formatjs/intl-displaynames.DisplayNames['of']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatDisplayNameOptions): string | undefined>[1] */ js.Any
  ): js.UndefOr[String] = js.native
  
  @JSName("formatList")
  def formatList_1(
    hasLocaleOnError: Locale,
    getListFormat: js.Function1[/* args */ ConstructorParameters[TypeofIntlListFormat], default],
    values: js.Array[String],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<@formatjs/intl.anon.FnCall>[1] */ js.Any
  ): String = js.native
  
  def formatMessage(config: DefaultFormats, state: Formatters): String = js.native
  def formatMessage(
    config: DefaultFormats,
    state: Formatters,
    messageDescriptor: js.UndefOr[scala.Nothing],
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = js.native
  def formatMessage(config: DefaultFormats, state: Formatters, messageDescriptor: MessageDescriptor): String = js.native
  def formatMessage(
    config: DefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = js.native
  
  def formatNumber(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[SupportedLocalesOf], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): String = js.native
  def formatNumber(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[SupportedLocalesOf], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): String = js.native
  
  def formatNumberToParts(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[SupportedLocalesOf], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  def formatNumberToParts(
    config: OnError,
    getNumberFormat: js.Function1[/* args */ ConstructorParameters[SupportedLocalesOf], NumberFormat],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.NumberFormat['format']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatNumberOptions | undefined): string>[1] */ js.Any
  ): js.Array[NumberFormatPart] = js.native
  
  def formatPlural(
    hasLocaleOnError: Locale,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[Instantiable], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any
  ): LDMLPluralRule = js.native
  def formatPlural(
    hasLocaleOnError: Locale,
    getPluralRules: js.Function1[/* args */ ConstructorParameters[Instantiable], PluralRules],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[0] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<std.Intl.PluralRules['select']>[0], opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatPluralOptions | undefined): std.ReturnType<std.Intl.PluralRules['select']>>[1] */ js.Any
  ): LDMLPluralRule = js.native
  
  def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any
  ): String = js.native
  def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: js.UndefOr[scala.Nothing],
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = js.native
  def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any
  ): String = js.native
  def formatRelativeTime(
    config: OnError,
    getRelativeTimeFormat: js.Function1[
      /* args */ ConstructorParameters[TypeofIntlRelativeTimeFor], 
      typingsSlinky.formatjsIntlRelativetimeformat.mod.default
    ],
    value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[0] */ js.Any,
    unit: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[1] */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<(value : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[0], unit : std.Parameters<@formatjs/intl-relativetimeformat.@formatjs/intl-relativetimeformat.default['format']>[1] | undefined, opts : @formatjs/intl.@formatjs/intl/lib/src/types.FormatRelativeTimeOptions | undefined): string>[2] */ js.Any
  ): String = js.native
  
  def formatTime(
    config: Formats,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Call], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatTime']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        String
      ]
    ]
  ): String = js.native
  
  def formatTimeToParts(
    config: Formats,
    getDateTimeFormat: js.Function1[/* args */ ConstructorParameters[Call], DateTimeFormat],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param hasValueOptions because its type Parameters<IntlFormatters['formatTimeToParts']> is not an array type */ hasValueOptions: Parameters[
      js.Function2[
        /* value */ (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<std.Intl.DateTimeFormat['format']>[0] */ js.Any) | String, 
        /* opts */ js.UndefOr[FormatDateOptions], 
        js.Array[DateTimeFormatPart]
      ]
    ]
  ): js.Array[DateTimeFormatPart] = js.native
  
  @JSName("getNamedFormat")
  def getNamedFormat_date(formats: CustomFormats, `type`: date, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSName("getNamedFormat")
  def getNamedFormat_number(formats: CustomFormats, `type`: number, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSName("getNamedFormat")
  def getNamedFormat_relative(formats: CustomFormats, `type`: relative, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSName("getNamedFormat")
  def getNamedFormat_time(formats: CustomFormats, `type`: time, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  
  @js.native
  object DEFAULT_INTL_CONFIG extends js.Object {
    
    var defaultFormats: CustomFormats = js.native
    
    var defaultLocale: String = js.native
    
    var formats: CustomFormats = js.native
    
    var messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
    
    def onError(err: typingsSlinky.formatjsIntl.errorMod.InvalidConfigError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MessageFormatError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingDataError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.MissingTranslationError): Unit = js.native
    def onError(err: typingsSlinky.formatjsIntl.errorMod.UnsupportedFormatterError): Unit = js.native
    def onError(err: FormatError): Unit = js.native
    @JSName("onError")
    var onError_Original: OnErrorFn = js.native
    
    var timeZone: js.UndefOr[String] = js.native
  }
  
  @js.native
  class IntlError[T /* <: IntlErrorCode */] protected ()
    extends typingsSlinky.formatjsIntl.errorMod.IntlError[T] {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: js.Error) = this()
  }
  
  @js.native
  class InvalidConfigError protected ()
    extends typingsSlinky.formatjsIntl.errorMod.InvalidConfigError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @js.native
  class MessageFormatError protected ()
    extends typingsSlinky.formatjsIntl.errorMod.MessageFormatError {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: js.UndefOr[scala.Nothing], exception: js.Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: js.Error) = this()
  }
  
  @js.native
  class MissingDataError protected ()
    extends typingsSlinky.formatjsIntl.errorMod.MissingDataError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @js.native
  class MissingTranslationError protected ()
    extends typingsSlinky.formatjsIntl.errorMod.MissingTranslationError {
    def this(descriptor: MessageDescriptor, locale: String) = this()
  }
  
  @js.native
  class UnsupportedFormatterError protected ()
    extends typingsSlinky.formatjsIntl.errorMod.UnsupportedFormatterError {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
}
