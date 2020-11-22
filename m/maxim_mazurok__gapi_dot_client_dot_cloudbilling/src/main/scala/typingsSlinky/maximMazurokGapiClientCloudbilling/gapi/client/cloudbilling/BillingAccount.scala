package typingsSlinky.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingAccount extends js.Object {
  
  /** The display name given to the billing account, such as `My Billing Account`. This name is displayed in the Google Cloud Console. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * If this account is a [subaccount](https://cloud.google.com/billing/docs/concepts), then this will be the resource name of the master billing account that it is being resold through.
    * Otherwise this will be empty.
    */
  var masterBillingAccount: js.UndefOr[String] = js.native
  
  /**
    * Output only. The resource name of the billing account. The resource name has the form `billingAccounts/{billing_account_id}`. For example, `billingAccounts/012345-567890-ABCDEF`
    * would be the resource name for billing account `012345-567890-ABCDEF`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. True if the billing account is open, and will therefore be charged for any usage on associated projects. False if the billing account is closed, and therefore projects
    * associated with it will be unable to use paid services.
    */
  var open: js.UndefOr[Boolean] = js.native
}
object BillingAccount {
  
  @scala.inline
  def apply(): BillingAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingAccount]
  }
  
  @scala.inline
  implicit class BillingAccountOps[Self <: BillingAccount] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setMasterBillingAccount(value: String): Self = this.set("masterBillingAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterBillingAccount: Self = this.set("masterBillingAccount", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
  }
}
