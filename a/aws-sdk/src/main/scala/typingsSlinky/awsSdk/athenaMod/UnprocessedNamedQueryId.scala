package typingsSlinky.awsSdk.athenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnprocessedNamedQueryId extends StObject {
  
  /**
    * The error code returned when the processing request for the named query failed, if applicable.
    */
  var ErrorCode: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ErrorCode] = js.native
  
  /**
    * The error message returned when the processing request for the named query failed, if applicable.
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.athenaMod.ErrorMessage] = js.native
  
  /**
    * The unique identifier of the named query.
    */
  var NamedQueryId: js.UndefOr[typingsSlinky.awsSdk.athenaMod.NamedQueryId] = js.native
}
object UnprocessedNamedQueryId {
  
  @scala.inline
  def apply(): UnprocessedNamedQueryId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedNamedQueryId]
  }
  
  @scala.inline
  implicit class UnprocessedNamedQueryIdMutableBuilder[Self <: UnprocessedNamedQueryId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setNamedQueryId(value: NamedQueryId): Self = StObject.set(x, "NamedQueryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedQueryIdUndefined: Self = StObject.set(x, "NamedQueryId", js.undefined)
  }
}
