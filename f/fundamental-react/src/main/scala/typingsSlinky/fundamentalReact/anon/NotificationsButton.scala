package typingsSlinky.fundamentalReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationsButton extends StObject {
  
  var counterLabel: String = js.native
  
  var notificationsButton: String = js.native
}
object NotificationsButton {
  
  @scala.inline
  def apply(counterLabel: String, notificationsButton: String): NotificationsButton = {
    val __obj = js.Dynamic.literal(counterLabel = counterLabel.asInstanceOf[js.Any], notificationsButton = notificationsButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsButton]
  }
  
  @scala.inline
  implicit class NotificationsButtonMutableBuilder[Self <: NotificationsButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCounterLabel(value: String): Self = StObject.set(x, "counterLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationsButton(value: String): Self = StObject.set(x, "notificationsButton", value.asInstanceOf[js.Any])
  }
}
