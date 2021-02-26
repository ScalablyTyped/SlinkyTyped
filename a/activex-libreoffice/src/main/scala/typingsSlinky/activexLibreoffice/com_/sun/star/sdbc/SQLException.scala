package typingsSlinky.activexLibreoffice.com_.sun.star.sdbc

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is an exception that provides information on a database access error.
  *
  * Each {@link com.sun.star.sdbc.SQLException} provides several kinds of information:
  *
  * a string describing the error. This is used as the {@link com.sun.star.uno.Exception} message.
  */
@js.native
trait SQLException extends Exception {
  
  /**
    * returns an integer error code that is specific to each vendor. Normally this will be the actual error code returned by the underlying database. A
    * chain to the next Exception. This can be used to provide additional error information.
    */
  var ErrorCode: Double = js.native
  
  /** returns a chain to the next Exception. This can be used to provide additional error information. */
  var NextException: js.Any = js.native
  
  /** returns a string, which uses the XOPEN SQLState conventions. The values of the SQLState string are described in the XOPEN SQL spec. */
  var SQLState: String = js.native
}
object SQLException {
  
  @scala.inline
  def apply(Context: XInterface, ErrorCode: Double, Message: String, NextException: js.Any, SQLState: String): SQLException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], NextException = NextException.asInstanceOf[js.Any], SQLState = SQLState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLException]
  }
  
  @scala.inline
  implicit class SQLExceptionMutableBuilder[Self <: SQLException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextException(value: js.Any): Self = StObject.set(x, "NextException", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSQLState(value: String): Self = StObject.set(x, "SQLState", value.asInstanceOf[js.Any])
  }
}
