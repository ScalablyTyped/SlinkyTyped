package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersOrderUpdateUserNotification extends StObject {
  
  /**
    * The contents of the notification.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * The title for the user notification.
    */
  var title: js.UndefOr[String] = js.native
}
object GoogleActionsV2OrdersOrderUpdateUserNotification {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderUpdateUserNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderUpdateUserNotification]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderUpdateUserNotificationMutableBuilder[Self <: GoogleActionsV2OrdersOrderUpdateUserNotification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
