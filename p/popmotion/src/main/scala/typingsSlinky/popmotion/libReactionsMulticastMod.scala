package typingsSlinky.popmotion

import typingsSlinky.popmotion.libObserverTypesMod.ObserverProps
import typingsSlinky.popmotion.libReactionsMod.BaseMulticast
import typingsSlinky.popmotion.libReactionsMulticastMod.Multicast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/reactions/multicast", JSImport.Namespace)
@js.native
object libReactionsMulticastMod extends js.Object {
  @js.native
  class Multicast () extends BaseMulticast[Multicast] {
    def create(props: ObserverProps): Multicast = js.native
  }
  
  def default(): Multicast = js.native
}

