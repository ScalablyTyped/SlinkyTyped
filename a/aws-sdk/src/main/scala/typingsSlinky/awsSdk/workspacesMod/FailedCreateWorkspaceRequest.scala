package typingsSlinky.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedCreateWorkspaceRequest extends StObject {
  
  /**
    * The error code that is returned if the WorkSpace cannot be created.
    */
  var ErrorCode: js.UndefOr[ErrorType] = js.native
  
  /**
    * The text of the error message that is returned if the WorkSpace cannot be created.
    */
  var ErrorMessage: js.UndefOr[Description] = js.native
  
  /**
    * Information about the WorkSpace.
    */
  var WorkspaceRequest: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.WorkspaceRequest] = js.native
}
object FailedCreateWorkspaceRequest {
  
  @scala.inline
  def apply(): FailedCreateWorkspaceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedCreateWorkspaceRequest]
  }
  
  @scala.inline
  implicit class FailedCreateWorkspaceRequestMutableBuilder[Self <: FailedCreateWorkspaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorType): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: Description): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    @scala.inline
    def setWorkspaceRequest(value: WorkspaceRequest): Self = StObject.set(x, "WorkspaceRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkspaceRequestUndefined: Self = StObject.set(x, "WorkspaceRequest", js.undefined)
  }
}
