package typingsSlinky.formatjsIntl

import typingsSlinky.formatjsIntl.anon.DefaultLocale
import typingsSlinky.formatjsIntl.typesMod.Formatters
import typingsSlinky.formatjsIntl.typesMod.MessageDescriptor
import typingsSlinky.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typingsSlinky.intlMessageformat.srcFormattersMod.PrimitiveType
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  @JSImport("@formatjs/intl/lib/src/message", "formatMessage")
  @js.native
  def formatMessage(config: DefaultLocale, state: Formatters): String = js.native
  @JSImport("@formatjs/intl/lib/src/message", "formatMessage")
  @js.native
  def formatMessage(
    config: DefaultLocale,
    state: Formatters,
    messageDescriptor: js.UndefOr[scala.Nothing],
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = js.native
  @JSImport("@formatjs/intl/lib/src/message", "formatMessage")
  @js.native
  def formatMessage(config: DefaultLocale, state: Formatters, messageDescriptor: MessageDescriptor): String = js.native
  @JSImport("@formatjs/intl/lib/src/message", "formatMessage")
  @js.native
  def formatMessage(
    config: DefaultLocale,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = js.native
}
