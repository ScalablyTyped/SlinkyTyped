package typingsSlinky.relayRuntime.relayObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends js.Object {
  
  val closed: Boolean = js.native
  
  def unsubscribe(): Unit = js.native
}
object Subscription {
  
  @scala.inline
  def apply(closed: Boolean, unsubscribe: () => Unit): Subscription = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionOps[Self <: Subscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsubscribe(value: () => Unit): Self = this.set("unsubscribe", js.Any.fromFunction0(value))
  }
}
