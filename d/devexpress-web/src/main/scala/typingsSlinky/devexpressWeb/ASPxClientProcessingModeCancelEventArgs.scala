package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the cancelable client-side events which allow the event's processing to be passed to the server side.
  */
@js.native
trait ASPxClientProcessingModeCancelEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
}
object ASPxClientProcessingModeCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, processOnServer: Boolean): ASPxClientProcessingModeCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientProcessingModeCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientProcessingModeCancelEventArgsMutableBuilder[Self <: ASPxClientProcessingModeCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
