package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for cancellable events which concern manipulations on groups.
  */
@js.native
trait ASPxClientNavBarGroupCancelEventArgs extends ASPxClientProcessingModeCancelEventArgs {
  
  /**
    * Gets the group object related to the event.
    */
  var group: ASPxClientNavBarGroup = js.native
}
object ASPxClientNavBarGroupCancelEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, group: ASPxClientNavBarGroup, processOnServer: Boolean): ASPxClientNavBarGroupCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientNavBarGroupCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientNavBarGroupCancelEventArgsMutableBuilder[Self <: ASPxClientNavBarGroupCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: ASPxClientNavBarGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
