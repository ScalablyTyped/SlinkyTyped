package typingsSlinky.popmotion

import typingsSlinky.popmotion.observerTypesMod.ObserverProps
import typingsSlinky.popmotion.reactionsMod.BaseMulticast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/reactions/multicast", JSImport.Namespace)
@js.native
object multicastMod extends js.Object {
  
  def default(): Multicast = js.native
  
  @js.native
  class Multicast () extends BaseMulticast[Multicast] {
    
    def create(props: ObserverProps): Multicast = js.native
  }
}
