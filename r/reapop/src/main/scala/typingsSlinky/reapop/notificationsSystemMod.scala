package typingsSlinky.reapop

import slinky.core.facade.ReactElement
import typingsSlinky.reapop.componentsContextMod.ComponentContextType
import typingsSlinky.reapop.themesTypesMod.Theme
import typingsSlinky.reapop.typesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsSystemMod {
  
  @JSImport("reapop/dist/components/NotificationsSystem", JSImport.Default)
  @js.native
  def default(props: Props): ReactElement = js.native
  
  type DismissNotification = js.Function1[/* id */ String, Unit]
  
  @js.native
  trait Props extends StObject {
    
    var components: js.UndefOr[ComponentContextType] = js.native
    
    var dismissNotification: DismissNotification = js.native
    
    var notifications: js.Array[Notification] = js.native
    
    var smallScreenBreakpoint: js.UndefOr[Double] = js.native
    
    var theme: js.UndefOr[Theme] = js.native
  }
  object Props {
    
    @scala.inline
    def apply(dismissNotification: /* id */ String => Unit, notifications: js.Array[Notification]): Props = {
      val __obj = js.Dynamic.literal(dismissNotification = js.Any.fromFunction1(dismissNotification), notifications = notifications.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: ComponentContextType): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setDismissNotification(value: /* id */ String => Unit): Self = StObject.set(x, "dismissNotification", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      @scala.inline
      def setSmallScreenBreakpoint(value: Double): Self = StObject.set(x, "smallScreenBreakpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallScreenBreakpointUndefined: Self = StObject.set(x, "smallScreenBreakpoint", js.undefined)
      
      @scala.inline
      def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
