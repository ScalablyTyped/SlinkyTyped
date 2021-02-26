package typingsSlinky.reapop

import slinky.core.facade.ReactElement
import typingsSlinky.reapop.notificationsSystemMod.DismissNotification
import typingsSlinky.reapop.typesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationContainerMod {
  
  @JSImport("reapop/dist/components/NotificationContainer", JSImport.Default)
  @js.native
  def default(props: Props): ReactElement = js.native
  
  @js.native
  trait Props extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var dismissNotification: DismissNotification = js.native
    
    var notification: Notification = js.native
  }
  object Props {
    
    @scala.inline
    def apply(dismissNotification: /* id */ String => Unit, notification: Notification): Props = {
      val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDismissNotification(value: /* id */ String => Unit): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
}
