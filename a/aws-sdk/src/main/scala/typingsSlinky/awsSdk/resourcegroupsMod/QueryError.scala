package typingsSlinky.awsSdk.resourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryError extends StObject {
  
  /**
    * Possible values are CLOUDFORMATION_STACK_INACTIVE and CLOUDFORMATION_STACK_NOT_EXISTING.
    */
  var ErrorCode: js.UndefOr[QueryErrorCode] = js.native
  
  /**
    * A message that explains the ErrorCode value. Messages might state that the specified CloudFormation stack does not exist (or no longer exists). For CLOUDFORMATION_STACK_INACTIVE, the message typically states that the CloudFormation stack has a status that is not (or no longer) active, such as CREATE_FAILED.
    */
  var Message: js.UndefOr[QueryErrorMessage] = js.native
}
object QueryError {
  
  @scala.inline
  def apply(): QueryError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryError]
  }
  
  @scala.inline
  implicit class QueryErrorMutableBuilder[Self <: QueryError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: QueryErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setMessage(value: QueryErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
