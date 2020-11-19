package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddSourceIdentifierToSubscriptionResult extends js.Object {
  
  var EventSubscription: js.UndefOr[typingsSlinky.awsSdk.neptuneMod.EventSubscription] = js.native
}
object AddSourceIdentifierToSubscriptionResult {
  
  @scala.inline
  def apply(): AddSourceIdentifierToSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSourceIdentifierToSubscriptionResult]
  }
  
  @scala.inline
  implicit class AddSourceIdentifierToSubscriptionResultOps[Self <: AddSourceIdentifierToSubscriptionResult] (val x: Self) extends AnyVal {
    
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
