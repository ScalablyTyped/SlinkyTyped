package typingsSlinky.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscriber extends StObject {
  
  /**
    * The address that AWS sends budget notifications to, either an SNS topic or an email. When you create a subscriber, the value of Address can't contain line breaks.
    */
  var Address: SubscriberAddress = js.native
  
  /**
    * The type of notification that AWS sends to a subscriber.
    */
  var SubscriptionType: typingsSlinky.awsSdk.budgetsMod.SubscriptionType = js.native
}
object Subscriber {
  
  @scala.inline
  def apply(Address: SubscriberAddress, SubscriptionType: SubscriptionType): Subscriber = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], SubscriptionType = SubscriptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscriber]
  }
  
  @scala.inline
  implicit class SubscriberMutableBuilder[Self <: Subscriber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: SubscriberAddress): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionType(value: SubscriptionType): Self = StObject.set(x, "SubscriptionType", value.asInstanceOf[js.Any])
  }
}
