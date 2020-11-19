package typingsSlinky.popmotion

import typingsSlinky.popmotion.actionTypesMod.ColdSubscription
import typingsSlinky.popmotion.chainableMod.default
import typingsSlinky.popmotion.observerTypesMod.IObserver
import typingsSlinky.popmotion.observerTypesMod.ObserverCandidate
import typingsSlinky.popmotion.reactionsTypesMod.HotSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/reactions", JSImport.Namespace)
@js.native
object reactionsMod extends js.Object {
  
  @js.native
  abstract class BaseMulticast[T] ()
    extends default[T]
       with IObserver {
    
    var parent: js.Any = js.native
    
    def registerParent(subscription: ColdSubscription): Unit = js.native
    
    def stop(): Unit = js.native
    
    def subscribe(observerCandidate: ObserverCandidate): HotSubscription = js.native
    
    var subscribers: js.Array[IObserver] = js.native
    
    @JSName("update")
    def update_MBaseMulticast(v: js.Any): Unit = js.native
  }
}
