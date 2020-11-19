package typingsSlinky.openfin

import typingsSlinky.openfin.emitterMapMod.EmitterMap
import typingsSlinky.openfin.transportMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openfin/_v2/api/events/eventAggregator", JSImport.Namespace)
@js.native
object eventAggregatorMod extends js.Object {
  
  @js.native
  class EventAggregator () extends EmitterMap {
    
    def dispatchEvent(message: Message[_]): Boolean = js.native
  }
}
