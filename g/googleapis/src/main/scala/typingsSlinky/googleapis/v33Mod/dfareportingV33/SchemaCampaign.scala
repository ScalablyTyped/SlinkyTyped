package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties of a Campaign Manager campaign.
  */
@js.native
trait SchemaCampaign extends js.Object {
  /**
    * Account ID of this campaign. This is a read-only field that can be left
    * blank.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Ad blocking settings for this campaign.
    */
  var adBlockingConfiguration: js.UndefOr[SchemaAdBlockingConfiguration] = js.native
  /**
    * Additional creative optimization configurations for the campaign.
    */
  var additionalCreativeOptimizationConfigurations: js.UndefOr[js.Array[SchemaCreativeOptimizationConfiguration]] = js.native
  /**
    * Advertiser group ID of the associated advertiser.
    */
  var advertiserGroupId: js.UndefOr[String] = js.native
  /**
    * Advertiser ID of this campaign. This is a required field.
    */
  var advertiserId: js.UndefOr[String] = js.native
  /**
    * Dimension value for the advertiser ID of this campaign. This is a
    * read-only, auto-generated field.
    */
  var advertiserIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Whether this campaign has been archived.
    */
  var archived: js.UndefOr[Boolean] = js.native
  /**
    * Audience segment groups assigned to this campaign. Cannot have more than
    * 300 segment groups.
    */
  var audienceSegmentGroups: js.UndefOr[js.Array[SchemaAudienceSegmentGroup]] = js.native
  /**
    * Billing invoice code included in the Campaign Manager client billing
    * invoices associated with the campaign.
    */
  var billingInvoiceCode: js.UndefOr[String] = js.native
  /**
    * Click-through URL suffix override properties for this campaign.
    */
  var clickThroughUrlSuffixProperties: js.UndefOr[SchemaClickThroughUrlSuffixProperties] = js.native
  /**
    * Arbitrary comments about this campaign. Must be less than 256 characters
    * long.
    */
  var comment: js.UndefOr[String] = js.native
  /**
    * Information about the creation of this campaign. This is a read-only
    * field.
    */
  var createInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * List of creative group IDs that are assigned to the campaign.
    */
  var creativeGroupIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Creative optimization configuration for the campaign.
    */
  var creativeOptimizationConfiguration: js.UndefOr[SchemaCreativeOptimizationConfiguration] = js.native
  /**
    * Click-through event tag ID override properties for this campaign.
    */
  var defaultClickThroughEventTagProperties: js.UndefOr[SchemaDefaultClickThroughEventTagProperties] = js.native
  /**
    * The default landing page ID for this campaign.
    */
  var defaultLandingPageId: js.UndefOr[String] = js.native
  /**
    * Date on which the campaign will stop running. On insert, the end date
    * must be today or a future date. The end date must be later than or be the
    * same as the start date. If, for example, you set 6/25/2015 as both the
    * start and end dates, the effective campaign run date is just that day
    * only, 6/25/2015. The hours, minutes, and seconds of the end date should
    * not be set, as doing so will result in an error. This is a required
    * field.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * Overrides that can be used to activate or deactivate advertiser event
    * tags.
    */
  var eventTagOverrides: js.UndefOr[js.Array[SchemaEventTagOverride]] = js.native
  /**
    * External ID for this campaign.
    */
  var externalId: js.UndefOr[String] = js.native
  /**
    * ID of this campaign. This is a read-only auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this campaign. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#campaign&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Information about the most recent modification of this campaign. This is
    * a read-only field.
    */
  var lastModifiedInfo: js.UndefOr[SchemaLastModifiedInfo] = js.native
  /**
    * Name of this campaign. This is a required field and must be less than 256
    * characters long and unique among campaigns of the same advertiser.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Whether Nielsen reports are enabled for this campaign.
    */
  var nielsenOcrEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Date on which the campaign starts running. The start date can be any
    * date. The hours, minutes, and seconds of the start date should not be
    * set, as doing so will result in an error. This is a required field.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * Subaccount ID of this campaign. This is a read-only field that can be
    * left blank.
    */
  var subaccountId: js.UndefOr[String] = js.native
  /**
    * Campaign trafficker contact emails.
    */
  var traffickerEmails: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCampaign {
  @scala.inline
  def apply(): SchemaCampaign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCampaign]
  }
  @scala.inline
  implicit class SchemaCampaignOps[Self <: SchemaCampaign] (val x: Self) extends AnyVal {
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
    def withAdBlockingConfiguration(value: SchemaAdBlockingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adBlockingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdBlockingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adBlockingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalCreativeOptimizationConfigurations(value: js.Array[SchemaCreativeOptimizationConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalCreativeOptimizationConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalCreativeOptimizationConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalCreativeOptimizationConfigurations")(js.undefined)
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
    def withAdvertiserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserId")(js.undefined)
        ret
    }
    @scala.inline
    def withAdvertiserIdDimensionValue(value: SchemaDimensionValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserIdDimensionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdvertiserIdDimensionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("advertiserIdDimensionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withArchived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(js.undefined)
        ret
    }
    @scala.inline
    def withAudienceSegmentGroups(value: js.Array[SchemaAudienceSegmentGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceSegmentGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudienceSegmentGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audienceSegmentGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingInvoiceCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingInvoiceCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingInvoiceCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingInvoiceCode")(js.undefined)
        ret
    }
    @scala.inline
    def withClickThroughUrlSuffixProperties(value: SchemaClickThroughUrlSuffixProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrlSuffixProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickThroughUrlSuffixProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickThroughUrlSuffixProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateInfo(value: SchemaLastModifiedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeGroupIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withCreativeOptimizationConfiguration(value: SchemaCreativeOptimizationConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeOptimizationConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreativeOptimizationConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creativeOptimizationConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultClickThroughEventTagProperties(value: SchemaDefaultClickThroughEventTagProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClickThroughEventTagProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultClickThroughEventTagProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClickThroughEventTagProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultLandingPageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLandingPageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultLandingPageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultLandingPageId")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTagOverrides(value: js.Array[SchemaEventTagOverride]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTagOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventTagOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTagOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalId")(js.undefined)
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
    def withLastModifiedInfo(value: SchemaLastModifiedInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedInfo")(js.undefined)
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
    def withNielsenOcrEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nielsenOcrEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNielsenOcrEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nielsenOcrEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
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
    def withTraffickerEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traffickerEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTraffickerEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("traffickerEmails")(js.undefined)
        ret
    }
  }
  
}

