package typingsSlinky.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionContentDetails extends StObject {
  
  /** The type of activity this subscription is for (only uploads, everything). */
  var activityType: js.UndefOr[String] = js.native
  
  /** The number of new items in the subscription since its content was last read. */
  var newItemCount: js.UndefOr[Double] = js.native
  
  /** The approximate number of items that the subscription points to. */
  var totalItemCount: js.UndefOr[Double] = js.native
}
object SubscriptionContentDetails {
  
  @scala.inline
  def apply(): SubscriptionContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionContentDetails]
  }
  
  @scala.inline
  implicit class SubscriptionContentDetailsMutableBuilder[Self <: SubscriptionContentDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityType(value: String): Self = StObject.set(x, "activityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityTypeUndefined: Self = StObject.set(x, "activityType", js.undefined)
    
    @scala.inline
    def setNewItemCount(value: Double): Self = StObject.set(x, "newItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewItemCountUndefined: Self = StObject.set(x, "newItemCount", js.undefined)
    
    @scala.inline
    def setTotalItemCount(value: Double): Self = StObject.set(x, "totalItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemCountUndefined: Self = StObject.set(x, "totalItemCount", js.undefined)
  }
}
