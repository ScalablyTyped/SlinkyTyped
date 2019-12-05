package typingsSlinky.reactDashIntl

import slinky.core.TagMod
import typingsSlinky.intlDashMessageformat.intlDashMessageformatMod.PrimitiveType
import typingsSlinky.reactDashIntl.libTypesMod.Formatters
import typingsSlinky.reactDashIntl.libTypesMod.IntlConfig
import typingsSlinky.reactDashIntl.libTypesMod.MessageDescriptor
import typingsSlinky.reactDashIntl.reactDashIntlStrings.defaultFormats
import typingsSlinky.reactDashIntl.reactDashIntlStrings.defaultLocale
import typingsSlinky.reactDashIntl.reactDashIntlStrings.formats
import typingsSlinky.reactDashIntl.reactDashIntlStrings.locale
import typingsSlinky.reactDashIntl.reactDashIntlStrings.messages
import typingsSlinky.reactDashIntl.reactDashIntlStrings.onError
import typingsSlinky.std.Pick
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/message", JSImport.Namespace)
@js.native
object libFormattersMessageMod extends js.Object {
  def formatHTMLMessage(
    config: Pick[IntlConfig, locale | formats | messages | defaultLocale | defaultFormats | onError],
    state: Formatters
  ): TagMod[Any] = js.native
  def formatHTMLMessage(
    config: Pick[IntlConfig, locale | formats | messages | defaultLocale | defaultFormats | onError],
    state: Formatters,
    messageDescriptor: MessageDescriptor
  ): TagMod[Any] = js.native
  def formatHTMLMessage(
    config: Pick[IntlConfig, locale | formats | messages | defaultLocale | defaultFormats | onError],
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    rawValues: Record[String, PrimitiveType]
  ): TagMod[Any] = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: Pick[IntlConfig, locale | formats | messages | defaultLocale | defaultFormats | onError],
    state: Formatters
  ): String = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: Pick[IntlConfig, locale | formats | messages | defaultLocale | defaultFormats | onError],
    state: Formatters,
    messageDescriptor: MessageDescriptor
  ): String = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: Pick[IntlConfig, locale | formats | messages | defaultLocale | defaultFormats | onError],
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType]
  ): String = js.native
}

