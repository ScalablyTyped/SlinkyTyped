package typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.reactNativeFirebase.anon.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotificationsStatics extends StObject {
  
  var Android: Action = js.native
  
  var Notification: Instantiable0[typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications.Notification] = js.native
}
object NotificationsStatics {
  
  @scala.inline
  def apply(Android: Action, Notification: Instantiable0[Notification]): NotificationsStatics = {
    val __obj = js.Dynamic.literal(Android = Android.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationsStatics]
  }
  
  @scala.inline
  implicit class NotificationsStaticsMutableBuilder[Self <: NotificationsStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroid(value: Action): Self = StObject.set(x, "Android", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: Instantiable0[Notification]): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
  }
}
