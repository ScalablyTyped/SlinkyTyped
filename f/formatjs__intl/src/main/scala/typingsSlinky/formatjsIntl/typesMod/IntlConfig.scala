package typingsSlinky.formatjsIntl.typesMod

import typingsSlinky.formatjsIntl.errorMod.InvalidConfigError
import typingsSlinky.formatjsIntl.errorMod.MessageFormatError
import typingsSlinky.formatjsIntl.errorMod.MissingDataError
import typingsSlinky.formatjsIntl.errorMod.MissingTranslationError
import typingsSlinky.formatjsIntl.errorMod.UnsupportedFormatterError
import typingsSlinky.intlMessageformat.mod.FormatError
import typingsSlinky.intlMessageformat.srcFormattersMod.FormatXMLElementFn
import typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntlConfig[T] extends js.Object {
  
  var defaultFormats: CustomFormats = js.native
  
  var defaultLocale: String = js.native
  
  var defaultRichTextElements: js.UndefOr[Record[String, FormatXMLElementFn[T, String | T | (js.Array[String | T])]]] = js.native
  
  var formats: CustomFormats = js.native
  
  var locale: String = js.native
  
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
