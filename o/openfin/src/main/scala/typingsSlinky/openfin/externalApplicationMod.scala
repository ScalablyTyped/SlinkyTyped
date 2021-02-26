package typingsSlinky.openfin

import typingsSlinky.openfin.eventsBaseMod.BaseEventMap
import typingsSlinky.openfin.eventsBaseMod.RuntimeEvent
import typingsSlinky.openfin.openfinStrings.connected
import typingsSlinky.openfin.openfinStrings.disconnected
import typingsSlinky.openfin.openfinStrings.externalapplication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalApplicationMod {
  
  @js.native
  trait ExternalApplicationEvents extends BaseEventMap {
    
    var connected: RuntimeEvent[externalapplication, typingsSlinky.openfin.openfinStrings.connected] = js.native
    
    var disconnected: RuntimeEvent[externalapplication, typingsSlinky.openfin.openfinStrings.disconnected] = js.native
  }
  object ExternalApplicationEvents {
    
    @scala.inline
    def apply(
      connected: RuntimeEvent[externalapplication, connected],
      disconnected: RuntimeEvent[externalapplication, disconnected],
      listenerRemoved: String,
      newListener: String
    ): ExternalApplicationEvents = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], listenerRemoved = listenerRemoved.asInstanceOf[js.Any], newListener = newListener.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalApplicationEvents]
    }
    
    @scala.inline
    implicit class ExternalApplicationEventsMutableBuilder[Self <: ExternalApplicationEvents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnected(value: RuntimeEvent[externalapplication, connected]): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisconnected(value: RuntimeEvent[externalapplication, disconnected]): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
    }
  }
}
