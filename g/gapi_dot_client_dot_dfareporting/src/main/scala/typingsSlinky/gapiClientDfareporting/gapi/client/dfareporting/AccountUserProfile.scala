package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountUserProfile extends js.Object {
  
  /** Account ID of the user profile. This is a read-only field that can be left blank. */
  var accountId: js.UndefOr[String] = js.native
  
  /** Whether this user profile is active. This defaults to false, and must be set true on insert for the user profile to be usable. */
  var active: js.UndefOr[Boolean] = js.native
  
  /** Filter that describes which advertisers are visible to the user profile. */
  var advertiserFilter: js.UndefOr[ObjectFilter] = js.native
  
  /** Filter that describes which campaigns are visible to the user profile. */
  var campaignFilter: js.UndefOr[ObjectFilter] = js.native
  
  /** Comments for this user profile. */
  var comments: js.UndefOr[String] = js.native
  
  /** Email of the user profile. The email addresss must be linked to a Google Account. This field is required on insertion and is read-only after insertion. */
  var email: js.UndefOr[String] = js.native
  
  /** ID of the user profile. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#accountUserProfile". */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Locale of the user profile. This is a required field.
    * Acceptable values are:
    * - "cs" (Czech)
    * - "de" (German)
    * - "en" (English)
    * - "en-GB" (English United Kingdom)
    * - "es" (Spanish)
    * - "fr" (French)
    * - "it" (Italian)
    * - "ja" (Japanese)
    * - "ko" (Korean)
    * - "pl" (Polish)
    * - "pt-BR" (Portuguese Brazil)
    * - "ru" (Russian)
    * - "sv" (Swedish)
    * - "tr" (Turkish)
    * - "zh-CN" (Chinese Simplified)
    * - "zh-TW" (Chinese Traditional)
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * Name of the user profile. This is a required field. Must be less than 64 characters long, must be globally unique, and cannot contain whitespace or any
    * of the following characters: "&;"#%,".
    */
  var name: js.UndefOr[String] = js.native
  
  /** Filter that describes which sites are visible to the user profile. */
  var siteFilter: js.UndefOr[ObjectFilter] = js.native
  
  /** Subaccount ID of the user profile. This is a read-only field that can be left blank. */
  var subaccountId: js.UndefOr[String] = js.native
  
  /** Trafficker type of this user profile. */
  var traffickerType: js.UndefOr[String] = js.native
  
  /** User type of the user profile. This is a read-only field that can be left blank. */
  var userAccessType: js.UndefOr[String] = js.native
  
  /** Filter that describes which user roles are visible to the user profile. */
  var userRoleFilter: js.UndefOr[ObjectFilter] = js.native
  
  /** User role ID of the user profile. This is a required field. */
  var userRoleId: js.UndefOr[String] = js.native
}
object AccountUserProfile {
  
  @scala.inline
  def apply(): AccountUserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountUserProfile]
  }
  
  @scala.inline
  implicit class AccountUserProfileOps[Self <: AccountUserProfile] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setAdvertiserFilter(value: ObjectFilter): Self = this.set("advertiserFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserFilter: Self = this.set("advertiserFilter", js.undefined)
    
    @scala.inline
    def setCampaignFilter(value: ObjectFilter): Self = this.set("campaignFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCampaignFilter: Self = this.set("campaignFilter", js.undefined)
    
    @scala.inline
    def setComments(value: String): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSiteFilter(value: ObjectFilter): Self = this.set("siteFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteFilter: Self = this.set("siteFilter", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
    
    @scala.inline
    def setTraffickerType(value: String): Self = this.set("traffickerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraffickerType: Self = this.set("traffickerType", js.undefined)
    
    @scala.inline
    def setUserAccessType(value: String): Self = this.set("userAccessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAccessType: Self = this.set("userAccessType", js.undefined)
    
    @scala.inline
    def setUserRoleFilter(value: ObjectFilter): Self = this.set("userRoleFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRoleFilter: Self = this.set("userRoleFilter", js.undefined)
    
    @scala.inline
    def setUserRoleId(value: String): Self = this.set("userRoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserRoleId: Self = this.set("userRoleId", js.undefined)
  }
}
