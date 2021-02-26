package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPromptDisplayingEventUIParam extends StObject {
  
  /**
    * Get a boolean indicating if the operation that triggered the prompt can be cancelled.
    */
  var canCancel: js.UndefOr[Boolean] = js.native
  
  /**
    * Get a boolean indicating if a message will be displayed to the end user.
    */
  var displayMessage: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets the exception for the error, if there was one.
    */
  var exception: js.UndefOr[js.Any] = js.native
  
  /**
    * Get or set the message that will be displayed.
    */
  var message: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Get the [action](ig.spreadsheet.SpreadsheetUserPromptTrigger) that caused the prompt to be displayed.
    */
  var trigger: js.UndefOr[String] = js.native
}
object UserPromptDisplayingEventUIParam {
  
  @scala.inline
  def apply(): UserPromptDisplayingEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPromptDisplayingEventUIParam]
  }
  
  @scala.inline
  implicit class UserPromptDisplayingEventUIParamMutableBuilder[Self <: UserPromptDisplayingEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanCancel(value: Boolean): Self = StObject.set(x, "canCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCancelUndefined: Self = StObject.set(x, "canCancel", js.undefined)
    
    @scala.inline
    def setDisplayMessage(value: Boolean): Self = StObject.set(x, "displayMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayMessageUndefined: Self = StObject.set(x, "displayMessage", js.undefined)
    
    @scala.inline
    def setException(value: js.Any): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
  }
}
