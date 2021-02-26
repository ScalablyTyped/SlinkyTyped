package typingsSlinky.openfin

import typingsSlinky.openfin.eventsBaseMod.BaseEventMap
import typingsSlinky.openfin.eventsBaseMod.RuntimeEvent
import typingsSlinky.openfin.openfinStrings.click
import typingsSlinky.openfin.openfinStrings.close
import typingsSlinky.openfin.openfinStrings.error
import typingsSlinky.openfin.openfinStrings.message
import typingsSlinky.openfin.openfinStrings.notification
import typingsSlinky.openfin.openfinStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationsMod {
  
  @js.native
  trait NotificationEvents extends BaseEventMap {
    
    var click: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.click] = js.native
    
    var close: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.close] = js.native
    
    var error: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.error] = js.native
    
    var message: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.message] = js.native
    
    var show: RuntimeEvent[notification, typingsSlinky.openfin.openfinStrings.show] = js.native
  }
  object NotificationEvents {
    
    @scala.inline
    def apply(
      click: RuntimeEvent[notification, click],
      close: RuntimeEvent[notification, close],
      error: RuntimeEvent[notification, error],
      listenerRemoved: String,
      message: RuntimeEvent[notification, message],
      newListener: String,
      show: RuntimeEvent[notification, show]
    ): NotificationEvents = {
      val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationEvents]
    }
    
    @scala.inline
    implicit class NotificationEventsMutableBuilder[Self <: NotificationEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClick(value: RuntimeEvent[notification, click]): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: RuntimeEvent[notification, close]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: RuntimeEvent[notification, error]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: RuntimeEvent[notification, message]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShow(value: RuntimeEvent[notification, show]): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    }
  }
}
