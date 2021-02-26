package typingsSlinky.formatjsIntl

import typingsSlinky.formatjsIntl.anon.DefaultFormats
import typingsSlinky.formatjsIntl.srcTypesMod.Formatters
import typingsSlinky.formatjsIntl.srcTypesMod.MessageDescriptor
import typingsSlinky.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typingsSlinky.intlMessageformat.srcFormattersMod.PrimitiveType
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMessageMod {
  
  @JSImport("@formatjs/intl/src/message", "formatMessage")
  @js.native
  def formatMessage(config: DefaultFormats, state: Formatters): String = js.native
  @JSImport("@formatjs/intl/src/message", "formatMessage")
  @js.native
  def formatMessage(
    config: DefaultFormats,
    state: Formatters,
    messageDescriptor: js.UndefOr[scala.Nothing],
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = js.native
  @JSImport("@formatjs/intl/src/message", "formatMessage")
  @js.native
  def formatMessage(config: DefaultFormats, state: Formatters, messageDescriptor: MessageDescriptor): String = js.native
  @JSImport("@formatjs/intl/src/message", "formatMessage")
  @js.native
  def formatMessage(
    config: DefaultFormats,
    state: Formatters,
    messageDescriptor: MessageDescriptor,
    values: Record[String, PrimitiveType | (FormatXMLElementFn[String, String])]
  ): String = js.native
}
