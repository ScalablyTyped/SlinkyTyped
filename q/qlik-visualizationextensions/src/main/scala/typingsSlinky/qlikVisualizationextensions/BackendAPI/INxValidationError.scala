package typingsSlinky.qlikVisualizationextensions.BackendAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INxValidationError extends StObject {
  
  /**
    * Context related to the error, from the user app domain.
    * It can be the identifier of an object, a field name, a table name.
    * This parameter is optional.
    * String
    */
  var qContext: String = js.native
  
  /**
    * Error code.
    * This parameter is always displayed in case of error.
    * Integer
    */
  var qErrorCode: Double = js.native
  
  /**
    * Internal information from the server.
    * This parameter is optional.
    * String
    */
  var qExtendedMessage: String = js.native
}
object INxValidationError {
  
  @scala.inline
  def apply(qContext: String, qErrorCode: Double, qExtendedMessage: String): INxValidationError = {
    val __obj = js.Dynamic.literal(qContext = qContext.asInstanceOf[js.Any], qErrorCode = qErrorCode.asInstanceOf[js.Any], qExtendedMessage = qExtendedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxValidationError]
  }
  
  @scala.inline
  implicit class INxValidationErrorMutableBuilder[Self <: INxValidationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQContext(value: String): Self = StObject.set(x, "qContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQErrorCode(value: Double): Self = StObject.set(x, "qErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQExtendedMessage(value: String): Self = StObject.set(x, "qExtendedMessage", value.asInstanceOf[js.Any])
  }
}
