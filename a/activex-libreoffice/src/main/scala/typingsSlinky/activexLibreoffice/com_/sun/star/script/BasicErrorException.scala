package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is thrown in order to transport an error to Basic.
  * @since OOo 2.0
  */
@js.native
trait BasicErrorException extends Exception {
  
  /** The error code. */
  var ErrorCode: Double = js.native
  
  /** Specifies the argument which is used in the localized error message for the placeholder. */
  var ErrorMessageArgument: String = js.native
}
object BasicErrorException {
  
  @scala.inline
  def apply(Context: XInterface, ErrorCode: Double, ErrorMessageArgument: String, Message: String): BasicErrorException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], ErrorMessageArgument = ErrorMessageArgument.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicErrorException]
  }
  
  @scala.inline
  implicit class BasicErrorExceptionMutableBuilder[Self <: BasicErrorException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageArgument(value: String): Self = StObject.set(x, "ErrorMessageArgument", value.asInstanceOf[js.Any])
  }
}
