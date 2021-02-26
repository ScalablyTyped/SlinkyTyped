package typingsSlinky.intlMessageformat

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcErrorMod {
  
  @JSImport("intl-messageformat/src/error", "FormatError")
  @js.native
  class FormatError protected () extends Error {
    def this(msg: String, code: ErrorCode) = this()
    def this(msg: String, code: ErrorCode, originalMessage: String) = this()
    
    val code: ErrorCode = js.native
    
    /**
      * Original message we're trying to format
      * `undefined` if we're only dealing w/ AST
      *
      * @type {(string | undefined)}
      * @memberof FormatError
      */
    val originalMessage: js.UndefOr[String] = js.native
  }
  
  @JSImport("intl-messageformat/src/error", "InvalidValueError")
  @js.native
  class InvalidValueError protected () extends FormatError {
    def this(variableId: String, value: js.Any, options: js.Array[String]) = this()
    def this(variableId: String, value: js.Any, options: js.Array[String], originalMessage: String) = this()
  }
  
  @JSImport("intl-messageformat/src/error", "InvalidValueTypeError")
  @js.native
  class InvalidValueTypeError protected () extends FormatError {
    def this(value: js.Any, `type`: String) = this()
    def this(value: js.Any, `type`: String, originalMessage: String) = this()
  }
  
  @JSImport("intl-messageformat/src/error", "MissingValueError")
  @js.native
  class MissingValueError protected () extends FormatError {
    def this(variableId: String) = this()
    def this(variableId: String, originalMessage: String) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.intlMessageformat.intlMessageformatStrings.MISSING_VALUE
    - typingsSlinky.intlMessageformat.intlMessageformatStrings.INVALID_VALUE
    - typingsSlinky.intlMessageformat.intlMessageformatStrings.MISSING_INTL_API
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    @scala.inline
    def INVALID_VALUE: typingsSlinky.intlMessageformat.intlMessageformatStrings.INVALID_VALUE = "INVALID_VALUE".asInstanceOf[typingsSlinky.intlMessageformat.intlMessageformatStrings.INVALID_VALUE]
    
    @scala.inline
    def MISSING_INTL_API: typingsSlinky.intlMessageformat.intlMessageformatStrings.MISSING_INTL_API = "MISSING_INTL_API".asInstanceOf[typingsSlinky.intlMessageformat.intlMessageformatStrings.MISSING_INTL_API]
    
    @scala.inline
    def MISSING_VALUE: typingsSlinky.intlMessageformat.intlMessageformatStrings.MISSING_VALUE = "MISSING_VALUE".asInstanceOf[typingsSlinky.intlMessageformat.intlMessageformatStrings.MISSING_VALUE]
  }
}
