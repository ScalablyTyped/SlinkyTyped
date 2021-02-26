package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsOrdersV3OrderUpdateUserNotification extends StObject {
  
  /**
    * The contents of the notification.
    * Max allowed length is 100 chars.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * The title for the user notification.
    * Max allowed length is 30 chars.
    */
  var title: js.UndefOr[String] = js.native
}
object GoogleActionsOrdersV3OrderUpdateUserNotification {
  
  @scala.inline
  def apply(): GoogleActionsOrdersV3OrderUpdateUserNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3OrderUpdateUserNotification]
  }
  
  @scala.inline
  implicit class GoogleActionsOrdersV3OrderUpdateUserNotificationMutableBuilder[Self <: GoogleActionsOrdersV3OrderUpdateUserNotification] (val x: Self) extends AnyVal {
    
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
