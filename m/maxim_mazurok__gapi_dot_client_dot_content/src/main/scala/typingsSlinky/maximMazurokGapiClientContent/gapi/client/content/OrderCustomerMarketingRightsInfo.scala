package typingsSlinky.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderCustomerMarketingRightsInfo extends js.Object {
  
  /**
    * Last known customer selection regarding marketing preferences. In certain cases this selection might not be known, so this field would be empty. If a customer selected `granted` in
    * their most recent order, they can be subscribed to marketing emails. Customers who have chosen `denied` must not be subscribed, or must be unsubscribed if already opted-in.
    * Acceptable values are: - "`denied`" - "`granted`"
    */
  var explicitMarketingPreference: js.UndefOr[String] = js.native
  
  /** Timestamp when last time marketing preference was updated. Could be empty, if user wasn't offered a selection yet. */
  var lastUpdatedTimestamp: js.UndefOr[String] = js.native
  
  /**
    * Email address that can be used for marketing purposes. The field may be empty even if `explicitMarketingPreference` is 'granted'. This happens when retrieving an old order from the
    * customer who deleted their account.
    */
  var marketingEmailAddress: js.UndefOr[String] = js.native
}
object OrderCustomerMarketingRightsInfo {
  
  @scala.inline
  def apply(): OrderCustomerMarketingRightsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderCustomerMarketingRightsInfo]
  }
  
  @scala.inline
  implicit class OrderCustomerMarketingRightsInfoOps[Self <: OrderCustomerMarketingRightsInfo] (val x: Self) extends AnyVal {
    
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
    def setExplicitMarketingPreference(value: String): Self = this.set("explicitMarketingPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitMarketingPreference: Self = this.set("explicitMarketingPreference", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestamp(value: String): Self = this.set("lastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimestamp: Self = this.set("lastUpdatedTimestamp", js.undefined)
    
    @scala.inline
    def setMarketingEmailAddress(value: String): Self = this.set("marketingEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarketingEmailAddress: Self = this.set("marketingEmailAddress", js.undefined)
  }
}
