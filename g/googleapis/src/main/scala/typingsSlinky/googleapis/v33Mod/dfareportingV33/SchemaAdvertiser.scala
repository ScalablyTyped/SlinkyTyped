package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Campaign Manager advertiser.
  */
@js.native
trait SchemaAdvertiser extends js.Object {
  /**
    * Account ID of this advertiser.This is a read-only field that can be left
    * blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * ID of the advertiser group this advertiser belongs to. You can group
    * advertisers for reporting purposes, allowing you to see aggregated
    * information for all advertisers in each group.
    */
  var advertiserGroupId: js.UndefOr[String] = js.native
  /**
    * Suffix added to click-through URL of ad creative associations under this
    * advertiser. Must be less than 129 characters long.
    */
  var clickThroughUrlSuffix: js.UndefOr[String] = js.native
  /**
    * ID of the click-through event tag to apply by default to the landing
    * pages of this advertiser&#39;s campaigns.
    */
  var defaultClickThroughEventTagId: js.UndefOr[String] = js.native
  /**
    * Default email address used in sender field for tag emails.
    */
  var defaultEmail: js.UndefOr[String] = js.native
  /**
    * Floodlight configuration ID of this advertiser. The floodlight
    * configuration ID will be created automatically, so on insert this field
    * should be left blank. This field can be set to another advertiser&#39;s
    * floodlight configuration ID in order to share that advertiser&#39;s
    * floodlight configuration with this advertiser, so long as:  - This
    * advertiser&#39;s original floodlight configuration is not already
    * associated with floodlight activities or floodlight activity groups.  -
    * This advertiser&#39;s original floodlight configuration is not already
    * shared with another advertiser.
    */
  var floodlightConfigurationId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of the floodlight configuration. This is a
    * read-only, auto-generated field.
    */
  var floodlightConfigurationIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * ID of this advertiser. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this advertiser. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#advertiser&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this advertiser. This is a required field and must be less than
    * 256 characters long and unique among advertisers of the same account.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Original floodlight configuration before any sharing occurred. Set the
    * floodlightConfigurationId of this advertiser to
    * originalFloodlightConfigurationId to unshare the advertiser&#39;s current
    * floodlight configuration. You cannot unshare an advertiser&#39;s
    * floodlight configuration if the shared configuration has activities
    * associated with any campaign or placement.
    */
  var originalFloodlightConfigurationId: js.UndefOr[String] = js.native
  /**
    * Status of this advertiser.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this advertiser.This is a read-only field that can be
    * left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Suspension status of this advertiser.
    */
  var suspended: js.UndefOr[Boolean] = js.native
}

object SchemaAdvertiser {
  @scala.inline
  def apply(): SchemaAdvertiser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAdvertiser]
  }
  @scala.inline
  implicit class SchemaAdvertiserOps[Self <: SchemaAdvertiser] (val x: Self) extends AnyVal {
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
    def withAdvertiserGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withClickThroughUrlSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrlSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThroughUrlSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrlSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultClickThroughEventTagId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClickThroughEventTagId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultClickThroughEventTagId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClickThroughEventTagId")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightConfigurationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightConfigurationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigurationId")(js.undefined)
        ret
    }
    @scala.inline
    def withFloodlightConfigurationIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigurationIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloodlightConfigurationIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floodlightConfigurationIdDimensionValue")(js.undefined)
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
    def withIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idDimensionValue")(js.undefined)
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
    def withOriginalFloodlightConfigurationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalFloodlightConfigurationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalFloodlightConfigurationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalFloodlightConfigurationId")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
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
    def withSuspended(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspended: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspended")(js.undefined)
        ret
    }
  }
  
}

