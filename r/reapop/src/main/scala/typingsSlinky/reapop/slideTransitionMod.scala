package typingsSlinky.reapop

import org.scalablytyped.runtime.StringDictionary
import slinky.core.facade.ReactElement
import typingsSlinky.reapop.typesMod.Notification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slideTransitionMod {
  
  @JSImport("reapop/dist/components/SlideTransition", JSImport.Default)
  @js.native
  def default(props: Props): ReactElement = js.native
  
  @js.native
  trait Props
    extends /* index */ StringDictionary[js.Any] {
    
    var children: ReactElement = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var notification: Notification = js.native
  }
  object Props {
    
    @scala.inline
    def apply(notification: Notification): Props = {
      val __obj = js.Dynamic.literal(notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setNotification(value: Notification): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
}
