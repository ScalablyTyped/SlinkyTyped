package typingsSlinky.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AccountUserProfiles contains properties of a Campaign Manager user profile.
  * This resource is specifically for managing user profiles, whereas
  * UserProfiles is for accessing the API.
  */
@js.native
trait SchemaAccountUserProfile extends StObject {
  
  /**
    * Account ID of the user profile. This is a read-only field that can be
    * left blank.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Whether this user profile is active. This defaults to false, and must be
    * set true on insert for the user profile to be usable.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Filter that describes which advertisers are visible to the user profile.
    */
  var advertiserFilter: js.UndefOr[SchemaObjectFilter] = js.native
  
  /**
    * Filter that describes which campaigns are visible to the user profile.
    */
  var campaignFilter: js.UndefOr[SchemaObjectFilter] = js.native
  
  /**
    * Comments for this user profile.
    */
  var comments: js.UndefOr[String] = js.native
  
  /**
    * Email of the user profile. The email addresss must be linked to a Google
    * Account. This field is required on insertion and is read-only after
    * insertion.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * ID of the user profile. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#accountUserProfile&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Locale of the user profile. This is a required field. Acceptable values
    * are:   - &quot;cs&quot; (Czech)  - &quot;de&quot; (German)  -
    * &quot;en&quot; (English)  - &quot;en-GB&quot; (English United Kingdom)  -
    * &quot;es&quot; (Spanish)  - &quot;fr&quot; (French)  - &quot;it&quot;
    * (Italian)  - &quot;ja&quot; (Japanese)  - &quot;ko&quot; (Korean)  -
    * &quot;pl&quot; (Polish)  - &quot;pt-BR&quot; (Portuguese Brazil) -
    * &quot;ru&quot; (Russian)  - &quot;sv&quot; (Swedish)  - &quot;tr&quot;
    * (Turkish)  - &quot;zh-CN&quot; (Chinese Simplified)  - &quot;zh-TW&quot;
    * (Chinese Traditional)
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * Name of the user profile. This is a required field. Must be less than 64
    * characters long, must be globally unique, and cannot contain whitespace
    * or any of the following characters: &quot;&amp;;&quot;#%,&quot;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Filter that describes which sites are visible to the user profile.
    */
  var siteFilter: js.UndefOr[SchemaObjectFilter] = js.native
  
  /**
    * Subaccount ID of the user profile. This is a read-only field that can be
    * left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  
  /**
    * Trafficker type of this user profile. This is a read-only field.
    */
  var traffickerType: js.UndefOr[String] = js.native
  
  /**
    * User type of the user profile. This is a read-only field that can be left
    * blank.
    */
  var userAccessType: js.UndefOr[String] = js.native
  
  /**
    * Filter that describes which user roles are visible to the user profile.
    */
  var userRoleFilter: js.UndefOr[SchemaObjectFilter] = js.native
  
  /**
    * User role ID of the user profile. This is a required field.
    */
  var userRoleId: js.UndefOr[String] = js.native
}
object SchemaAccountUserProfile {
  
  @scala.inline
  def apply(): SchemaAccountUserProfile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountUserProfile]
  }
  
  @scala.inline
  implicit class SchemaAccountUserProfileMutableBuilder[Self <: SchemaAccountUserProfile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAdvertiserFilter(value: SchemaObjectFilter): Self = StObject.set(x, "advertiserFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserFilterUndefined: Self = StObject.set(x, "advertiserFilter", js.undefined)
    
    @scala.inline
    def setCampaignFilter(value: SchemaObjectFilter): Self = StObject.set(x, "campaignFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignFilterUndefined: Self = StObject.set(x, "campaignFilter", js.undefined)
    
    @scala.inline
    def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSiteFilter(value: SchemaObjectFilter): Self = StObject.set(x, "siteFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteFilterUndefined: Self = StObject.set(x, "siteFilter", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = StObject.set(x, "subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubaccountIdUndefined: Self = StObject.set(x, "subaccountId", js.undefined)
    
    @scala.inline
    def setTraffickerType(value: String): Self = StObject.set(x, "traffickerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraffickerTypeUndefined: Self = StObject.set(x, "traffickerType", js.undefined)
    
    @scala.inline
    def setUserAccessType(value: String): Self = StObject.set(x, "userAccessType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAccessTypeUndefined: Self = StObject.set(x, "userAccessType", js.undefined)
    
    @scala.inline
    def setUserRoleFilter(value: SchemaObjectFilter): Self = StObject.set(x, "userRoleFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRoleFilterUndefined: Self = StObject.set(x, "userRoleFilter", js.undefined)
    
    @scala.inline
    def setUserRoleId(value: String): Self = StObject.set(x, "userRoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserRoleIdUndefined: Self = StObject.set(x, "userRoleId", js.undefined)
  }
}
