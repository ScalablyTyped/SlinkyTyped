package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AccountUserProfiles contains properties of a Campaign Manager user profile.
  * This resource is specifically for managing user profiles, whereas
  * UserProfiles is for accessing the API.
  */
@js.native
trait SchemaAccountUserProfile extends js.Object {
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
  implicit class SchemaAccountUserProfileOps[Self <: SchemaAccountUserProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertiserFilter(value: SchemaObjectFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withCampaignFilter(value: SchemaObjectFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCampaignFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("campaignFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSiteFilter(value: SchemaObjectFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiteFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siteFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withSubaccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubaccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subaccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withTraffickerType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traffickerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraffickerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traffickerType")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAccessType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAccessType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAccessType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAccessType")(js.undefined)
        ret
    }
    @scala.inline
    def withUserRoleFilter(value: SchemaObjectFilter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRoleFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRoleFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRoleFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withUserRoleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRoleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRoleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRoleId")(js.undefined)
        ret
    }
  }
  
}

