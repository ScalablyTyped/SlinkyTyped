package typingsSlinky.reapop

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import typingsSlinky.reapop.themesTypesMod.Theme
import typingsSlinky.reapop.typesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationDismissIconMod {
  
  @JSImport("reapop/dist/components/NotificationDismissIcon", JSImport.Default)
  @js.native
  def default(props: Props): ReactElement = js.native
  
  @js.native
  trait Props extends StObject {
    
    def dismissNotification(event: SyntheticEvent[Event, Element]): Unit = js.native
    
    var notification: Notification = js.native
    
    var theme: js.UndefOr[Theme] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(dismissNotification: SyntheticEvent[Event, Element] => Unit, notification: Notification): Props = {
      val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDismissNotification(value: SyntheticEvent[Event, Element] => Unit): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
