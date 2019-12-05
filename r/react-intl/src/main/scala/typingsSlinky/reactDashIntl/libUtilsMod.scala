package typingsSlinky.reactDashIntl

import typingsSlinky.atFormatjsIntlDashRelativetimeformat.atFormatjsIntlDashRelativetimeformatMod.IntlRelativeTimeFormatOptions
import typingsSlinky.reactDashIntl.libTypesMod.CustomFormats
import typingsSlinky.reactDashIntl.libTypesMod.Formatters
import typingsSlinky.reactDashIntl.libTypesMod.IntlCache
import typingsSlinky.reactDashIntl.libTypesMod.IntlConfig
import typingsSlinky.reactDashIntl.reactDashIntlStrings.defaultFormats
import typingsSlinky.reactDashIntl.reactDashIntlStrings.defaultLocale
import typingsSlinky.reactDashIntl.reactDashIntlStrings.formats
import typingsSlinky.reactDashIntl.reactDashIntlStrings.messages
import typingsSlinky.reactDashIntl.reactDashIntlStrings.onError
import typingsSlinky.reactDashIntl.reactDashIntlStrings.relative
import typingsSlinky.reactDashIntl.reactDashIntlStrings.textComponent
import typingsSlinky.reactDashIntl.reactDashIntlStrings.timeZone
import typingsSlinky.std.Intl.DateTimeFormatOptions
import typingsSlinky.std.Intl.NumberFormatOptions
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  val DEFAULT_INTL_CONFIG: Pick[
    IntlConfig, 
    formats | messages | timeZone | textComponent | defaultLocale | defaultFormats | onError
  ] = js.native
  def createError(message: String): String = js.native
  def createError(message: String, exception: js.Error): String = js.native
  def createFormatters(): Formatters = js.native
  def createFormatters(cache: IntlCache): Formatters = js.native
  def createIntlCache(): IntlCache = js.native
  def defaultErrorHandler(error: String): Unit = js.native
  def escape(str: String): String = js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K]): Pick[T, K] = js.native
  def filterProps[T /* <: Record[String, _] */, K /* <: String */](props: T, whitelist: js.Array[K], defaults: Partial[T]): Pick[T, K] = js.native
  @JSName("getNamedFormat")
  def getNamedFormat_relative(
    formats: CustomFormats,
    `type`: relative,
    name: String,
    onError: js.Function1[/* err */ String, Unit]
  ): js.UndefOr[NumberFormatOptions | DateTimeFormatOptions | IntlRelativeTimeFormatOptions] = js.native
  def invariantIntlContext(): Unit = js.native
  def invariantIntlContext(intl: js.Any): Unit = js.native
}

