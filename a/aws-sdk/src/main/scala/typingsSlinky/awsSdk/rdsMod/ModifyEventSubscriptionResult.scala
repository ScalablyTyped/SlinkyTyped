package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyEventSubscriptionResult extends js.Object {
  
  var EventSubscription: js.UndefOr[typingsSlinky.awsSdk.rdsMod.EventSubscription] = js.native
}
object ModifyEventSubscriptionResult {
  
  @scala.inline
  def apply(): ModifyEventSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyEventSubscriptionResult]
  }
  
  @scala.inline
  implicit class ModifyEventSubscriptionResultOps[Self <: ModifyEventSubscriptionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventSubscription(value: EventSubscription): Self = this.set("EventSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventSubscription: Self = this.set("EventSubscription", js.undefined)
  }
}
