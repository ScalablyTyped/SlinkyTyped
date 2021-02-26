package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailureException extends StObject {
  
  /**
    * Description of the failure.
    */
  var ExceptionDescription: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ExceptionDescription] = js.native
  
  /**
    * Exception name.
    */
  var ExceptionName: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ExceptionName] = js.native
}
object FailureException {
  
  @scala.inline
  def apply(): FailureException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureException]
  }
  
  @scala.inline
  implicit class FailureExceptionMutableBuilder[Self <: FailureException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionDescription(value: ExceptionDescription): Self = StObject.set(x, "ExceptionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionDescriptionUndefined: Self = StObject.set(x, "ExceptionDescription", js.undefined)
    
    @scala.inline
    def setExceptionName(value: ExceptionName): Self = StObject.set(x, "ExceptionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionNameUndefined: Self = StObject.set(x, "ExceptionName", js.undefined)
  }
}
