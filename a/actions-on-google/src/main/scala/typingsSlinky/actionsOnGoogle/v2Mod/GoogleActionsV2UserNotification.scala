package typingsSlinky.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UserNotification extends StObject {
  
  /**
    * The content of the notification.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * The title for the notification.
    */
  var title: js.UndefOr[String] = js.native
}
object GoogleActionsV2UserNotification {
  
  @scala.inline
  def apply(): GoogleActionsV2UserNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UserNotification]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UserNotificationMutableBuilder[Self <: GoogleActionsV2UserNotification] (val x: Self) extends AnyVal {
    
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
