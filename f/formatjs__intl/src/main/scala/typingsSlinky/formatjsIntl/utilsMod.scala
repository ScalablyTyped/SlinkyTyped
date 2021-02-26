package typingsSlinky.formatjsIntl

import typingsSlinky.formatjsEcma402Abstract.typesRelativeTimeMod.IntlRelativeTimeFormatOptions
import typingsSlinky.formatjsIntl.errorMod.InvalidConfigError
import typingsSlinky.formatjsIntl.errorMod.MessageFormatError
import typingsSlinky.formatjsIntl.errorMod.MissingDataError
import typingsSlinky.formatjsIntl.errorMod.MissingTranslationError
import typingsSlinky.formatjsIntl.errorMod.UnsupportedFormatterError
import typingsSlinky.formatjsIntl.formatjsIntlStrings.date
import typingsSlinky.formatjsIntl.formatjsIntlStrings.number
import typingsSlinky.formatjsIntl.formatjsIntlStrings.relative
import typingsSlinky.formatjsIntl.formatjsIntlStrings.time
import typingsSlinky.formatjsIntl.typesMod.CustomFormats
import typingsSlinky.formatjsIntl.typesMod.Formatters
import typingsSlinky.formatjsIntl.typesMod.IntlCache
import typingsSlinky.formatjsIntl.typesMod.OnErrorFn
import typingsSlinky.intlMessageformat.mod.FormatError
import typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  /* Inlined std.Pick<@formatjs/intl.@formatjs/intl/lib/src/types.IntlConfig<any>, 'formats' | 'messages' | 'timeZone' | 'defaultLocale' | 'defaultFormats' | 'onError'> */
  object DEFAULT_INTL_CONFIG {
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.defaultFormats")
    @js.native
    def defaultFormats: CustomFormats = js.native
    @scala.inline
    def defaultFormats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultFormats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    @scala.inline
    def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.formats")
    @js.native
    def formats: CustomFormats = js.native
    @scala.inline
    def formats_=(x: CustomFormats): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formats")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.messages")
    @js.native
    def messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
    @scala.inline
    def messages_=(x: Record[String, js.Array[MessageFormatElement] | String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("messages")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError: OnErrorFn = js.native
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: InvalidConfigError): Unit = js.native
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: MessageFormatError): Unit = js.native
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: MissingDataError): Unit = js.native
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: MissingTranslationError): Unit = js.native
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: UnsupportedFormatterError): Unit = js.native
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.onError")
    @js.native
    def onError(err: FormatError): Unit = js.native
    @scala.inline
    def onError_=(x: OnErrorFn): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onError")(x.asInstanceOf[js.Any])
    
    @JSImport("@formatjs/intl/lib/src/utils", "DEFAULT_INTL_CONFIG.timeZone")
    @js.native
    def timeZone: js.UndefOr[String] = js.native
    @scala.inline
    def timeZone_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@formatjs/intl/lib/src/utils", "createFormatters")
  @js.native
  def createFormatters(): Formatters = js.native
  @JSImport("@formatjs/intl/lib/src/utils", "createFormatters")
  @js.native
  def createFormatters(cache: IntlCache): Formatters = js.native
  
  @JSImport("@formatjs/intl/lib/src/utils", "createIntlCache")
  @js.native
  def createIntlCache(): IntlCache = js.native
  
  @JSImport("@formatjs/intl/lib/src/utils", "filterProps")
  @js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K]): Pick[T, K] = js.native
  @JSImport("@formatjs/intl/lib/src/utils", "filterProps")
  @js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K], defaults: Partial[T]): Pick[T, K] = js.native
  
  @JSImport("@formatjs/intl/lib/src/utils", "getNamedFormat")
  @js.native
  def getNamedFormat_date(formats: CustomFormats, `type`: date, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSImport("@formatjs/intl/lib/src/utils", "getNamedFormat")
  @js.native
  def getNamedFormat_number(formats: CustomFormats, `type`: number, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSImport("@formatjs/intl/lib/src/utils", "getNamedFormat")
  @js.native
  def getNamedFormat_relative(formats: CustomFormats, `type`: relative, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  @JSImport("@formatjs/intl/lib/src/utils", "getNamedFormat")
  @js.native
  def getNamedFormat_time(formats: CustomFormats, `type`: time, name: String, onError: OnErrorFn): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
}
