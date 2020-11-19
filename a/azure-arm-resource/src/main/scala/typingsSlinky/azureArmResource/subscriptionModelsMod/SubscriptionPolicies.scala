package typingsSlinky.azureArmResource.subscriptionModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionPolicies extends js.Object {
  
  /**
    * The subscription location placement ID. The ID indicates which regions are visible for a
    * subscription. For example, a subscription with a location placement Id of Public_2014-09-01
    * has access to Azure public regions.
    */
  val locationPlacementId: js.UndefOr[String] = js.native
  
  /**
    * The subscription quota ID.
    */
  val quotaId: js.UndefOr[String] = js.native
  
  /**
    * The subscription spending limit. Possible values include: 'On', 'Off', 'CurrentPeriodOff'
    */
  val spendingLimit: js.UndefOr[String] = js.native
}
object SubscriptionPolicies {
  
  @scala.inline
  def apply(): SubscriptionPolicies = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPolicies]
  }
  
  @scala.inline
  implicit class SubscriptionPoliciesOps[Self <: SubscriptionPolicies] (val x: Self) extends AnyVal {
    
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
    def setLocationPlacementId(value: String): Self = this.set("locationPlacementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationPlacementId: Self = this.set("locationPlacementId", js.undefined)
    
    @scala.inline
    def setQuotaId(value: String): Self = this.set("quotaId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaId: Self = this.set("quotaId", js.undefined)
    
    @scala.inline
    def setSpendingLimit(value: String): Self = this.set("spendingLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpendingLimit: Self = this.set("spendingLimit", js.undefined)
  }
}
