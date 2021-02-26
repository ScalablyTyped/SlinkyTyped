package typingsSlinky.openfin

import typingsSlinky.openfin.emitterMapMod.EmitterMap
import typingsSlinky.openfin.transportMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventAggregatorMod {
  
  @JSImport("openfin/_v2/api/events/eventAggregator", "EventAggregator")
  @js.native
  class EventAggregator () extends EmitterMap {
    
    def dispatchEvent(message: Message[_]): Boolean = js.native
  }
}
