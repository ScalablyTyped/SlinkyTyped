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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl/lib/src/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  def createFormatters(): Formatters = js.native
  def createFormatters(cache: IntlCache): Formatters = js.native
  
  def createIntlCache(): IntlCache = js.native
  
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K]): Pick[T, K] = js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K], defaults: Partial[T]): Pick[T, K] = js.native
  
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
}
