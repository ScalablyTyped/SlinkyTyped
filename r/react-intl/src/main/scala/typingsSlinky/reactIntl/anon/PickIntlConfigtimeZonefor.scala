package typingsSlinky.reactIntl.anon

import typingsSlinky.formatjsIntl.srcErrorMod.InvalidConfigError
import typingsSlinky.formatjsIntl.srcErrorMod.MessageFormatError
import typingsSlinky.formatjsIntl.srcErrorMod.MissingDataError
import typingsSlinky.formatjsIntl.srcErrorMod.MissingTranslationError
import typingsSlinky.formatjsIntl.srcErrorMod.UnsupportedFormatterError
import typingsSlinky.formatjsIntl.srcTypesMod.CustomFormats
import typingsSlinky.formatjsIntl.srcTypesMod.OnErrorFn
import typingsSlinky.intlMessageformat.mod.FormatError
import typingsSlinky.intlMessageformatParser.srcTypesMod.MessageFormatElement
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<react-intl.react-intl/src/types.IntlConfig, 'timeZone' | 'formats' | 'messages' | 'defaultLocale' | 'defaultFormats' | 'onError' | 'textComponent'> */
@js.native
trait PickIntlConfigtimeZonefor extends StObject {
  
  var defaultFormats: CustomFormats = js.native
  
  var defaultLocale: String = js.native
  
  var formats: CustomFormats = js.native
  
  var messages: Record[String, js.Array[MessageFormatElement] | String] = js.native
  
  var onError: OnErrorFn = js.native
  
  var textComponent: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
  ] = js.native
  
  var timeZone: js.UndefOr[String] = js.native
}
object PickIntlConfigtimeZonefor {
  
  @scala.inline
  def apply(
    defaultFormats: CustomFormats,
    defaultLocale: String,
    formats: CustomFormats,
    messages: Record[String, js.Array[MessageFormatElement] | String],
    onError: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
  ): PickIntlConfigtimeZonefor = {
    val __obj = js.Dynamic.literal(defaultFormats = defaultFormats.asInstanceOf[js.Any], defaultLocale = defaultLocale.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError))
    __obj.asInstanceOf[PickIntlConfigtimeZonefor]
  }
  
  @scala.inline
  implicit class PickIntlConfigtimeZoneforMutableBuilder[Self <: PickIntlConfigtimeZonefor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultFormats(value: CustomFormats): Self = StObject.set(x, "defaultFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLocale(value: String): Self = StObject.set(x, "defaultLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormats(value: CustomFormats): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: Record[String, js.Array[MessageFormatElement] | String]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnError(
      value: /* err */ MissingTranslationError | MessageFormatError | MissingDataError | InvalidConfigError | UnsupportedFormatterError | FormatError => Unit
    ): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextComponent(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): Self = StObject.set(x, "textComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextComponentUndefined: Self = StObject.set(x, "textComponent", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
