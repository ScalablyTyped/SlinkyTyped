package typingsSlinky.formatjsIntl

import typingsSlinky.formatjsIntl.formatjsIntlStrings.FORMAT_ERROR
import typingsSlinky.formatjsIntl.formatjsIntlStrings.INVALID_CONFIG
import typingsSlinky.formatjsIntl.formatjsIntlStrings.MISSING_DATA
import typingsSlinky.formatjsIntl.formatjsIntlStrings.MISSING_TRANSLATION
import typingsSlinky.formatjsIntl.formatjsIntlStrings.UNSUPPORTED_FORMATTER
import typingsSlinky.formatjsIntl.typesMod.MessageDescriptor
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("@formatjs/intl/lib/src/error", "IntlError")
  @js.native
  class IntlError[T /* <: IntlErrorCode */] protected () extends Error {
    def this(code: T, message: String) = this()
    def this(code: T, message: String, exception: js.Error) = this()
    
    val code: T = js.native
  }
  
  @JSImport("@formatjs/intl/lib/src/error", "InvalidConfigError")
  @js.native
  class InvalidConfigError protected () extends IntlError[INVALID_CONFIG] {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("@formatjs/intl/lib/src/error", "MessageFormatError")
  @js.native
  class MessageFormatError protected () extends IntlError[FORMAT_ERROR] {
    def this(message: String, locale: String) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor) = this()
    def this(message: String, locale: String, descriptor: js.UndefOr[scala.Nothing], exception: js.Error) = this()
    def this(message: String, locale: String, descriptor: MessageDescriptor, exception: js.Error) = this()
    
    val descriptor: js.UndefOr[MessageDescriptor] = js.native
  }
  
  @JSImport("@formatjs/intl/lib/src/error", "MissingDataError")
  @js.native
  class MissingDataError protected () extends IntlError[MISSING_DATA] {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  @JSImport("@formatjs/intl/lib/src/error", "MissingTranslationError")
  @js.native
  class MissingTranslationError protected () extends IntlError[MISSING_TRANSLATION] {
    def this(descriptor: MessageDescriptor, locale: String) = this()
    
    val descriptor: js.UndefOr[MessageDescriptor] = js.native
  }
  
  @JSImport("@formatjs/intl/lib/src/error", "UnsupportedFormatterError")
  @js.native
  class UnsupportedFormatterError protected () extends IntlError[UNSUPPORTED_FORMATTER] {
    def this(message: String) = this()
    def this(message: String, exception: js.Error) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.formatjsIntl.formatjsIntlStrings.FORMAT_ERROR
    - typingsSlinky.formatjsIntl.formatjsIntlStrings.UNSUPPORTED_FORMATTER
    - typingsSlinky.formatjsIntl.formatjsIntlStrings.INVALID_CONFIG
    - typingsSlinky.formatjsIntl.formatjsIntlStrings.MISSING_DATA
    - typingsSlinky.formatjsIntl.formatjsIntlStrings.MISSING_TRANSLATION
  */
  trait IntlErrorCode extends StObject
  object IntlErrorCode {
    
    @scala.inline
    def FORMAT_ERROR: typingsSlinky.formatjsIntl.formatjsIntlStrings.FORMAT_ERROR = "FORMAT_ERROR".asInstanceOf[typingsSlinky.formatjsIntl.formatjsIntlStrings.FORMAT_ERROR]
    
    @scala.inline
    def INVALID_CONFIG: typingsSlinky.formatjsIntl.formatjsIntlStrings.INVALID_CONFIG = "INVALID_CONFIG".asInstanceOf[typingsSlinky.formatjsIntl.formatjsIntlStrings.INVALID_CONFIG]
    
    @scala.inline
    def MISSING_DATA: typingsSlinky.formatjsIntl.formatjsIntlStrings.MISSING_DATA = "MISSING_DATA".asInstanceOf[typingsSlinky.formatjsIntl.formatjsIntlStrings.MISSING_DATA]
    
    @scala.inline
    def MISSING_TRANSLATION: typingsSlinky.formatjsIntl.formatjsIntlStrings.MISSING_TRANSLATION = "MISSING_TRANSLATION".asInstanceOf[typingsSlinky.formatjsIntl.formatjsIntlStrings.MISSING_TRANSLATION]
    
    @scala.inline
    def UNSUPPORTED_FORMATTER: typingsSlinky.formatjsIntl.formatjsIntlStrings.UNSUPPORTED_FORMATTER = "UNSUPPORTED_FORMATTER".asInstanceOf[typingsSlinky.formatjsIntl.formatjsIntlStrings.UNSUPPORTED_FORMATTER]
  }
}
