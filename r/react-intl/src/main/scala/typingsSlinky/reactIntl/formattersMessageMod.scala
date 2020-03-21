package typingsSlinky.reactIntl

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.intlMessageformat.mod.PrimitiveType
import typingsSlinky.reactIntl.typesMod.Formatters
import typingsSlinky.reactIntl.typesMod.MessageDescriptor
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-intl/lib/formatters/message", JSImport.Namespace)
@js.native
object formattersMessageMod extends js.Object {
  def formatHTMLMessage(config: PickIntlConfiglocaleformaDefaultFormats, state: Formatters): TagMod[Any] = js.native
  def formatHTMLMessage(
    config: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor
  ): TagMod[Any] = js.native
  def formatHTMLMessage(
    config: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    rawValues: Record[String, PrimitiveType]
  ): TagMod[Any] = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters
  ): String = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor
  ): String = js.native
  def formatMessage(
    hasLocaleFormatsMessagesDefaultLocaleDefaultFormatsOnError: PickIntlConfiglocaleformaDefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType]
  ): String = js.native
  def prepareIntlMessageFormatHtmlOutput(chunks: js.Array[String | js.Object]): ReactElement = js.native
}

