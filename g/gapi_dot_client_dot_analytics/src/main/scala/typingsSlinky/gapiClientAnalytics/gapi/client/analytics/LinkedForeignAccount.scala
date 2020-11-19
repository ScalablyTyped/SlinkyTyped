package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkedForeignAccount extends js.Object {
  
  /** Account ID to which this linked foreign account belongs. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Boolean indicating whether this is eligible for search. */
  var eligibleForSearch: js.UndefOr[Boolean] = js.native
  
  /** Entity ad account link ID. */
  var id: js.UndefOr[String] = js.native
  
  /** Internal ID for the web property to which this linked foreign account belongs. */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  
  /** Resource type for linked foreign account. */
  var kind: js.UndefOr[String] = js.native
  
  /** The foreign account ID. For example the an AdWords `linkedAccountId` has the following format XXX-XXX-XXXX. */
  var linkedAccountId: js.UndefOr[String] = js.native
  
  /** Remarketing audience ID to which this linked foreign account belongs. */
  var remarketingAudienceId: js.UndefOr[String] = js.native
  
  /** The status of this foreign account link. */
  var status: js.UndefOr[String] = js.native
  
  /** The type of the foreign account. For example, `ADWORDS_LINKS`, `DBM_LINKS`, `MCC_LINKS` or `OPTIMIZE`. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Web property ID of the form UA-XXXXX-YY to which this linked foreign account belongs. */
  var webPropertyId: js.UndefOr[String] = js.native
}
object LinkedForeignAccount {
  
  @scala.inline
  def apply(): LinkedForeignAccount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedForeignAccount]
  }
  
  @scala.inline
  implicit class LinkedForeignAccountOps[Self <: LinkedForeignAccount] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setEligibleForSearch(value: Boolean): Self = this.set("eligibleForSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEligibleForSearch: Self = this.set("eligibleForSearch", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = this.set("internalWebPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalWebPropertyId: Self = this.set("internalWebPropertyId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLinkedAccountId(value: String): Self = this.set("linkedAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkedAccountId: Self = this.set("linkedAccountId", js.undefined)
    
    @scala.inline
    def setRemarketingAudienceId(value: String): Self = this.set("remarketingAudienceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemarketingAudienceId: Self = this.set("remarketingAudienceId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
}
