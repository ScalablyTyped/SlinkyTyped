package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNotificationSubscriptionResponse extends js.Object {
  
  /**
    * The subscription.
    */
  var Subscription: js.UndefOr[typingsSlinky.awsSdk.workdocsMod.Subscription] = js.native
}
object CreateNotificationSubscriptionResponse {
  
  @scala.inline
  def apply(): CreateNotificationSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationSubscriptionResponse]
  }
  
  @scala.inline
  implicit class CreateNotificationSubscriptionResponseOps[Self <: CreateNotificationSubscriptionResponse] (val x: Self) extends AnyVal {
    
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
    def setSubscription(value: Subscription): Self = this.set("Subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription: Self = this.set("Subscription", js.undefined)
  }
}
