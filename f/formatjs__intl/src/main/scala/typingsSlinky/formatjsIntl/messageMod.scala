package typingsSlinky.formatjsIntl

import typingsSlinky.formatjsIntl.anon.DefaultFormats
import typingsSlinky.formatjsIntl.typesMod.Formatters
import typingsSlinky.formatjsIntl.typesMod.MessageDescriptor
import typingsSlinky.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typingsSlinky.intlMessageformat.srcFormattersMod.PrimitiveType
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl/lib/src/message", JSImport.Namespace)
@js.native
object messageMod extends js.Object {
  
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
}
