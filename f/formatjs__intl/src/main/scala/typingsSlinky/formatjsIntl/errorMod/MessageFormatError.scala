package typingsSlinky.formatjsIntl.errorMod

import typingsSlinky.formatjsIntl.formatjsIntlStrings.FORMAT_ERROR
import typingsSlinky.formatjsIntl.typesMod.MessageDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/intl/lib/src/error", "MessageFormatError")
@js.native
class MessageFormatError protected () extends IntlError[FORMAT_ERROR] {
  def this(message: String, locale: String) = this()
  def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
  def this(message: String, locale: String, descriptor: js.UndefOr[scala.Nothing], exception: js.Error) = this()
  def this(message: String, locale: String, descriptor: MessageDescriptor, exception: js.Error) = this()
  
  val descriptor: js.UndefOr[MessageDescriptor] = js.native
}
